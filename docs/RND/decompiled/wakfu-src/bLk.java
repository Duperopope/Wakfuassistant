/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class bLk
extends Enum<bLk> {
    public static final /* enum */ bLk ksj = new bLk();
    public static final /* enum */ bLk ksk = new bLk();
    public static final /* enum */ bLk ksl = new bLk();
    public static final /* enum */ bLk ksm = new bLk();
    public static final /* enum */ bLk ksn = new bLk();
    private static final /* synthetic */ bLk[] kso;

    public static bLk[] values() {
        return (bLk[])kso.clone();
    }

    public static bLk valueOf(String string) {
        return Enum.valueOf(bLk.class, string);
    }

    @NotNull
    public static bLk a(float f2, int n, int n2, int n3, int n4) {
        if (f2 < (float)n) {
            return ksj;
        }
        if (f2 < (float)n2) {
            return ksk;
        }
        if (f2 < (float)n3) {
            return ksl;
        }
        if (f2 < (float)n4) {
            return ksm;
        }
        return ksn;
    }

    private static /* synthetic */ bLk[] ecz() {
        return new bLk[]{ksj, ksk, ksl, ksm, ksn};
    }

    static {
        kso = bLk.ecz();
    }
}

