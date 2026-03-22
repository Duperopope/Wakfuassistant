/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class eHy {
    private static final Calendar qsh = new GregorianCalendar(uw_0.bvG);

    private eHy() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static short n(Date date) {
        Calendar calendar = qsh;
        synchronized (calendar) {
            qsh.setTime(date);
            byte by = (byte)qsh.get(5);
            byte by2 = (byte)qsh.get(2);
            return GC.d(by, by2);
        }
    }

    public static short M(ux_0 ux_02) {
        byte by = (byte)ux_02.bjD();
        byte by2 = (byte)(ux_02.bjG() - 1);
        return GC.d(by, by2);
    }
}

