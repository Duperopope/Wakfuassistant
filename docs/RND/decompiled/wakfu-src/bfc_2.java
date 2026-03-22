/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFC
 */
public class bfc_2
extends bfc_1 {
    private static final Logger jTJ = Logger.getLogger(bfc_2.class);

    public bfc_2(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jTJ.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        if (!aue_0.cVJ().c(cxu_1.eXd())) {
            aue_0.cVJ().a(cxu_1.eXd());
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.sku;
    }
}

