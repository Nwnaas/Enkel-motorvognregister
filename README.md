# Enkel-Motorvognregister


Dette registeret for biler holder styr på viktig info som personnummer, kjønn
navn, adresse, bilskilt, bilmerke, registrerings sted og bilmodell. 
Målet med prosjektet er å bli bedre på HTML, 
JavaScript og Java. 
Jeg vil ikke bare lage en simpel motorvognregister, 
jeg vil utfordre min kunskap ved å impimentere APIer, lage datalister og lage regler for fødselsnummer og bilskilt.

## Kartverket´s API

Undeveis i programeringen kom jeg på noen ting jeg kunne gjøre får å få motorognregisteret til å være enklere for brukerne å bruke. 
Først implimenterte jeg Kartverket sin API som gjør at jeg har tilgang til alle adresser, postnummer og byer i Norge, 
dette vil si at når du begynner å fylle ut adressen din så kommer det opp vis det finnes en adresse i norge som heter det samme og vis du da trykker på den så vil den fylle det ut med postnummer og by. 

## Dataliste med Bilmerker og Bilmodeller

Den neste tingen som jeg la til sånn at det skulle være enklere for brukeren var å lage en data list men de mest kjente bilmerkene sånn at det er lettere for brukeren å skrive riktig bilmerke. 
Her kunne jeg også brukt en API hvor alle bilmerkene lå inne men det gjorde det veldig vanskelig for meg å gjøre sånn at brukeren bare fikk opp modelene til bilmerket brukeren hadde valgt

## Regler for fødselsnummer

Jeg leste meg litt opp på hvordan strukturen på personn nummer er bygget opp på og fant ut at det var en ganske mange ting man måtte passe på f.eks, individ nummer, Kjønn og Kontrollsiffer.

#### Individ nummeret

Individ nummeret er de 3 første tallene i personummeret disse forteller oss hvilket periode man er født i. 
Vis man er født mellom 1854-1899 har man mellom 500-749 som indivd nummer, 
folk som er født mellom 1900-1999 har 000-499. 
personer som er født mellom 2000-2035 kan ha mellom 500-899. 
MEN alle født mellom 1940-2035 kan ha ett tall mellom 900-999, 
men da er det vanskelig å skille forskjell på hvilken periode de er født i. 
Det siste sifferet i personnummeret sier også hvilken kjønn man er født som, 
vis man er født dom gutt vil dette tallet være et oddetall og vis man er født som jente vill dette være ett partall.

#### Fødselsnummeret

I fødselsnummeret har vi også kontrollsiffer, 
dette er en sjekksum begregnet ut ifra de andre tallene i fødelsesnummeret, 
dette er det mulig å regne ut men er et kanske komlpisert regnestykke.

Alle disse kravene har jeg laget en kode som går igjenom å sjekker om det er et riktig fødselsnummer

## Regler for Bilskilt

Jeg la til en regel for bilskilt, som er at strukturen må være 2 bokstaver + 5 tall

## Søke funkson

Jeg har også lagt til sånn at man kan søke etter person bilskilt eller bilen, 
dette gjorde jeg sånn at det er enklere for brukeren å finne bilen eller personen brukeren er på jakt etter, 
spesielt vis det er regisrert mange biler.

## Automatisk fylle ut av skjemaet

Jeg har også lagt til en knapp som heter 'Fyll ut automatisk'. 
Hensikten med denne knappen er å gjøre det enklere å gjennomgå hvordan ting vil se ut. 
Når du trykker på denne knappen, kjører den en funksjon jeg har laget. 
Denne funksjonen genererer 20 tilfeldige personer og biler.

#### Fødselsnummer

Fødselsnummer som blir generert blir generert med riktig struktur. 

#### Navn

Den oppretter også et fiktivt navn ved å velge fra to lister jeg har laget som inneholder med mange navn. 

#### Adresse

Videre genererer den en fiktiv adresse basert på tre forskjellige lister som inneholder gateadresser, 
postnummer (her kunne en kommando ha gjort det enklere ved å generere et tilfeldig 4-sifret tall), og byer. 

#### Bilskilt

I tillegg lager den et tilfeldig bilskilt med riktig struktur.

#### Bil og bilmerke

Funksjonen velger også tilfeldig et bilmerke og en modell fra en liste over bilmerker og tilhørende modeller. 
Dette gir en helhetlig og tilfeldig fiktiv informasjon når du bruker 'Fyll ut automatisk'-knappen.

