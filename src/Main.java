public class Main {

    public static void main(String[] args) {
        System.out.println("Hi !");
        for(  String name : createWordsArray() ) {
            System.out.println(name);
        }
    }

    private static String[] createWordsArray() {
        return new String[]{"java", "input", "loop", "class"};
    }
}
