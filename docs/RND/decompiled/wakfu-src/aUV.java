/*
 * Decompiled with CFR 0.152.
 */
public abstract class aUV
extends agb_1 {
    protected static final bsT hsg = new bsT();
    private bsS efA;
    private final int hsh;

    public aUV(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.hsh = n4;
    }

    private void cWr() {
        if (this.efA == null) {
            this.efA = bsU.dHk().Ft(this.hsh);
        }
    }

    public bsS cja() {
        this.cWr();
        return this.efA;
    }

    protected int bha() {
        return this.hsh;
    }

    public boolean cWs() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        this.cWr();
        if (bgt_02.dmV() == null || this.efA == null) {
            return false;
        }
        return bgt_02.dmV() == this.efA;
    }

    public bgy iD(long l) {
        this.cWr();
        if (this.efA != null) {
            return this.efA.kq(l);
        }
        return null;
    }

    public QR bai() {
        this.cWr();
        if (this.efA == null) {
            dJP.error((Object)("combat non trouv\u00e9 : " + this.hsh));
            return null;
        }
        return this.efA.bai();
    }

    public qm_0 cWu() {
        this.cWr();
        if (this.efA != null) {
            return this.efA.bbh();
        }
        return bas_2.cZC();
    }

    @Override
    protected void caV() {
        bgy bgy2 = this.iD(this.caQ());
        bgy bgy3 = this.iD(this.Qy());
        aWq.b(bgy2, bgy3);
    }
}

