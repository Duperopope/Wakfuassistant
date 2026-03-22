/*
 * Decompiled with CFR 0.152.
 */
public class cxL
extends nr_0 {
    private eTu mmf;
    private byte[] mmg;

    @Override
    public boolean dn(byte[] byArray) {
        this.mmg = byArray;
        return true;
    }

    public eTu eFe() {
        if (this.mmf == null) {
            eTL eTL2 = new eTL(new bse());
            eTL2.as(this.mmg);
            this.mmf = eTL2.fJr();
        }
        return this.mmf;
    }

    @Override
    public int d() {
        return 1066;
    }
}

