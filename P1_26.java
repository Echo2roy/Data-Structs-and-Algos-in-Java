import java.util.Scanner; //Added Scanner class to read input

public class P1_26 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:  ");

        // Stores each string in array cell separated by whitespaces
        String[] s = input.nextLine().split(" ");

        //iterates through array and displays each string
        for(int t = (s.length-1); t >= 0; t--){
            System.out.print(s[t] + " ");
        }
    }

}
