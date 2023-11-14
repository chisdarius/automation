public class Main {
    public static void main(String[] args) {
        //EX 3
        int x = 5;
        int y = 10;
        System.out.println("The sum of " + x + " and " + y + " is:" + sum(x, y));

        //EX 4
        int i = 20;
        float f = 10;
        String s = "java";
        System.out.println("int = " + i + "; float = " + f + "; string = " + s);

        //EX 5
        System.out.println("The multiplication of " + x + " and " + y + " is:" + produs(x, y));

        //EX6
        int b1 = 10;
        int b2 = 20;
        int b3 = 30;
        int sumb = b1 + b2 + b3;
        System.out.println("Pretul biletelor este =" + sumb);

        //EX7
        float sum = (float) (142 + 9.38);
        System.out.println("Sum is = " + sum);

        //EX8
        String nume = "Chis";
        String prenume = "Darius";
        System.out.println("Numele complet are " + lungime(nume + prenume) + " caractere");

        //EX9
        int l, L;
        l = 10;
        L = 10;
        System.out.println("Aria dreptunghiului este " + produs(l, L));

        //EX10
        String m = "eu merg la mare";
        System.out.println("The length of the sentence is " + lungime(m));

        //EX11
        String z = "Ana are mere";
        int n = 3;
        System.out.println(z.substring(n, lungime(z)));

        //EX12
        String w = "Coral is either the stupidest animal or the smartest rock";
        int v = 7;
        System.out.println(w.substring(0, lungime(w) - v));

        //EX13
        String h = w.substring(0, 5) + w.substring(lungime(w) - 5, lungime(w));
        System.out.println(h);

        //EX14
        System.out.println("Number of appearances is " + nrAparitii(w));

        //EX15
        System.out.println(replaceThe(w));


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int produs(int a, int b) {
        return a * b;
    }

    public static int lungime(String string) {
        return string.length();
    }

    public static int nrAparitii(String str) {
        String[] strings = str.split(" ");
        int n = 0;
        for (String string : strings) {
            if (string.equals("the")) n++;
        }
        return n;
    }

    public static String replaceThe(String str) {
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            if (string.equals("the")) string = string.toUpperCase();
            result.append(string).append(" ");
        }
        return result.toString();
    }
}

