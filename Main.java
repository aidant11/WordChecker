import java.util.ArrayList;


public class Main {
    public static void main(String [] args)
    {
        WordChecker w = new WordChecker(null);
       
        ArrayList<String> words = new ArrayList<String>();
       
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");

        System.out.println(words);
        WordChecker x = new WordChecker(words);
        for (int i = 1; i < words.size(); i++) {
        String after = words.get(i);
        String before = words.get(i-1);
        }   
    }
}
