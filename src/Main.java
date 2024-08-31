import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi !");
        String[] words = createWordsArray();
        for(  String name :  words) {
            System.out.println(name);
        }
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(getOneRandomWord(words));
        }

        char[] targetWorld = getOneRandomWord(words).toCharArray();

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
}
