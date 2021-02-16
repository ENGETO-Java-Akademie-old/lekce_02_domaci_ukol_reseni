# Java 1 Lekce 2 Domaci Ukol Reseni
Reseni domaciho ukolu Java 1 - Lekce 2
## Zadani
[Zadani domaciho ukolu](https://github.com/ENGETO-Java-Akademie/lekce_02_domaci_ukol)

Potřebujeme nějak evidovat maturitní výsledky studentů - každý student má jméno, příjmení, datum narození, patří do nějaké třídy a maturuje ze čtyř předmětů - z každého dostane jednu známku a nakonec buď prospěje z vyznamenáním, prospěje, a nebo neprospěje - všechny tyhle údaje potřebujeme nějak evidovat a na vás je vymyslet a naprogramovat to jak.

A protože jsou naši programátoři poněkud líní, tak je velmi potěší, když jestě vytvoříte i metodu, pomocí které půjde jednoduše vypsat, jak ten daný student dopadl a druhou metodu, která zjistí, jestli už má maturitu za sebou.

### Analyza

#### Objekty
Trida `Student`

- Jmeno - `String jmeno`
- Prijmeni - `String prijmeni`
- Datum Narozeni - `LocalDate datumNarozeni`
- Trida - `String trida`
- Predmet1 - `Predmet predmet1`
- Predmet2 - `Predmet predmet2`
- Predmet3 - `Predmet predmet3`
- Predmet4 - `Predmet predmet4`

V dalsi lekci si ukazeme, jak se vyhnout opakovani promenych `predmet1, predmet2, ...` a ulozit je do nejake slozitejsi datove struktury.

Trida `Predmet` 
- Jmeno predmetu - `String nazev`
- Znamka z predmetu - `Integer znamka`

#### Metody

Metoda na zjisteni ukonceni maturitni zkousky - vraci `true` - prospel, `false` - neprospel nebo `null` - jeste nedokoncil hodnoceni. `Boolean maStudentMaturitniZkousku(Student student)`

Zadani se da interpretovat i jinym zpusobem a take implementace muze vypadat jinak. Napriklad metoda muze vracet `enum StavMaturity{PROSPEL, NEPROSPEL, NEHODNOCEN}` nebo jenom `true` a `false`

Metodu na zjisteni jestli je maturitni zkouska dokoncena definujeme takto: Pokud student ma ze vsechny predmety definovane a z kazdeho ma nejakou znamku, tak je maturita dokoncena. I kdyz s vysledkem neprospel. `Boolean jeMaturitniZkouskaDokoncena(Student student)`

