/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.HashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from cZr
 */
public class czr_2 {
    private static final Logger oaU = Logger.getLogger(czr_2.class);
    private static final TLongObjectHashMap<fdd_1> oaV = new TLongObjectHashMap();
    private static final int oaW = 2000;

    private czr_2() {
    }

    public static void eZh() {
        TLongObjectIterator tLongObjectIterator = oaV.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fdd_1 fdd_12 = (fdd_1)tLongObjectIterator.value();
            if (fdd_12 == null || fdd_12.getElementMap() == null) continue;
            fdd_12.guv();
        }
        oaV.clear();
    }

    public static void oQ(long l) {
        fdd_1 fdd_12 = (fdd_1)oaV.remove(l);
        if (fdd_12 != null) {
            fdd_12.guv();
        }
    }

    public static boolean a(int n, bgy bgy2) {
        String string = VI.pX(n).bkI();
        fdd_1 fdd_12 = czr_2.b(bgy2, string);
        if (fdd_12 == null) {
            return false;
        }
        czr_2.a(bgy2, fdd_12);
        return true;
    }

    private static fdd_1 b(bgy bgy2, String string) {
        long l = bgy2.Sn();
        fdd_1 fdd_12 = (fdd_1)oaV.get(l);
        if (fdd_12 != null) {
            assert (l == ((adj_0)fdd_12.getTarget()).Sn()) : "Le mobile de " + bgy2.getName() + " ne correspond pas \u00e0 l'ancien";
            try {
                fdd_12.bnz();
                fdd_12.setAnimation(string);
            }
            catch (Exception exception) {
                fdd_12.guv();
                oaV.remove(l);
                oaU.warn((Object)exception);
                return null;
            }
        }
        try {
            String string2 = aix_0.cgF();
            fdd_12 = aix_0.iz(string2);
            fdd_12.b(string2, string, false);
            oaV.put(l, (Object)fdd_12);
        }
        catch (Exception exception) {
            oaU.warn((Object)exception);
            return null;
        }
        return fdd_12;
    }

    private static void a(bgy bgy2, fdd_1 fdd_12) {
        ZG zG = bgy2.dkT();
        assert (bgy2.doV() instanceof bjz_1);
        czr_2.a(bgy2, zG.bqd());
        fdd_12.setDuration(2000);
        fdd_12.setTarget(bgy2.ddI());
        fdd_12.gsr();
        fdd_12.setYOffset(ddw_0.eY(10, bgy2.ddI().bpX()));
        fdd_12.setSmileyIsVisible(true);
        fdd_12.gsr();
        fax_1 fax_12 = fdd_12.getAnimatedElementViewer();
        fax_12.setAnimatedElement(zG);
        fax_12.getAnimatedElement().a(new czs_2(bgy2));
    }

    public static boolean a(int n, long l, int n2, bgy bgy2) {
        String string;
        assert (bgy2 != null);
        eyp eyp2 = bgy2.doV();
        try {
            int n3 = czr_2.b(n2, bgy2);
            string = auc_0.cVq().zK(VI.at(n, eyp2.aWP()));
            if (string == null) {
                string = czr_2.eV(n, n3);
            }
        }
        catch (Exception exception) {
            oaU.error((Object)"Exception during displayEmoteIconOnMonster", (Throwable)exception);
            return false;
        }
        if (string == null) {
            return false;
        }
        return czr_2.a(l, eyp2, string);
    }

    public static boolean d(int n, long l, int n2) {
        if (n2 == 1) {
            oaU.error((Object)("character inconnu " + l));
            return false;
        }
        String string = czr_2.eV(n, n2);
        return czr_2.a(l, null, string);
    }

    private static boolean a(long l, eyp eyp2, String string) {
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null || !adj_02.isVisible()) {
            return false;
        }
        HashSet<xa_0> hashSet = xd_0.bnv().b(adj_02);
        byte by = eyp2 == null ? (byte)adj_02.aKu() : eyp2.bcN();
        xo_0 xo_02 = new xo_0(string, 32, 32, (xu_0)new xt_0(), 2000);
        xo_02.a(adj_02);
        xo_02.setYOffset((int)((float)by * 10.0f + (float)xo_02.getYOffset() + 10.0f));
        xo_02.qC(Math.max(1, hashSet != null ? hashSet.size() * 2000 / 2 : 0));
        xd_0.bnv().a(xo_02);
        return true;
    }

    private static int b(int n, bgy bgy2) {
        if (n != -1) {
            return n;
        }
        eyv eyv2 = eyw.fik().OW(bgy2.doV().cqy());
        return bgy2.a(ezj_0.psQ) ? 0 : eyv2.fii();
    }

    public static String eV(int n, int n2) {
        return auc_0.cVq().zJ(VI.at(n, n2));
    }

    public static void a(bgy bgy2, aro_1 aro_12) {
        bdj_2 bdj_22 = bgy2.ddI();
        czr_2.a(aro_12, bdj_22, arx_1.cTs.bHJ());
        czr_2.a(aro_12, bdj_22, arx_1.cTt.bHJ());
        czr_2.a(aro_12, bdj_22, arx_1.cTz.bHJ());
        aro_12.btE();
    }

    private static void a(aro_1 aro_12, bdj_2 bdj_22, int n) {
        float[] fArray = bdj_22.qU(n);
        aro_12.c(n, fArray);
    }
}

