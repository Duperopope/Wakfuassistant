/*
 * Decompiled with CFR 0.152.
 */
public class aRX
extends aRY {
    private final long eMO;

    public aRX(long l) {
        this.eMO = l;
    }

    public aRX() {
        this.eMO = bbs_2.xl();
    }

    @Override
    public boolean isValid() {
        return this.eMO > 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)423);
        ns_02.cX(this.eMO);
        ayf_22.d(ns_02);
    }
}

