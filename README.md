# Enkel-Motorvognregister

Dette er en mottorvognregister som registrerer perosonnummer, navn, adresse, bilskilt, bilmerke og bilmodel. Målet med dette prosjektet er å utfordre kompetangsen min innen html, javascript og java. 

# Kartverket´s API

Undeveis i programeringen kom jeg på noen ting jeg kunne gjøre får å få motorognregisteret til å være enklere for brukerne å bruke. så først imlimenterte jeg Kartverket sin API som gjør at jeg har tilgang til alle adresser postnummer og byer i norge, dette vil si at når du begynner å fylleut adresse så kommer det opp vis det ffinnes en adresse i norge som heter det samme og vis du da trykker på den så vil den fylle det ut med postnummer og by etter. 

# Dataliste med Bilmerker og Bilmodeller

Den neste tingen som jeg la til sånn at det skulle være enklere for brukeren var å lage en data list men de mest kjente bilmerkene sånn at det er lettere for brukeren å skrive riktig bilmerke. Her kunne jeg også brukt en API hvor alle bilmerkene lå inne men det gjorde det veldig vanskelig for meg å gjøre sånn at brukeren bare fikk opp modelene til bilmerket brukeren hadde valgt

# Regler for person nummer og bilskilt

Jeg la også inn noen regler for hva person nummeret og bilskiltet måtte inneholde. på personnummeret gjorde jeg sånn at de 2 første tallene måtte inneholde ett tall mellom "01" og "31" og at de to tallene etter der måtte inneholde ett tall mellom "01" og "12", resten av tallene kan jo være tilfeldig. jeg kunne også lagt til en regel hvor man bare kan skrive 31 dager vis det er en måned som inneholder 31 men dette tror jeg hadde vært vanskleig å implimentere speiselt når det er skuddår. Jeg la også inn en regel som gjorde sånn at den ser igjenom stukturen på bilskiltet å sjekker om det består av 2 bokstaver og 5 tall.

# Søke funkson

Jeg har også lagt til sånn at man kan søke etter person bilskilt eller bilen, dette gjorde jeg sånn at det er enklere for brukeren å finne bilen eller personen brukeren er på jakt etter, spesielt vis det er regisrert mange biler.

# Automatisk fylle ut av skjemaet

Jeg har også lagt til en knapp som heter "Fyll ut automatisk", denne knappen har jeg lagt til sånn at det skal være enklere å gå igjenom funksoner som søk. Denne knappen kjører en funkson som jeg har laget denne genererer et tilfeldig personnr på riktig struktur, den lager også et fiktivt navn som den plukker ut ifra to lister jeg har laget med mange navn, den genererer også en fiktiv adresse ut ifra 3 forskjellige lister som består av gateadresser, postnummer (Her hadde det vært enklere å lage en komando som genererte et tilfeldig 4 sifret tall), og byer. Den genererer også et tilfeldig bilksilt på riktig struktur. Den velger også et tilfeldig bilmerke og en tilfeldig milmodel som bilmerke har gitt ut.

# Slette knapp

Jeg har også lagt til en slett knapp på alle bilene sånn at man kan slette en vis man legger en bil til ved en feil.
