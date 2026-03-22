/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from clq
 */
public class clq_0
extends nv_0 {
    private final long lZn;
    private final List<Long> lZo = new ArrayList<Long>();
    private final boolean lZp;

    public clq_0(long l, boolean bl) {
        this.lZn = l;
        this.lZp = bl;
    }

    public void no(long l) {
        this.lZo.add(l);
    }

    public void at(List<Long> list) {
        this.lZo.addAll(list);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(this.evz());
        azg_12.gK(this.lZn);
        azg_12.aG((short)this.lZo.size());
        this.lZo.forEach(azg_12::gK);
        azg_12.dz(this.lZp);
        return this.a((byte)3, azg_12.bTe());
    }

    private int evz() {
        return 10 + 8 * this.lZo.size() + 1;
    }

    @Override
    public int d() {
        return 12557;
    }
}

