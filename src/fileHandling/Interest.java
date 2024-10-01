package fileHandling;

import java.util.Scanner;

@FunctionalInterface
    interface Interest {
        int calculate(int x);
    }

class Bank {

        int p;
        double r;
        int t;

public Bank (int p, double r, int t) {
        this.p = p;
        this.r = r;
        this.t = t;
        }
}

class Calculator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the principle, whatever r stands for, and the number of time. ");
            int p = scan.nextInt();
            double r = scan.nextDouble();
            int t = scan.nextInt();

            Bank b1 = new Bank(p, r, t);

                    double s = (double) p * r * (double) t;
                    int ans = (int) s;
                    System.out.println(ans);

        }
}




