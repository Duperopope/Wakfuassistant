/*
 * Decompiled with CFR 0.152.
 */
public final class aSj
extends aRY {
    public static final int eNq = 0;
    public static final int eNr = 1;
    public static final int eNs = 2;
    public static final int eNt = 3;
    public static final int eNu = 4;
    public static final int eNv = 5;
    public static final int eNw = 6;
    public static final int eNx = 7;
    private final int eNy;
    private final String[] eNz;

    public aSj(int n, String ... stringArray) {
        this.eNy = n;
        this.eNz = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eNy) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return this.eNz.length == 1;
            }
            case 0: 
            case 1: 
            case 6: 
            case 7: {
                return this.eNz.length == 0;
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
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dmL().t(ffS.sgX) == null && (this.eNy == 2 || this.eNy == 3 || this.eNy == 1)) {
            aqh_0.cBI().jI("Il faut avoir un familier \u00e9quip\u00e9!");
            return;
        }
        try {
            switch (this.eNy) {
                case 0: {
                    this.cBS();
                    break;
                }
                case 3: {
                    this.B(ayf_22);
                    break;
                }
                case 1: {
                    aSj.aA(ayf_22);
                    break;
                }
                case 2: {
                    this.az(ayf_22);
                    break;
                }
                case 4: {
                    this.av(ayf_22);
                    break;
                }
                case 5: {
                    this.aw(ayf_22);
                    break;
                }
                case 6: {
                    this.ay(ayf_22);
                    break;
                }
                case 7: {
                    this.ax(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me d'une commande" + String.valueOf(exception));
        }
    }

    private void av(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)80);
        ayf_22.d(ns_02);
    }

    private void aw(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)456);
        ayf_22.d(ns_02);
    }

    private void ax(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)368);
        ayf_22.d(ns_02);
    }

    private void ay(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)387);
        ayf_22.d(ns_02);
    }

    private void az(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)445);
        ns_02.nX(Integer.parseInt(this.eNz[0]));
        ayf_22.d(ns_02);
    }

    private void B(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)184);
        ns_02.nX(Integer.parseInt(this.eNz[0]));
        ayf_22.d(ns_02);
    }

    private static void aA(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)352);
        ayf_22.d(ns_02);
    }

    private void cBS() {
        aSj.jF("pet ('help'|'h') : display command help");
        aSj.jF("pet ('xp') xpDelta : add xpDelta to equipped pet xp");
        aSj.jF("pet ('health'|'hp') healthValue : set pet health to healthValue");
        aSj.jF("pet ('forceFeed'|'ff') : force equipped pet to be fed");
        aSj.jF("pet ('learnSkin'|'ls') skinId : add pet skin to account cosmetic inventory");
        aSj.jF("pet ('removeSkin'|'rs') skinId : remove pet skin from account cosmetic inventory");
        aSj.jF("pet ('learnAllSkins'|'las') : add all pet skins to account cosmetic inventory");
        aSj.jF("pet ('removeAllSkins'|'ras') : remove all pet skins from account cosmetic inventory");
    }
}

