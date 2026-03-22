/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.AppenderSkeleton
 *  org.apache.log4j.Level
 *  org.apache.log4j.spi.LoggingEvent
 */
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aDX
 */
public class adx_1
extends AppenderSkeleton {
    private String bxo;
    private boolean dEq;

    protected void append(LoggingEvent loggingEvent) {
        String string;
        if (this.dEq) {
            return;
        }
        if (loggingEvent.getLevel() != Level.ERROR && loggingEvent.getLevel() != Level.FATAL) {
            return;
        }
        if (this.bxo != null && !loggingEvent.getLoggerName().matches(this.bxo)) {
            return;
        }
        String string2 = loggingEvent.getMessage().toString() + "\r\n\r\nAfficher les erreurs suivantes ?";
        if (JOptionPane.showConfirmDialog(null, string2, string = loggingEvent.getLocationInformation().getFileName() + ":" + loggingEvent.getLocationInformation().getLineNumber(), 0, 0) != 0) {
            this.dEq = true;
        }
    }

    public void hk(String string) {
        this.bxo = null;
        try {
            Pattern.compile(string);
            this.bxo = string;
        }
        catch (Exception exception) {
            System.out.println("Invalid Pattern : " + string);
        }
    }

    public boolean requiresLayout() {
        return false;
    }

    public void close() {
    }
}

