import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;

public class P1_29 {

    

    public static void main(String[] args) {
        int n, r, i;
        double d;
        BigDecimal abd = new BigDecimal("0");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of people in room: ");
        i = input.nextInt();
        n = 365;
        r = 365 - i;
        // Calculate the nPr

        abd = factor(n).divide(factor(n-(n-r))) ;
        abd = abd.divide(BigDecimal.valueOf(Math.pow(n,i)),4,
                RoundingMode.HALF_UP);
        d = abd.doubleValue();
        System.out.printf("Same birthday probability: %.0f%%\n",((1-d)*100));
    }


    public static BigDecimal factor(int num)
    {
        BigDecimal abd = new BigDecimal("1");
        int i;
        for(i=0; i<num; i++){
            abd = abd.add(abd.multiply(BigDecimal.valueOf(i)));
        }
        return abd;



      /*  //shifting value specifies the first value

        int array [] = new int[5];

        for (int roll = 0; roll <5; roll++) {

            array[roll] = 1 + randomNumbers.nextInt(31);
        }// close for

        for (int i = 0; i < 5; i++)
        {
            System.out.print(array[i] + " ");
        }
*/


    }
}
