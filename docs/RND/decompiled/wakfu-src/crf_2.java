/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cRF
 */
public final class crf_2
extends Enum<crf_2>
implements aeh_2 {
    public static final /* enum */ crf_2 noi = new crf_2(0, "small");
    public static final /* enum */ crf_2 noj = new crf_2(1, "big");
    public static final /* enum */ crf_2 nok = new crf_2(2, "small");
    public static final crf_2[] nol;
    private static final double nom = 1080.0;
    public static final String non = "name";
    private final int noo;
    @NotNull
    private final String nop;
    private static final /* synthetic */ crf_2[] noq;

    public static crf_2[] values() {
        return (crf_2[])noq.clone();
    }

    public static crf_2 valueOf(String string) {
        return Enum.valueOf(crf_2.class, string);
    }

    private crf_2(int n2, String string2) {
        this.noo = n2;
        this.nop = string2;
    }

    public int d() {
        return this.noo;
    }

    @NotNull
    public String ao(@NotNull String string, @NotNull String string2) {
        return String.format(string, this.nop, string2);
    }

    public String qf(@NotNull String string) {
        return String.format(string, this.nop);
    }

    @NotNull
    public static crf_2 Z(double d2) {
        return d2 <= 1080.0 ? nok : noj;
    }

    @NotNull
    public static crf_2 Mk(int n) {
        for (crf_2 crf_22 : nol) {
            if (crf_22.noo != n) continue;
            return crf_22;
        }
        return noi;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (non.equals(string)) {
            return aum_0.cWf().c("outgame.background.style.label." + this.noo, new Object[0]);
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{non};
    }

    private static /* synthetic */ crf_2[] eMK() {
        return new crf_2[]{noi, noj, nok};
    }

    static {
        noq = crf_2.eMK();
        nol = crf_2.values();
    }
}

