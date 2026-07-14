import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !theirCollection.containsAll(myCollection) &&
               !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> intersetcion = new HashSet<>(collections.get(0));
        for(Set<String> set: collections){
            intersetcion.retainAll(set);
        }
        return intersetcion;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allEl = new HashSet<>();
        for(Set<String> set: collections){
            for(String element : set){
                allEl.add(element);
            }
        }
       return allEl;
    }
}
