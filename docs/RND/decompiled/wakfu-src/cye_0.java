/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyE
 */
public class cye_0
extends nv_0 {
    private long aDh;
    private short mmD;
    private String p;
    private dR mmE;
    private boolean mmF;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        azg_12.aG(this.mmD);
        byte[] byArray = BH.aP(this.p);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        azg_12.aF(this.mmF ? (byte)1 : 0);
        byte[] byArray2 = this.mmE.toByteArray();
        azg_12.aG((short)byArray2.length);
        azg_12.dH(byArray2);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 23978;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void d(dR dR2) {
        this.mmE = dR2;
    }

    public void cG(short s) {
        this.mmD = s;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void jv(boolean bl) {
        this.mmF = bl;
    }
}

