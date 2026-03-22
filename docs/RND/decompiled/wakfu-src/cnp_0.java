/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from cnP
 */
public final class cnp_0
extends nv_0 {
    private final long mcg;
    private final ArrayList<ax_0> mch = new ArrayList(5);
    private final ArrayList<aq_0> mci = new ArrayList(5);

    public cnp_0(long l) {
        this.mcg = l;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.mcg);
        azg_12.vC(this.mch.size());
        for (ax_0 enum_ : this.mch) {
            azg_12.vC(enum_.getNumber());
        }
        azg_12.vC(this.mci.size());
        for (aq_0 aq_02 : this.mci) {
            azg_12.vC(aq_02.getNumber());
        }
        return this.a((byte)3, azg_12.bTe());
    }

    public void c(ax_0 ax_02) {
        this.mch.add(ax_02);
    }

    public void C(Collection<ax_0> collection) {
        this.mch.addAll(collection);
    }

    public void c(aq_0 aq_02) {
        this.mci.add(aq_02);
    }

    public void D(Collection<aq_0> collection) {
        this.mci.addAll(collection);
    }

    @Override
    public int d() {
        return 13618;
    }
}

