/*
 * Decompiled with CFR 0.152.
 */
public final class bfS
extends Enum<bfS>
implements aoq_1 {
    public static final /* enum */ bfS hXb = new bfS(0);
    public static final /* enum */ bfS hXc = new bfS(1);
    public static final /* enum */ bfS hXd = new bfS(2);
    public static final /* enum */ bfS hXe = new bfS(4);
    public static final /* enum */ bfS hXf = new bfS(5);
    public static final /* enum */ bfS hXg = new bfS(6);
    public static final /* enum */ bfS hXh = new bfS(7);
    public static final /* enum */ bfS hXi = new bfS(8);
    private final byte hXj;
    private static final /* synthetic */ bfS[] hXk;

    public static bfS[] values() {
        return (bfS[])hXk.clone();
    }

    public static bfS valueOf(String string) {
        return Enum.valueOf(bfS.class, string);
    }

    public static bfS bh(byte by) {
        for (bfS bfS2 : bfS.values()) {
            if (bfS2.hXj != by) continue;
            return bfS2;
        }
        return null;
    }

    private bfS(byte by) {
        this.hXj = by;
    }

    public byte aJr() {
        return this.hXj;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.hXj);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    public String did() {
        return aum_0.cWf().c("challenge.type." + this.ordinal(), new Object[0]);
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bfS[] die() {
        return new bfS[]{hXb, hXc, hXd, hXe, hXf, hXg, hXh, hXi};
    }

    static {
        hXk = bfS.die();
    }
}

