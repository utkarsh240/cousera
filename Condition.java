import java.util.Scanner;

public class Condition {
   
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int i;

        i = input.nextInt();

//        i = input.nextInt();

            if (i > 15000) 
            {
                i = i + 2000;
            }
            else {
            i = i + 1000;
        }
            System.out.println(i);
        }
    }
