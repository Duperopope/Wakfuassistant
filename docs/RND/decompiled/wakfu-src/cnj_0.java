/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnJ
 */
public class cnj_0
extends nv_0 {
    private final fpu_0 mbV;

    public cnj_0(fpu_0 fpu_02) {
        this.mbV = fpu_02;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.mbV.aJr());
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12794;
    }
}

