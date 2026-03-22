/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTx
 */
public class atx_0
extends aRY {
    public static final int eRT = 0;
    public static final int eRU = 1;
    private final int eRV;
    private final int eRW;
    private final boolean eRX;

    public atx_0(int n) {
        this(n, -1, false);
    }

    public atx_0(int n, int n2, boolean bl) {
        this.eRV = n;
        this.eRW = n2;
        this.eRX = bl;
    }

    @Override
    public boolean isValid() {
        return this.eRW > 1 || this.eRW == -1;
    }

    @Override
    public void bGy() {
        switch (this.eRV) {
            case 0: {
                this.cDR();
                break;
            }
            case 1: {
                this.cBS();
            }
        }
    }

    private void cBS() {
        atx_0.jF("turnduration seconds [(allFight | af)] : set the turn duration to the value given (in seconds). If the 'allFight' parameter is used, then the given turn duration will be active for the rest of the current fight.Note that this turn duration only occurs on controllable characters (not IA).On the other hand if the 'allFight' parameter is not used, the given turn duration will only be active for the current turn after what the turn duration will be set back to its default value.");
    }

    private void cDR() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)42);
            ns_02.nX(this.eRW * 1000);
            ns_02.aN(this.eRX);
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 cette commande il faut \u00eatre connect\u00e9 !");
        }
    }

    public static String cCL() {
        return null;
    }
}

