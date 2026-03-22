/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnT
 */
public final class bnt_0
extends Enum<bnt_0> {
    public static final /* enum */ bnt_0 iKs = new bnt_0(0);
    public static final /* enum */ bnt_0 iKt = new bnt_0(1);
    private final byte iKu;
    private static final /* synthetic */ bnt_0[] iKv;

    public static bnt_0[] values() {
        return (bnt_0[])iKv.clone();
    }

    public static bnt_0 valueOf(String string) {
        return Enum.valueOf(bnt_0.class, string);
    }

    private bnt_0(byte by) {
        this.iKu = by;
    }

    public byte aJr() {
        return this.iKu;
    }

    public String getName() {
        return aum_0.cWf().c("dungeon.filter." + this.iKu, new Object[0]);
    }

    public boolean a(bny_0 bny_02) {
        switch (this.ordinal()) {
            case 1: {
                return bny_02.dAm() && !bny_02.bfb();
            }
        }
        return true;
    }

    private static /* synthetic */ bnt_0[] dzE() {
        return new bnt_0[]{iKs, iKt};
    }

    static {
        iKv = bnt_0.dzE();
    }
}

