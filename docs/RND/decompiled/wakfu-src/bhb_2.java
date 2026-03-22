/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bHb
 */
public class bhb_2
extends fil_0 {
    private static final Logger jXd = Logger.getLogger(bhb_2.class);

    public bhb_2(fiq_0 fiq_02) {
        super(fiq_02);
    }

    @Override
    public void ij(long l) {
        fiq_0 fiq_02 = this.fZH();
        if (fiq_02 == null) {
            jXd.error((Object)"Propri\u00e9taire d'un item \u00e0 xp inconnu !");
            return;
        }
        fij_0 fij_02 = fiq_02.fVV();
        long l2 = fij_02.pf();
        short s = fij_02.cmL();
        super.ij(l);
        long l3 = fij_02.dnH().nG(fij_02.cmL() + 1) - l;
        String string = ((ffV)this.fZH()).dOg().getName();
        int n = fij_02.cmL() - s;
        long l4 = l - l2;
        aPd.f("infoPop.xpGain", string, l4, l3, aPc.eww, n);
    }
}

