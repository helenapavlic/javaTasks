import java.util.ArrayList;
import java.util.Arrays;


public class Acronym {
    String[] words;
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        words = phrase.split("[\\s-]+");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            word = word.replaceAll("[^A-Za-z]+", "");
            result.append(word.toUpperCase().charAt(0));
        }
        System.out.println(result);
        return result.toString();
    }
}
