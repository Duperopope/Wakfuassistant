/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFl
 */
public final class bfl_1
extends bfc_1 {
    private static final Logger jTd = Logger.getLogger(bfl_1.class);
    private int jTe;

    bfl_1(int n) {
        super(n);
    }

    public int dTm() {
        return this.jTe;
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray.length > 2) {
            jTd.error((Object)("[GD] Mauvais nombre de param\u00e8tres sur une action d'item id=" + this.ski));
            return;
        }
        this.jTe = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTd.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fiq_2.gCw().d(fik_2.a(string -> this.jU(ffV2.LV())).l("question.activateCompanion", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skN;
    }
}

