/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public final class fjc
extends Enum<fjc> {
    public static final /* enum */ fjc swt = new fjc(0);
    public static final /* enum */ fjc swu = new fjc(9);
    public static final /* enum */ fjc swv = new fjc(5);
    public static final /* enum */ fjc sww = new fjc(9);
    public static final /* enum */ fjc swx = new fjc(5);
    private static final fjc[] swy;
    private final int swz;
    private static final /* synthetic */ fjc[] swA;

    public static fjc[] values() {
        return (fjc[])swA.clone();
    }

    public static fjc valueOf(String string) {
        return Enum.valueOf(fjc.class, string);
    }

    public static fjc Wt(int n) {
        return swy[n];
    }

    @Generated
    public int dDc() {
        return this.swz;
    }

    @Generated
    private fjc(int n2) {
        this.swz = n2;
    }

    private static /* synthetic */ fjc[] gaG() {
        return new fjc[]{swt, swu, swv, sww, swx};
    }

    static {
        swA = fjc.gaG();
        swy = fjc.values();
    }
}

