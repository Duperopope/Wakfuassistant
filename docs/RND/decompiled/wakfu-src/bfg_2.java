/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFg
 */
public class bfg_2
extends bfc_1 {
    private static final Logger jSX = Logger.getLogger(bfg_2.class);

    public bfg_2(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jSX.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
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
        return fgM.skq;
    }
}

