/*
 * Decompiled with CFR 0.152.
 */
public class clI
extends nv_0 {
    private final String mab;
    private final long mac;
    private final long mad;

    public clI(String string, long l, long l2) {
        this.mab = string;
        this.mac = l;
        this.mad = l2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.mab);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        azg_12.gK(this.mac);
        azg_12.gK(this.mad);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12541;
    }
}

