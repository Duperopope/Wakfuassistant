/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ckf
 */
public class ckf_0
extends nv_0 {
    private final long lXK;
    private final List<Long> lXL = new ArrayList<Long>();

    public ckf_0(long l) {
        this.lXK = l;
    }

    public void nc(long l) {
        this.lXL.add(l);
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lXK);
        azg_12.vC(this.lXL.size());
        for (Long l : this.lXL) {
            azg_12.gK(l);
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12780;
    }
}

