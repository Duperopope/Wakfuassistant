/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from cjf
 */
public class cjf_0
extends nv_0 {
    private final Set<Integer> lVQ = new HashSet<Integer>();
    private boolean lVR = true;

    public void KS(int n) {
        this.lVQ.add(n);
    }

    public void B(Collection<Integer> collection) {
        this.lVQ.addAll(collection);
    }

    public void ji(boolean bl) {
        this.lVR = bl;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(5 + this.lVQ.size() * 4);
        azg_12.dz(this.lVR);
        azg_12.vC(this.lVQ.size());
        this.lVQ.forEach(azg_12::vC);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13307;
    }
}

