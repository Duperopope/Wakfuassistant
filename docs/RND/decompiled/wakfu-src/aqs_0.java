/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQs
 */
public final class aqs_0
extends aRY {
    private final long eCI;

    public aqs_0(long l) {
        this.eCI = l;
    }

    @Override
    public boolean isValid() {
        return this.eCI > 0L;
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
        ns_02.Q((short)222);
        ns_02.cX(this.eCI);
        ayf_22.d(ns_02);
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), aue_0.cVJ().cVK().bxk());
    }
}

