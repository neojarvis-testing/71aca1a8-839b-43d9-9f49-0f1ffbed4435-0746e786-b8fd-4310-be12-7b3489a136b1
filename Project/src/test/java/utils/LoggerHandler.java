package utils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.FileAppender;
 
 
public class LoggerHandler {
 
    private static final Logger log = LoggerFactory.getLogger(LoggerHandler.class);
   
    static {
        File logDir = new File(System.getProperty("user.dir") + "/logs/");
        if (!logDir.exists()) {
            logDir.mkdirs();
        }
        try {
            LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
 
            FileAppender fileAppender = new FileAppender();
            fileAppender.setContext(context);
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String fileLocation = System.getProperty("user.dir") + "/logs/application"+ timestamp +"_.log";
            fileAppender.setFile(fileLocation);
            fileAppender.setAppend(true);
            PatternLayout layout = new PatternLayout();
            layout.setContext(context);
            layout.setPattern("%d{ISO8601} %-5p - %m%n");
            layout.start();
            fileAppender.setLayout(layout);
            fileAppender.start();
            ch.qos.logback.classic.Logger rootLogger = context.getLogger(Logger.ROOT_LOGGER_NAME);
            rootLogger.addAppender(fileAppender);
        } catch (Exception e) {
            log.error("Failed to configure logging system programmatically", e);
        }
    }
 
    public static void debug(String message) {
        log.debug(message);
    }
 
    public static void info(String message) {
        log.info(message);
    }
 
    public static void warn(String message) {
        log.warn(message);
    }
 
    public static void error(String message) {
        log.error(message);
    }
 
    public static void fatal(String message) {
        log.error(message); // SLF4J does not have a fatal level, so using error instead
    }
 
    public static void trace(String message) {
        log.trace(message);
    }
 
    public static void log(String message) {
        log.info(message); // Default to info level for generic logging
    }
 
}
 
 
