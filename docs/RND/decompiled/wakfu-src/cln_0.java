/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clN
 */
public class cln_0
extends nv_0 {
    private final int mah;
    private final int mai;
    private final long maj;
    private long lZT = -1L;
    private short lZm = (short)-1;

    public cln_0(int n, int n2, long l) {
        this.mah = n;
        this.mai = n2;
        this.maj = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.mah);
        azg_12.vC(this.mai);
        azg_12.gK(this.maj);
        if (this.lZT != -1L) {
            azg_12.gK(this.lZT);
            azg_12.aG(this.lZm);
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13338;
    }

    public void nr(long l) {
        this.lZT = l;
    }

    public void setDestinationPosition(short s) {
        this.lZm = s;
    }
}

