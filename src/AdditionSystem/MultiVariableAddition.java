package src.AdditionSystem;

import java.util.Scanner;
public class MultiVariableAddition {

    public static void main (String[] args) {
        Scanner scan= new Scanner(System.in);
        int a1,b1,c1,d1;
        double p1,q1,r1,s1;

        System.out.println("Choose Your Data Type :");
        System.out.println("1.Integer");
        System.out.println("2.Double");

        int option = scan.nextInt();
        if(option==1)
        {
            System.out.println("Number of Variable :");
            System.out.println("2.Two");
            System.out.println("3.Three");
            System.out.println("4.Four");
            int ab =scan.nextInt();
            if(ab==2)
            {
               a1 = scan.nextInt();
               b1 =scan.nextInt();
                CalculationSystem cal1 = new CalculationSystem(a1,b1);
            }
            else if(ab==3)
            {
                a1 = scan.nextInt();
                b1 =scan.nextInt();
                c1 = scan.nextInt();
                CalculationSystem cal2 = new CalculationSystem(a1,b1,c1);

            }
            else if(ab==4)
            {
                a1 = scan.nextInt();
                b1 =scan.nextInt();
                c1 = scan.nextInt();
                d1 =scan.nextInt();
                CalculationSystem cal3 = new CalculationSystem(a1,b1,c1,d1);
            }
        }
        if(option==2)
        {
            System.out.println("Number of Variable :");
            System.out.println("2.Two");
            System.out.println("3.Three");
            System.out.println("4.Four");
            int ab =scan.nextInt();
            if(ab==2)
            {
                p1 = scan.nextDouble();
                q1 =scan.nextDouble();

                CalculationSystem cal4 = new CalculationSystem(p1,q1);
            }
            else if(ab==3)
            {
                p1 = scan.nextDouble();
                q1 =scan.nextDouble();
                r1 = scan.nextDouble();
                CalculationSystem cal5 = new CalculationSystem(p1,q1,r1);
            }
            else if(ab==4)
            {
                p1 = scan.nextDouble();
                q1 =scan.nextDouble();
                r1 = scan.nextDouble();
                s1 = scan.nextDouble();
                CalculationSystem cal6 = new CalculationSystem(p1,q1,r1,s1);
            }

        }

    }

    public static class CalculationSystem {

        int a, b, c, d;
        double p, q, r, s;
        int result_int;
        double result_double;

        CalculationSystem(int m, int n) {
            a = m;
            b = n;
            result_int = a + b;
            System.out.println("Sum of two integer : " + result_int);
        }

        CalculationSystem(int m, int n, int x) {
            a = m;
            b = n;
            c = x;
            result_int = a + b + c;
            System.out.println("Sum of three integer : " + result_int);

        }

        CalculationSystem(int m, int n, int x, int y) {
            a = m;
            b = n;
            c = x;
            d = y;
            result_int = a + b + c + d;
            System.out.println("Sum of four integer : " + result_int);

        }

        CalculationSystem(double m, double n) {
            p = m;
            q = n;
            result_double = p + q;
            System.out.println("Sum of two double : " + result_double);
        }

        CalculationSystem(double m, double n, double x) {
            p = m;
            q = n;
            r = x;
            result_double = p + q + r;
            System.out.println("Sum of three double : " + result_double);
        }

        CalculationSystem(double m, double n, double x, double y) {
            p = m;
            q = n;
            r = x;
            s = y;
            result_double = p + q + r + s;
            System.out.println("Sum of four double :" + result_double);
        }
    }
}

