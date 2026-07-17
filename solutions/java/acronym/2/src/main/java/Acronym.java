public class Acronym {
    String[] words;
    String phrase;
    StringBuilder result = new StringBuilder();

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        words = phrase.split("[\\s-]+");
        for(String word : words){
            word = word.replaceAll("[^A-Za-z]+", "");
            result.append(word.toUpperCase().charAt(0));
        }
        return result.toString();
    }
}
