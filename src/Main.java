import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi !");
        String[] words = createWordsArray();

        char[] targetWorld = getOneRandomWord(words).toCharArray();
        char[] display = createTargetDisplay(targetWorld.length);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a char : ");
        String userinput = scan.nextLine();
        if(userinput.length()  == 1) {
            char c = userinput.charAt(0);
        } else {
            System.out.println("at least 1 char and only one please");
        }
    }

    private static String[] createWordsArray() {
        return new String[]{"java", "input", "loop", "class"};
    }

    private static String getOneRandomWord(String[] words) {
        if (words == null || words.length < 2 ) {
            throw new IllegalArgumentException();
        }
        Random randomizer = new Random();
        int index = randomizer.nextInt(words.length);
        return words[index];
    }

    private static char[] createTargetDisplay(int length) {
        char[] display = new char[length];
        for( int i = 0 ; i < length ; i++) {
            display[i] = '_';
        }
        return display;
    }
}
