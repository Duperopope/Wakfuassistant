/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFr
 */
public class bfr_0
extends bfc_1 {
    private static final Logger jTq = Logger.getLogger(bfr_0.class);

    public bfr_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTq.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
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
        return fgM.skD;
    }
}

