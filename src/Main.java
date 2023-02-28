import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        long startRange = sc.nextLong();
        System.out.print("Enter ending range: ");
        long endRange = sc.nextLong();

        sc.close();

        System.out.println("All Tech numbers from " + startRange + " to " + endRange + " are: ");

        for(long i=startRange; i<=endRange; i++) {
            if (isTechNumber(i))
                System.out.print(i + "  ");
        }
    }

    private static boolean isTechNumber(long num) {

        long n = num;
        long count = 0;
        long firstHalf;
        long lastHalf;
        long squareOfTwoHalves;

        while(n != 0){
            n /= 10;
            count++;
        }

        if(count % 2 != 0) return false;

        firstHalf = num / (int)Math.pow(10, count/2);
        lastHalf = num % (int)Math.pow(10, count/2);

        squareOfTwoHalves = (firstHalf + lastHalf)*(firstHalf + lastHalf);

        return squareOfTwoHalves == num;
    }
}