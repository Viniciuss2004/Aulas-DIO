package cod.src;

public class Operadores {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.60;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("Exercicio 1");

        System.out.println("\ni1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i2 > i2));
        System.out.println("i1 <= i2: " + (i2 <= i2));

        System.out.println("\nf1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 > f2: " + (f1 > f2));
        System.out.println("f1 <= f2: " + (f1 <= f2));

        System.out.println("\nc1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println("\ns1 == s2:  " + (s1 == s2));
        System.out.println("s1 != s3: " + (s1 != s3));
        // System.out.println("s1 > s2: " + (s2 > s2)); Da erro!
        // System.out.println("s1 <= s2: " + (s2 <= s2)); Da erro!

        System.out.println("\nb1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));
        // System.out.println("b1 > b2: " + (b1 > b2)); Da erro!
        // System.out.println("b1 <= b2: " + (b1 <= b2)); Da erro!

        System.out.println("\ni1 > f1: " + (i1 > f1));
        System.out.println("d1 == h1: " + (d1 == h1));
        // System.out.println("s2 != c1: " + (s2 != c1)); Da erro!
        // System.out.println("s3 != i1: " + (s3 != i1)); Da erro!

        System.out.println("\nl1 == i2: " + (l1 == i2));
        System.out.println("l2 >= i1: " + (l2 >= i1));
        System.out.println("y1 != h1: " + (y1 != h1));

        /* Respostas

           i1 == i2: false
           i1 != i2: true
           i1 > i2: false
           i1 <= i2: true

           f1 == f2: false
           f1 != f2: true
           f1 > f2: true
           f1 <= f2: false

           c1 == c2: false
           c1 != c2: true
           c1 > c2: false
           c1 <= c2: true

           s1 == s2: true
           s1 != s3: true
           s1 > s2: erro
           s1 <= s2: erro

           b1 == b2: false
           b1 != b2: true
           b1 > b2: erro
           b1 <= b2: erro

           i1 > f1: true
           d1 == h1: false
           s2 != c1: erro
           s3 != i1: erro

           l1 == i2: false
           l2 >= i1: true
           y1 != h1: true */

        System.out.println("\nExercicio 2");

        boolean n1 = true;
        boolean n2 = false;
        boolean n3 = true;
        boolean n4 = false;

        System.out.println("\no1 && o2: " + (n1 && n2));
        System.out.println("o1 && o3: " + (n1 && n3));

        System.out.println("\no2 || o3: " + (n2 || n3));
        System.out.println("o2 || o4: " + (n2 || n4));

        System.out.println("\no1 ^ o3: " + (n1 ^ n3));
        System.out.println("o4 ^ o1: " + (n4 ^ n1));

        System.out.println("\n" + !n1);
        System.out.println(!n2);

        int t1 = 10;
        int t2 = 5;
        float a1 = 20f;
        float a2 = 50f;

        System.out.println("\n((t1 + t2) < (a1 - a2)) && true: " + (((t1 + t2) < (a1 - a2)) && true));
        System.out.println("(t1 + t2) || (a1 - a2) && true: " + ((t1 + t2) < (a1 - a2) && true));

        /* Respostas

           n1 && n2: false
           n1 && n3: true

           n2 || n3: true
           n2 || n4: false

           n1 ^ n3: false
           n4 ^ n1: true

           false
           true

           ((t1 + t2) < (a1 - a2)) && true: false
           (t1 + t2) || (a1 - a2) && true: false */

    }
}
