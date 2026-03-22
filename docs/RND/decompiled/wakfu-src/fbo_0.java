/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fbO
 */
public class fbo_0 {
    private static final Logger rSy = Logger.getLogger(fbo_0.class);
    static final TShortObjectHashMap<ArrayList<fbk_0>> rSz = new TShortObjectHashMap();
    static final TShortObjectHashMap<fby_0> rSA = new TShortObjectHashMap();
    private static boolean nTs;

    public static void fSg() {
        nTs = true;
    }

    public static void fSh() {
        if (!nTs) {
            return;
        }
        fbw_0.rSQ.T(new fbp_0());
        fbw_0.rSQ.U(new fbq_0());
        nTs = false;
    }

    private static fby_0 b(fbk_0 fbk_02) {
        return fbo_0.eD(fbk_02.aIi());
    }

    public static fby_0 eD(short s) {
        fbo_0.fSh();
        return (fby_0)rSA.get(s);
    }

    static ArrayList<fbk_0> c(fby_0 fby_02) {
        List<fbu_0> list = fbw_0.rSQ.h(fby_02);
        ArrayList<fbk_0> arrayList = new ArrayList<fbk_0>(list.size());
        if (!list.isEmpty()) {
            arrayList.add(fbw_0.rSQ.eE(list.get(0).fSj()));
            for (fbu_0 fbu_02 : list) {
                fbk_0 fbk_02 = fbw_0.rSQ.eE(fbu_02.fSk());
                if (fbk_02 == null || fbk_02.coj() != fby_02.fSr()) continue;
                arrayList.add(fbk_02);
            }
        } else {
            fbw_0.rSQ.T(new fbr_0(fby_02, arrayList));
        }
        return arrayList;
    }

    public static ua_0 c(fbk_0 fbk_02) {
        uz_0 uz_02 = uz_0.fo(0L);
        fby_0 fby_02 = fbo_0.b(fbk_02);
        List<fbu_0> list = fbw_0.rSQ.h(fby_02);
        if (!list.isEmpty()) {
            for (fbu_0 fbu_02 : list) {
                if (fbu_02.fSm()) continue;
                uz_02.g(fbu_02.fSl());
            }
        }
        return uz_02;
    }

    public static ua_0 d(fbk_0 fbk_02) {
        fbu_0 fbu_02 = fbw_0.rSQ.eF(fbk_02.aIi());
        return fbu_02 != null ? fbu_02.fSl() : uz_0.bwa;
    }

    @Nullable
    public static fbk_0 e(fbk_0 fbk_02) {
        if (fbk_02 == null) {
            return null;
        }
        if (fbk_02.coy()) {
            return fbk_02;
        }
        fby_0 fby_02 = fbo_0.b(fbk_02);
        if (fby_02 == null) {
            return null;
        }
        return fbo_0.d(fby_02);
    }

    @Nullable
    public static fbk_0 d(fby_0 fby_02) {
        fbo_0.fSh();
        ArrayList arrayList = (ArrayList)rSz.get(fby_02.fSr());
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (fbk_0)arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public static fbk_0 e(fby_0 fby_02) {
        fbo_0.fSh();
        ArrayList arrayList = (ArrayList)rSz.get(fby_02.fSr());
        if (arrayList == null) {
            return null;
        }
        return (fbk_0)arrayList.get(0);
    }

    @Nullable
    public static fbk_0 f(fbk_0 fbk_02) {
        if (fbk_02 == null) {
            return null;
        }
        fby_0 fby_02 = fbo_0.b(fbk_02);
        if (fby_02 == null) {
            return null;
        }
        return fbo_0.e(fby_02);
    }

    public static fbt_0 g(fbk_0 fbk_02) {
        if (fbk_02.coy()) {
            return fbt_0.rSH;
        }
        fbk_0 fbk_03 = fbo_0.f(fbk_02);
        if (fbk_03 == fbk_02) {
            return fbt_0.rSF;
        }
        fbk_0 fbk_04 = fbo_0.e(fbk_02);
        if (fbk_04 == fbk_02) {
            return fbt_0.rSH;
        }
        return fbt_0.rSG;
    }

    public static boolean aa(short s, short s2) {
        fbu_0 fbu_02 = fbw_0.rSQ.eF(s);
        while (fbu_02 != null) {
            if ((fbu_02 = fbw_0.rSQ.eF(fbu_02.fSk())) == null || fbu_02.fSk() != s2) continue;
            return true;
        }
        return false;
    }

    public static ArrayList<String> h(fbk_0 fbk_02) {
        if (fbk_02 == null) {
            return null;
        }
        if (!fbk_02.erO()) {
            return null;
        }
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
        ((fbn_0)fbk_02).Q(new fbs_0(arrayList));
        assert (!arrayList.isEmpty());
        return eLL.a(new eLU(arrayList, 0, 0, true, eLN.qJo, 0));
    }
}

