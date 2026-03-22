/*
 * Decompiled with CFR 0.152.
 */
public final class aSm
extends aRY {
    private final long eNN;
    private final String eNO;

    public aSm(long l, String string) {
        this.eNN = l;
        this.eNO = string;
    }

    @Override
    public boolean isValid() {
        return this.eNO != null && this.eNN != 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)454);
            ns_02.cX(this.eNN);
            ns_02.cT(this.eNO);
            ayf_22.d(ns_02);
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Error trying to play animation : " + String.valueOf(exception));
        }
    }
}

