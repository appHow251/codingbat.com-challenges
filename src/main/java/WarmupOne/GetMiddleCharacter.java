package WarmupOne;

public class GetMiddleCharacter {

    public Character getMiddleCharacter(String word) {
        char[] ch = word.toCharArray();
        return ch[word.length() / 2];
    }
}
