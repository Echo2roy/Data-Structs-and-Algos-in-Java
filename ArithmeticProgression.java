public class ArithmeticProgression extends Progression {
    protected long increment;

    public ArithmeticProgression() {this (1,0);} //start at 0 with increment of 1

    public ArithmeticProgression(long stepsize) {this(stepsize, 0);}


    //Constructs ap with arbitrary start and increment
    public ArithmeticProgression(long stepsize, long start){
        super(start);
        increment = stepsize;
    }

    protected void advance(){
        current +=increment;
    }
}

