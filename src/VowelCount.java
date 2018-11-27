import java.util.ArrayList;
import java.util.List;

public class VowelCount {

        public int getCount(String str) {
            int vowelsCount = 0;
            String lowerString = str.toLowerCase();
            ArrayList<Character> vowels = new ArrayList();
            vowels.add('e');
            vowels.add('o');
            vowels.add('u');
            vowels.add('i');
            vowels.add('a');
            for(int i = 0; i<str.length();i++){
                if(vowels.contains(lowerString.charAt(i))){
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }
}
