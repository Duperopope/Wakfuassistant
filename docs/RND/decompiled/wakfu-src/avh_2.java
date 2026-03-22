/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from avh
 */
public class avh_2
implements aeh_2 {
    protected static final Logger dhE = Logger.getLogger(avh_2.class);
    public static final avh_2 dhF = new avh_2();
    private final EnumMap<avg_2, Boolean> dhG = new EnumMap(avg_2.class);
    private static final String[] dhH;

    private avh_2() {
    }

    public void a(avg_2 avg_22, boolean bl) {
        this.dhG.put(avg_22, bl);
    }

    public boolean a(avg_2 ... avg_2Array) {
        for (avg_2 avg_22 : avg_2Array) {
            Boolean bl = this.dhG.get((Object)avg_22);
            if (bl != null && bl.booleanValue()) continue;
            return false;
        }
        return true;
    }

    @Override
    public String[] bxk() {
        return dhH;
    }

    @Override
    public Object eu(String string) {
        return this.a(avg_2.go(string));
    }

    public boolean bMS() {
        return this.a(avg_2.dhk, avg_2.dhl);
    }

    public boolean bMT() {
        return this.a(avg_2.dhm, avg_2.dhn);
    }

    public boolean bMU() {
        return this.bMS() && this.bMT();
    }

    static {
        avg_2[] avg_2Array = avg_2.values();
        dhH = new String[avg_2Array.length];
        for (int i = 0; i < avg_2Array.length; ++i) {
            avh_2.dhH[i] = avg_2Array[i].aYh();
        }
    }
}

