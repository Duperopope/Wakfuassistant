/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Oo
 */
public class oo_1
extends nv_0 {
    public static final byte aZw = 0;
    public static final byte aZx = 1;
    public boolean aZy = true;
    private byte aZz;
    private long aZA;
    private String aZB;
    private long aZC;
    private long aZD;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.aZz);
        azg_12.gK(this.aZA);
        azg_12.gK(this.aZD);
        if (this.aZB != null) {
            byte[] byArray = BH.aP(this.aZB);
            azg_12.aF((byte)0);
            azg_12.aF((byte)byArray.length);
            azg_12.dH(byArray);
        } else {
            azg_12.aF((byte)1);
            azg_12.gK(this.aZC);
        }
        if (this.aZy) {
            return this.a((byte)6, azg_12.bTe());
        }
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 1105;
    }

    public void F(byte by) {
        this.aZz = by;
    }

    public void cX(String string) {
        this.aZB = string;
        this.aZC = -1L;
    }

    public void cY(long l) {
        this.aZC = l;
        this.aZB = null;
    }

    public void cZ(long l) {
        this.aZD = l;
    }

    public void aO(boolean bl) {
        this.aZy = bl;
    }

    public void da(long l) {
        this.aZA = l;
    }
}

