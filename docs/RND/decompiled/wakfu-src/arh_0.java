/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRh
 */
public class arh_0
extends aRY {
    private final int eJe;

    public arh_0(int n) {
        this.eJe = n;
    }

    @Override
    public boolean isValid() {
        return this.eJe == 1 || this.eJe == 0;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.nX(this.eJe);
        ns_02.Q((short)411);
        ayf_22.d(ns_02);
    }
}

