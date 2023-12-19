# Enkel-Motorvognregister

Dette er en mottorvognregister som registrerer perosonnummer, navn, adresse, bilskilt, bilmerke og bilmodel. Målet med dette prosjektet er å utfordre kompetangsen min innen html, javascript og java. 

# Kartverket´s API

Undeveis i programeringen kom jeg på noen ting jeg kunne gjøre får å få motorognregisteret til å være enklere for brukerne å bruke. så først imlimenterte jeg Kartverket sin API som gjør at jeg har tilgang til alle adresser postnummer og byer i norge, dette vil si at når du begynner å fylleut adresse så kommer det opp vis det ffinnes en adresse i norge som heter det samme og vis du da trykker på den så vil den fylle det ut med postnummer og by etter. 

# Dataliste med Bilmerker og Bilmodeller

Den neste tingen som jeg la til sånn at det skulle være enklere for brukeren var å lage en data list men de mest kjente bilmerkene sånn at det er lettere for brukeren å skrive riktig bilmerke. Her kunne jeg også brukt en API hvor alle bilmerkene lå inne men det gjorde det veldig vanskelig for meg å gjøre sånn at brukeren bare fikk opp modelene til bilmerket brukeren hadde valgt

# Regler for fødselsnummer

Jeg leste meg litt opp på hvordan strukturen på personn nummer er bygget opp på og fant ut at det var en ganske mange ting man måtte passe på f.eks, individ nummer, Kjønn og Kontrollsiffer.

Individ nummeret er de 3 første tallene i personummeret disse forteller oss hvilket periode man er født i. vis man er født mellom 1854-1899 har man mellom 500-749 som indivd nummer, folk som er født mellom 1900-1999 har 000-499. personer som er født mellom 2000-2035 kan ha mellom 500-899. MEN alle født mellom 1940-2035 kan ha ett tall mellom 900-999, men da er det vanskelig å skille forskjell på hvilken periode de er født i. Det siste sifferet i personnummeret sier også hvilken kjønn man er født som, vis man er født dom gutt vil dette tallet være et oddetall og vis man er født som jente vill dette være ett partall.

I fødselsnummeret har vi også kontrollsiffer, dette er en sjekksum begregnet ut ifra de andre tallene i fødelsesnummeret, dette er det mulig å regne ut men er et kanske komlpisert regnestykke.

alle disse kravene har jeg laget en kode som går igjenom å sjekker om det er et riktig fødselsnummer

# Regler for Bilskilt

Jeg la til en regel for bilskilt, som er at strukturen må være 2 bokstaver + 5 tall

# Søke funkson

Jeg har også lagt til sånn at man kan søke etter person bilskilt eller bilen, dette gjorde jeg sånn at det er enklere for brukeren å finne bilen eller personen brukeren er på jakt etter, spesielt vis det er regisrert mange biler.

# Automatisk fylle ut av skjemaet

Jeg har også lagt til en knapp som heter "Fyll ut automatisk", denne knappen har jeg lagt til sånn at det skal være enklere å gå igjenom funksoner som søk. Denne knappen kjører en funkson som jeg har laget denne genererer et tilfeldig personnr på riktig struktur, den lager også et fiktivt navn som den plukker ut ifra to lister jeg har laget med mange navn, den genererer også en fiktiv adresse ut ifra 3 forskjellige lister som består av gateadresser, postnummer (Her hadde det vært enklere å lage en komando som genererte et tilfeldig 4 sifret tall), og byer. Den genererer også et tilfeldig bilksilt på riktig struktur. Den velger også et tilfeldig bilmerke og en tilfeldig milmodel som bilmerke har gitt ut.

# Slette knapp

Jeg har også lagt til en slett knapp på alle bilene sånn at man kan slette en vis man legger en bil til ved en feil.
