/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmI
 */
public class cmi_0
extends nv_0 {
    private final long maT;

    public cmi_0(long l) {
        this.maT = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.maT);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12195;
    }
}

