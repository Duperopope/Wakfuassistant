/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFM
 */
public class bfm_1
extends bfc_1 {
    private static final Logger jTX = Logger.getLogger(bfm_1.class);
    private int Nf;

    public bfm_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.Nf = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean aR(ffV ffV2) {
        if (!super.aR(ffV2)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bcd_2 bcd_22 = bgt_02.dpy();
        return !bcd_22.od(this.Nf) || bcd_22.oe(this.Nf);
    }

    @Override
    public String dTj() {
        return aum_0.cWf().c("item.action.resetAchievement", aum_0.cWf().a(62, (long)this.Nf, new Object[0]));
    }

    @Override
    public boolean aQ(ffV ffV2) {
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skE;
    }
}

