/*
 * Decompiled with CFR 0.152.
 */
public class aRo
extends aRY {
    private static final byte eJD = 0;
    private static final byte eJE = 1;
    private static final byte eJF = 2;
    private final byte eJG;

    public aRo() {
        this.eJG = 0;
    }

    public aRo(boolean bl) {
        this.eJG = (byte)(bl ? 1 : 2);
    }

    public aRo(long l, boolean bl) {
        this.eJG = (byte)(bl ? 1 : 2);
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)64);
        ns_02.D(this.eJG);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

