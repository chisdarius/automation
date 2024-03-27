import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //EX1
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti gradele Celsius");
        float celsius = keyboard.nextFloat();
        float fah = (celsius*9/5)+32;
        System.out.println("Gradele in Fahrenheit sunt: "+fah);
//
//        //EX2
        int a=3;
        int b=5;
        System.out.println("a este = "+a+ "b este egal cu " +b);
        int aux =a;
        a=b;
        b=aux;
        System.out.println("dupa schimbare, a este = "+a+ "b este egal cu " +b);
//
//        //EX3
        int minPeZi = 24*60;
        int minPeAn= minPeZi * 365;
        System.out.println("Introduceti minutele");
        long minute = keyboard.nextLong();
        int nrAni = (int) (minute/minPeAn);
        int nrZile = (int) ((minute % minPeAn)/minPeZi);
        System.out.println("sunt " +nrAni+ " ani " +nrZile+ " zile");

//        //EX4
//        System.out.println("Introduceti primul numar");
//        int a1 = keyboard.nextInt();
//        System.out.println("Introduceti al doilea numar");
//        int a2 = keyboard.nextInt();
//        System.out.println("Introduceti al treilea numar");
//        int a3 = keyboard.nextInt();
//        System.out.println("Introduceti al patrulea numar");
//        int a4 = keyboard.nextInt();
//        System.out.println("Introduceti al cincilea numar");
//        int a5 = keyboard.nextInt();
//        float medAritm = (a1+a2+a3+a4+a5)/5;
//        System.out.println("Media aritmetica este "+medAritm);
//
////        //EX5
//        System.out.println("Intoroduceti nota elevului");
//        int nota = keyboard.nextInt();
//        if (nota >= 5){
//            System.out.println("Promovat");
//        }
//        else System.out.println("Nepromovat");
//
//        //EX6
//        System.out.println("introduceti nota elevului: ");
//        int nota = keyboard.nextInt();
//        if (nota >= 8){
//            System.out.println("Foarte bine");
//        }
//        else if (nota <8 && nota >= 5){
//            System.out.println("Bine");
//        }
//        else System.out.println("insuficient");
//
////        //EX7
//
//        System.out.println("Introduceti numarul");
//        int nr = keyboard.nextInt();
//        if (nr % 2 == 0){
//            System.out.println("Numarul este par");
//        }
//        else System.out.println("Numarul este impar");
//
//        //EX8
//        System.out.println("introduceti numarul");
//        int n = keyboard.nextInt();
//        int[] cifre = new int[4];
//        for (int i=0;i<4;i++){
//            cifre[i] = (int) (n/Math.pow(10,i)%10);
//        }
//        int[] aparitii = {0,0,0,0,0,0,0,0,0,0};
//        for (int i=0; i<10; i++)
//            for (int j=0; j<4; j++)
//                if (cifre[j] == i){
//                    aparitii[i]++;
//                }
//        Arrays.sort(cifre);
//        System.out.println("Cea mai mare cifra este "+ cifre[3] + " si apare de "+aparitii[cifre[3]]+" ori");
//
//        //EX9
//        System.out.println("introduceti numarul");
//        int n = keyboard.nextInt();
//        switch (n){
//            case 1:
//                System.out.println("azi e luni");
//                break;
//            case 2:
//                System.out.println("azi e marti");
//                break;
//            case 3:
//                System.out.println("azi e miercuri");
//                break;
//            case 4:
//                System.out.println("azi e joi");
//                break;
//            case 5:
//                System.out.println("azi e vineri");
//                break;
//            case 6:
//                System.out.println("azi e sambata");
//                break;
//            case 7:
//                System.out.println("azi e duminica");
//                break;
//            default:
//                System.out.println("numarul nu este o zi a saptamanii");
//        }
//
//        //EX10
//        System.out.println("introduceti prima cifra");
//        int n1 = keyboard.nextInt();
//        System.out.println("introduceti a doua cifra ");
//        int n2 = keyboard.nextInt();
//        System.out.println("introduceti a treia cifra");
//        int n3 = keyboard.nextInt();
//        double nr = n1* Math.pow(10,2)+n2*10 + n3;
//        System.out.println("Numarul format din cele 3 cifre este: " + nr);
//
//        //EX11
//        System.out.println("introduceti primul numar");
//        int a = keyboard.nextInt();
//        System.out.println("introduceti al doilea numar");
//        int b = keyboard.nextInt();
//        if (a+1==b || a-1==b){
//            System.out.println("numerele sunt consecutive");
//        }
//        else System.out.println("numerele nu sunt consecutive");


        //EX12
        System.out.println("introduceti luna");
        int n = keyboard.nextInt();
        switch (n) {
            case 1:
                System.out.println("iarna");
                break;
            case 2:
                System.out.println("iarna");
                break;
            case 3:
                System.out.println("primavara");
                break;
            case 4:
                System.out.println("primavara");
                break;
            case 5:
                System.out.println("primavara");
                break;
            case 6:
                System.out.println("vara");
                break;
            case 7:
                System.out.println("vara");
                break;
            case 8:
                System.out.println("vara");
                break;
            case 9:
                System.out.println("toamna");
                break;
            case 10:
                System.out.println("toamna");
                break;
            case 11:
                System.out.println("toamna");
                break;
            case 12:
                System.out.println("iarna");
                break;
            default:
                System.out.println("Nu este nici o luna cu acest numar");
        }

    }
}
