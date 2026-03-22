/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFD
 */
public class bfd_2
extends bfc_1 {
    private static final Logger jTK = Logger.getLogger(bfd_2.class);
    private int jTL;

    public bfd_2(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.jTL = Integer.valueOf(stringArray[0]);
    }

    public int dTu() {
        return this.jTL;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTK.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
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
        return fgM.skR;
    }
}

