/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFB
 */
public class bfb_1
extends bfc_1 {
    private static final Logger jTG = Logger.getLogger(bfb_1.class);
    private int jTH = 0;
    private final boolean jTI = false;

    public bfb_1(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTG.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.dET();
        this.jU(ffV2.LV());
        return true;
    }

    public void dET() {
        cso_2 cso_22 = cso_2.eOa();
        cso_22.Mr(this.jTH);
        aue_0.cVJ().a(cso_22);
    }

    public boolean bhl() {
        return false;
    }

    @Override
    public void v(String[] stringArray) {
        this.jTH = Integer.valueOf(stringArray[0]);
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skt;
    }
}

