import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

//        //EX1
//        int i = 1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 1;
//        do{
//            System.out.println(j);
//            j++;
//        }while (j<=10);
//
//        for(int k=1; k<=10; k++){
//            System.out.println(k);
//        }

        //ex2
//
//        int i = 1, sum=0;
//        while(i<=10){
//            sum = sum+i;
//            i++;
//        }
//        System.out.println(sum);
//
//        int j = 1, sum1=0;
//        do{
//            sum1 = sum1+j;
//            j++;
//        }while (j<=10);
//        System.out.println(sum);
//
//        int sum2=0;
//        for(int k=1; k<=10; k++){
//             sum2 = sum2 + k;
//        }
//        System.out.println(sum);


        //EX3

//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Introduceti un numar intreg");
//        int numar = keyboard.nextInt();
//        int n=1;
//        while(n<=10) {
//            System.out.println(numar+"*"+n+"="+numar*n);
//            n++;
//        }
//        System.out.println("\n");
//        int n1 = 1;
//        do{
//            System.out.println(numar+"*"+n1+"="+numar*n1);
//            n1++;
//        }while (n1<=10);
//        System.out.println("\n");
//
//        for(int n3=1; n3<=10; n3++){
//            System.out.println(numar+"*"+n3+"="+numar*n3);
//        }
//        System.out.println("\n");

        //ex4

        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Introduceti un numar intreg");
//        int numar = keyboard.nextInt();
//        int n=1, produs=1;
//        while(n<=numar) {
//            produs = produs*n;
//            n++;
//        }
//        System.out.println("!"+numar+"="+produs);
//        System.out.println("\n");
//        int n1 = 1, produs1=1;
//        do{
//            produs1=produs1*n1;
//            n1++;
//        }while (n1<=numar);
//        System.out.println("!"+numar+"="+produs1);
//        System.out.println("\n");
//
//        int produs2=1;
//        for(int n3=1; n3<=numar; n3++){
//           produs2=produs2*n3;
//        }
//        System.out.println("!"+numar+"="+produs2);
//        System.out.println("\n");

        //ex5
        //pentru ex 6 la fel ca pt ex 5 doar ca variabila se initializeaza cu 1

//        int i = 0;
//        while(i<=100){
//            System.out.println(i);
//            i=i+2;
//        }
//
//        int j = 0;
//        do{
//            System.out.println(j);
//            j=j+2;
//        }while (j<=100);
//
//        for(int k=0; k<=100; k=k+2){
//            System.out.println(k);
//        }

        //ex7
        //ex8 la fel ca si pentru ex7 doar ca n=n+2;
//        System.out.println("Introduceti un numar natural");
//        int numar = keyboard.nextInt();
//        int n=1, sum=0;
//        while(n<=numar) {
//            sum = sum + n;
//            n++;
//        }
//        System.out.println("Suma este " +sum);
//        System.out.println("\n");
//        int n1 = 1, sum1=0;
//        do{
//            sum1=sum1 + n1;
//            n1++;
//        }while (n1<=numar);
//        System.out.println("Suma este " +sum1);
//        System.out.println("\n");
//
//        int sum2=0;
//        for(int n3=1; n3<=numar; n3++){
//           sum2=sum2+n3;
//        }
//        System.out.println("Suma este " +sum2);
//        System.out.println("\n");

        //ex9
//        System.out.println("Introduceti un numar natural");
//        int numar = keyboard.nextInt();
//        int numar1 = numar;
//        int n=0;
//        while(numar>0) {
//            n=n*10+numar%10;
//            numar = numar/10;
//        }
//        if(n==numar1) System.out.println("Palindrom");
//        else System.out.println("nu este palindrom");
//        System.out.println("\n");
//
//        int n1 = 0, numar2 = numar1;
//        do{
//            n1=n1*10+numar1%10;
//            numar1 = numar1/10;
//        }while (numar1>0);
//        if(n1==numar2) System.out.println("Palindrom");
//        else System.out.println("nu este palindrom");
//        System.out.println("\n");
//
//        int numar3 = numar2, n2=0;
//        for(; numar2>0; numar2=numar2/10){
//            n2=n2*10+numar2%10;
//        }
//        if(n2==numar3) System.out.println("Palindrom");
//        else System.out.println("nu este palindrom");
//        System.out.println("\n");

        //ex10

//        System.out.println("Introduceti un numar natural de minim 3 cifre");
//        int numar = keyboard.nextInt();
//        int sum = 0;
//        for (; numar > 0; numar = numar / 10) {
//            sum = sum + numar % 10;
//        }
//        System.out.println("suma este "+sum);

//        //ex11
//        System.out.println("Introduceti un numar");
//        int a = keyboard.nextInt();
//        System.out.println("Introduceti alt numar");
//        int b = keyboard.nextInt();
//        int power=1;
//        for(int i=1;i<=b;i++){
//            power=power*a;
//        }
//        System.out.println(a+" la puterea "+b+"este "+power);

        //ex12
        System.out.println("Introduceti un numar natural");
        int numar = keyboard.nextInt();
        int n=0;
        while(numar>0) {
            n=n*10+numar%10;
            numar = numar/10;
        }
        System.out.println(n);
    }
}
