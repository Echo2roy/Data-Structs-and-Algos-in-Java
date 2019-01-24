import java.security.SecureRandom;

public class P1_29 {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        //shifting value specifies the first value

        int array [] = new int[5];

        for (int roll = 0; roll <5; roll++) {

            array[roll] = 1 + randomNumbers.nextInt(31);
        }// close for

        for (int i = 0; i < 5; i++)
        {
            System.out.print(array[i] + " ");
        }



    }
}
