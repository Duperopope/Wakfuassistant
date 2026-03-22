/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.EnumSet;

/*
 * Renamed from fqa
 */
public final class fqa_0
extends Enum<fqa_0>
implements aoq_1 {
    public static final /* enum */ fqa_0 sRE = new fqa_0(0, "No ideal rain", new wg_0[0]);
    public static final /* enum */ fqa_0 sRF = new fqa_0(1, "No rain", wg_0.bMG);
    public static final /* enum */ fqa_0 sRG = new fqa_0(2, "Light rain", wg_0.bMH);
    public static final /* enum */ fqa_0 sRH = new fqa_0(3, "Heavy rain or storm", wg_0.bMI, wg_0.bMJ);
    private final int sRI;
    private final String sRJ;
    private final EnumSet<wg_0> sRK = EnumSet.noneOf(wg_0.class);
    private static final /* synthetic */ fqa_0[] sRL;

    public static fqa_0[] values() {
        return (fqa_0[])sRL.clone();
    }

    public static fqa_0 valueOf(String string) {
        return Enum.valueOf(fqa_0.class, string);
    }

    private fqa_0(int n2, String string2, wg_0 ... wg_0Array) {
        this.sRI = n2;
        this.sRJ = string2;
        if (wg_0Array.length > 0) {
            this.sRK.addAll(Lists.newArrayList((Object[])wg_0Array));
        }
    }

    public static fqa_0 YR(int n) {
        fqa_0[] fqa_0Array;
        for (fqa_0 fqa_02 : fqa_0Array = fqa_0.values()) {
            if (fqa_02.sRI != n) continue;
            return fqa_02;
        }
        throw new IllegalArgumentException("Not found " + n);
    }

    public EnumSet<wg_0> ghI() {
        return this.sRK;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sRI);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.sRJ;
    }

    private static /* synthetic */ fqa_0[] ghJ() {
        return new fqa_0[]{sRE, sRF, sRG, sRH};
    }

    static {
        sRL = fqa_0.ghJ();
    }
}

