/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTy
 */
public class aty_0
extends aRY {
    private final long eRY;
    private final String eRZ;
    private final boolean eSa;

    public aty_0(long l, String string) {
        this.eRY = l;
        this.eRZ = string;
        this.eSa = false;
    }

    public aty_0(long l, String string, boolean bl) {
        this.eRY = l;
        this.eRZ = string;
        this.eSa = bl;
    }

    @Override
    public boolean isValid() {
        return this.eRY > 0L && this.eRZ != null;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q((short)482);
        ns_02.cX(this.eRY);
        ns_02.cT(this.eRZ);
        ns_02.aN(this.eSa);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

