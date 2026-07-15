import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScores {
    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    public List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        int index = highScores.toArray().length -1 ;
        return highScores.get(index);
    }

    Integer personalBest() {
        int best = 0;
        for (int score: highScores){
            if (score >= best){
                best = score;
            }
        }
        return best;
    }

    List<Integer> personalTopThree() {
        List<Integer> topThree = new ArrayList<>();
        List<Integer> copyToSort = new ArrayList<>(highScores);
        copyToSort.sort(Collections.reverseOrder());
        if (copyToSort.size() >= 3){
            for (int i = 0; i < 3; i++) {
                topThree.add(copyToSort.get(i));
            }
        } else {
            topThree.addAll(copyToSort);
        }
       return topThree;
    }
}
