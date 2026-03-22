/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from bIG
 */
public class big_2 {
    private static final Logger khw = Logger.getLogger(big_2.class);

    public static void dZd() {
        URL uRL;
        try {
            uRL = new URL(auc_0.kG("mapDefinitionPath"));
        }
        catch (fu_0 fu_02) {
            return;
        }
        catch (MalformedURLException malformedURLException) {
            return;
        }
        aqs_2 aqs_22 = big_2.h(uRL);
        if (aqs_22 == null) {
            return;
        }
        aqt_2 aqt_22 = aqs_22.bGT();
        apd_1 apd_12 = aqt_22.fq("id");
        int n = apd_12.bCo();
        bir_2 bir_22 = new bir_2(n, aum_0.cWf().c("map.root.text.description", new Object[0]));
        bih_2.dZf().a(bii_2.khF, n, bir_22);
    }

    private static aqs_2 h(URL uRL) {
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
            aqr_22.gU(bufferedInputStream);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
            bufferedInputStream.close();
        }
        catch (Exception exception) {
            khw.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + String.valueOf(uRL)));
            return null;
        }
        return aqs_22;
    }

    public static void dZe() {
        big_2.hQ(true);
    }

    public static void hQ(boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.aqZ();
        biq_1 biq_12 = big_2.l(l, true);
        if (!bl) {
            big_2.a(biq_12);
            return;
        }
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(l);
        if (!bzq_22.lEI) {
            big_2.a(biq_12);
            return;
        }
        bJK bJK2 = bgt_02.dnU();
        if (bJK2 == null) {
            big_2.a(biq_12);
            return;
        }
        biq_1 biq_13 = big_2.y(bJK2.d(), l);
        if (biq_13 == null) {
            big_2.a(biq_12);
            return;
        }
        big_2.a(biq_13);
    }

    private static void a(biq_1 biq_12) {
        bif_2.dYO().a(biq_12);
        bik_2.dZl().a(biq_12);
    }

    public static biq_1 l(long l, boolean bl) {
        bic_2 bic_22 = (bic_2)bih_2.dZf().b(bii_2.khD, l);
        if (bic_22 == null) {
            try {
                String string = auc_0.i("fullMapPath", l);
                try {
                    string = apr_1.bA(string).toString();
                }
                catch (MalformedURLException malformedURLException) {
                    return null;
                }
                if (!bl_0.bl(string)) {
                    return null;
                }
            }
            catch (fu_0 fu_02) {
                return null;
            }
            bic_22 = new bic_2(l, bl);
            bih_2.dZf().a(bii_2.khD, l, bic_22);
        }
        if (bl && !bic_22.dYu()) {
            bic_22.dYv();
        }
        return bic_22;
    }

    public static biq_1 y(int n, long l) {
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khC, n);
        if (biq_12 != null) {
            return biq_12;
        }
        try {
            String string = String.format(auc_0.kG("fullSubMapPath"), l, n / 100);
            try {
                string = apr_1.bA(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return null;
            }
            if (!bl_0.bl(string)) {
                return null;
            }
        }
        catch (fu_0 fu_02) {
            return null;
        }
        biq_12 = new bio_2(n, l);
        bih_2.dZf().a(bii_2.khC, n, biq_12);
        return biq_12;
    }

    public static void a(bgy bgy2, bip_2 bip_22) {
        bgt_0 bgt_02;
        assert (bgy2 != null && bip_22 != null);
        float[] fArray = bgy2.aFW() == 1 ? aid_0.dUN : (bgy2.bvY() ? aid_0.dUK : ((bgt_02 = aue_0.cVJ().cVK()).dnQ().dfG() && bgt_02.dnQ().dKL().rw(bgy2.Sn()) != null ? aid_0.dUM : aid_0.dUL));
        big_2.a(bgy2, fArray, bip_22);
    }

    public static void b(bgy bgy2, bip_2 bip_22) {
        big_2.b(bgy2, aid_0.dUO, bip_22);
    }

    public static void a(bgy bgy2, float[] fArray, bip_2 bip_22) {
        big_2.a(bgy2, true, false, fArray, bip_22);
    }

    public static void b(bgy bgy2, float[] fArray, bip_2 bip_22) {
        big_2.a(bgy2, false, true, fArray, bip_22);
    }

    private static void a(bgy bgy2, boolean bl, boolean bl2, float[] fArray, bip_2 bip_22) {
        assert (bgy2 != null && bip_22 != null && fArray != null);
        if (bl) {
            big_2.b(bgy2.Sn(), 0, bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), bgy2.aqZ(), bgy2, bip_22.dXT(), bgy2.aZk(), fArray, bip_22);
        }
        if (bl2) {
            big_2.a(bgy2.Sn(), 0, bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), bgy2.aqZ(), bgy2, bip_22.dXT(), bgy2.aZk(), fArray, bip_22);
        }
    }

    public static void a(bdf_1 bdf_12, float[] fArray, bip_2 bip_22) {
        big_2.a(bdf_12, fArray, true, false, bip_22);
    }

    public static void b(bdf_1 bdf_12, float[] fArray, bip_2 bip_22) {
        big_2.a(bdf_12, fArray, false, true, bip_22);
    }

    private static void a(bdf_1 bdf_12, float[] fArray, boolean bl, boolean bl2, bip_2 bip_22) {
        assert (bdf_12 != null && bip_22 != null && fArray != null);
        if (bl) {
            big_2.b(bdf_12.Sn(), 0, bdf_12.getWorldX(), bdf_12.getWorldY(), bdf_12.getAltitude(), aue_0.cVJ().cVK().aqZ(), bdf_12, bip_22.dXT(), null, fArray, bip_22);
        }
        if (bl2) {
            big_2.a(bdf_12.Sn(), 0, bdf_12.getWorldX(), bdf_12.getWorldY(), bdf_12.getAltitude(), aue_0.cVJ().cVK().aqZ(), bdf_12, bip_22.dXT(), null, fArray, bip_22);
        }
    }

    public static void a(long l, int n, float f2, float f3, float f4, long l2, Object object, fso_1 fso_12, String string, float[] fArray, bip_2 bip_22) {
        bip_22.a(l, n, f2, f3, f4, l2, string, object, fso_12, fArray);
    }

    public static void b(long l, int n, float f2, float f3, float f4, long l2, Object object, fso_1 fso_12, String string, float[] fArray, bip_2 bip_22) {
        big_2.a(l, n, f2, f3, f4, l2, object, fso_12, null, string, fArray, bip_22);
    }

    public static void a(long l, int n, float f2, float f3, float f4, long l2, Object object, fso_1 fso_12, String string, String string2, float[] fArray, bip_2 bip_22) {
        bip_22.a(l, n, f2, f3, f4, l2, string2, object, fso_12, string, fArray);
    }

    public static void a(int n, long l, bip_2 bip_22) {
        bip_22.k(n, l);
    }

    public static void b(int n, long l, bip_2 bip_22) {
        bip_22.w(n, l);
    }

    public static void c(bgy bgy2, bip_2 bip_22) {
        big_2.a(0, bgy2.Sn(), bip_22);
    }

    public static void d(bgy bgy2, bip_2 bip_22) {
        big_2.b(0, bgy2.Sn(), bip_22);
    }

    public static void a(bdf_1 bdf_12, bip_2 bip_22) {
        big_2.a(0, bdf_12.Sn(), bip_22);
    }

    public static void b(bdf_1 bdf_12, bip_2 bip_22) {
        big_2.b(0, bdf_12.Sn(), bip_22);
    }

    public static String lA(long l) {
        Collection collection = fpk.sNF.ggj().valueCollection();
        Set set = collection.stream().filter(foM2 -> foM2.aqZ() == l).map(foM2 -> (bJK)foM2).collect(Collectors.toSet());
        Optional<bJK> optional = set.stream().filter(bJK2 -> bJK2.aVf() > 0).min(Comparator.comparingInt(bJK::aVf));
        if (optional.isEmpty()) {
            return null;
        }
        Optional<bJK> optional2 = set.stream().filter(bJK2 -> bJK2.aVe() > 0).max(Comparator.comparingInt(bJK::aVe));
        if (optional2.isEmpty()) {
            return null;
        }
        return aum_0.cWf().c("recommended.level", optional.get().aVf(), optional2.get().aVe());
    }
}

