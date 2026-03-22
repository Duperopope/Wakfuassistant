/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clF
 */
public class clf_0
extends nv_0 {
    private final String lZW;

    public clf_0(String string) {
        this.lZW = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        byte[] byArray = BH.aP(this.lZW);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12946;
    }
}

