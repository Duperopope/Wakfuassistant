/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from fgn
 */
public class fgn_0 {
    private static final Logger sjk = Logger.getLogger(fgn_0.class);

    private fgn_0() {
    }

    public static boolean d(ffa_0<? extends fhc_0> ffa_02) {
        boolean bl = ewo_0.oBF.k(ewr_0.oDJ);
        if (!bl) {
            return false;
        }
        Object r = fgD.fXh().Vd(ffa_02.fVq());
        return r != null;
    }

    public static fgo_0 a(exP exP2, ffa_0<? extends fhc_0> ffa_02, ffV ffV2) {
        eid_0 eid_02 = exP2.dpX();
        if (eid_02 != null && eid_02.dsm() == 24) {
            return fgo_0.sjn;
        }
        int n = ffa_02.dSg();
        int n2 = exP2.dod().fVd();
        if (ffV2.bfd() == 1) {
            ++n2;
        }
        if (n <= n2) {
            return fgo_0.sjl;
        }
        for (fhc_0 fhc_02 : ffa_02) {
            boolean bl;
            ffV ffV3 = exP2.dod().UK(fhc_02.d());
            boolean bl2 = bl = ffV3 != null && ffV3.fWa() != 0 && (!fhc_02.fYA() || ffV3.fWv());
            if (bl) continue;
            --n2;
        }
        return n2 >= 0 ? fgo_0.sjl : fgo_0.sjm;
    }

    public static boolean a(exP exP2, ffa_0<? extends fhc_0> ffa_02) {
        return fgn_0.a(exP2, ffa_02, false);
    }

    public static boolean a(exP exP2, ffa_0<? extends fhc_0> ffa_02, boolean bl) {
        boolean bl2 = true;
        Iterator<? extends fhc_0> iterator = ffa_02.iterator();
        while (iterator.hasNext() && bl2) {
            fhc_0 fhc_02 = iterator.next();
            ffV ffV2 = exP2.dod().d(fhc_02.d(), fhz_0.srn);
            if (ffV2 != null) continue;
            bl2 = false;
            if (!bl) continue;
            sjk.error((Object)("Fusion de panoplie : le joueur id=" + exP2.Sn() + " ne poss\u00e8de pas l'item de refId=" + fhc_02.d()));
        }
        return bl2;
    }
}

