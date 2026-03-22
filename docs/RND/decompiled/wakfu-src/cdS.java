/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cdS
implements adi_1 {
    protected static final Logger lRj = Logger.getLogger(cdS.class);
    public static final cdS lRk = new cdS();

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 22301: {
                czd czd2 = (czd)aam_22;
                ewo_0.oBF.dS(czd2.aKU());
                String string = String.valueOf(ewo_0.oBF.j(ewr_0.oDt));
                byf_2.nM(string);
                boolean bl = ewo_0.oBF.k(ewr_0.oCa);
                fse_1.gFu().f("isShopAvailable", bl);
                fse_1.gFu().f("systemConfiguration", new aXM());
                int[] nArray = aue_0.cVJ().cVO().cWq();
                boolean bl2 = !evm_2.c(nArray, evm_2.osZ);
                boolean bl3 = ewo_0.oBF.k(ewr_0.oCt) && !bl2;
                fse_1.gFu().f("noExpoRestrictions", !bl3);
                return false;
            }
            case 23826: {
                cze cze2 = (cze)aam_22;
                String string = cze2.getKey();
                String string2 = cze2.getValue();
                ewr_0 ewr_02 = ewr_0.rJ(string);
                if (ewr_02 == null) {
                    lRj.error((Object)("Unknown property " + string + " received with value " + string2));
                    return false;
                }
                ewo_0.oBF.a(ewr_02, string2);
                if (ewr_02 == ewr_0.oCa) {
                    boolean bl = ewo_0.oBF.k(ewr_0.oCa);
                    fse_1.gFu().f("isShopAvailable", bl);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

