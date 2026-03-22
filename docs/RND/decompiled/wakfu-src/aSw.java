/*
 * Decompiled with CFR 0.152.
 */
public class aSw
extends aRY {
    private final String eOI;

    public aSw(String string) {
        this.eOI = string.trim();
    }

    @Override
    public boolean isValid() {
        return ffV.sH(this.eOI) != null;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)55);
        ns_02.cX(aqw_0.cCv());
        ns_02.cT(this.eOI);
        aue_0.cVJ().etu().d(ns_02);
    }
}

