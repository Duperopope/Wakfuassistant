/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;

/*
 * Renamed from fpF
 */
public final class fpf_0
extends Enum<fpf_0>
implements aoq_1 {
    public static final /* enum */ fpf_0 sQm = new fpf_0(1, 369, (ImmutableList<Integer>)ImmutableList.of((Object)1161), 120);
    public static final /* enum */ fpf_0 sQn = new fpf_0(2, 370, (ImmutableList<Integer>)ImmutableList.of((Object)1203), 120);
    public static final /* enum */ fpf_0 sQo = new fpf_0(3, 369, (ImmutableList<Integer>)ImmutableList.of((Object)1217), 120);
    public static final /* enum */ fpf_0 sQp = new fpf_0(4, 370, (ImmutableList<Integer>)ImmutableList.of((Object)1218), 120);
    public static final /* enum */ fpf_0 sQq = new fpf_0(5, 371, (ImmutableList<Integer>)ImmutableList.of((Object)1219), 120);
    private final int sQr;
    private final int sQs;
    private final ImmutableList<Integer> sQt;
    private final int sQu;
    private static final /* synthetic */ fpf_0[] sQv;

    public static fpf_0[] values() {
        return (fpf_0[])sQv.clone();
    }

    public static fpf_0 valueOf(String string) {
        return Enum.valueOf(fpf_0.class, string);
    }

    private fpf_0(int n2, int n3, ImmutableList<Integer> immutableList, int n4) {
        this.sQr = n2;
        this.sQs = n3;
        this.sQt = immutableList;
        this.sQu = n4;
    }

    public static fpf_0 YC(int n) {
        fpf_0[] fpf_0Array;
        for (fpf_0 fpf_02 : fpf_0Array = fpf_0.values()) {
            if (fpf_02.sQr != n) continue;
            return fpf_02;
        }
        return null;
    }

    public int d() {
        return this.sQr;
    }

    public int ghb() {
        return this.sQs;
    }

    public int ghc() {
        return this.sQu;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sQr);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fpf_0[] ghd() {
        return new fpf_0[]{sQm, sQn, sQo, sQp, sQq};
    }

    static {
        sQv = fpf_0.ghd();
    }
}

