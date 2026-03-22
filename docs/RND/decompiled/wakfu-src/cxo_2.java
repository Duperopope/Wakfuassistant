/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cXo
 */
public class cxo_2
implements adi_1,
alx_2 {
    private static final cxo_2 nVe = new cxo_2();
    private alx_2 ikv;
    final ArrayList<String> nVf = new ArrayList();
    private dcC nVg;
    private final bma_1 nVh = new bma_1();

    public static cxo_2 eWM() {
        return nVe;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16471: {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                dae_0 dae_02 = (dae_0)aam_22;
                byte by = dae_02.bCn();
                blx_1 blx_12 = bgt_02.dmN();
                if (blx_12 == null) {
                    return false;
                }
                if (by != blx_12.fmR()) {
                    blx_12.eG(by);
                    ciV ciV2 = new ciV();
                    ciV2.db(bgt_02.Sn());
                    ciV2.df(by);
                    aue_0.cVJ().etu().d(ciV2);
                }
                this.aq(bgt_02);
                return false;
            }
            case 16525: {
                return false;
            }
            case 19909: {
                dae_0 dae_03 = (dae_0)aam_22;
                byte by = dae_03.bCn();
                if (aue_0.cVJ().cVK().dnj()) {
                    return false;
                }
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                if (bgt_03.dmN() != null) {
                    bmb_1 bmb_12 = (bmb_1)bgt_03.dmN().Pm(by);
                    if (bgt_03.dmN().Pm(by) != null) {
                        fiq_2.gCw().d(fik_2.a(string -> {
                            this.a(bmb_12);
                            bgt_03.dmN().eI(by);
                        }).l("question.osaFreeCreature", bmb_12.daT()).vG(ccp_2.mRE.byf()).abQ(1));
                    }
                }
                return false;
            }
            case 17151: {
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                dae_0 dae_04 = (dae_0)aam_22;
                byte by = dae_04.bCn();
                blx_1 blx_13 = bgt_04.dmN();
                if (blx_13 == null) {
                    return false;
                }
                ezw ezw2 = blx_13.Pm(by);
                if (ezw2 == null) {
                    return false;
                }
                String string2 = dae_04.bCt();
                if (string2.isEmpty()) {
                    return false;
                }
                if (!cdd_2.checkNameValidity(string2)) {
                    return false;
                }
                if (!bYV.bkY().dB(string2)) {
                    aPd.e("error.chat.operationNotPermited", new Object[0]);
                    return false;
                }
                ezw2.setName(string2);
                ciU ciU2 = new ciU();
                ciU2.db(bgt_04.Sn());
                ciU2.dg(by);
                ciU2.ou(string2);
                ciU2.jh(true);
                aue_0.cVJ().etu().d(ciU2);
                return false;
            }
        }
        return true;
    }

    private void aq(bgt_0 bgt_02) {
        if (this.nVg == null) {
            return;
        }
        if (aue_0.cVJ().c(cuk_2.eSS())) {
            return;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        if (bsj_02.dGQ().bhF() != bgt_02.Sn()) {
            return;
        }
        aaw_1.bUq().h(this.nVg);
        bgt_02.dlH();
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            dcC dcC2 = new dcC();
            dcC2.g((bmx_0)aue_0.cVJ().cVK().dkB().pc(7348));
            dcC2.lK(17025);
            this.nVg = dcC2;
            this.ikv = new cxp_1(this);
            fyw_0.gqw().a(this.ikv);
            this.doz();
            ccj_2.g("osamodasSymbiotDialog", 32768L);
            fyw_0.gqw().d("wakfu.osamodasSymbiot", cgb_2.class);
        }
    }

    public void doz() {
        blx_1 blx_12 = aue_0.cVJ().cVK().dmN();
        this.nVh.a(blx_12);
        blx_12.a(this.nVh);
        bmc_1.eeg().a(blx_12);
        fse_1.gFu().f("osamodasSymbiot", bmc_1.eeg());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            for (String string : (ArrayList)this.nVf.clone()) {
                if (!fyw_0.gqw().to(string)) continue;
                fyw_0.gqw().tl(string);
            }
            this.nVf.clear();
            fyw_0.gqw().tl("osamodasSymbiotDialog");
            fse_1.gFu().vX("osamodasSymbiot");
            fse_1.gFu().vX("osamodasSymbiot.describedCreature");
            fyw_0.gqw().tc("wakfu.osamodasSymbiot");
            this.nVg = null;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(bmb_1 bmb_12) {
        blx_1 blx_12 = aue_0.cVJ().cVK().dmN();
        if (blx_12 == null) {
            return;
        }
        String string = cxo_2.NA(blx_12.c(bmb_12));
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().tl(string);
            this.nVf.remove(string);
        } else {
            this.nVf.add(string);
            fyw_0.gqw().az(string, ccj_2.pe("monsterDetailDialog"));
            fse_1.gFu().b("monsterDetail", bmb_12, string);
        }
    }

    @NotNull
    private static String NA(int n) {
        return "monsterDetailDialog" + n;
    }

    @Override
    public void dialogUnloaded(String string) {
        this.nVf.remove(string);
    }

    public void ar(bgt_0 bgt_02) {
        dcC dcC2 = new dcC();
        dcC2.g((bmx_0)bgt_02.dkB().pc(7348));
        dcC2.lK(17025);
        this.nVg = dcC2;
        bmc_1.eeg().a(bgt_02.dmN());
        fse_1.gFu().f("osamodasSymbiot", bmc_1.eeg());
        fse_1.gFu().aT("osamodasSymbiot", "capturedCreatures");
    }

    public void eWN() {
        if (this.nVf.isEmpty()) {
            return;
        }
        blx_1 blx_12 = aue_0.cVJ().cVK().dmN();
        if (blx_12 == null) {
            return;
        }
        for (int i = 0; i < 10; ++i) {
            String string = cxo_2.NA(i);
            if (!this.nVf.contains(string)) continue;
            ezw ezw2 = blx_12.Pm(i);
            fse_1.gFu().b("monsterDetail", ezw2, string);
        }
    }
}

