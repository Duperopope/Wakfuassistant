/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFH
 */
public class bfh_1
extends bfc_1 {
    private static final Logger jTR = Logger.getLogger(bfh_1.class);

    public bfh_1(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTR.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        if (bgt_02.ddI().bvW()) {
            aPd.e("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public void clear() {
        this.U(null);
    }

    @Override
    public fgM dTl() {
        return fgM.skm;
    }
}

