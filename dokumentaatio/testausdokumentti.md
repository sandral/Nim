##Testausdokumentti

###Yleistä

Testien kirjoittaminen oli yleisesti ottaen hieman hankalaa. Kun on kyse näin yksinkertaisesta ohjelmasta, on vaikeaa keksiä mielekkäitä testejä, ja välillä tuntuikin, että piti keksimällä keksiä, että mitä voisi testata. Scores-luokkaa tehdessä koin, että testeistä oli oikeasti hyötyä, ja ne kertoivat itsellekin, että ohjelma toimii kuten pitääkin.

###Mitä testattiin

Pyrin kirjoittamaan testejä jokaisen luokan (käyttöliittymää lukuunottamatta) jokaiselle metodille paitsi getterreille ja settereille. Niillekin kirjoitin joitain testejä, jotta saisin viikkopalautukseen vaadittavat 10 testiä täyteen ;)

####NimGame-luokan testit

Testasin, että createStacks luo varmasti Stack-taulukon, jonka pituus on 5. Testasin, että kasat eivät ole heti alussa tyhjiä. Testasin tikkujen poistamista ensin yhden tikun poistolla, sitten kaikkien tikkujen poistolla, sitten satunnaisen määrän poistolla. Testasin samalla, että vuoro vaihtuu jokaisen poiston jälkeen.

####NimApplication-luokan testit

Testasin, että ennen pelin aloitusta pelaajat, voittajat ja meneillään oleva peli ovat null, ja että pelin aloituksen jälkeen meneillään oleva peli ei ole null. Testasin, että siirron tekeminen vaikuttaa kasojen kokoihin. Testasin tätä sekä sallituilla, että ei-sallituilla arvoilla, sillä ei-sallitut siirrot eivät saa vaikuttaa kasojen kokoihin. Testasin, että pelivuoro vaihtuu, ja että vuorossa oleva pelaaja on se, joka kuuluukin olla. Tällöinkin, jos siirto ei ole sallittu, vuoron ei kuulu vaihtua.


####Player-luokan testit

Testasin lähinnä, että pisteiden kasvattaminen onnistuu, sekä kasvattamalla pisteitä jokin tietty määrä, että satunnainen määrä.

####Scores-luokan testit

Testasin, että tiedoston, mihin nimet ja pisteet on tallennettu, lukeminen onnistuu, ja että tiedot tallentuvat treemappiin. Testasin myös, että tietojen kirjoittaminen tiedostoon onnistuu. Testasin, että getPlayer-metodi toimii kuten pitääkin. Kokeilin myös kasvattaa pelaajan pistemäärää ja että tietojen tallentaminen sekä treemappiin että tiedostoon onnistuvat.

####Stack-luokan testit

Testasin lähinnä, että decrease-metodi toimii. Testasin sitä vähentämällä sekä tietyn määrän, että satunnaisen määrän tikkuja. Testasin myös, että kun kaikki tikut on poistettu, kasa on tyhjä. 

