import java.time.LocalDate;

class Main{

    public static void main(String[] args){
        Student janNovak = new Student();

        janNovak.datumNarozeni = LocalDate.parse("2002-04-23");
        janNovak.jmeno = "Jan";
        janNovak.prijmeni = "Novak";
        janNovak.trida = "4.C";

        janNovak.predmet1 = new Predmet("Cesky Jazyk", 2);
        janNovak.predmet2 = new Predmet("Anglicky Jazyk", 3);
        janNovak.predmet3 = new Predmet("Matematika", 1);
        janNovak.predmet4 = new Predmet("Dejepis", 2);

        System.out.println("Student "+janNovak.jmeno +" "+janNovak.prijmeni
                +" Slozeno: "+jeMaturitniZkouskaDokoncena(janNovak)+" Maturitni zkouska: "+ maStudentMaturitniZkousku(janNovak));

        Student tomasPropadl = new Student();

        tomasPropadl.datumNarozeni = LocalDate.parse("2002-02-23");
        tomasPropadl.jmeno = "Tomas";
        tomasPropadl.prijmeni = "Propadl";
        tomasPropadl.trida = "4.C";

        tomasPropadl.predmet1 = new Predmet("Cesky Jazyk", 5);
        tomasPropadl.predmet2 = new Predmet("Anglicky Jazyk", 4);
        tomasPropadl.predmet3 = new Predmet("Matematika", 5);
        tomasPropadl.predmet4 = new Predmet("Dejepis", 2);

        System.out.println("Student "+tomasPropadl.jmeno +" "+tomasPropadl.prijmeni
                +" Slozeno: "+jeMaturitniZkouskaDokoncena(tomasPropadl)+" Maturitni zkouska: "+ maStudentMaturitniZkousku(tomasPropadl));


        Student marekNehoda = new Student();

        marekNehoda.datumNarozeni = LocalDate.parse("2002-01-23");
        marekNehoda.jmeno = "Marek";
        marekNehoda.prijmeni = "Nehoda";
        marekNehoda.trida = "4.C";

        marekNehoda.predmet1 = new Predmet("Cesky Jazyk", 1);
        marekNehoda.predmet2 = new Predmet("Anglicky Jazyk", 1);
        marekNehoda.predmet3 = new Predmet("Matematika", null);
        marekNehoda.predmet4 = new Predmet("Dejepis", null);

        System.out.println("Student "+marekNehoda.jmeno +" "+marekNehoda.prijmeni
                +" Slozeno: "+jeMaturitniZkouskaDokoncena(marekNehoda)+" Maturitni zkouska: "+ maStudentMaturitniZkousku(marekNehoda));

    }

    static Boolean maStudentMaturitniZkousku(Student student){

        if ((student.predmet1 == null || student.predmet1.hodnoceni == null)
                ||(student.predmet2 == null || student.predmet2.hodnoceni == null)
                ||(student.predmet3 == null || student.predmet3.hodnoceni == null)
                ||(student.predmet4 == null || student.predmet4.hodnoceni == null)){
            return null;
        }

        return (student.predmet1.hodnoceni >= 1 && student.predmet1.hodnoceni < 5)
            && (student.predmet2.hodnoceni >= 1 && student.predmet2.hodnoceni < 5)
                && (student.predmet3.hodnoceni >= 1 && student.predmet3.hodnoceni < 5)
                && (student.predmet4.hodnoceni >= 1 && student.predmet4.hodnoceni < 5);
    }

    static Boolean jeMaturitniZkouskaDokoncena(Student student){
        return ((student.predmet1 != null && student.predmet1.hodnoceni != null )
                && (student.predmet2 != null && student.predmet2.hodnoceni != null )
                && (student.predmet3 != null && student.predmet3.hodnoceni != null )
                && (student.predmet4 != null && student.predmet4.hodnoceni != null ));
    }

}