package MultiThreading;

import java.util.Scanner;

      //wait, notify, join, daemon
    //create random number guessing game

//using math.random can give you better random numbers
    class RNG {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);



            for (int i = 0; i < 2; ) {
                int input;

                System.out.println("guess the number. welcome to hell");
                int answer = (int) (Math.random() * 10000);

                input = scan.nextInt();

                if (answer == input) {

                        i = 5;
                        Thread.sleep(4000);
                        System.out.println("wow, i can't believe you really wasted your time with that");
                    }else {
                        System.out.println("the right answer was " + answer + "\nyou can't leave until you get the number right");
                    }

                }
            }



    }


