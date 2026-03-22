/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRr
 */
public class arr_0
extends aRY {
    private final long eJP;
    private final boolean eJQ;

    public arr_0(boolean bl) {
        this(bbs_2.xl(), bl);
    }

    public arr_0(long l, boolean bl) {
        this.eJP = l;
        this.eJQ = bl;
    }

    @Override
    public boolean isValid() {
        return this.eJP > 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You must be connected to use this command");
            return;
        }
        arr_0.jF("\n===== Game Account Data for account " + this.eJP + " =====");
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)487);
        ns_02.cX(this.eJP);
        ns_02.aN(this.eJQ);
        ayf_22.d(ns_02);
    }
}

