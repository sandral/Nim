package Nim.logic;

/** 
 * Luokka jonka alkiot ovat kasaolioita, jotka sisältävät tiedon yhden tikkukasan 
 * tikkumäärästä.
 */
public class Stack {

    int size;

    /**
     * Konstruktori
     * @param size kasaa luotaessa on määriteltävä sen sisältämien tikkujen määrä.
     */
    public Stack(int size) {
        this.size = size;
    }


    /**
     * Palauttaa kasan sisältämien tikkujen lukumäärän
     * @return kasan sisältämien tikkujen lukumäärä.
     */
    public int getSize() {
        return size;
    }

    /**
     * Asettaa kasan sisältämien tikkujen lukumääräksi halutuksi.
     * @param size haluttu lukumäärä
     */
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + "|";
        }
        return s;
    }

    /**
     * Metodi, joka vähentää kasasta yhden tikun.
     */
    public void decrease() {
        if (!isEmpty()) {
            setSize(getSize() - 1);
        }
     }

    /**
     * Metodi, joka tarkistaa, onko kasa tyhjä.  
     * @return totuusarvo, onko kasassa olevien tikkujen määrä 0 eli kasa on tyhjä.
     */
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
