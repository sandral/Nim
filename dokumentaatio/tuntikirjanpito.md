###Tuntikirjanpito

####Maanantai 12.5.
Yritin saada maven-hässäkkää toimimaa netbeansin kanssa, ei onnistunut, alkoi väsyttää, luovutin.
Käytetty aika: n. 2h

####Tiistai 13.5.
Asensin Netbeansin uudelleen, oli hiukkasen säätöä, mutta lopulta onnistui ja sain maven-projektin luotua. Loin ohjeessa mainitun xml-tiedoston ja tein pom.xml-tiedostoon ne muutokset, mitä ohjeissa käskettiin. Oli vähän säätöä myös git:in kanssa, mutta lopulta sain senkin toimimaan. 
Käytetty aika: n. 2h

####Keskiviikko 14.5.
Aloitin dokumentaation latexilla, mutta sitten huomasin, että siihen pitää käyttää markdownia. Pähkäilin sen kanssa hetken, kunnes ymmärsin mikä on pelin henki. 
Aloitin ohjelmoimaan peliä, teen aluksi tekstipohjaisen version ja myöhemmin graafisen käyttöliittymän. 

Sain ihan hyvin peliä aloitettua.
Käytetty aika: 3-4h

####Torstai 15.5.
Ohjelma tuli ihan hyvään vaiheeseen, sitä pystyi jo pelaamaan. Erikoistapaukset, esimerkiksi se, että yrittää ottaa kasasta enemmän tikkuja kuin mitä siinä on, eivät vielä käsitelty.
Käytetty aika: 3h

####Perjantai 16.5 & lauantai 17.5 & sunnuntai 18.5.
Käytetty aika: 0h

####Maanantai 19.5.
Käsittelin kaikki erikoistapaukset, kasasta on pakko ottaa vähintään yksi tikku, mutta ei voi ottaa enempää tikkuja kuin mitä siinä on. Toisaalta tyhjästä kasasta ei voi ottaa tikkuja. Myöskään ei voi yrittää ottaa sellaisesta kasasta jonka indeksi on suurempi kuin mitä kasoja on.
Aloitin testausta, mutta on kovin vaikea keksiä, mitä testaisin ja millä tavalla. 
Käytetty aika 3-4h


####Tiistai 20.5.
Päätin muuttaa ohjelman rakennetta hieman ja luoda sinne Stack-luokan joka kuvaa yhtä tikkukasaa. Tämä siksi, että ohjelmaan tulisi lisää rakennetta -> helpompi tehdä testejä. Tein tällaisen luokan jo aivan aluksi, mutta ajattelin, että se on kärpäsen ampumista tykillä, mutta eilen huomasin, että sellaisenaan ohjelmalle on aika hankala keksiä testejä.
Tein muutamia testejä sekä Stack- että Player-luokalle. 
Käytetty aika 3-4h

####Keskiviikko 21.5.
Minulla on suuria vaikeuksia päättää, millainen rakenne ohjelmalla pitäisi olla...
Suunnittelin ja muokkasin ohjelman rakennetta ja piirsin luokkakaavion.
Käytetty aika 3-4h

####Torstai-Sunnuntai
En tehnyt mitään

####Maanantai 26.5.
Tein tekstikäyttöliittymää
Käytetty aika n. 1h

####Tiistai 27.5.
Tein tekstikäyttöliittymää
Käytetty aika n. 2h

####Keskiviikko 28.5.
Tein tekstikäyttöliittymää yms.
Käytetty aika n. 2h

####Torstai 29.5.
En tehnyt mitään

####Perjantai 30.5.
Valmistelin viikkopalautusta 
Käytetty aika n. 2 h

####Maanantai 2.6.
Luin tenttiin
Käytetty aika 0 h

####Tiistai 3.6.
Luin tenttiin
Käytetty aika n. 0 h

####Keskiviikko 4.6.
Aloitin graafista käyttistä.
käytetty aika n. 3 h

####Torstai 5.6.
Yritin tehdä graafista käyttöliittymää.
Käytetty aika: en muista


####Perjantai 6.6.
Lapsiperhejuttujen takia en ehtinyt tehdä mitään.
Käytetty aika 0 h


####Lauantai 7.6.
Tein graafista käyttöliittymää 
Käytetty aika n. 1 h

####Sunnuntai 8.6.
Pyöräilin kotiin Lahdesta, meni koko päivä.
Illalla valmistelin viikkopalautusta ja yritin sekvenssikaavion ideaa, mutta en ymmärtänyt.
Käytetty aika n. 2 h

####Maanantai 9.6.
Tein kaikenlaista yleistä.
Käytetty aika n. 2 h

####Tiistai 10.6.
Kävin ohjelmointipajassa ja sain apua kaavioiden piirtämiseen.
Valmistelin viikkopalautuksen.
Käytetty aika n. 4 h

####Keskiviikko 11.6.
Aloittelin tuloslistan tekemistä.
Käytetty aika n. 2 h

####Torstai 12.6.
Tein tuloslistaa huonolla menestyksellä.
Käytetty aika n. 2 h

####Perjantai 13.6.
Tein tuloslistaa edelleen huonolla menestyksellä.
Käytetty aika n. 2 h

####Lauantai 14.6.
Tein tuloslistaa, netbeans meni jotenkin sekaisin eikä osannut rakentaa projektia. Säädin kaike
nlaista, lopulta deletoin projektin nb:stä ja avasin sen uudelleen nb:ssä, ja se alkoi toimia.
Käytetty aika n. 4 h

####Sunnuntai 15.6.
Aamulla herättyäni tajusin yhtäkkiä, miten se tuloslista pitää tehdä. Tein sen ja sain sen toimimaan tekstiveriossa. Päivitin luokkakaavion.
Käytetty aika n. 4 h


####Maanantai 16.6.
Veljeni auttoi gui:n kanssa. Huomasin myös, että tuloslista järjestyykin avainten eli pelaajien nimien eikä pistemäärien perusteella. Ratkaisin asian (ehkä kömpelösti) siirtämällä listan tiedot priorityqueuehen tulostamista varten. 
Jouduin myös kirjoittamaan testejä uusiksi, sillä muutin muutamien parametrien tyyppejä. Päivitin javadoccia ja tein kaikenlaista yleistä.
Käytetty aika n. 6 h

####Tiistai 17.6.
Korjailin testejä, päivitin tuntikirjanpitoa. Kävin demotilaisuudessa. Piirsin sekvenssikaavioita uusiksi.
Käytetty aika n. 3,5 h

####Keskiviikko 18.6.
En tehnyt mitään
Käytetty aika 0 h

####Torstai 19.6.
Kirjoitin käyttöohjeet, tarkistin, että kaikki on suurinpiirtein kunnossa palautusta varten. 