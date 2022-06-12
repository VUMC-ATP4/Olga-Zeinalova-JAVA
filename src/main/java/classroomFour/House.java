package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platums;
    boolean irStavvieta;
    char valuta;


    public void printetAdresi(){
        System.out.println("Mājas adtrese ir: " + ielasNosaukums + "" + majasNumurs);
    }


}
