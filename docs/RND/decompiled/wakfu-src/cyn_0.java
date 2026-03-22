/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from cyN
 */
public class cyn_0
extends nv_0 {
    private List<Long> mmL;

    public cyn_0(List<Long> list) {
        this.mmL = list;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(4 + this.mmL.size() * 8);
        azg_12.vC(this.mmL.size());
        this.mmL.forEach(azg_12::gK);
        return this.a((byte)2, azg_12.bTe());
    }

    @Override
    public int d() {
        return 23269;
    }
}

