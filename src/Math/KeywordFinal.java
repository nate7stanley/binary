package Math;

public class KeywordFinal {

    public static void main(String args[]) {
        final StringBuilder sb=new StringBuilder("hello ");
        // immune to initializing, can be appended because thats an object
        System.out.println(sb);


        sb.append("welcome");

        System.out.println(sb);
    }
}
