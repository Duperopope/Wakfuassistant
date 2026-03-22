/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public class cjD
extends nv_0 {
    private final fm_1 lWK;
    private final Set<Integer> lWL;

    public cjD(fm_1 fm_12, Set<Integer> set) {
        this.lWL = set;
        this.lWK = fm_12;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.lWK.getNumber());
        azg_12.vC(this.lWL.size());
        for (int n : this.lWL) {
            azg_12.vC(n);
        }
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13745;
    }
}

