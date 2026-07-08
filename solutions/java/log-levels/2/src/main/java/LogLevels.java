public class LogLevels {
    
    public static String message(String logLine) {
        String mess = logLine.substring(logLine.indexOf(":")+1).trim();
        return mess;
    }

    public static String logLevel(String logLine) {
        String level = logLine.substring(1,logLine.indexOf("]")).toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
