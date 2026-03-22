/*
 * Decompiled with CFR 0.152.
 */
public class aSR
extends aRY {
    private final byte ePM;

    public aSR(byte by) {
        this.ePM = by;
    }

    @Override
    public boolean isValid() {
        return this.ePM == 0 || this.ePM == 1 || this.ePM == 2 || this.ePM == 3;
    }

    @Override
    public void bGy() {
        if (this.ePM == 3) {
            this.cBS();
            return;
        }
        this.aU((byte)1);
        this.aU((byte)2);
    }

    private void cBS() {
        aSR.jF("Syntax: serverlock <command>");
        aSR.jF("(h) : show help");
        aSR.jF("(on|off) : enable or disable admin-only restriction");
        aSR.jF("() : retrieve lock status");
    }

    private void aU(byte by) {
        ns_0 ns_02 = new ns_0();
        ns_02.C(by);
        ns_02.Q((short)129);
        ns_02.D(this.ePM);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

