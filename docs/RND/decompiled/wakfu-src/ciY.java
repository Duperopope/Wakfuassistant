/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ciY
extends nv_0 {
    private final List<Long> lVG;

    public ciY(long l) {
        this.lVG = List.of(Long.valueOf(l));
    }

    public ciY(List<ffV> list) {
        this.lVG = list.stream().map(ffV::LV).toList();
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(2 + 8 * this.lVG.size());
        azg_12.aG((short)this.lVG.size());
        this.lVG.forEach(azg_12::gK);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12273;
    }
}

