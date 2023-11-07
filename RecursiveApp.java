import java.util.InputMismatchException;
import java.util.Scanner;

class  RecursiveApp {
    public static int f(int x) {
        if (x == 10) {
            return 10;

        } else {
            System.out.println("f(" + x + ") = " + x + " + " + "" + "f(" + (x + 1) + ")");
            return x + f(x + 1);
        }
    }

    public static long faktoriyelBul(int n) {
        if (n == 0) {
            return 1;

        } else {
            return n * faktoriyelBul(n - 1);

        }

    }

    public static long usAl(int taban, int us) {
        if (us == 0) {
            if (taban == 0) {
                System.out.print("0E0 belirsizligi...\nKabul:");
            }
            return 1;

        } else {
            return taban * usAl(taban, us - 1);
        }
    }

    public static int fibBul(int n) {
        if (n == 0) {
            return 0;

        } else if (n == 1 || n == 2) {
            return 1;

        } else {
            return fibBul(n - 1) + fibBul(n - 2);
        }
    }

    public static int bsmSayBul(int n) {

        if ((-10 < n) && (n < 10)) {
            return 1;
        } else {
            return 1 + bsmSayBul(n / 10);
        }
    }

    public static long basKuvBul(int n, int i) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return usAl(n % 10, i++) + basKuvBul(n / 10, i);
        } else {

            return usAl(n % 10, i++) + basKuvBul(n / 10, i);
        }
    }

    public static int negatifSayTop(int n) {

        if (n == -1 || n == 0) {
            return n;
        } else {

            return n + negatifSayTop(n + 1);
        }
    }

    public static String ortakBolBul(int n, int n1, int i) {
        if (i > n && i > n1) {

            return "";

        } else if (n % i == 0 && n1 % i == 0) {
            return "\n" + -i + " " + i + ortakBolBul(n, n1, i + 1);

        }

        else {
            return ortakBolBul(n, n1, i + 1);

        }
    }

    public static int topCarp(int n, int n1) {
        if ((n == 0) || (n1 == 0))
            return 0;
        else
            return n + topCarp(n, n1 - 1);
    }

    public static int sayRakTopla(int n) {
        if (n != 0) {
            return (n % 10) + sayRakTopla(n / 10);
        } else {
            return 0;
        }
    }

    public static int tavsanGozSay(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 + tavsanGozSay(n - 1);
        }
    }

    public static int triBul(int n) {

        if (n == 0) {
            return 0;

        } else if (n == 1 || n == 2) {
            return 1;

        } else {
            return triBul(n - 1) + triBul(n - 2) + triBul(n - 3);
        }
    }

    public static int obebBul(int n, int n1) {

        if (n1 == 0) {
            return n;

        }

        else {
            return obebBul(n1, n % n1);
        }
    }

    public static int toplamBul(int n) {
        if (n == 1 || n == 0) {
            return n;

        } else {
            return n + toplamBul(n - 1);
        }
    }

    public static int kareKokHesap(int n, int i) {
        if ((i * i) > n) {
            System.out
                    .print("Girdiginiz " + n + " sayisina en yakin ustdeger sayinin  (" + i * i + ") 'un Karekoku = ");
            return i;

        }
        if ((i * i) == n) {
            System.out.print(n + " sayisinin Karekoku = ");
            return i;
        }
        if (n == 0) {
            System.out.print(n + " sayisinin Karekoku = ");
            return n;
        } else {

            return kareKokHesap(n, i + 1);

        }

    }

    public static String asalMi(int n, int i) {
        if (i == 1) {// if (n <= 2) return (n == 2) ? true : false;
            return n + " sayisi asaldir.";
        } else if (n == 0 || n == 1 || n % i == 0) {

            return n + " sayisi asal degildir.";
        } else {

            return asalMi(n, i - 1);

        }
    }

    public static int telHop(int n) {
        if (n == 0) {
            return 0;

        } else {
            if (n % 2 == 0) {
                return 2 + telHop(n - 1);
            } else {
                return 1 + telHop(n - 1);
            }
        }
    }

    public static int sayRakCarp(int n) {
        if (n == 0) {
            return 1;

        } else {
            return (n % 10) * sayRakCarp(n / 10);
        }
    }

    public static int ciftSayTop(int n) {

        if (n == 0) {
            return 0;
        } else if (n % 2 == 1) {

            return ciftSayTop(n - 1);
        } else {
            return n + ciftSayTop(n - 2);
        }
    }

    public static String tersYaz(int n) {
        if ((0 <= n) && (n < 10)) {
            return Integer.toString(n);
        } else {
            return (n % 10) + "" + tersYaz(n / 10);

        }
    }

    public static String bolenBul(int n, int i) {
        if (i > n)
            return "";
        else if (n % i == 0)
            return Integer.toString(i) + " " + bolenBul(n, i + 1);
        else
            return bolenBul(n, i + 1);
    }

    public static boolean palMi(String s) {// ama
        if (s.length() == 0 || s.length() == 1) {// 1 true
            return true;
        }

        else if (s.charAt(0) == s.charAt(s.length() - 1)) {// a==a
            return palMi(s.substring(1, s.length() - 1));// palMi(m)
        } else {
            return false;
        }

    }

    public static int diziTop(int dizi[], int i) {
        if (i == dizi.length - 1) {
            return dizi[i];
        } else {
            return dizi[i] + diziTop(dizi, i + 1);
        }
    }

    public static int diziEnBuyBul(int dizi[], int i) {
        if (i == dizi.length - 1) {
            return dizi[i];
        } else {
            return Math.max(dizi[i], diziEnBuyBul(dizi, i + 1));
        }
    }

    public static int diziElemanBul(int dizi[], int n, int i) {
        if (i == dizi.length) {
            return 1;

        } else if (dizi[i] == n) {
            return i;
        } else {
            return diziElemanBul(dizi, n, i + 1);
        }
    }

    public static long seriTop(int n) {

        if (n == 1) {
            return 1;
        } else {

            return usAl(n, n) + seriTop(n - 1);
        }
    }

    public static double dogalLogFak(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else {

            return dogalLogFak(n - 1) + Math.log(n);// ln(n)
        }

    }

    public static double harmTop(int n) {

        if (n == 1) {
            return 1;

        } else {
            return (double) 1 / n + (harmTop(n - 1));
        }
    }

    public static int okekBul(int n, int n1) {
        return (n * n1) / obebBul(n, n1);
    }

    public static int rakamAdet(int n, int n1) {
        if (n <= 9) {
            if (n == n1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (n % 10 == n1) {
                return 1 + rakamAdet(n / 10, n1);

            } else {
                return 0 + rakamAdet(n / 10, n1);
            }
        }

    }

    public static void ikiTab(int n) {
        if (n == 0) {
            return;
        } else {
            ikiTab(n / 2);
            System.out.print(n % 2);
        }

    }
    public static class HanoiKuleleri {

        public static void hanoiKuleleri(int n, char fromRod, char toRod, char auxRod) {
            if (n == 1) {
                System.out.println("Disk 1 " + fromRod + "'dan " + toRod + "'a tasi.");
                return;
            }
            hanoiKuleleri(n - 1, fromRod, auxRod, toRod);
            System.out.println("Disk " + n + " " + fromRod + "'dan " + toRod + "'a tasi.");
            hanoiKuleleri(n - 1, auxRod, toRod, fromRod);
        }
    }
    public static void main(String[] args) {

        System.out.println("Ozyineleme Programina Hosgeldiniz");
        System.out.println("******************************************************************************");
        System.out.println("******************************************************************************");
        String algoritmalar = "Kullanmak istediginiz Program:\n"
                + "1.Ozyinelemeli Fonksiyonlarin Temel Mantigini Gosterir (0'dan 10'a Kadar sayilari Toplar)\n"
                + "2.0'dan 20'e Kadar Girilen sayilarin Faktoriyelini Hesaplar\n" + "3.Kuvvet Alir \n"
                + "4.Girilen sayinin(Dizi Indisinin) Fibonacci Dizisinde Degerini Bulur\n"
                + "5.Girilen sayinin Basamak sayisini Bulur\n"
                + "6.Girilen sayinin Basamak sayisi Kadar Kuvvetini Alir Ve Toplamlarini Veir(123=3^1+2^2+1^3)ve(-123=(-3^1)+(-2^2)+(-1^3))=\n"
                + "7.0'dan Girilen Negatif Ustdegere Kadar sayilarin Toplamini Bulur\n"
                + "8.Girilen Iki sayinin Ortak Tam sayi Bolenlerini Bulur\n"
                + "9.Girilen Iki sayiyi Tekrarli Toplar(Carpar)\n" + "10.Girilen sayinin Rakamlarini Toplar\n"
                + "11.Tavsanin Goz sayisini Bulur\n"
                + "12.Girilen sayinin(Dizi Indisinin) Tribonacci Dizisinde Degerini Bulur\n"
                + "13.Girilen Iki sayinin Ortak  Bolenlerinin En Buyugunu Bulur\n"
                + "14.0'dan Girilen Pozitif Ustdegere Kadar sayilarin Toplamini Bulur\n"
                + "15.Girilen sayinin Karekokunu(Karekoku Tam sayi Degilse En Yakin Ustdeger sayinin Karekokunu)Hesaplar\n"
                + "16.Girilen sayinin Asal Olup Olmadigini Kontrol Eder\n"
                + "17.X Markasinin Telefon Modeline Gore Hoparlor sayisini Ongoren Program\n"
                + "18.Girilen sayinin Rakamlarini Carpar\n"
                + "19.0'dan Girilen Pozitif Ustdegere Kadar Cift sayilarin Toplamini Bulur\n"
                + "20.Girilen sayiyi Tersten Yazar\n" + "21.Girilen sayinin Pozitif Tam Bolenlerini Bulur \n"
                + "22.Palindrom Karakter/sayi/Dize Konrol Eder\n" + "23.Dizinin Elamanlarini Yazdirir Ve Toplar\n"
                + "24.Dizinin Elamanlarini Yazdirir Ve En Buyugunu Bulur\n"
                + "25.Dizinin Elamanlarini Yazdirir Ve Aranilan Dizi Elamanini Kontrol Eder\n"
                + "26.1 den Girilen sayiya Kadar 1^1 + 2^2 +...+ n^n Serisinde Hesaplar\n"
                + "27.Girilen Degerin ln(n!)[ln(3!)=ln(3*(3-1)*(3-2))=ln3+ln2+ln1(0)] Serisinde Hesaplar\n"
                + "28.1 den Girilen sayiya Kadar Harmonik Seride(1/1 + 1/2 + 1/3 +...+ 1/n) Hesaplar\n"
                + "29.Girilen Iki sayinin Ortak Katlarinin En Kucugunu Bulur\n"
                + "30.Girilen sayinin Rakamlarinin Kac Defa Tekrar Ettigini Hesaplar\n"
                + "31.Girilen sayinin Ikilik Tabana Cevirir\n"
                + "32.Hanoi Kuleleri\n"
                + "Cikis Icin q'ya Basin ";

        System.out.println(algoritmalar);
        System.out.println("******************************************************************************");
        System.out.println("******************************************************************************");
        Scanner scan = new Scanner(System.in);
        int n, n1, i;
        short boyut;
        String s;
        int[] dizi;

        while (true) {

            System.out.print("Hangi algoritmayi calistirmak istiyorsunuz ?\n " + "~ ");
            String islem = scan.nextLine();
            if (islem.equals("q")) {

                System.out.println("Programdan Cikiliyor...");
                break;

            } else if (islem.equals("1")) {
                System.out.println("f(10)= 10\n" + "f(0):" + f(0));
            } else if (islem.equals("2")) {
                System.out.print("Faktoriyelini hesaplatmak istedigniz sayiyi giriniz: ");

                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n >= 0) {
                            System.out.println("Girdiginiz sayinin faktoriyeli ==> " + n + "! = " + faktoriyelBul(n));
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();
                    }
                }
            } else if (islem.equals("3")) {

                while (true) {

                    try {
                        System.out.print("Taban degerini giriniz: ");
                        int taban = scan.nextInt();
                        System.out.print("Us degerini giriniz: ");
                        int us = scan.nextInt();
                        scan.nextLine();

                        if (us > 0 || us == 0) {
                            System.out.println(taban + "E" + us + " = " + usAl(taban, us));
                            break;
                        } else if (us < 0) {
                            System.out.print("Us degerini pozitif giriniz... \n");

                        } else if (taban == 0 && us == 0) {
                            System.out.println("0E0 belirsizligi...");
                            break;
                        }

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err.print("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");
                        scan.nextLine();

                    }

                }
            } else if (islem.equals("4")) {

                System.out.print("Fibonacci dizisinin kacinci indisini goruntulemek istiyorsunuz: ");
                while (true) {
                    try {

                        n = scan.nextInt();
                        scan.nextLine();
                        if (n >= 0) {
                            System.out.println("Fibonacci dizisinin " + n + ". indisinin degeri:" + fibBul(n));
                            break;
                        } else {
                            System.out.print("Negatif sayi girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("5")) {

                System.out.print("Basamak sayisini bulmak istediginiz sayiyi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Girdiginiz sayi " + bsmSayBul(n) + " basamaklidir.");
                        break;

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("6")) {
                System.out.print("Lutfen bir sayi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Basamak sayisi Kadar Kuvvetini Alma Isleminizin Sonucu = " + basKuvBul(n, 1)
                                + "'dur.");
                        break;

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("7")) {
                System.out.print("Lutfen bir sayi giriniz: ");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n <= 0) {
                            System.out.println("0 dan " + n + "'e kadar olan sayilarin toplami: " + negatifSayTop(n));
                            break;
                        } else {
                            System.out.print("Pozitif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }
            } else if (islem.equals("8")) {
                while (true) {
                    try {
                        System.out.print("Lutfen ilk sayiyi giriniz:");
                        n = scan.nextInt();
                        System.out.print("Lutfen ikinci sayiyi giriniz:");
                        n1 = scan.nextInt();
                        scan.nextLine();
                        if (n < 0 && n1 < 0) {
                            System.out.println(n + " ve " + n1 + " sayilarin ortak tam sayi bolenleri :"
                                    + ortakBolBul(-n, -n1, 1));
                            break;
                        } else if (n != 0 && n1 != 0) {
                            System.out.println(
                                    n + " ve " + n1 + " sayilarin ortak tam sayi bolenleri :" + ortakBolBul(n, n1, 1));
                            break;
                        } else if (n == 0 && n1 == 0) {
                            System.out.println("0/0 Belirsizligi...");
                            break;
                        } else if (n == 0 || n1 == 0) {
                            System.out.println("sayi/0 Belirsizligi...");
                            break;
                        }

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err.print("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("9")) {
                while (true) {
                    try {
                        System.out.print("Lutfen ilk sayiyi giriniz:");
                        n = scan.nextInt();
                        System.out.print("Lutfen ikinci sayiyi giriniz:");
                        n1 = scan.nextInt();
                        scan.nextLine();

                        if (n < 0 || n1 < 0) {
                            System.out.println("Negatif girmeyiniz...");

                        } else {
                            System.out.println("Girdiginiz sayilarin tekrarli toplami (carpimi): " + n + " * " + n1
                                    + " = " + topCarp(n, n1));
                            break;
                        }
                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err.print("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("10")) {
                System.out.print("Rakamlari toplanacak sayiyi giriniz :");
                while (true) {
                    try {

                        n = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0) {
                            System.out.println("Girdiginiz sayinin rakamlari toplami: " + sayRakTopla(n));
                            break;
                        } else {
                            System.out.println("Girdiginiz sayinin rakamlari toplami: " + sayRakTopla(-n));
                            break;
                        }

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }

            } else if (islem.equals("11")) {
                System.out.print("Lutfen bir sayi giriniz:");
                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n >= 0) {

                            System.out.println(n + " Tavasanin " + tavsanGozSay(n) + " adet gozu vardir.");
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("12")) {
                System.out.print("Tribonacci dizisinin kacinci indisini goruntulemek istiyorsunuz: ");
                while (true) {
                    try {

                        n = scan.nextInt();
                        scan.nextLine();
                        if (n >= 0) {
                            System.out.println("Tribonacci dizisinin " + n + ". indisinin degeri:" + triBul(n));
                            break;
                        } else {
                            System.out.print("Negatif sayi girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("13")) {

                while (true) {

                    try {

                        System.out.print("Lutfen ilk sayiyi giriniz:");
                        n = scan.nextInt();
                        System.out.print("Lutfen ikinci sayiyi giriniz:");
                        n1 = scan.nextInt();
                        scan.nextLine();

                        if (n > 0 && n1 > 0) {
                            System.out.println("OBEB(" + n + "," + n1 + ") = " + obebBul(n, n1));
                            break;
                        } else if (n == 0 || n1 == 0) {
                            System.out.print("0/0 Belirsizligi...\n");

                            break;
                        } else {
                            System.out.println("Ebob islemi asal carpanlara dayandigindan negatif girmeyiniz...");
                        }

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err
                                .println("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("14")) {

                System.out.print("Lutfen bir sayi giriniz: ");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0) {
                            System.out.println("0 dan " + n + "'e kadar olan sayilarin toplami: " + toplamBul(n));
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("15")) {
                System.out.print(
                        "Karekonu veya karekokune en yakin ustdeger sayinin karekonu hesaplatmak istediginiz sayiyi giriniz: ");
                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0) {
                            System.out.println(kareKokHesap(n, 0));
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("16")) {
                System.out.print("Asal olup olmadigini kontrol edeceginiz sayiyi giriniz: ");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0) {
                            System.out.println(asalMi(n, n / 2));
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("17")) {
                /*
                 * X markasi telefonlarini uretirken telefonun tek veya cift olmasina gore
                 * hoparlor ekler. Eger model tekse (phoneX1_3_5... 1 ekler )model (ciftse
                 * phoneX2_4_6...) 2 ekler phoneX1=1 phoneX2=1+2=3 phoneX3=1+2+1=4
                 * phoneX4=1+2+1+2=6
                 *
                 */
                System.out.print("Hangi modelin hoparlor sayisini hesaplatmak istersiniz ?" + "\n-");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n > 0) {
                            System.out
                                    .println("phoneX" + n + " Modelinde " + telHop(n) + " adet hoparlor bulunduruyor.");
                            break;
                        } else if (n < 0) {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        } else {
                            System.out.println("phoneX0 Modeli bulunmuyor...");
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }

            } else if (islem.equals("18")) {
                System.out.print("Rakamlarini carpmak istediginiz sayiyi giriniz: ");

                while (true) {
                    try {

                        n = scan.nextInt();
                        scan.nextLine();
                        if (n > 0) {
                            System.out.println("Girdiginiz sayinin rakamlari carpimi: " + sayRakCarp(n));
                            break;

                        } else if (n == 0) {
                            System.out.println("Girdiginiz sayinin rakamlari carpimi: " + 0);
                            break;

                        } else {
                            System.out.println("Girdiginiz sayinin rakamlari carpimi: " + sayRakCarp(-n));
                            break;

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("19")) {

                System.out.print("Lutfen bir sayi giriniz: ");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0) {
                            System.out.println("0 dan " + n + "'e kadar olan cift sayilarin toplami: " + ciftSayTop(n));
                            break;
                        } else {
                            System.out.print("Negatif girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }
            } else if (islem.equals("20")) {

                System.out.print("Tersine cevirmek istediginiz sayiyi girin: ");

                while (true) {

                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n < 0) {
                            System.out.println("Tersine cevirdiginiz sayi: -" + tersYaz(-n));

                            break;
                        }
                        System.out.println("Tersine cevirdiginiz sayi: " + tersYaz(n));

                        break;

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }
            } else if (islem.equals("21")) {

                System.out.print("Pozitif tam bolenleri bulmak istidiginiz sayiyi giriniz :");

                while (true) {

                    try {

                        n = scan.nextInt();
                        scan.nextLine();

                        if (n > 0) {
                            System.out.println("Girdiginiz sayinin pozitif tam bolenleri: " + bolenBul(n, 1));
                            break;
                        } else {
                            System.out.print("Negatif ve sifir girmeyiniz...\n" + "sayi: ");

                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }

                }
            } else if (islem.equals("22")) {

                System.out.print("Karakter/sayi/Dize giriniz: ");

                while (true) {

                    s = scan.nextLine();

                    if (palMi(s)) {
                        System.out.println(s + " palindromdur.");

                    } else {
                        System.out.println(s + " palindrom degildir.");
                        break;
                    }
                }
            } else if (islem.equals("23")) {
                System.out.print("Dizinin  boyutunu giriniz :");

                while (true) {

                    try {
                        boyut = scan.nextShort();
                        dizi = new int[boyut];

                        for (i = 0; i < boyut; i++) {
                            System.out.print("Dizinin " + (i + 1) + ". elemanini girin : ");
                            dizi[i] = scan.nextInt();
                            scan.nextLine();// Onemli!
                        }

                        for (i = 0; i < dizi.length; i++) {
                            System.out.println("dizi[" + i + "] = " + dizi[i]);

                        }
                        System.out.println("Diziye girdiginiz sayilarin toplami: " + (diziTop(dizi, 0)));
                        break;

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    } catch (Exception e) {

                        System.err.print("Dizinin boyutu negatif ve sifir olamaz.Pozitif girin :");

                    }
                }
            } else if (islem.equals("24")) {
                System.out.print("Dizinin  boyutunu giriniz :");

                while (true) {

                    try {
                        boyut = scan.nextShort();
                        dizi = new int[boyut];

                        for (i = 0; i < boyut; i++) {
                            System.out.print("Dizinin " + (i + 1) + ". elemanini girin : ");
                            dizi[i] = scan.nextInt();
                            scan.nextLine();
                        }

                        for (i = 0; i < dizi.length; i++) {
                            System.out.println("dizi[" + i + "] = " + dizi[i]);

                        }
                        System.out.println("Diziye girdiginiz sayilar arasinda en buyugu : " + (diziEnBuyBul(dizi, 0)));
                        break;

                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    } catch (Exception e) {

                        System.err.print("Dizinin boyutu negatif ve sifir olamaz.Pozitif girin :");

                    }
                }
            } else if (islem.equals("25")) {
                System.out.print("Dizinin  boyutunu giriniz :");

                while (true) {

                    try {
                        boyut = scan.nextShort();
                        dizi = new int[boyut];

                        for (i = 0; i < boyut; i++) {
                            System.out.print("Dizinin " + (i + 1) + ". elemanini girin : ");
                            dizi[i] = scan.nextInt();
                            scan.nextLine();
                        }

                        for (i = 0; i < dizi.length; i++) {
                            System.out.println("dizi[" + i + "] = " + dizi[i]);

                        }
                        System.out.print("Dizinin hangi elamanin(konumunu) sorgulamak istersiniz :");
                        n = scan.nextInt();
                        scan.nextLine();

                        if (1 == diziElemanBul(dizi, n, 0)) {
                            System.out.println(n + "  sayisi  girdiginiz dizinin elemani degildir...");
                            break;
                        } else if (true) {
                            System.out.println(n + " sayisi girdiginiz dizinin " + diziElemanBul(dizi, n, 0)
                                    + ". indisi " + (diziElemanBul(dizi, n, 0) + 1) + ". elemani konumundadir.");
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    } catch (Exception e) {

                        System.err.print("Dizinin boyutu negatif olamaz.Pozitif girin :");

                    }
                }
            } else if (islem.equals("26")) {
                System.out.print("Lutfen bir sayi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n <= 0) {
                            System.out.print("Sayma sayilari 1 den baslar!\nLutfen sayi giriniz: ");

                        } else {
                            System.out.println("1 den " + n + " 'e Kadar Serinin toplami : " + seriTop(n) + "'dur.");
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("27")) {
                System.out.print("Lutfen bir sayi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n < 0) {
                            System.out.print("Negatif girmeyiniz!\nLutfen sayi giriniz: ");

                        } else {
                            System.out.println("ln(" + n + "!) = " + dogalLogFak(n));
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }

            } else if (islem.equals("28")) {
                System.out.print("Lutfen bir sayi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();
                        if (n <= 0) {
                            System.out.print("Sayma sayilari 1 den baslar!\nLutfen sayi giriniz: ");

                        } else {
                            System.out.println(
                                    "1 den " + n + " 'e Kadar Harmonik Serinin toplami : " + harmTop(n) + "'dur.");
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("29")) {
                while (true) {
                    try {

                        System.out.print("Lutfen ilk sayiyi giriniz:");
                        n = scan.nextInt();
                        System.out.print("Lutfen ikinci sayiyi giriniz:");
                        n1 = scan.nextInt();
                        scan.nextLine();

                        if (n > 0 && n1 > 0) {
                            System.out.println("OKEK(" + n + "," + n1 + ") = " + okekBul(n, n1));
                            break;
                        } else if (n == 0 || n1 == 0) {
                            System.out.print("0/0 Belirsizligi...\n");

                            break;
                        } else {
                            System.out.println("Ekok islemi asal carpanlara dayandigindan negatif girmeyiniz...");
                        }

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err
                                .println("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("30")) {
                while (true) {
                    try {

                        System.out.print("Lutfen sayiyi giriniz:");
                        n = scan.nextInt();
                        System.out.print("Aradiginiz rakami giriniz:");
                        n1 = scan.nextInt();
                        scan.nextLine();

                        if (n >= 0 && n1 >= 0) {
                            System.out.println(
                                    n + " sayisinda " + rakamAdet(n, n1) + " adet " + n1 + " rakami bulunmaktadir...");
                            break;

                        } else {
                            System.out.println("Negatif girmeyiniz!");

                        }

                    } catch (InputMismatchException e) {
                        scan.nextLine();
                        System.err
                                .println("Girdiginiz sayi gecerisizdir...Enter tusuna basip gecerli bir sayi giriniz!");

                        scan.nextLine();

                    }
                }
            } else if (islem.equals("31")) {
                System.out.print("Onluk tabanda sayi giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n <= 0) {
                            System.out.print("Negatif ve sifir girmeyiniz!\nLutfen sayi giriniz: ");

                        } else {
                            System.out.print("Girilen sayiyin ikilik tabandaki degeri : ");
                            ikiTab(n);
                            System.out.println();
                            break;
                        }
                    } catch (InputMismatchException e) {

                        System.err.print("Girdiginiz sayi gecerisizdir...Gecerli bir sayi giriniz:");

                        scan.nextLine();

                    }
                }
            }else if (islem.equals("32")) {
                System.out.print("Disk sayisini giriniz: ");
                while (true) {
                    try {
                        n = scan.nextInt();
                        scan.nextLine();

                        if (n <= 0) {
                            System.out.print("Negatif ve sifir girilemez!\nLütfen pozitif bir sayi giriniz: ");
                        } else {
                            System.out.println("Disklerin tasima sirasi:");
                            HanoiKuleleri.hanoiKuleleri(n, 'A', 'C', 'B');
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.err.print("Girdiginiz sayi gecerli degildir...Gecerli bir sayi giriniz: ");
                        scan.nextLine();
                    }
                }
            }else {
                System.out.println("Gecersiz bir algoritmayi calistirmayi denediniz...");
            }
        }
    }
}

