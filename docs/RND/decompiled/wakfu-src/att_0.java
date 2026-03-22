/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aTt
 */
public class att_0
extends aRY {
    protected static Logger oO = Logger.getLogger(att_0.class);

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        att_0.aQ(ayf_22);
    }

    private static void aQ(ayf_2 ayf_22) {
        cwK cwK2 = new cwK();
        cwK2.db(591892L);
        cwK2.nH(0L);
        ayf_22.d(cwK2);
    }

    private static void p(ayf_2 ayf_22) {
        cwB cwB2 = new cwB();
        cwB2.nI(0L);
        ayf_22.d(cwB2);
    }

    private static void m(ayf_2 ayf_22) {
        cwI cwI2 = new cwI();
        cwI2.nI(5L);
        ayf_22.d(cwI2);
    }
}

