/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFI
 */
public class bfi_2
extends bfc_1 {
    private static final Logger jTS = Logger.getLogger(bfi_2.class);

    public bfi_2(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jTS.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fiq_2.gCw().d(fik_2.a(string -> this.jU(ffV2.LV())).l("recustomItem.confirmUse", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
        return true;
    }

    @Override
    protected boolean dTk() {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skO;
    }
}

