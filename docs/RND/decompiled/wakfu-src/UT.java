/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.helpers.AbsoluteTimeDateFormat
 *  org.jetbrains.annotations.Nullable
 */
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.helpers.AbsoluteTimeDateFormat;
import org.jetbrains.annotations.Nullable;

public class UT
extends AbsoluteTimeDateFormat {
    public UT() {
    }

    public UT(TimeZone timeZone) {
        super(timeZone);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        long l = date.getTime();
        int n = (int)(l % 1000L);
        this.calendar.setTime(date);
        int n2 = stringBuffer.length();
        int n3 = this.calendar.get(1);
        stringBuffer.append(n3);
        stringBuffer.append(switch (this.calendar.get(2)) {
            case 0 -> "-01-";
            case 1 -> "-02-";
            case 2 -> "-03-";
            case 3 -> "-04-";
            case 4 -> "-05-";
            case 5 -> "-06-";
            case 6 -> "-07-";
            case 7 -> "-08-";
            case 8 -> "-09-";
            case 9 -> "-10-";
            case 10 -> "-11-";
            case 11 -> "-12-";
            default -> "-NA-";
        });
        int n4 = this.calendar.get(5);
        if (n4 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n4);
        stringBuffer.append(' ');
        int n5 = this.calendar.get(11);
        if (n5 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n5);
        stringBuffer.append(':');
        int n6 = this.calendar.get(12);
        if (n6 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n6);
        stringBuffer.append(':');
        int n7 = this.calendar.get(13);
        if (n7 < 10) {
            stringBuffer.append('0');
        }
        stringBuffer.append(n7);
        return stringBuffer;
    }

    @Nullable
    public Date parse(String string, ParsePosition parsePosition) {
        return null;
    }
}

