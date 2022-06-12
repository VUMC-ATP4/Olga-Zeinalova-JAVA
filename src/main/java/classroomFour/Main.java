package classroomFour;

public class Main {
    public static void main(String[] args) {
        int vecums = 15;
//objekts viens
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";

        //objekts divi
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Gertrūdes iela";


        majaDivi.printetAdresi();
        majaViens.printetAdresi();
        majaDivi.ielasNosaukums = "Izmainīts nosaukums";
        majaDivi.printetAdresi();


Darbinieks darbinieksViens = new Darbinieks();
darbinieksViens.dzimums = "Vīrietis";
darbinieksViens.vecums = 34;
darbinieksViens.amats = "grāmatvedis";
darbinieksViens.darbaPieredze = 3.5;

darbinieksViens.printetDarbinieks();





    }

}
