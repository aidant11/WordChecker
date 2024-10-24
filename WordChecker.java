import java.util.ArrayList;


public class WordChecker
{
    public ArrayList<String> wordList;


    public WordChecker(ArrayList<String> list)
    {
        wordList = new ArrayList<String>();
    }
public boolean isWordChain()
{
    for(int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i);
            String before = wordList.get(i -1 );
            if (after.indexOf(before) < 0) return false;
        }
        return true;
}
ArrayList<String> list = new ArrayList<String>(); {
for(String s : wordList) {
    String target;
    if (s.indexOf(target)==0)
    list.add(s.substring(target.length()));
}
return list;
}
}