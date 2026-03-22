/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCz
 */
public final class bcz_0
extends Enum<bcz_0>
implements nh_1 {
    public static final /* enum */ bcz_0 jJc = new bcz_0(0, new bCu());
    public static final /* enum */ bcz_0 jJd = new bcz_0(1, null);
    public static final /* enum */ bcz_0 jJe = new bcz_0(2, new bzk());
    public static final /* enum */ bcz_0 jJf = new bcz_0(3, new bya_0());
    public static final /* enum */ bcz_0 jJg = new bcz_0(4, new bbj_1());
    private final short jJh;
    private final ayw_2<ng_1> jJi;
    private static final /* synthetic */ bcz_0[] jJj;

    public static bcz_0[] values() {
        return (bcz_0[])jJj.clone();
    }

    public static bcz_0 valueOf(String string) {
        return Enum.valueOf(bcz_0.class, string);
    }

    private bcz_0(short s, ayw_2<ng_1> ayw_22) {
        this.jJh = s;
        this.jJi = ayw_22;
    }

    @Override
    public short aVE() {
        return this.jJh;
    }

    @Override
    public ayw_2<ng_1> aVF() {
        return this.jJi;
    }

    @Override
    public String aXA() {
        return Short.toString(this.jJh);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bcz_0[] dQq() {
        return new bcz_0[]{jJc, jJd, jJe, jJf, jJg};
    }

    static {
        jJj = bcz_0.dQq();
    }
}

