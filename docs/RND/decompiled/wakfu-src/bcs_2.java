/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

/*
 * Renamed from bcs
 */
public final class bcs_2
extends Enum<bcs_2> {
    public static final /* enum */ bcs_2 hEp = new bcs_2(new bcn_2());
    public static final /* enum */ bcs_2 hEq = new bcs_2(new bco_2());
    public static final /* enum */ bcs_2 hEr = new bcs_2(new bcp_2());
    private final Predicate<Integer> hEs;
    private static final /* synthetic */ bcs_2[] hEt;

    public static bcs_2[] values() {
        return (bcs_2[])hEt.clone();
    }

    public static bcs_2 valueOf(String string) {
        return Enum.valueOf(bcs_2.class, string);
    }

    private bcs_2(Predicate<Integer> predicate) {
        this.hEs = predicate;
    }

    public boolean Bj(int n) {
        return this.hEs.apply((Object)n);
    }

    private static /* synthetic */ bcs_2[] dbf() {
        return new bcs_2[]{hEp, hEq, hEr};
    }

    static {
        hEt = bcs_2.dbf();
    }
}

