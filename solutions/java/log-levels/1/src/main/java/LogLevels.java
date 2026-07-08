import java.util.ArrayList;
import java.util.Collections;

public class LogLevels {
    public static String message(String logLine) {
        ArrayList<String> strArr = getArray(logLine);
        strArr.remove(0);
        return String.join(" ", strArr).replaceAll("\\s+", " ").trim();
    }

    public static String logLevel(String logLine) {
        ArrayList<String> strArr = getArray(logLine);
        String res = strArr.get(0).replace("[","").replace("]","").replace(":","").toLowerCase().trim();
        return res;
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    public static ArrayList<String> getArray(String logLine){
        String[] split = logLine.split(" ");
        ArrayList<String> strArr = new ArrayList<>(split.length);
        Collections.addAll(strArr,split);
        return strArr;
    }
}
