import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        //EX2
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a string");
        String a = keyboard.nextLine();
        System.out.println(a.substring(0, 3) + a.substring(a.length() - 3));
        System.out.println(a.replaceAll("a", "?"));
        System.out.println("Pozitiile pe care apare x sunt: " + Arrays.toString(pozitii(a).toArray()));
        char[] c = a.toCharArray();
        if (c[0] == c[a.length() - 1]) {
            System.out.println("DA");
        } else System.out.println("NU");

        //EX3,4

        System.out.println("enter a new string");
        String b = keyboard.nextLine();
        if (b.matches("[a-zA-Z]+")) {
            System.out.println("Doar litere");
        } else System.out.println("Litere si cifre");

        //EX5
        System.out.println("enter a new string with odd length");
        String d = keyboard.nextLine();
        System.out.println("Caracterul din mijloc este " + d.toCharArray()[d.length() / 2]);

        //EX6
        System.out.println("enter a new string");
        String e = keyboard.nextLine();
        System.out.println(litereMari(e));
        //EX 7,8,9,10,11
        System.out.println("Enter x= ");
        float x = keyboard.nextFloat();
        if (x >= 0 && x == (int) x) {
            System.out.println("este numar natural ");
        } else System.out.println("Nu este numar natural");
        if (x > 0) {
            System.out.println("este numar pozitiv ");
        } else if (x == 0) System.out.println("Este neutru");
        else System.out.println("este negativ");

        if (x >= -2 && x <= 13) {
            System.out.println("este intre -2 si 13");
        } else System.out.println("Nu este intre -2 si 13");

        System.out.println("Enter y= ");
        float y = keyboard.nextFloat();
        if(x-y < 5)
            System.out.println("Diferenta mai mica de 5");
        else System.out.println("Diferenta mai mare de 5");

        if (!(x >= 5 && x <= 27)) {
            System.out.println("X nu este intre 5 si 27");
        } else System.out.println("X este intre 5 si 27");

        //EX12
        System.out.println("x2= ");
        int x2= keyboard.nextInt();
        System.out.println("y2= ");
        int y2= keyboard.nextInt();
        if(x2 == y2)
            System.out.println("x2 egal cu y2");
        else if(x2>y2)
            System.out.println("x2 este mai mare");
        else System.out.println("y2 este mai mare");

        //EX13
        System.out.println("x3= ");
        int x3 = keyboard.nextInt();
        System.out.println("y3= ");
        int y3 = keyboard.nextInt();
        System.out.println("z3= ");
        int z3 = keyboard.nextInt();
        if (x3 == y3 && x3 == z3)
            System.out.println("Triunghi echilateral");
        else if (x3 == y3 || z3 == y3 || x3 == z3)
            System.out.println("Triunghi isoscel");
        else System.out.println("Triunghi oarecare");

        //EX14
        System.out.println("Introduceti o litera ");
        String litera = keyboard.nextLine();
        String vocale = "aeiou";
        if(vocale.contains(litera))
            System.out.println("este vocala");
        else System.out.println("este consoana");

        //EX15
        char[] noteTransf = new char[10];
        for (int i=0; i<4; i++)
            noteTransf[i] = 'F';
        noteTransf[4] = 'E';
        noteTransf[5] = 'E';
        noteTransf[6] = 'D';
        noteTransf[7] = 'C';
        noteTransf[8] = 'B';
        noteTransf[9] = 'A';
        for (int i=0; i<10; i++)
            System.out.println("Nota "+ (i+1) + " este echivalenta cu "+noteTransf[i]);



        //EX16
        System.out.println("x4= ");
        int x4 = keyboard.nextInt();
        if(String.valueOf(x4).length() >= 4)
            System.out.println("are minim 4 cifre");
        else System.out.println("nu are minim 4 cifre");
        //EX17
        if(String.valueOf(x4).length() == 6)
            System.out.println("are 6 cifre");
        else System.out.println("nu are 6 cifre");
        //EX18
        if(x4 % 2 == 0)
            System.out.println("X este nr par");
        else System.out.println("X este nr impar");

        //EX19,20

        System.out.println("x5= ");
        int x5 = keyboard.nextInt();
        System.out.println("y5= ");
        int y5 = keyboard.nextInt();
        System.out.println("z5= ");
        int z5 = keyboard.nextInt();
        if(x5>=y5 && x5 >=z5)
            System.out.println("x5 este cel mai mare");
        else if (y5>=z5)
            System.out.println("y5 este cel mai mare");
        else System.out.println("z5 este cel mai mare");

        if (x5+y5+z5 == 180)
            System.out.println("Triunghi valid");
        else System.out.println("Nu este triunghi");


        //EX21
        Person persoana1 = new Person(21,false,false,true,false,false);
        Person persoana2 = new Person(17,true,true,true,false,false);
        Person persoana3 = new Person(17,true,false,true,false,true);
        Person persoana4 = new Person(21,false,false,false,false,false);
        Person persoana5 = new Person(15,false,false,true,false,false);
        Person persoana6 = new Person(17,true,false,true,false,false);

        System.out.println("Expected result persoana1: true");
        System.out.println("Actual result persoana1: "+ Person.sePoateImbarca(persoana1));
        System.out.println("Expected result persoana2: true");
        System.out.println("Actual result persoana2: "+ Person.sePoateImbarca(persoana2));
        System.out.println("Expected result persoana3: true");
        System.out.println("Actual result persoana3: "+ Person.sePoateImbarca(persoana3));
        System.out.println("Expected result persoana4: false");
        System.out.println("Actual result persoana4: "+ Person.sePoateImbarca(persoana4));
        System.out.println("Expected result persoana5: false");
        System.out.println("Actual result persoana5: "+ Person.sePoateImbarca(persoana5));
        System.out.println("Expected result persoana6: false");
        System.out.println("Actual result persoana6: "+ Person.sePoateImbarca(persoana6));


        //EX22

        System.out.println("Ghiceste numarul: ");
        int x6 = keyboard.nextInt();
        Random random = new Random();
        int randomZar = random.nextInt(6);
        if (x6 == randomZar)
            System.out.println("Ai ghicit.Felicitari. Ai ales " + x6 + " si numarul a fost " + randomZar);
        else if (x6 < randomZar)
            System.out.println("Ai pierdut. Ai ales un numar mai mic. Ai ales " + x6 + " dar a fost " + randomZar);
        else System.out.println("Ai pierdut. Ai ales un numar mai mare. Ai ales " + x6 + " dar a fost " + randomZar);

    }

    public static List<Integer> pozitii(String string) {
        List<Integer> pozitii = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.toCharArray()[i];
            if (c == 'x')
                pozitii.add(i);

        }
        return pozitii;
    }

    public static String litereMari(String string) {
        char[] m = string.toCharArray();
        char primaLitera = m[0];
        StringBuilder result = new StringBuilder();
        result.append(primaLitera);
        for (int i = 1; i < string.length() - 1; i++) {
            if (m[i] == primaLitera)
                m[i] = Character.toUpperCase(m[i]);
            result.append(m[i]);
        }
        result.append(m[string.length() - 1]);
        return result.toString();
    }

}



