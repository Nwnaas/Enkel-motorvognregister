# Enkel-Motorvognregister

Dette er en mottorvognregister som registrerer perosonnummer, navn, adresse, bilskilt, bilmerke og bilmodel. 
Målet med dette prosjektet er å utfordre kompetangsen min innen html, javascript og java. 

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

#### fødselsnummeret

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