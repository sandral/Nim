/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

/**
 * Sovelluslogiikka luokka.
 */
public class NimApplication {

    NimGame currentGame;
    Scores scorelist;
    Player p1;
    Player p2;
    String winner;

    /**
     * Konstruktori.
     */
    public NimApplication() {
        currentGame = null;
        p1 = null;
        p2 = null;
        scorelist = Scores.initScorelist();
        winner = "";
    }

    /**
     * Metodi aloittaa uuden pelin ja hakee pistelistalta syötteenä saatujen
     * merkkijonojen perusteella sen pelaajan, jonka nimi vastaa merkkijonoa.
     *
     * @param sp1 Pelaajan 1 nimi
     * @param sp2 Pelaajan 2 nimi
     */
    public void startGame(String sp1, String sp2) {
        p1 = scorelist.getPlayer(sp1);
        p2 = scorelist.getPlayer(sp2);
        currentGame = new NimGame();
    }

    /**
     * Palauttaa totuusarvon true, jos peli on meneillään.
     *
     * @return totuusarvo, onko peli meneillään
     */
    boolean gameStarted() {
        return currentGame != null;
    }

    /**
     * Palauttaa taulukon, joka sisältää tikkukasojen tikkujen lukumäärää
     * vastaavat kokonaisluvut.
     *
     * @return taulukko, joka sisältää tikkujen lukumäärät.
     */
    public int[] stackSizes() {
        int[] sizes = new int[currentGame.getStacks().length];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = currentGame.getStacks()[i].getSize();
        }
        return sizes;
    }

    /**
     * Palauttaa pelivuorossa olevan pelaajan nimen.
     *
     * @return Sen pelaajan nimi, joka on vuorossa.
     */
    public String currentPlayerName() {
        if (currentGame.getTurn() == 1) {
            return p1.getName();
        } else {
            return p2.getName();
        }
    }

    /**
     * Palauttaa totuusarvon, onko tehty tehtävä tikkujen poisto mahdollinen.
     * Tikkuja ei voi poistaa enempää kuin mitä kasassa on, kuitenkin vähintään
     * yksi tikku on poistettava. Tyhjästä kasasta, tai kasasta, jota ei ole
     * olemassa, ei voi poistaa.
     *
     * @param i Kasan, josta tikku halutaan poistaa, indeksi.
     * @param amount Poistettavien tikkujen määrä.
     * @return Totuusarvo, onko tehtävä poisto mahdollinen.
     */
    boolean legalMove(int i, int amount) {
        if (i < 0) {
            return false;
        }
        if (i >= currentGame.getStacks().length) {
            return false;
        }
        if (amount < 1) {
            return false;
        }
        if (amount > currentGame.getStacks()[i].getSize()) {
            return false;
        }
        return true;
    }

    /**
     * Poistaa halutusta kasasta halutun määrän tikkuja. Palauttaa totuusarvon
     * true, jos peli loppui tämän siirron jälkeen.
     *
     * @param i Kasa, josta tikkuja poistetaan
     * @param amount Poistettava määrä.
     * @return Totuusarvo, loppuiko peli siirron jälkeen.
     */
    boolean makeMove(int i, int amount) {
        if (legalMove(i, amount)) {
            currentGame.removeSticks(i, amount);
            if (currentGame.ended()) {
                winner = currentPlayerName();
                //currentGame = null;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Palauttaa viimeksi pelatun pelin voittajan nimen.
     * @return Viimeksi voittaneen pelaajan nimi.
     */
    String getLastWinner() {
        return winner;
    }

    /**
     * Kasvattaa pelin voittaneen pelaajan pistesaldoa pelin 
     * loputtua.
     */
    void increaseWinnerScore() {
        if (currentGame.ended()) {
            if (currentPlayerName().equals(p1.getName())) {
                p2.increaseScore();
            } else {
                p1.increaseScore();
            }
        }
    }

    boolean gameEnded() {
        return currentGame.ended();
    }
}
