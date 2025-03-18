import java.util.ArrayList;
import java.util.Scanner;

public class Admin{

    private String name;
    private String lastname;
    private  kala kala;
    private char input;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public Admin(String name,String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Admin(kala kk) {
        this.kala = kk;
    }
    public void show_kala() {
        switch (kala) {
            case shoyande:
                ArrayList shoyandeh = new ArrayList<>();


                shoyandeh.add("tayd");
                   int index = shoyandeh.indexOf("tayd");
                     if(index<0){
                         System.out.println("vojood nadarad");
                         System.out.println("tayd ezafe beshe?(yes/no)");
                         Scanner scanner = new Scanner(System.in);
                         String input =scanner.nextLine();
                         if (input.equals("yes")){
                             shoyandeh.add("tayd");
                         }
                     }
                     else
                     {
                         System.out.println("vojood darad");
                     }


                     shoyandeh.add("rika");
                     int index1 = shoyandeh.indexOf("rika");
                       if (index1<=0){
                           System.out.println("vojood nadarad");
                           System.out.println("rika ezafe beshe?(yes/no)");
                           Scanner scanner = new Scanner(System.in);
                           String input =scanner.nextLine();
                           if (input.equals("yes")){
                               shoyandeh.add("rika");
                           }
                       }
                       else {
                           System.out.println("vojood darad");
                       }


                   shoyandeh.add("maye lebas-shoyee");
                       int index2 = shoyandeh.indexOf("maye lebas-shoyee");
                       if (index2<0){
                           System.out.println("vojood  nadarad");
                           System.out.println("maye lebas-shoyee ezafe beshe?(yes/no)");
                           Scanner scanner = new Scanner(System.in);
                           String input = scanner.nextLine();
                           if (input.equals("yes")){
                               shoyandeh.add("maye lebas-shoyee");
                           }
                       }
                       else {
                           System.out.println("vojood darad");
                       }

                   shoyandeh.add("vaytex");
                       int index3 = shoyandeh.indexOf("vaytex");
                       if (index3<0){
                           System.out.println("vojood nadarad");
                           System.out.println("vaytex ezafe beshe?");
                           Scanner scanner = new Scanner(System.in);
                           String input = scanner.nextLine();
                           if (input.equals("yes")){
                               shoyandeh.add("vaytex");
                           }
                       }
                       else {
                           System.out.println("vojod darad");
                       }
                       System.out.println(shoyandeh);
                       break;

            case behdashti:
                ArrayList behdashti = new ArrayList<>();

                behdashti.add("shampo");
                int index4 = behdashti.indexOf("shampo");
                if(index4<0){
                    System.out.println("vojood nadarad");
                    System.out.println("shampo ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        behdashti.add("shampo");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                behdashti.add("saboon");
                int index5 = behdashti.indexOf("saboon");
                if (index5<0){
                    System.out.println("vojood  nadarad");
                    System.out.println("saboon ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if(input.equals("yes")){
                        behdashti.add("saboon");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                behdashti.add("body splash");
                int index6 = behdashti.indexOf("body splash");
                if (index6<0){
                    System.out.println("vojood nadarad");
                    System.out.println("body splash ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        behdashti.add("body splash");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                behdashti.add("lif");
                int index7 = behdashti.indexOf("lif");
                if (index7<0){
                    System.out.println("vojood nadarad");
                    System.out.println("lif ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if(input.equals("yes")){
                        behdashti.add("lif");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                behdashti.add("dastmal");
                int index8 = behdashti.indexOf("dastmal");
                if (index8<0){
                    System.out.println("vojood nadarad");
                    System.out.println("dastmal ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if(input.equals("yes")){
                        behdashti.add("dastmal");
                    }
                }
                else{
                    System.out.println("vojod darad");
                }
                  System.out.println(behdashti);
                break;

            case ghazayii:
                ArrayList ghazayii =new ArrayList<>();
                ghazayii.add("makaroni");
                int index9 = ghazayii.indexOf("makaroni");
                if (index9<0){
                    System.out.println("vojood nadarad");
                    System.out.println("makaroni ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if(input.equals("yes")){
                        ghazayii.add("makaroni");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                ghazayii.add("reshte soop");
                int index10 = ghazayii.indexOf("reshte soop");
                if (index10<0) {
                    System.out.println("vojood nadarad");
                    System.out.println("reshte soop ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        ghazayii.add("reshte soop");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                ghazayii.add("reshte ash");
                int index11 = ghazayii.indexOf("reshte ash");
                if (index11<0){
                    System.out.println("vojood nadarad");
                    System.out.println("reshte ash ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        ghazayii.add("reshte ash");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                ghazayii.add("rob");
                int index12 = ghazayii.indexOf("rob");
                if (index12<0){
                    System.out.println("vojood nadarad");
                    System.out.println("rob ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        ghazayii.add("rob");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                ghazayii.add("berenj");
                int index13 = ghazayii.indexOf("berenj");
                if (index13<0){
                    System.out.println("vojood nadarad");
                    System.out.println("berenj ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        ghazayii.add("berenj");
                    }
                }
                else{
                    System.out.println("vojod darad");
                }
                System.out.println(ghazayii);
                break;


            case noshidani:
                ArrayList noshidani = new ArrayList<>();
                noshidani.add("ab-porteghal");
                int index14 = noshidani.indexOf("ab-porteghal");
                if (index14<0){
                    System.out.println("vojood nadarad");
                    System.out.println("ab-porteghal ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        noshidani.add("ab-porteghal");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }

                noshidani.add("ab-havij");
                int index15 = noshidani.indexOf("ab-havij");
                if (index15<0){
                    System.out.println("vojood nadarad");
                    System.out.println("ab-havij ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        noshidani.add("ab-havij");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                noshidani.add("ab-anar");
                int index16  = noshidani.indexOf("ab-anar");
                if (index16<0){
                    System.out.println("vojood nadarad");
                    System.out.println("ab-anar ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        noshidani.add("ab-anar");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                noshidani.add("ab-sib");
                int index17 = noshidani.indexOf("ab-sib");
                if (index17<0){
                    System.out.println("vojood nadarad");
                    System.out.println("ab-sib ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        noshidani.add("ab-sib");
                    }
                }
                else{
                    System.out.println("vojod darad");
                }


                noshidani.add("ab-angoor");
                int index18 = noshidani.indexOf("ab-angoor");
                if (index18<0){
                    System.out.println("vojood nadarad");
                    System.out.println("ab-angoor ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        noshidani.add("ab-angoor");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }
                System.out.println(noshidani);
                break;

            case gooshti:
                ArrayList gooshti = new ArrayList<>();
                gooshti.add("morgh");
                int index19 = gooshti.indexOf("morgh");
                if (index19<0){
                    System.out.println("vojood nadarad");
                    System.out.println("morgh ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        gooshti.add("morgh");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                gooshti.add("goosfandi");
                int index20 = gooshti.indexOf("goosfandi");
                if (index20<0){
                    System.out.println("vojood nadarad");
                    System.out.println("goosfandi ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        gooshti.add("goosfandi");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                gooshti.add("gav");
                int index21 = gooshti.indexOf("gav");
                if (index21<0){
                    System.out.println("vojood nadarad");
                    System.out.println("gav ezafe beshe?");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        gooshti.add("gav");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                gooshti.add("goosaleh");
                int index22 = gooshti.indexOf("goosaleh");
                if (index22<0){
                    System.out.println("vojood nadarad");
                    System.out.println("goosale ezafe beshe?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                    gooshti.add("goosaleh");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }
                System.out.println(gooshti);
            break;


            case sabzijat:
                ArrayList sabzijat = new ArrayList<>();
                sabzijat.add("reyhoon");
                int index23 = sabzijat.indexOf("reyhoon");
                if (index23<0){
                    System.out.println("vojood nadarad");
                    System.out.println("reyhoon ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        sabzijat.add("reyhooon");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                sabzijat.add("jafari");
                int index24 = sabzijat.indexOf("jafari");
                if (index24<0){
                    System.out.println("vojood nadarad");
                    System.out.println("jafari ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        sabzijat.add("jafari");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                sabzijat.add("piazche");
                int index25 = sabzijat.indexOf("piazche");
                if (index25<0){
                    System.out.println("vojood nadarad");
                    System.out.println("piazche ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if(input.equals("yes")){
                        sabzijat.add("piazche");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                sabzijat.add("nanu");
                int index26 = sabzijat.indexOf("nanu");
                if (index26<0){
                    System.out.println("vojood nadarad");
                    System.out.println("nanu ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        sabzijat.add("nanu");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                sabzijat.add("avishan");
                int index27 = sabzijat.indexOf("avishan");
                if (index27<0){
                    System.out.println("vojood nadarad");
                    System.out.println("avishan ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        sabzijat.add("avishan");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }
                System.out.println(sabzijat);
                break;


            case mivejat:
                ArrayList mivejat = new ArrayList<>();
                mivejat.add("sib");
                int index28 = mivejat.indexOf("sib");
                if (index28<0){
                    System.out.println("vojood nadarad");
                    System.out.println("sib ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("sib");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                mivejat.add("porteghal");
                int index29 = mivejat.indexOf("porteghal");
                if (index29<0){
                    System.out.println("vojood nadarad");
                    System.out.println(" porteghal ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("porteghal");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                mivejat.add("hooloo");
                int index30 = mivejat.indexOf("hooloo");
                if (index30<0){
                    System.out.println("vojood nadarad");
                    System.out.println("hooloo ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("hooloo");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                mivejat.add("zardallo");
                int index31 = mivejat.indexOf("zardallo");
                if (index31<0){
                    System.out.println("vojood nadarad");
                    System.out.println("zardalo ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("zardallo");
                    }
                }
                else {
                    System.out.println("vojood darad");
                }


                mivejat.add("mooz");
                int index32 = mivejat.indexOf("mooz");
                if (index32<0){
                    System.out.println("vojood nadarad");
                    System.out.println("mooz ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("mooz");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                mivejat.add("gilas");
                int index33 = mivejat.indexOf("gilas");
                if (index33<0){
                    System.out.println("vojood nadarad");
                    System.out.println("gilas ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("gilas");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }


                mivejat.add("hendooneh");
                int index34 = mivejat.indexOf("hendooneh");
                if (index34<0){
                    System.out.println("vojood nadarad");
                    System.out.println("hendooneh ezafe shavad?(yes/no)");
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    if (input.equals("yes")){
                        mivejat.add("hendooneh");
                    }
                }
                else{
                    System.out.println("vojood darad");
                }
                System.out.println(mivejat);
                break;
        }

    }
}
