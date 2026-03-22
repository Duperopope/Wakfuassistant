/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;

public final class bDr {
    private static final Logger jKb = Logger.getLogger(bDr.class);
    private static final int jKc = 82;
    public static final String jKd = "BagIn-1";

    private bDr() {
    }

    public static boolean a(long l, ffV ffV2, BiConsumer<Long, acd_1> biConsumer) {
        boolean bl = bDr.dkH();
        if (!bDr.dQO() && !bl) {
            aPd.e("error.deploy.notInBag", new Object[0]);
            return false;
        }
        cvh_1 cvh_12 = bDr.dQP();
        if (aue_0.cVJ().c(cvh_12)) {
            aue_0.cVJ().b(cvh_12);
            return false;
        }
        bCA bCA2 = bcw_0.dQn().kY(l);
        if (bCA2 == null) {
            jKb.error((Object)("[IE Deploy] TemplateId=" + l + " inconnu"));
            return false;
        }
        if (bCA2 instanceof bap_0 && bl) {
            aPd.e("error.cannotDeployMerchantDisplayInHavenWorld", new Object[0]);
            bCA2.aZp();
            return false;
        }
        bCA2.ht(false);
        bCA2.aVQ();
        for (ng_1 ng_12 : bCA2.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            afk_0 afk_02 = (afk_0)ng_12;
            afh_0.bxU().a(afk_02);
        }
        bDh bDh2 = bCA2.dNj();
        cvh_12.b(bDh2);
        cvh_12.y(() -> {
            bDr.e(bCA2);
            biConsumer.accept(ffV2.LV(), bDh2.dQz().dQG());
            bCA2.aZp();
        });
        cvh_12.x(() -> {
            bnr_1 bnr_12 = cvh_12.eRb();
            if (bnr_12 != null && bnr_12.dzA()) {
                aPd.e(bnr_12.dzB(), new Object[0]);
            }
            bDr.e(bCA2);
            bCA2.aZp();
        });
        cvh_12.a(cvi_2.nQn);
        aue_0.cVJ().a(cvh_12);
        return true;
    }

    private static void e(bCA bCA2) {
        for (ng_1 ng_12 : bCA2.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            afk_0 afk_02 = (afk_0)ng_12;
            afh_0.bxU().b(afk_02);
        }
    }

    public static boolean la(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        long l2 = bjn_12.Ya();
        if (l2 <= 0L) {
            return false;
        }
        return l == caf_2.lFq.rT(l2);
    }

    public static boolean a(long l, BiConsumer<Long, bDv> biConsumer) {
        bCA bCA2;
        boolean bl = bDr.dkH();
        if (!bDr.dQO() && !bl) {
            aPd.e("error.deploy.notInBag", new Object[0]);
            return false;
        }
        cvh_1 cvh_12 = bDr.dQP();
        if (aue_0.cVJ().c(cvh_12)) {
            cvh_12.reset();
        }
        cut_1 cut_12 = cut_1.eTd();
        if (aue_0.cVJ().c(cut_12)) {
            cut_12.eTe();
        }
        if ((bCA2 = bcw_0.dQn().kY(l)) == null) {
            jKb.error((Object)("[IE Deploy] TemplateId=" + l + " inconnu"));
            return false;
        }
        if (bCA2 instanceof bap_0 && bl) {
            aPd.e("error.cannotDeployMerchantDisplayInHavenWorld", new Object[0]);
            bCA2.aZp();
            return false;
        }
        bCA2.a(cvh_12.eRd());
        bCA2.ht(false);
        bCA2.aVQ();
        for (ng_1 ng_12 : bCA2.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            afk_0 afk_02 = (afk_0)ng_12;
            afh_0.bxU().a(afk_02);
        }
        bDh bDh2 = bCA2.dNj();
        cvh_12.b(bDh2);
        cvh_12.y(() -> biConsumer.accept(l, new bDv(bDh2.dQz().dQG(), bDh2.bcB())));
        cvh_12.z(() -> {
            for (ng_1 ng_12 : bCA2.aVG()) {
                if (!(ng_12 instanceof afk_0)) continue;
                afk_0 afk_02 = (afk_0)ng_12;
                afh_0.bxU().b(afk_02);
            }
            bCA2.aZp();
        });
        cvh_12.x(() -> {
            bnr_1 bnr_12 = cvh_12.eRb();
            if (bnr_12 != null && bnr_12.dzA()) {
                aPd.e(bnr_12.dzB(), new Object[0]);
            }
            for (ng_1 ng_12 : bCA2.aVG()) {
                if (!(ng_12 instanceof afk_0)) continue;
                afk_0 afk_02 = (afk_0)ng_12;
                afh_0.bxU().b(afk_02);
            }
            bCA2.aZp();
        });
        cvh_12.a(cvi_2.nQn);
        if (!aue_0.cVJ().c(cvh_12)) {
            aue_0.cVJ().a(cvh_12);
        } else {
            bCA2.dQz().dQH();
        }
        return true;
    }

    public static boolean dkH() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        long l = bjn_12.Ya();
        if (l <= 0L) {
            return false;
        }
        long l2 = bgt_02.aqZ();
        return l2 == caf_2.lFq.rT(l);
    }

    public static boolean dQO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02.dnw() == bgt_02.dnx();
    }

    public static cvh_1 dQP() {
        if (bDr.dQO()) {
            return ctp_2.eQZ();
        }
        return cvp_2.eTJ();
    }

    public static boolean i(aam_2 aam_22) {
        dcl_0 dcl_02 = (dcl_0)aam_22;
        KeyEvent keyEvent = dcl_02.fcf();
        if (keyEvent == null) {
            return false;
        }
        if (keyEvent.getKeyCode() != 82) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null;
    }

    public static boolean a(aam_2 aam_22, bDh bDh2) {
        if (bDr.i(aam_22)) {
            bDh2.dNm();
            return false;
        }
        return true;
    }

    public static boolean f(bCA bCA2) {
        OptionalInt optionalInt = bDr.h(bCA2);
        if (optionalInt.isEmpty()) {
            return false;
        }
        int n = optionalInt.getAsInt();
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return false;
        }
        Optional<bgf_1> optional = beg_1.t(bgv_22);
        return optional.isPresent();
    }

    public static boolean g(bCA bCA2) {
        OptionalInt optionalInt = bDr.h(bCA2);
        if (optionalInt.isEmpty()) {
            return false;
        }
        return bDq.Gj(optionalInt.getAsInt());
    }

    private static OptionalInt h(bCA bCA2) {
        if (bCA2 == null) {
            return OptionalInt.empty();
        }
        Optional<Integer> optional = fdb.fSX().sE(bCA2.dQA());
        return optional.map(OptionalInt::of).orElse(OptionalInt.empty());
    }

    public static List<String> i(bCA bCA2) {
        bDh bDh2 = bCA2.dNk();
        if (bDh2 == null) {
            return null;
        }
        if (bDh2.dNl()) {
            return null;
        }
        try {
            return Lists.newArrayList((Object[])new String[]{String.format(auc_0.cVq().bS("pictoIconPath"), jKd)});
        }
        catch (fu_0 fu_02) {
            jKb.error((Object)fu_02);
            return null;
        }
    }
}

