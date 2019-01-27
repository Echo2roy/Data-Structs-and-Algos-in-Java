
public class Progression {

    //instance variable

    protected long current;

    // Constructs a progression starting from 0
    public Progression(){this(0);}

    //constructs a progression with a given start value

    public Progression(long start){current = start;}

    //Returns the net value of the progression
    public long nextValue(){
        long answer = current;
        advance(); // this protected call is responsibe for advancing the current value
        return answer;
    }

    //Advances the current value to the next value of the progression
    protected void advance(){
        current++;
    }

    //Prints the next n values of the progression, separated by the spaces

    public void printProgression(int n){
        System.out.print(nextValue()); //print first value wwithout leading space
        for(int j = 1; j < n; j++)
            System.out.print(" " + nextValue());
        System.out.println();
    }

}
