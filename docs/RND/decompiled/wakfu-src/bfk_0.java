/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFk
 */
public class bfk_0
extends bfc_1 {
    private static final Logger jTc = Logger.getLogger(bfk_0.class);
    private int epQ;

    public bfk_0(int n) {
        super(n);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            jTc.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    protected boolean dTk() {
        return false;
    }

    @Override
    public void v(String[] stringArray) {
        this.epQ = Integer.parseInt(stringArray[0]);
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skL;
    }
}

