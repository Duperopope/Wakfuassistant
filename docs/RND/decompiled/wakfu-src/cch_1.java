/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import org.apache.log4j.Logger;

/*
 * Renamed from ccH
 */
public class cch_1
implements adi_1 {
    private static final Logger lPy = Logger.getLogger(cch_1.class);
    public static final cch_1 lPz = new cch_1();

    private cch_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12412: {
                cch_1.a((cpe_0)aam_22);
                return false;
            }
            case 13237: {
                cch_1.a((cpd_0)aam_22);
                return false;
            }
            case 13222: {
                cch_1.a((cpg_0)aam_22);
                return false;
            }
            case 12079: {
                cch_1.a((cpb_0)aam_22);
                return false;
            }
            case 12753: {
                cch_1.a((cpf_0)aam_22);
                return false;
            }
            case 12631: {
                cch_1.a((cpc_0)aam_22);
                return false;
            }
        }
        return true;
    }

    private static void a(cpc_0 cpc_02) {
        Optional optional = bbs_2.a(eva_1.owz);
        if (optional.isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found to update upon receiving update result message");
            return;
        }
        ekr_0 ekr_02 = (ekr_0)optional.get();
        eks_0 eks_02 = ekt_0.f(cpc_02.exu());
        ekr_02.a(eks_02.BJ(), eks_02);
        if (ctb_2.eQx()) {
            bmh.dvr().a(OptionalInt.of(eks_02.BJ()));
            bmh.dvr().DS(eks_02.BJ());
        }
    }

    private static void a(cpf_0 cpf_02) {
        bgt_0 bgt_02;
        int n;
        Optional optional = bbs_2.a(eva_1.owz);
        if (optional.isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found to update upon receiving update result message");
            return;
        }
        ekr_0 ekr_02 = (ekr_0)optional.get();
        Optional<eks_0> optional2 = ekr_02.Qu(n = cpf_02.BJ());
        if (optional2.isEmpty()) {
            aPd.e("cosmetic.preset.unknown.preset", new Object[0]);
            return;
        }
        eks_0 eks_02 = optional2.get();
        eks_0 eks_03 = eks_0.a(eks_02, cpf_02.BL(), cpf_02.BN(), cpf_02.dva());
        ekr_02.a(n, eks_03);
        if (ctb_2.eQx()) {
            ctb_2.MH(n);
        }
        if ((bgt_02 = aue_0.cVJ().cVK()) != null) {
            int n2 = bjf_1.a(cpf_02.BL(), bgt_02);
            bgt_02.dlG().a(fqu_0.sTw, n, n2);
        }
    }

    private static void a(cpg_0 cpg_02) {
        Optional optional;
        ekq_0 ekq_02 = cpg_02.exv();
        if (ekq_02 != ekq_0.qBM) {
            bjf_1.a(ekq_02);
        }
        if ((optional = bbs_2.a(eva_1.owz)).isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found to update upon receiving update result message");
            return;
        }
        ekr_0 ekr_02 = (ekr_0)optional.get();
        ekr_02.a(cpg_02.exw().BJ(), ekt_0.f(cpg_02.exw()));
        if (ctb_2.eQx()) {
            ctb_2.eQr().MG(cpg_02.exw().BJ());
        }
    }

    private static void a(cpe_0 cpe_02) {
        bgt_0 bgt_02;
        if (cpe_02.exv() != ekq_0.qBM) {
            bjf_1.a(cpe_02.exv());
            return;
        }
        Optional optional = bbs_2.a(eva_1.owz);
        if (optional.isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found upon receiving preset deletion result");
            return;
        }
        int n = cpe_02.BJ();
        ekr_0 ekr_02 = (ekr_0)optional.get();
        ekr_02.Qr(n);
        if (ctb_2.eQx()) {
            bmh.dvr().DT(cpe_02.BJ());
        }
        if ((bgt_02 = aue_0.cVJ().cVK()) != null) {
            bgt_02.dlG().dlH();
        }
    }

    private static void a(cpd_0 cpd_02) {
        if (cpd_02.exv() != ekq_0.qBM) {
            bjf_1.a(cpd_02.exv());
            return;
        }
        Optional optional = bbs_2.a(eva_1.owz);
        if (optional.isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found upon receiving preset creation result");
            return;
        }
        ekr_0 ekr_02 = (ekr_0)optional.get();
        int n = cpd_02.BJ();
        eks_0 eks_02 = new eks_0(n, -1, cpd_02.BN(), new HashMap<fm_1, List<ekp_0>>(), ue_0.bjV().bjm());
        ekr_02.a(n, eks_02);
        boolean bl = ctb_2.eQx();
        boolean bl2 = false;
        if (bl) {
            bmh.dvr().a(OptionalInt.of(cpd_02.BJ()));
            bmh.dvr().DS(n);
            bl2 = ctb_2.eQr().eQu();
        }
        if (ekr_02.fxY() == 1 || bl2) {
            bhJ bhJ2 = bl ? ctb_2.eQw() : aue_0.cVJ().cVK();
            cjE cjE2 = new cjE(n, bhJ2.Sn(), true);
            aue_0.cVJ().etu().d(cjE2);
        }
    }

    private static void a(cpb_0 cpb_02) {
        Optional optional;
        if (cpb_02.exv() != ekq_0.qBM) {
            bjf_1.a(cpb_02.exv());
        }
        if ((optional = bbs_2.a(eva_1.owz)).isEmpty()) {
            aPd.e("cosmetic.preset.generic.error", new Object[0]);
            lPy.error((Object)"[COSMETIC PRESETS] No account data found upon receiving active preset update result");
            return;
        }
        ekr_0 ekr_02 = (ekr_0)optional.get();
        if (cpb_02.ext() == -1) {
            ekr_02.qe(cpb_02.KU());
        } else {
            ekr_02.W(cpb_02.KU(), cpb_02.ext());
        }
        if (ctb_2.eQx()) {
            bmh.dvr().dvC();
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

