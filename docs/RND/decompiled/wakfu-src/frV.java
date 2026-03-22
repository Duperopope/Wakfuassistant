/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import org.apache.log4j.Logger;

public final class frV
extends Enum<frV> {
    public static final /* enum */ frV tas;
    public static final /* enum */ frV tat;
    public static final /* enum */ frV tau;
    public static final /* enum */ frV tav;
    public static final /* enum */ frV taw;
    protected static Logger oO;
    private static final TByteObjectHashMap<frV> tax;
    private byte tay;
    private long taz;
    private static final /* synthetic */ frV[] taA;

    public static frV[] values() {
        return (frV[])taA.clone();
    }

    public static frV valueOf(String string) {
        return Enum.valueOf(frV.class, string);
    }

    private frV(byte by, long l) {
        this.tay = by;
        this.taz = l;
    }

    public byte gkA() {
        return this.tay;
    }

    public static frV a(int n, int n2, int n3, float f2) {
        if ((float)(n = Math.min(n, n3)) >= (float)n2 - (float)n2 * f2 && (float)n <= (float)n2 + (float)n2 * f2) {
            return tau;
        }
        if (n < n2) {
            if (1.0f - ((float)n2 - (float)n) / (float)n2 <= 0.5f) {
                return tas;
            }
            return tat;
        }
        if ((float)(n - n2) / (float)(n3 - n2) <= 0.5f) {
            return tav;
        }
        return taw;
    }

    public long gkB() {
        return this.taz;
    }

    public static frV hF(byte by) {
        return (frV)((Object)tax.get(by));
    }

    private static /* synthetic */ frV[] gkC() {
        return new frV[]{tas, tat, tau, tav, taw};
    }

    static {
        frV[] frVArray;
        tas = new frV(1, -2L);
        tat = new frV(2, -1L);
        tau = new frV(3, 0L);
        tav = new frV(4, 1L);
        taw = new frV(5, 2L);
        taA = frV.gkC();
        oO = Logger.getLogger(frV.class);
        tax = new TByteObjectHashMap();
        for (frV frV2 : frVArray = frV.values()) {
            tax.put(frV2.gkA(), (Object)frV2);
        }
    }
}

