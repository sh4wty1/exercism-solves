public class LogLevels {
    
    public static String message(String logLine) {
        String msg = logLine.split(": ")[1].trim();
        return msg;
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(": ")[0];
        return level.replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return "%s (%s)".formatted(message(logLine), logLevel(logLine));
    }
}
