/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class csu
extends nv_0 {
    private final long mhi;
    private final List<Long> mhj;

    public csu(long l, long l2) {
        this.mhi = l;
        this.mhj = List.of(Long.valueOf(l2));
    }

    public csu(long l, List<ffV> list) {
        this.mhi = l;
        this.mhj = list.stream().map(ffV::LV).toList();
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(10 + 8 * this.mhj.size());
        azg_12.gK(this.mhi);
        azg_12.aG((short)this.mhj.size());
        this.mhj.forEach(azg_12::gK);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13973;
    }
}

