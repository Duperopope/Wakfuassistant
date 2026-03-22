/*
 * Decompiled with CFR 0.152.
 */
public class aSc
extends aRY {
    public static final int eMQ = 0;
    public static final int eMR = 1;
    public static final int eMS = 2;
    public static final int eMT = 3;
    public static final int eMU = 4;
    public static final int eMV = 5;
    private final int eMW;
    private final String[] eMX;

    public aSc(int n, String ... stringArray) {
        this.eMW = n;
        this.eMX = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eMW) {
            case 1: 
            case 2: 
            case 5: {
                return this.eMX.length == 1;
            }
            case 0: 
            case 3: 
            case 4: {
                return this.eMX.length == 0;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.eMW) {
                case 0: {
                    aSc.cBS();
                    break;
                }
                case 1: {
                    this.aq(ayf_22);
                    break;
                }
                case 2: {
                    this.ar(ayf_22);
                    break;
                }
                case 3: {
                    this.as(ayf_22);
                    break;
                }
                case 4: {
                    this.at(ayf_22);
                    break;
                }
                case 5: {
                    this.au(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me d'une commande" + String.valueOf(exception));
        }
    }

    private void aq(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)189);
        ns_02.nX(Integer.parseInt(this.eMX[0]));
        ayf_22.d(ns_02);
    }

    private void ar(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)471);
        ns_02.nX(Integer.parseInt(this.eMX[0]));
        ayf_22.d(ns_02);
    }

    private void as(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)434);
        ayf_22.d(ns_02);
    }

    private void at(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)32);
        ayf_22.d(ns_02);
    }

    private void au(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)128);
        ns_02.nX(Integer.parseInt(this.eMX[0]));
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        aSc.jF("mount ('help'|'h') : display command help");
        aSc.jF("mount ('learnSkin'|'ls') skinId : add an skin to the cosmetic inventory, bypass all checks");
        aSc.jF("mount ('removeSkin'|'rs') skinId : remove a skin from the cosmetic inventory");
        aSc.jF("mount ('learnAllSkins'|'las') : add all mount skins to account cosmetic inventory");
        aSc.jF("mount ('removeAllSkins'|'ras') : remove all mount skins from account cosmetic inventory");
        aSc.jF("mount ('health'|'hp') hpValue : set equipped mount hp to given value");
    }
}

