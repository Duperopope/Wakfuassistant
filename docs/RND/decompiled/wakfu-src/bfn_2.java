/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.Optional;
import lombok.Generated;

/*
 * Renamed from bfn
 */
final class bfn_2
extends Enum<bfn_2> {
    public static final /* enum */ bfn_2 hSb = new bfn_2(1, 2, 7081, 6611, "Psychopath");
    public static final /* enum */ bfn_2 hSc = new bfn_2(2, 1, 7081, 6611, "Psychopath");
    public static final /* enum */ bfn_2 hSd = new bfn_2(3, 2, 7082, 6612, "Coward");
    public static final /* enum */ bfn_2 hSe = new bfn_2(4, 1, 7082, 6612, "Coward");
    public static final /* enum */ bfn_2 hSf = new bfn_2(5, 2, 7083, 6613, "Classic");
    public static final /* enum */ bfn_2 hSg = new bfn_2(6, 1, 7083, 6613, "Classic");
    private static final bfn_2[] hSh;
    private final int hSi;
    private final int hSj;
    private final int hSk;
    private final int hSl;
    private final String hSm;
    private static final /* synthetic */ bfn_2[] hSn;

    public static bfn_2[] values() {
        return (bfn_2[])hSn.clone();
    }

    public static bfn_2 valueOf(String string) {
        return Enum.valueOf(bfn_2.class, string);
    }

    private static Optional<bfn_2> BL(int n) {
        for (bfn_2 bfn_22 : hSh) {
            if (bfn_22.hSi != n) continue;
            return Optional.of(bfn_22);
        }
        return Optional.empty();
    }

    @Generated
    public int dfP() {
        return this.hSi;
    }

    @Generated
    public int dfT() {
        return this.hSj;
    }

    @Generated
    public int axA() {
        return this.hSk;
    }

    @Generated
    public int LR() {
        return this.hSl;
    }

    @Generated
    public String dfR() {
        return this.hSm;
    }

    @Generated
    private bfn_2(int n2, int n3, int n4, int n5, String string2) {
        this.hSi = n2;
        this.hSj = n3;
        this.hSk = n4;
        this.hSl = n5;
        this.hSm = string2;
    }

    private static /* synthetic */ bfn_2[] dfU() {
        return new bfn_2[]{hSb, hSc, hSd, hSe, hSf, hSg};
    }

    static {
        hSn = bfn_2.dfU();
        hSh = bfn_2.values();
    }
}

