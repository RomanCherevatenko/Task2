public class View {

    public static final String RANGE_STRING = "Range is: ";
    public static final String INPUT_STRING = "Enter your number: ";
    public static final String WRONG_INPUT_STRING = "Wrong input: ";
    public static final String WRONG_RANGE_STRING =
            "Enter number within range ";
    public static final String MORE_STRING = "More ";
    public static final String LESS_STRING = "Less ";
    public static final String Attempt_STRING = "Attampt -  ";
    public static final String WON_STRING = "You won !! ";

    public void printMessage (String message){
        System.out.println(message);
    }

    public void printRange(int rangeLow, int rangeTop){
        printMessage(View.RANGE_STRING+"]"+rangeLow+";"+rangeTop+"[");
    }
}
