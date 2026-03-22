/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cjr
extends nv_0 {
    private final long lWo;
    private final List<eJL> lWp;

    public cjr(long l, List<eJL> list) {
        this.lWo = l;
        this.lWp = list;
    }

    @Override
    public byte[] aVX() {
        int n = this.lWp.stream().mapToInt(eJL::bVY).sum();
        azg_1 azg_12 = new azg_1(10 + n);
        azg_12.gK(this.lWo);
        azg_12.aG((short)this.lWp.size());
        this.lWp.forEach(eJL2 -> eJL2.d(azg_12));
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13898;
    }
}

