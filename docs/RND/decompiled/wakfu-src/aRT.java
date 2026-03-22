/*
 * Decompiled with CFR 0.152.
 */
public class aRT
extends aRY {
    private final short eMp;

    public aRT(short s) {
        this.eMp = s;
    }

    @Override
    public boolean isValid() {
        return this.eMp > 0;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.R(this.eMp);
        ns_02.Q((short)280);
        ayf_22.d(ns_02);
    }
}