## Slette knapp

Jeg har lagt til en slett knapp på slutten av hver rad, 
dette har jeg gjordt sånn at det skal være enkelt å endre noe vis man vil fjærne bilen i tilfelle man har skrevet feil eller lagt inn ved et uhell

## Registrerings sted

Jeg leste meg litt opp på Bilskilt og fant fort ut av av de boksavene som er i bilskiltet har noe å si om hvor bilen er registrert.
Derfor valgte jeg å implementere dette inn i koden sånn at man fort kan se hvor bilen er registrert.
Dette gjorde jeg ved å lage en stor liste å lagde en funksjon som lette etter de to første bokstavene i skiltet å finner ut hvor den er registrert.

# Brukertesting

## Bruker 1.

### Oppgave til brukeren

1. #### Gi nettsiden et overblikk. Hva synes du?

    Nettsiden virker ryddig med en enkel og oversiktlig layout.

2. #### Hva tror du denne nettsiden er?

    Det ser ut som en nettside for registrering av biler og eiere i et motorvognregister.

3. #### Hvor tror du at du skal skrive får å legge en bruker inn i motorvogn registeret?

    Jeg vil tippe at det skal skrives i den boksen som er i midten av skjermen.

4. #### Klarer du å finne adressen din ved å fylle ut felltet "Eiers adresse"?

    Ja, det var veldig enkelt.

5. #### Klarer du å finne favoritt bilmerket og favorittbilmoddelen din?

    Ja, det klarte jeg veldig fort

6. #### Klarer du å registrere en bruker uten hjelp fra knappen "Fyll ut automatisk"?

    Ja, men tokk noen forsøk siden jeg bare fant opp et tilfeldig fødslesnummer, 
   og den klarte å skjønne at den var falsk.

7. #### Kan du legge til 20 brukere automatisk?

    Ja, det var ikke så vanskelig, måtte bare trykke på en knapp.

8. #### Klarer du å søke etter bilmerke?

    Ja, det var ganske enkelt.

9. #### Klarer du å slette en registrert bil?

    Ja, det var også ganske enkelt.

### Tilbakemeldigsspørsmåll

1. #### Hva synes du om nettsiden?

   Nettsiden virker brukervennlig og effektiv for registrering av biler.

2. #### Hvordan var det å navigere rundt på siden?

   Jeg synes det var lett å navigere rundt på nettsiden.

3. #### Hva synes du om fargene?

   Jeg synes blått og hvit passer veldig bra med hværandre.

4. #### Hvordan synes du det var å fylle ut skjemaet var det noe som manglet?

   Jeg synes den fikk men det meste, men kansje at man burde ha med fargen på bilen.

5. #### Var det oversiktlig måten man kunne søke på adresser og bilmerker/bilmodeller?

   Ja det synes jeg, det tokk kansje litt lang tid å finne adressen, men skjønner at det kan ta litt lang tid når man må gå igjennom alle adresser i norge.

6. #### Var det oversiklig måten man kunne søke ettter personer eller biler?

   Ja det synes jeg, synes det var bra at man kunne søke på alle ting inkudert kjønn og bil registrerings sted.

7. #### Noen andre ting som kan forbedres?

   Nei, synes egentlig ikke at det var noe mere som kunne forbedres utenom at man skal kunne legge til hvilken farge bilen er.

## Bruker 2.

### Oppgave til brukeren

1. #### Gi nettsiden et overblikk. Hva synes du?

   Det ser bra ut.

2. #### Hva tror du denne nettsiden er?

   Jeg tipper det er en mottorvognregister fordi det står i stor skrift.

3. #### Hvor tror du at du skal skrive får å legge en bruker inn i motorvogn registeret?

   Den boksen i midten.

4. #### Klarer du å finne adressen din ved å fylle ut felltet "Eiers adresse"?

   Ja.

5. #### Klarer du å finne favoritt bilmerket og favorittbilmoddelen din?

   Ja.

6. #### Klarer du å registrere en bruker uten hjelp fra knappen "Fyll ut automatisk"?

   Ja.

7. #### Kan du legge til 20 brukere automatisk?

   Ja.

8. #### Klarer du å søke etter bilmerke?

   Ja.

9. #### Klarer du å slette en registrert bil?

   Ja.

### Tilbakemeldigsspørsmåll

1. #### Hva synes du om nettsiden?

   Kult.

