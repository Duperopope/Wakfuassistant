/*
 * Decompiled with CFR 0.152.
 */
public class ckG
extends nv_0 {
    private long bhR;
    private int bap;
    private int baq;
    private short ban;
    private boolean htg = false;
    private int lYp = 2;
    private boolean lYq = true;
    private byte lYr = 1;
    private acd_1 lYs = null;
    private int[] lYt = null;
    private acd_1 lYu;
    private acd_1 lYv;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.bhR);
        azg_12.vC(this.bap);
        azg_12.vC(this.baq);
        azg_12.aG(this.ban);
        azg_12.aF(this.htg ? (byte)1 : 0);
        azg_12.vC(this.lYp);
        azg_12.aF(this.lYq ? (byte)1 : 0);
        azg_12.aF(this.lYr);
        if (this.lYs == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)1);
            azg_12.vC(this.lYs.getX());
            azg_12.vC(this.lYs.getY());
            azg_12.aG(this.lYs.bdi());
        }
        if (this.lYt == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)this.lYt.length);
            for (int n = 0; n < this.lYt.length; n = (int)((byte)(n + 1))) {
                azg_12.vC(this.lYt[n]);
            }
        }
        if (this.lYu == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)1);
            azg_12.vC(this.lYu.getX());
            azg_12.vC(this.lYu.getY());
            azg_12.aG(this.lYu.bdi());
        }
        if (this.lYv == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)1);
            azg_12.vC(this.lYv.getX());
            azg_12.vC(this.lYv.getY());
            azg_12.aG(this.lYv.bdi());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13673;
    }

    public void fg(long l) {
        this.bhR = l;
    }

    public void Y(int n, int n2, short s) {
        this.bap = n;
        this.baq = n2;
        this.ban = s;
    }

    public void aa(acd_1 acd_12) {
        this.lYs = acd_12;
    }

    public void dn(byte by) {
        this.lYr = by;
    }

    public void F(int[] nArray) {
        this.lYt = nArray;
    }

    public void KW(int n) {
        this.lYp = n;
    }

    public void fa(boolean bl) {
        this.htg = bl;
    }

    public void jn(boolean bl) {
        this.lYq = bl;
    }

    public acd_1 evw() {
        return this.lYu;
    }

    public void ab(acd_1 acd_12) {
        this.lYu = acd_12;
    }

    public acd_1 evx() {
        return this.lYv;
    }

    public void ac(acd_1 acd_12) {
        this.lYv = acd_12;
    }
}

