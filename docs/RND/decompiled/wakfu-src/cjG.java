/*
 * Decompiled with CFR 0.152.
 */
public class cjG
extends nv_0 {
    private final String lWS;

    public cjG(String string) {
        this.lWS = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(this.lWS.getBytes().length + 1);
        azg_12.gW(this.lWS);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12416;
    }
}