2. #### Hvordan var det å navigere rundt på siden?

   Lett.

3. #### Hva synes du om fargene?

   bra.

4. #### Hvordan synes du det var å fylle ut skjemaet var det noe som manglet?

   Det var lett, synes den inneholt alt man trenger.

5. #### Var det oversiktlig måten man kunne søke på adresser og bilmerker/bilmodeller?

   Ja.

6. #### Var det oversiklig måten man kunne søke ettter personer eller biler?

   Ja.

7. #### Noen andre ting som kan forbedres?

   Nei, synes den var bra.

## Bruker 3.

### Oppgave til brukeren

1. #### Gi nettsiden et overblikk. Hva synes du?

   Jeg synes den ser ryddig ut

2. #### Hva tror du denne nettsiden er?

   Det ser ut som at det er en motorvognregister hvor man kan registrere navn bilskilt bilmerke osv.

3. #### Hvor tror du at du skal skrive får å legge en bruker inn i motorvogn registeret?

   Jeg vil anta at det er i midten av skjermen.

4. #### Klarer du å finne adressen din ved å fylle ut felltet "Eiers adresse"?

   Ja, jeg klarte å finne adressen min veldig fort.

5. #### Klarer du å finne favoritt bilmerket og favorittbilmoddelen din?

   Nei, jeg klarte lett å finne bilmerke men bilmodelen var ikke på listen.

6. #### Klarer du å registrere en bruker uten hjelp fra knappen "Fyll ut automatisk"?

   Ja det klarte jeg, jeg måtte bare bruke 2 forsåk siden jeg bare skrev inn noen tilfeldige tall på fødselsnummeret.

7. #### Kan du legge til 20 brukere automatisk?

   Ja, men det tokk litt tid før jeg skjønte at det var den knappen.

8. #### Klarer du å søke etter bilmerke?

   Ja, dette var ganske lett

9. #### Klarer du å slette en registrert bil?

   Ja, det er bare å trykke på slett til høyre for bilen

### Tilbakemeldigsspørsmåll

1. #### Hva synes du om nettsiden?

   Jeg synes den er ganske oversiktlig men det var noen få ting jeg savnet

2. #### Hvordan var det å navigere rundt på siden?

   Det var ikke noe problem å navigere rundt på siden.

3. #### Hva synes du om fargene?

   Jeg like fargene veldig godt, men kansje litt kjedelig.

4. #### Hvordan synes du det var å fylle ut skjemaet var det noe som manglet?

   Jeg synes det var veldig lett

5. #### Var det oversiktlig måten man kunne søke på adresser og bilmerker/bilmodeller?

   Ja det var veldig lett, uten om at favoritt bil modellen min ikke var der.

6. #### Var det oversiklig måten man kunne søke ettter personer eller biler?

   Ja, det var veldig oversiktlig

7. #### Noen andre ting som kan forbedres?

   Ja jeg har noen ting du burde gjøre.
   
   Først så hadde jeg endret navnet på knappen som automatisk legger til brukere.
   
   Det andre jeg hadde gjordt er å legge til bilmodellen til "Lotus" som heter "Eletre"

   Det tredde jeg hadde gjord er å ha litt mere farger sånn at ikke nettsiden er så kjedelig

## Oppsumering av Brukertesting

### Ting jeg må endre på:
   - [x] At man ikke kunne velge farge på bilen
   - [x] Endre navnet på knappen som legger til 20. brukere.
   - [x] Legge til bilmodellen "Eletre", som er en bil "Lotus" har laget.
   - [x] At jeg må endre litt på hvordan det ser ut siden det ser litt skjedelig ut.

# Litteaturliste

   ### Kilder for fødselsnummer

   - https://no.wikipedia.org/wiki/F%C3%B8dselsnummer
   - https://www.skatteetaten.no/person/folkeregister/identitetsnummer/fodselsnummer/

   ### Kilder for bilskilt

   - https://no.wikipedia.org/wiki/Kjennemerke_for_motorkj%C3%B8ret%C3%B8y_i_Norge
   - https://snl.no/norske_bilkjennetegn

   ### Kilder for Kartverket´s API

   - https://ws.geonorge.no/adresser/v1/
   - https://kartverket.no/api-og-data/eiendomsdata/brukarrettleiing-adresse-api

   ### Kilder brukt igjennom hele prossessen

   - https://www.w3schools.com/
   - https://chat.openai.com/