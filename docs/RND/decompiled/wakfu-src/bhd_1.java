/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bHD
 */
public final class bhd_1
extends Enum<bhd_1> {
    public static final /* enum */ bhd_1 kbY = new bhd_1(0, fja.svm, fja.svn, fja.svp, fja.svo);
    public static final /* enum */ bhd_1 kbZ = new bhd_1(1, fja.svq, fja.svE, fja.svr, fja.svF, fja.svv, fja.svJ, fja.svt, fja.svH, fja.svx, fja.svL);
    public static final /* enum */ bhd_1 kca = new bhd_1(2, fja.svQ, fja.svR, fja.svS, fja.svT, fja.svU, fja.svV, fja.svW);
    public static final /* enum */ bhd_1 kcb = new bhd_1(3, fja.svz, fja.svN, fja.svA, fja.svO, fja.svB, fja.svC, fja.svX, fja.svY, fja.svP, fja.svD);
    private final int kcc;
    private final fja[] kcd;
    private static final /* synthetic */ bhd_1[] kce;

    public static bhd_1[] values() {
        return (bhd_1[])kce.clone();
    }

    public static bhd_1 valueOf(String string) {
        return Enum.valueOf(bhd_1.class, string);
    }

    private bhd_1(int n2, fja ... fjaArray) {
        this.kcc = n2;
        this.kcd = fjaArray;
    }

    @Generated
    public int d() {
        return this.kcc;
    }

    @Generated
    public fja[] dWN() {
        return this.kcd;
    }

    private static /* synthetic */ bhd_1[] dWO() {
        return new bhd_1[]{kbY, kbZ, kca, kcb};
    }

    static {
        kce = bhd_1.dWO();
    }
}

