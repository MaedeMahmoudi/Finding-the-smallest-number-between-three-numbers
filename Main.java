import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("1.modir");
        System.out.println("2.admin");
        System.out.println("3.moshtary");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("ramz ra vared konid");
            Scanner scannerr = new Scanner(System.in);
            int inputt = scannerr.nextInt();
            if (inputt == 123) {

                Questins modir = new Questins();
                modir.modir();
                Scanner scanner55 = new Scanner(System.in);
                int input55 = scanner.nextInt();

                if (input55 == 1) {

                    Questins q2 = new Questins();
                    q2.modir2();
                    Scanner scanner1 = new Scanner(System.in);
                    int input1 = scanner1.nextInt();

                    if (input1 == 1) {
                        try {
                            FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameShoyande", true);
                            BufferedWriter bf = new BufferedWriter(fileWriter);
                            bf.write("mavad shoyandeh");
                            bf.newLine();
                            bf.write("tayd");
                            bf.newLine();
                            bf.write("rika ");
                            bf.newLine();
                            bf.write("mayee zarf-shoyee ");
                            bf.newLine();
                            bf.write("vaytex");
                            bf.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m1 = new Manager();
                        m1.nameshoyandeh1();
                        System.out.println("baray moshahede be file(name shoyande ) beravid  ");
                    }
                    if (input1 == 2) {
                        try {
                            FileWriter fileWriter2 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameBehdashti", true);
                            BufferedWriter bf2 = new BufferedWriter(fileWriter2);
                            bf2.write("behdashti : ");
                            bf2.newLine();
                            bf2.write("shampoo");
                            bf2.newLine();
                            bf2.write("saboon");
                            bf2.newLine();
                            bf2.write("body splash");
                            bf2.newLine();
                            bf2.write("lif");
                            bf2.newLine();
                            bf2.write("dastmal kaghazi");
                            bf2.newLine();
                            bf2.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m2 = new Manager();
                        m2.namebedashti();
                        System.out.println("baray moshahede be file(name behdashti ) beravid  ");
                    }
                    if (input1 == 3) {
                        try {
                            FileWriter fileWriter3 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGhazaii", true);
                            BufferedWriter bf3 = new BufferedWriter(fileWriter3);
                            bf3.write("ghazaii : ");
                            bf3.newLine();
                            bf3.write("makarani");
                            bf3.newLine();
                            bf3.write("reshte-soop");
                            bf3.newLine();
                            bf3.write("rashte-ash");
                            bf3.newLine();
                            bf3.write("rob");
                            bf3.newLine();
                            bf3.write("berenj");
                            bf3.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m3 = new Manager();
                        m3.nameghazayii();
                        System.out.println("baray moshahede be file(name ghazaii) beravid  ");
                    }
                    if (input1 == 4) {
                        try {
                            FileWriter fileWriter4 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\Namenoshidani", true);
                            BufferedWriter bf4 = new BufferedWriter(fileWriter4);
                            bf4.write("name noshidani : ");
                            bf4.newLine();
                            bf4.write("ab-havij");
                            bf4.newLine();
                            bf4.write("ab-sib");
                            bf4.newLine();
                            bf4.write("ab-angoor");
                            bf4.newLine();
                            bf4.write("ab-anar");
                            bf4.newLine();
                            bf4.write("ab-porteghal");
                            bf4.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m4 = new Manager();
                        m4.namenoshidani();
                        System.out.println("baray moshahede be file(name noshidani ) beravid  ");
                    }
                    if (input1 == 5) {
                        try {
                            FileWriter fileWriter5 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGooshti", true);
                            BufferedWriter bf5 = new BufferedWriter(fileWriter5);
                            bf5.write("gooshti : ");
                            bf5.newLine();
                            bf5.write("morgh ");
                            bf5.newLine();
                            bf5.write("goosfandi");
                            bf5.newLine();
                            bf5.write("gavi");
                            bf5.newLine();
                            bf5.write("goosale");
                            bf5.newLine();
                            bf5.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m5 = new Manager();
                        m5.namegooshti();
                        System.out.println("baray moshahede be file(name gooshti) beravid  ");
                    }
                    if (input1 == 6) {
                        try {
                            FileWriter fileWriter6 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameSabzijat", true);
                            BufferedWriter bf6 = new BufferedWriter(fileWriter6);
                            bf6.write("sabzijat :");
                            bf6.newLine();
                            bf6.write("reyhoon");
                            bf6.newLine();
                            bf6.write("jafari");
                            bf6.newLine();
                            bf6.write("piazche");
                            bf6.newLine();
                            bf6.write("nanu");
                            bf6.newLine();
                            bf6.write("avishan");
                            bf6.newLine();
                            bf6.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m6 = new Manager();
                        m6.namesabzijat();
                        System.out.println("baray moshahede be file(name sabzijat ) beravid  ");
                    }
                    if (input1 == 7) {
                        try {
                            FileWriter fileWriter7 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\Namemivejat", true);
                            BufferedWriter bf7 = new BufferedWriter(fileWriter7);
                            bf7.write("mivejat :");
                            bf7.newLine();
                            bf7.write("porteghai");
                            bf7.newLine();
                            bf7.write("holoo");
                            bf7.newLine();
                            bf7.write("zardaloo");
                            bf7.newLine();
                            bf7.write("gilass");
                            bf7.newLine();
                            bf7.write("hendoone");
                            bf7.newLine();
                            bf7.write("mooz");
                            bf7.newLine();
                            bf7.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m7 = new Manager();
                        m7.namemivejat();
                        System.out.println("baray moshahede be file(name mivejat ) beravid  ");
                    }
                    if (input1 == 8) {
                        Manager m8 = new Manager();
                        m8.all();
                    }
                }

                if (input55 == 2) {

                    Questins q3 = new Questins();
                    q3.modir3();
                    Scanner scanner15 = new Scanner(System.in);
                    int input15 = scanner15.nextInt();

                    if (input15 == 1) {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameShoyande");
                        try {
                            BufferedWriter bf = new BufferedWriter(fileWriter);
                            bf.write(" gheimat tayd = 10000");
                            bf.write(" gheimat rika =15000 ");
                            bf.write(" gheimat mayee zarf-shoyee = 21000 ");
                            bf.write(" gheimat vaytex = 32000");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m9 = new Manager();
                        m9.gheimatsh();
                        System.out.println("baray moshahede be file(name shoyande ) beravid  ");

                    } else if (input15 == 2) {
                        FileWriter fileWriter2 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameBehdashti");
                        try {
                            BufferedWriter bf2 = new BufferedWriter(fileWriter2);
                            bf2.write(" gheimat behdashti : ");
                            bf2.newLine();
                            bf2.write(" gheimat shampoo = 55000");
                            bf2.newLine();
                            bf2.write(" gheimat saboon = 13000");
                            bf2.newLine();
                            bf2.write(" gheimat body splash = 80000");
                            bf2.newLine();
                            bf2.write(" gheimat lif = 20000");
                            bf2.newLine();
                            bf2.write(" gheimat dastmal kaghazi = 25000");
                            bf2.newLine();
                            bf2.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m10 = new Manager();
                        m10.gheimatbeh();
                        System.out.println("baray moshahede be file(name behdashti ) beravid  ");

                    } else if (input15 == 3) {
                        FileWriter fileWriter3 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGhazaii");
                        try {
                            BufferedWriter bf3 = new BufferedWriter(fileWriter3);
                            bf3.write("gheimat ghazaii : ");
                            bf3.newLine();
                            bf3.write(" gheimat makarani = 15000");
                            bf3.newLine();
                            bf3.write(" gheimat reshte-soop = 11000");
                            bf3.newLine();
                            bf3.write("gheimat rashte-ash = 13000");
                            bf3.newLine();
                            bf3.write("gheimat  rob = 89000");
                            bf3.newLine();
                            bf3.write("gheimat berenj =150 harkilo");
                            bf3.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m11 = new Manager();
                        m11.gheimatgh();
                        System.out.println("baray moshahede be file(name ghazaii) beravid  ");

                    } else if (input15 == 4) {
                        FileWriter fileWriter4 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\Namenoshidani");
                        try {
                            BufferedWriter bf4 = new BufferedWriter(fileWriter4);
                            bf4.write("gheimat noshidani : ");
                            bf4.newLine();
                            bf4.write("gheimat ab-havij = 28000");
                            bf4.newLine();
                            bf4.write("gheimat ab-sib = 30000");
                            bf4.newLine();
                            bf4.write("gheimat ab-angoor = 32000");
                            bf4.newLine();
                            bf4.write("gheimat ab-anar = 40000");
                            bf4.newLine();
                            bf4.write("ab-porteghal");
                            bf4.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m12 = new Manager();
                        m12.gheimatab();

                    } else if (input15 == 5) {
                        FileWriter fileWriter5 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGooshti");
                        try {
                            BufferedWriter bf5 = new BufferedWriter(fileWriter5);
                            bf5.write(" gheimat gooshti : ");
                            bf5.newLine();
                            bf5.write(" gheimat morgh = 100 harkilo");
                            bf5.newLine();
                            bf5.write("gheimat goosfandi = 200 harkilo");
                            bf5.newLine();
                            bf5.write("gheimat gavi = 180 harkilo");
                            bf5.newLine();
                            bf5.write(" gheimat goosale = 170 harkilo");
                            bf5.newLine();
                            bf5.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m13 = new Manager();
                        m13.gheimatgo();
                        System.out.println("baray moshahede be file(name gooshti) beravid  ");

                    } else if (input15 == 6) {

                        FileWriter fileWriter6 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameSabzijat ");
                        try {
                            BufferedWriter bf6 = new BufferedWriter(fileWriter6);
                            bf6.write("gheimat sabzijat :");
                            bf6.newLine();
                            bf6.write("gheimat reyhoon = 15000");
                            bf6.newLine();
                            bf6.write("gheimat piazche = 10000");
                            bf6.newLine();
                            bf6.write("gheimat nanu = 14000");
                            bf6.newLine();
                            bf6.write("gheimat jafari = 9000");
                            bf6.newLine();
                            bf6.write("gheimat avishan = 11000");
                            bf6.newLine();
                            bf6.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m14 = new Manager();
                        m14.gheimatsabzijat();
                        System.out.println("baray moshahede be file(name sabzijat ) beravid  ");

                    } else if (input15 == 7) {
                        FileWriter fileWriter7 = new FileWriter(" D:\\javaa\\newShop\\src\\name mahsolat\\Namemivejat ");
                        try {
                            BufferedWriter bf7 = new BufferedWriter(fileWriter7);
                            bf7.write("gheimat mivejat :");
                            bf7.newLine();
                            bf7.write("gheimat porteghai = 18000 harkilo");
                            bf7.newLine();
                            bf7.write("gheimat holoo = 25000 harkilo");
                            bf7.newLine();
                            bf7.write("gheimat zardaloo = 30000 harkilo");
                            bf7.newLine();
                            bf7.write("gheimat gilass = 50000 harkilo");
                            bf7.newLine();
                            bf7.write("gheimat hendoone = 20000 harkilo");
                            bf7.newLine();
                            bf7.write("gheimat mooz = 45000 harkilo");
                            bf7.newLine();
                            bf7.close();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        Manager m15 = new Manager();
                        m15.gheimatmive();
                        System.out.println("baray moshahede be file(name mivejat ) beravid  ");
                    } else {
                        System.out.println("adad vared shode dar renj nist!");
                    }
                }
                if (input55 == 3) {

                    Manager m16 = new Manager();
                    m16.shiftname();
                }

                if (input55 == 4) {
                    System.out.println("be bakhsh ezafe kardan admin khosh ammadid :) ");
                    try {
                        FileWriter addadmin = new FileWriter("D:\\javaa\\newShop\\src\\afzodan\\MoshakhasateAdminJadid", true);
                        BufferedWriter bff = new BufferedWriter(addadmin);
                        System.out.println("name admin jadid :");
                        Scanner scanner60 = new Scanner(System.in);
                        String input60 = scanner60.nextLine();
                        bff.write("name admin jadid :");
                        bff.write(input60);
                        bff.newLine();
                        System.out.println("last name of admin jadid :");
                        Scanner scanner61 = new Scanner(System.in);
                        String input61 = scanner61.nextLine();
                        bff.write("last name of admin jadid :");
                        bff.write(input61);
                        bff.newLine();
                        System.out.println("shift kari :(sobh , zohr , shab )");
                        Scanner scanner62 = new Scanner(System.in);
                        String input62 = scanner62.nextLine();
                        bff.write("shift kari :");
                        bff.write(input62);
                        bff.newLine();
                        System.out.println(" hoghogh daryafti :");
                        Scanner scanner63 = new Scanner(System.in);
                        String input63 = scanner63.nextLine();
                        bff.write("hoghogh  daryafti : ");
                        bff.write(input63);
                        bff.newLine();
                        bff.close();
                        System.out.println("etelaat admin jadid dar file (admin jadid) ezafe shod ");

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (input55 == 5) {
                    System.out.println("be ghesmat ezafe kardan shobee jadid khosh amadid :) ");
                    try {
                        FileWriter sh = new FileWriter("D:\\javaa\\newShop\\src\\afzodan\\Shobejadid", true);
                        BufferedWriter bsh = new BufferedWriter(sh);
                        System.out.println("name shobe");
                        Scanner scanner64 = new Scanner(System.in);
                        String input64 = scanner64.nextLine();
                        bsh.write("name shoobe jadid : ");
                        bsh.write(input64);
                        bsh.newLine();
                        System.out.println("ezafe kardan admin be shobe : ");
                        System.out.println("name admin : ");
                        Scanner scanner65 = new Scanner(System.in);
                        String input65 = scanner65.nextLine();
                        bsh.write("name admin : ");
                        bsh.write(input65);
                        bsh.newLine();
                        System.out.println("last name admin : ");
                        Scanner scanner66 = new Scanner(System.in);
                        String input66 = scanner66.nextLine();
                        bsh.write("last name admin : ");
                        bsh.write(input66);
                        bsh.newLine();
                        System.out.println("hoghogh : ");
                        Scanner scanner67 = new Scanner(System.in);
                        String input67 = scanner67.nextLine();
                        bsh.write("hoghogh  : ");
                        bsh.write(input67);
                        bsh.newLine();
                        System.out.println("shift : ");
                        Scanner scanner68 = new Scanner(System.in);
                        String input68 = scanner68.nextLine();
                        bsh.write("shift : ");
                        bsh.write(input68);
                        bsh.newLine();

                        System.out.println("ghesmat label hay jadid :");
                        System.out.println("tedad labal hayii ke mikhahid ezafe konid?");
                        Scanner scanner168 = new Scanner(System.in);
                        int input168 = scanner168.nextInt();
                        for (int i = 1; i <= input168; i++) {
                            System.out.println("name label ");
                            Scanner scanner068 = new Scanner(System.in);
                            String input068 = scanner068.nextLine();
                            bsh.write("label = ");
                            bsh.newLine();
                            bsh.write(input068);
                        }

                        bsh.newLine();

                        System.out.println("ghesmat  afzodan kala : ");
                        System.out.println("tedad kala ra vard konid ");
                        Scanner scanneraa = new Scanner(System.in);
                        int inputaa = scanneraa.nextInt();
                        bsh.write("kalahaye jadid : ");
                        for (int j = 1; j <= inputaa; j++) {
                            System.out.println("kala =  ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bsh.write("kala = ");
                            bsh.write(input2);
                            bsh.newLine();
                        }
                        System.out.println("foroshgah jadid ba moafaghiat dar file ( shobe jadid ) ezafe shod :)))) ");
                        bsh.write("foroshgah jadid sukhte shod =) ");
                        bsh.close();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                System.out.println("ramz vard shode sahih nmibashad ");
            }
        }
        if (input == 2) {

            Questins q1 = new Questins();
            q1.admin1();
            Scanner scanner70 = new Scanner(System.in);
            int input70 = scanner70.nextInt();

            if (input70 == 1) {
                System.out.println(" chand horof  az mahsololat mord nazar khod ra search konid :");
                ProductSearch search = new ProductSearch();
                Scanner scanner6 = new Scanner(System.in);
                String keyword = scanner6.nextLine();
                ArrayList<Product> matchingProducts = search.searchProducts(keyword);
                System.out.println("mahsolat moshabeh " + keyword + " ke peida shodand");
                for (Product product : matchingProducts) {
                    System.out.println(product.getName() + " - " + product.getPrice());

                }
            }

            if (input70 == 2) {

                Questins q2 = new Questins();
                q2.admin2();
                Scanner scanner80 = new Scanner(System.in);
                int input80 = scanner80.nextInt();

                if (input80 == 1) {
                    System.out.println("shoyande jadid ra ezafe konid ke dar file marbote sabt shavad : ");
                    try {
                        FileWriter fileWriter80 = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameShoyande", true);
                        BufferedWriter bufferedWriter80 = new BufferedWriter(fileWriter80);
                        System.out.println("tedad shoyande : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("shoyande jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter80.write("shoyande jadid = ");
                            bufferedWriter80.write(input2);
                            System.out.println("shoyandeha dar file(name shoyande) sabt shodand ");
                        }
                        bufferedWriter80.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if (input80 == 2) {
                    System.out.println("kalaye behdashti jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameBehdashti", true);
                        BufferedWriter bufferedWriter82 = new BufferedWriter(fileWriter);
                        System.out.println("tedad behdashti : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("behdashti jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter82.write("behdashti jadid = ");
                            bufferedWriter82.write(input2);
                            System.out.println("kala dar file(name behdashti) sabt shodand ");
                        }

                        bufferedWriter82.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if (input80 == 3) {
                    System.out.println("kalaye ghazaii jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGhazaii", true);
                        BufferedWriter bufferedWriter83 = new BufferedWriter(fileWriter);
                        System.out.println("tedad  : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("ghazaii jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter83.write("ghazaii jadid = ");
                            bufferedWriter83.write(input2);
                            System.out.println("kala dar file(name ghazaii) sabt shodand ");
                        }
                        bufferedWriter83.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if (input80 == 4) {
                    System.out.println("kalaye noshidani jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\Namenoshidani", true);
                        BufferedWriter bufferedWriter84 = new BufferedWriter(fileWriter);
                        System.out.println("tedad  : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("noshidani jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter84.write("noshidani jadid = ");
                            bufferedWriter84.write(input2);
                            System.out.println("kala dar file(name noshidanii ) sabt shodand ");
                        }
                        bufferedWriter84.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if (input80 == 5) {
                    System.out.println("kalaye gooshti jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameGooshti", true);
                        BufferedWriter bufferedWriter85 = new BufferedWriter(fileWriter);
                        System.out.println("tedad  : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("gooshti jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter85.write("gooshti jadid = ");
                            bufferedWriter85.write(input2);
                            System.out.println("kala dar file(name gooshti ) sabt shodand ");
                        }
                        bufferedWriter85.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                if (input80 == 6) {
                    System.out.println("kalaye sabzijat jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\NameSabzijat", true);
                        BufferedWriter bufferedWriter86 = new BufferedWriter(fileWriter);
                        System.out.println("tedad  : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("sabzijat jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter86.write("sabzijat jadid = ");
                            bufferedWriter86.write(input2);
                            System.out.println("kala dar file(name sabzijat ) sabt shodand ");
                        }
                        bufferedWriter86.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

                if (input80 == 7) {
                    System.out.println("kalaye mivejat jadid ra ezafe konid ke dar file marbote sabt shavad :");
                    ;
                    try {
                        FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\name mahsolat\\Namemivejat", true);
                        BufferedWriter bufferedWriter87 = new BufferedWriter(fileWriter);
                        System.out.println("tedad  : ");
                        Scanner scanner1 = new Scanner(System.in);
                        int input1 = scanner1.nextInt();
                        for (int i = 1; i <= input1; i++) {
                            System.out.println("mivejat jadid = ");
                            Scanner scanner2 = new Scanner(System.in);
                            String input2 = scanner2.nextLine();
                            bufferedWriter87.write("mivejat jadid = ");
                            bufferedWriter87.write(input2);
                            System.out.println("kala dar file(name mivejat ) sabt shodand ");
                        }
                        bufferedWriter87.close();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (input70 == 3) {

                FileReader fileReader = new FileReader("D:\\javaa\\newShop\\src\\AllKala.csv");
                try {
                    BufferedReader bf = new BufferedReader(fileReader);
                    String lines ;
                    while ((lines = bf.readLine()) != null){
                        System.out.println(lines);
                    }
                    bf.close();
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            if (input70 == 4) {
                Questins q3 = new Questins();
                q3.admin3();
                System.out.println("labal jadid ezafe shavad ?(yes/no) ");
                Scanner scanner90 = new Scanner(System.in);
                String input90 = scanner90.nextLine();
                if (input90.equals("yes")) {
                    FileWriter fileWriter91 = new FileWriter("D:\\javaa\\newShop\\src\\afzodan\\AfzodanLabalJadid", true);
                    try {
                        BufferedWriter bufferedWriter91 = new BufferedWriter(fileWriter91);
                        System.out.println("name label");
                        Scanner scanner91 = new Scanner(System.in);
                        String input91 = scanner91.nextLine();
                        bufferedWriter91.write(input91);
                        bufferedWriter91.close();
                        System.out.println("dar file label jadid  ba moafaghiiat afzode shode :D ");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if (input70 == 5) {
                FileWriter fileWriter705 = new FileWriter("D:\\javaa\\newShop\\src\\afzodan\\AfzodanMoshtariJadid.csv",true);
                try {
                    BufferedWriter bf705 = new BufferedWriter(fileWriter705);
                    Customer customer1 = new Customer();
                    System.out.println("name moshtari :");
                    Scanner scanner1 = new Scanner(System.in);
                    String input1 = scanner1.nextLine();
                    customer1.setName(input1);
                    bf705.write("name moshtari :");
                    bf705.newLine();
                    bf705.write(customer1.getName());
                    bf705.newLine();

                    System.out.println(" last name moshtari :");
                    bf705.write("last name moshtari :");
                    Scanner scanner2 = new Scanner(System.in);
                    String input2 = scanner2.nextLine();
                    customer1.setLastname(input2);
                    bf705.newLine();
                    bf705.write(customer1.getLastname());
                    bf705.newLine();

                    System.out.println("phone number moshtari :");
                    bf705.write("phone number  moshtari :");
                    bf705.newLine();
                    bf705.write(customer1.getNumber());
                    bf705.newLine();

                    bf705.close();
                    System.out.println("moshtari jadid dar file (afzodan moshtari jadid) ezafe shod  ");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (input70 == 6){
                FileReader fr =new FileReader("");
                try {
                    BufferedReader bbf = new BufferedReader(fr);
                    String line ;
                    while ((line = bbf.readLine()) != null){
                        System.out.println(line);
                    }
                    bbf.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (input == 3) {
            Questins q1 = new Questins();
            q1.moshtari1();

            Scanner scanner4 = new Scanner(System.in);
            int input4 = scanner4.nextInt();

            if (input4 == 1) {
                System.out.println("moshahede tamam mahsolat : ");
                Manager mm = new Manager();
                mm.all();
                System.out.println("mahsol mord nazar khod ra search konid :");
                ProductSearch search01 = new ProductSearch();
                Scanner scanner01 = new Scanner(System.in);
                String keyword01 = scanner01.nextLine();
                ArrayList<Product> matchingProducts01 = search01.searchProducts(keyword01);
                System.out.println("mahsolat moshabeh " + keyword01 + " ke peida shodand");
                for (Product product01 : matchingProducts01) {
                    System.out.println(product01.getName() + " - " + product01.getPrice());
                }
            }
            if (input4 == 2) {
                FileWriter ff = new FileWriter("D:\\javaa\\newShop\\src\\moshtari\\Factor ", true);
                try {
                    BufferedWriter bf4 = new BufferedWriter(ff);
                    System.out.println("mikhahid in shobe ra fallow konid?(yes/no)");
                    Scanner scanner7 = new Scanner(System.in);
                    String input7 = scanner7.nextLine();
                    if (input7.equals("yes")) {
                        System.out.println("foroshgah fallow shod");
                        System.out.println("az entekhab shoma sepas goozarim");
                        ff.write("foroshgah fallow shod ");
                    } else if (input7.equals("no")) {
                        System.out.println("az in ke be site ma sar zadid sepas goozarim,ta didar digar khodanegahdar :) ");
                    } else {
                        System.out.println("not in range !");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (input4 == 3) {
                FileWriter f3 = new FileWriter("D:\\javaa\\newShop\\src\\moshtari\\NazaratVaPishnehadat", true);
                try {
                    BufferedWriter b3 = new BufferedWriter(f3);
                    System.out.println("name = ");
                    Scanner sc1 = new Scanner(System.in);
                    String in1 =sc1.nextLine();
                    b3.write("name : ");
                    b3.write(in1);
                    b3.newLine();
                    System.out.println("last name = ");
                    Scanner sc2 = new Scanner(System.in);
                    String in2 =sc2.nextLine();
                    b3.write("last name : ");
                    b3.write(in2);
                    b3.newLine();
                    System.out.println("mamnon az tavajoh shoma ," +
                            "lotfan nazarat va pishnehadat khod ra vared konid .");
                    Scanner scanner8 = new Scanner(System.in);
                    String input8 = scanner8.nextLine();
                    b3.write("nazarat : ");
                    b3.write(input8);
                    b3.newLine();
                    b3.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }
            if (input4 == 4) {
                FileWriter fileWriter = new FileWriter("D:\\javaa\\newShop\\src\\moshtari\\Factor", true);

                try {

                    BufferedWriter bf = new BufferedWriter(fileWriter);
                    System.out.println("kalay mad nazar ra vared konid ");
                    Questins q3 = new Questins();
                    q3.admin3();
                    System.out.println("baray moshahede labal mord nazar adad marbote ra vared konid");
                    Scanner scanner11 = new Scanner(System.in);
                    int input11 = scanner11.nextInt();

                    KalaMoshtariSearch m11 = new KalaMoshtariSearch();
                    m11.kalamoshtari(input11);

                    if (input11 == 1) {
                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.behdashtisabad(inp);
                            m.beh(inp);
                            bf.write("kala : ");
                            bf.write(m.beh(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid da file(factor) ");
                        bf.close();
                    }
                    if (input11 == 2){

                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.shoyandesabad(inp);
                            m.sho(inp);
                            bf.write("kala : ");
                            bf.write(m.sho(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid da file(factor) ");
                        bf.close();
                    }
                    if (input11 == 3){

                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.ghazaiisabad(inp);
                            m.ghaz(inp);
                            bf.write("kala : ");
                            bf.write(m.ghaz(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid dar file(factor) ");
                        bf.close();
                    }
                    if (input11 == 4){

                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.noshidanisabad(inp);
                            m.nosh(inp);
                            bf.write("kala : ");
                            bf.write(m.nosh(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid dar file(factor) ");
                        bf.close();
                    }
                    if(input11 == 5){

                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.gooshtisabad(inp);
                            m.goosht(inp);
                            bf.write("kala : ");
                            bf.write(m.goosht(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid dar file(factor) ");
                        bf.close();
                    }
                    if (input11 == 6){

                        System.out.println("tedad  kalaye delkhah ra vared konid ");
                        Scanner scc = new Scanner(System.in);
                        int inpp = scc.nextInt();
                        bf.write("sabad kharid ");
                        bf.newLine();
                        for (int i = 1; i <= inpp; i++) {
                            System.out.println("adad kala ha ra vared  konid = ");
                            Scanner s = new Scanner(System.in);
                            int inp = s.nextInt();
                            EntekhabM m = new EntekhabM();
                            m.sabzijatsabad(inp);
                            m.sabz(inp);
                            bf.write("kala : ");
                            bf.write(m.sabz(i));
                            bf.newLine();
                        }
                        System.out.println("ba moafaghiat sabt shod");
                        System.out.println("moshahede kharid dar file(factor) ");
                        bf.close();
                    }
                if (input11 == 7){

                    System.out.println("tedad  kalaye delkhah ra vared konid ");
                    Scanner scc = new Scanner(System.in);
                    int inpp = scc.nextInt();
                    bf.write("sabad kharid ");
                    bf.newLine();
                    for (int i = 1; i <= inpp; i++) {
                        System.out.println("adad kala ha ra vared  konid = ");
                        Scanner s = new Scanner(System.in);
                        int inp = s.nextInt();
                        EntekhabM m = new EntekhabM();
                        m.mivejatsabad(inp);
                        m.mive(inp);
                        bf.write("kala : ");
                        bf.write(m.mive(i));
                        bf.newLine();
                    }
                    System.out.println("ba moafaghiat sabt shod");
                    System.out.println("moshahede kharid dar file(factor) ");
                    bf.close();
                }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (input4 == 5) {
                Questins q2 = new Questins();
                q2.moshtari2();

                Scanner scanner1 = new Scanner(System.in);
                int input1 = scanner1.nextInt();
                KalaMoshtariSearch m1 = new KalaMoshtariSearch();
                m1.kalamoshtari(input1);
            }

        }
    }

}










