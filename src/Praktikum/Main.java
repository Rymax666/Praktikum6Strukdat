package Praktikum;
/*
 * Rymax666
 * Fuck Everyone Else!
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void Kegiatan1(){
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String kalimat1 = null;
        String kalimat2 = null;
        String regex = null;
        String replaceFix = null;
        String replace;
        try{
            System.out.print("Masukkan Kalimat Pertama : ");
            kalimat1 = bf.readLine();
            System.out.print("Masukkan Kalimat Kedua : ");
            kalimat2 = bf.readLine();
            System.out.print("Masukkan Regex : ");
            regex = bf.readLine();
        }catch (Exception e){
            System.out.println("Pacarku Lemu");
        }
        //Menggabungkan Kalimat 1 dan 2
        String Kalimat = kalimat1 +", "+ kalimat2;
        //Menggabungkan syntax dengan var regex agar bisa terbaca
        String regexreal = ".*"+regex+".*";
        //jika kata regex ada di dalam kalimat
        if (Pattern.matches(regexreal,Kalimat) == true){
            System.out.print("Masukkan Kata untuk me-replace regex : ");
            try{
            replace = bf.readLine();
            //me-replace kata regex di dalam kalimat dengan kata replace
            replaceFix = Kalimat.replaceAll(regex,replace);
            }catch (Exception e){
                System.out.println(" ");
            }
        }else{
            System.out.println("Regex tidak cocok!");
            Kegiatan1();
        }
        System.out.println("Output : "+replaceFix);

        System.out.print("\nMau Lagee /Cuss kegiatan 2 ? Y/N for cuss  : ");
        char input = scan.next().charAt(0);
        if (input == 'Y' || input == 'y'){
            Kegiatan1();
        }else {
            Kegiatan2();
        }
    }

    public static void Kegiatan2(){
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String kalimat1 = null;
        String kalimat2 = null;
        String kalimat3 = null;
        String Key = null;
        try{
            //definisi variavel
            System.out.print("Masukkan Kalimat Ke-1 : ");
            kalimat1 = bf.readLine();
            System.out.print("Masukkan Kalimat ke-2 : ");
            kalimat2 = bf.readLine();
            System.out.print("Masukkan Kalimat ke-3 : ");
            kalimat3 = bf.readLine();
            System.out.print("Masukkan Key : ");
            Key = bf.readLine();
        }catch (Exception e){
            System.out.println("Pacarku Rewel");
        }
        //Menambahkan syntax ke var key agar bisa dibaca
        String realkey = ".*"+Key+".*";
        //mengecek apakah key berada didalam kalimat
        boolean kondisi1 = Pattern.matches(realkey,kalimat1);
        boolean kondisi2 = Pattern.matches(realkey,kalimat2);
        boolean kondisi3 = Pattern.matches(realkey,kalimat3);

        System.out.println("Kondisi Pertama : "+kondisi1);
        System.out.println("Kondisi Kedua   : "+kondisi2);
        System.out.println("Kondisi Ketiga  : "+kondisi3);

        System.out.print("\nMau Lagee ? Y/N  : ");
        char input = scan.next().charAt(0);
        if (input == 'Y' || input == 'y'){
            Kegiatan2();
        }else {
            System.out.println("Dada sayang :* ");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Kegiatan1" +
                "\n2. Kegiatan2" +
                "\n3. Exit" +
                "\n>>> ");
        int infud = scan.nextInt();
        switch (infud){
            case 1 :
                Kegiatan1();
                break;
            case 2 :
                Kegiatan2();
                break;
            default:
                break;
        }
    }
}
