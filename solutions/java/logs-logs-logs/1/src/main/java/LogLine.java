public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String log = logLine.substring(1,logLine.indexOf("]"));

        switch (log){
            case "INF": return LogLevel.INFO;
            case "DBG": return LogLevel.DEBUG;
            case "TRC": return LogLevel.TRACE;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {

    LogLevel ll = getLogLevel();
    int num = ll.getCode();
    String message = logLine.substring(logLine.indexOf(" ")).trim();
    String res = num + ":"+ message;
    return res;
    }
}
