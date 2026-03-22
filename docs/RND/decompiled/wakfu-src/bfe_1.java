/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFE
 */
public class bfe_1
extends bfc_1 {
    private static final Logger jTM = Logger.getLogger(bfe_1.class);
    private int jTN;

    public bfe_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.jTN = Integer.valueOf(stringArray[0]);
    }

    public int dTv() {
        return this.jTN;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02.dno() == null) {
            jTM.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skQ;
    }
}

