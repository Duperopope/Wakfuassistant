/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cyJ
 */
public class cyj_0
extends nv_0 {
    private long aDh;
    private String aFD;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.aDh);
        byte[] byArray = BH.aP(this.aFD);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 22282;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dm(String string) {
        this.aFD = string;
    }
}

