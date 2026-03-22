/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTr
 */
public class atr_0
extends aRY {
    public static final int eRI = 0;
    public static final int eRJ = 1;
    public static final int eRK = 2;
    private static final int eRL = -1;
    private final int eRM;
    private final String eRN;
    private final Object[] eRO;

    public atr_0(int n, String string, Object ... objectArray) {
        this.eRM = n;
        this.eRN = string;
        this.eRO = objectArray;
    }

    @Override
    public boolean isValid() {
        if (this.eRN == null || this.eRN.isBlank()) {
            return false;
        }
        switch (this.eRM) {
            case 0: {
                return true;
            }
            case 1: {
                return this.eRO.length == 2;
            }
            case 2: {
                return this.eRO.length == 3;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        switch (this.eRM) {
            case 0: {
                ns_02.C((byte)2);
                ns_02.Q((short)145);
                ns_02.R((short)187);
                ns_02.cT(this.eRN);
                break;
            }
            case 1: {
                ns_02.Q((short)377);
                ns_02.cT(this.eRN);
                ns_02.nX((Integer)this.eRO[0]);
                ns_02.nX((Integer)this.eRO[1]);
                break;
            }
            case 2: {
                ns_02.Q((short)204);
                ns_02.cT(this.eRN);
                ns_02.nX((Integer)this.eRO[0]);
                ns_02.nX((Integer)this.eRO[1]);
                ns_02.cX((Long)this.eRO[2]);
            }
        }
        if (ns_02.aVZ() == 0) {
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

