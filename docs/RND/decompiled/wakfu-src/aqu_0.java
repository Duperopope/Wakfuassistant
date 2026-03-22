/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQu
 */
public class aqu_0
extends aRY {
    private final int eCK;
    private final long eCL;

    public aqu_0(int n, long l) {
        this.eCK = n;
        this.eCL = l;
    }

    @Override
    public boolean isValid() {
        return this.eCL > 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)495);
        ns_02.nX(this.eCK);
        ns_02.cX(this.eCL);
        ayf_22.d(ns_02);
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), aue_0.cVJ().cVK().bxk());
    }
}

