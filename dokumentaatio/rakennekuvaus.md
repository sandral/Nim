###Rakennekuvaus

Projekti sisältää paketit Nim.logic ja Nim.ui.

Paketissa Nim.logic ovat kaikki sovelluslogiikkaan liittyvät luokat: NimApplication, NimGame, Player, Stack ja Scores.

Paketissa Nim.ui ovat tekstipohjainen käyttöliittymä ja graafinen käyttöliittymä.

Käyttöliittymät kommunikoivat ainoastaan luokan NimApplication kanssa ja pitävät yhteyttä muihin luokkiin tämän luokan välityksellä. 

Esimerkiksi kun pelaaja aloittaa pelin, käyttöliittymä luo uuden NimApplication-olion, joka luo uuden NimGame-olion ja Scores-olion. NimGame luo Stack-olioita luodessaan tikkukasat. Scores luo Player-oliot. 

Scores tarkistaa, onko samalla nimellä varustettu pelaaja jo listalla, ja jos sellainen löytyy listalta, se luo Player-olion, jolla on sama nimi ja sama pistemäärä. Jos pelaajaa ei löydy listalta, luodaan uusi pelaaja, jonka pistemäärä on 0.

NimApplication tuntee sen hetkistä peliä pelaavat Player-oliot ja Scores-olion, NimGame puolestaan ei. NimApplication kasvattaa pelin loputtua voittajan pistemäärää, ja Scores lisää pelaajan ja tämän pistemäärän listalle. 

NimGame huolehtii siitä, että pelivuoro vaihtuu siirron jälkeen, mutta NimApplication osaa liittää vuorossa olevan pelaajan kuhunkin vuoroon. Pelin päätyttyä vuoroon jäänyt pelaaja on voittaja. 