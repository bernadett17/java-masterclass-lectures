package controlFlow;

public class TraditionalSwitch {
    public static void main(String[] args) {

        char natoAlphabet='D';

        switch (natoAlphabet){
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + natoAlphabet + " was not found in the switch");
        }
    }
}
