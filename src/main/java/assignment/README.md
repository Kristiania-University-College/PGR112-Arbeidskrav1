### Oppgaven:

I filmen [Objektorientering i Sopra Steria](https://kristiania.instructure.com/courses/14902/pages/film-objektorientering-i-sopra-steria?module_item_id=627164) (tid: 9.14–10.51) nevner Johannes en oppgave som de av og til benytter i ansettelsesprosessen. Oppgaven er: Lag et Java-program der brukeren kan skrive inn et tall, og få en tekstlig beskrivelse fra programmet av hvordan tallet uttales på norsk. Hvis for eksempel brukeren skriver inn «101», skal programmet skrive ut «Ett hundre og en».

Høres kanskje enkelt ut, men det dukker nok opp noen problemstillinger underveis... Du kan selv velge hvor mange tall løsningen din kan håndtere.


Koden din skal ligge i form av java-filer i `src/main/java/assignment` folderen. 
Du kan bruke testene i `src/test/java/assignment/TestAssignment.java` folderen for å teste løsningen din underveis.

---

## Del #1:

Opprett en ny klasse _NumberConverter_ med 

- felt _public static final int MAXNUMBER_ -- dette setter du til maksimum tallet du velger å håndtere. 
- metode _printInNorwegian_ med parameter _INTEGER inputNumber_ - som tar imot ønsket tall og skriver til standard output tallet i Norsk tekst. Merk at parameteren skal ha ikke-primitive datatype INTEGER.

## Del #2:

Opprett en ny compact source fil _JavaProgram_ som

- oppretter et nytt objekt fra klasse _NumberConverter_
- leser fra standard input
- kaller objektmetoden _printInNorwegian_ med tallet 

---

## Tips og teknisk informasjon

> For at GitHub classroom klarer å teste koden din automatisk er det viktig at du skriver koden nøyaktig slik som det står i oppgave beskrivelsen - samt stor og småbokstaver

> Hver gang du pusher opp koden din, blir det kjør to tester:

1) en test som sjekker om du har brukt riktikt syntakseni DEL #1.
2) en test som sjekker om _printInNorwegian_ skriver ut riktig tekst til standard-output avhengig av _MAXNUMBER_ du setter. F.e. setter du _MAXNUMBER = 100_ ville testene kun kjøre for tall opp til 100. 

