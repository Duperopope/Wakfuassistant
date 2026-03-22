/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEG
 */
@fyf_0
public class ceg_2 {
    public static final String PACKAGE = "wakfu.fightCreationOrPlacement";

    public static void lockFight() {
        fey_2 fey_22 = cty_1.ePV().getWindow();
        if (fey_22 != null) {
            fdd_2 fdd_22;
            fdd_22.setSelected(!(fdd_22 = (fdd_2)fey_22.getElementMap().uH("lockFightBtn")).getSelected());
            ceg_2.lockFight(null, fdd_22);
        }
    }

    public static void lockFight(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.cC(fdd_22.getSelected());
        dae_02.lK(17914);
        aaw_1.bUq().h(dae_02);
    }
}

