/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFh
 */
public class bfh_2
extends bfc_1 {
    private static final Logger jSY = Logger.getLogger(bfh_2.class);
    private long jSZ;
    private short bkc;

    public bfh_2(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        try {
            anf_2 anf_22 = ehu_0.rX(stringArray[0]);
            this.jSZ = anf_22.d(null, null, null, null);
        }
        catch (Exception exception) {
            jSY.error((Object)("Impossible de parser la position : " + stringArray[0]));
        }
        this.bkc = Short.parseShort(stringArray[1]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jSY.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        acd_1 acd_12 = anf_2.gn(this.jSZ);
        bif_2.dYO().dYk();
        bif_2.dYO().a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), this.bkc, ffV2, true);
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skw;
    }
}

