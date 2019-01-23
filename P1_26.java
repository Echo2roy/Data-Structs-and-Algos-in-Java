import java.util.Scanner; //Added Scanner class to read input

public class P1_26 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:  ");

        String[] s = input.nextLine().split(" ");


        for(int t = (s.length-1); t >= 0; t--){
            System.out.print(s[t] + " ");
        }
    }

}
