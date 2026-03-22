/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cYA
 */
public class cya_1
implements adi_1,
alx_2 {
    private static final cya_1 nYI = new cya_1();
    private static final String nYJ = "watcherContainer";
    private final ArrayList<String> nYK = new ArrayList();
    final ArrayList<String> nYL = new ArrayList();
    private bua jkw;

    public static cya_1 eYj() {
        return nYI;
    }

    public void cn(bgy bgy2) {
        if (bjv_2.aM(bgy2)) {
            return;
        }
        String string = "fighterDescriptionDialog" + bgy2.Sn();
        if (this.nYL.contains(string)) {
            this.qS(string);
        } else {
            this.a(bgy2, string);
        }
    }

    public void co(bgy bgy2) {
        String string = "fighterDescriptionDialog" + bgy2.Sn();
        this.a(bgy2, string);
    }

    public void cp(bgy bgy2) {
        String string = "fighterDescriptionDialog" + bgy2.Sn();
        this.qS(string);
    }

    private void a(bgy bgy2, String string) {
        if (bgy2.i(exe_1.rEu)) {
            return;
        }
        if (!this.nYL.contains(string)) {
            this.nYL.add(string);
            long l = 0L;
            if (bgy2 instanceof bgt_0) {
                l |= 0x8000L;
            }
            fey_2 fey_22 = (fey_2)fyw_0.gqw().a(string, ccj_2.pe("fighterDescriptionDialog"), l);
            fhm_1.bH(fey_22);
            if (!(bgy2 instanceof bgt_0)) {
                this.bF(fey_22);
            }
            fse_1.gFu().b("fighter", bgy2, string);
            fey_22.setSizeToPrefSize();
        }
    }

    private void bF(fey_2 fey_22) {
        fey_22.a(new cyb_2(this, fey_22));
    }

    private void qS(String string) {
        if (this.nYL.remove(string)) {
            fyw_0.gqw().tl(string);
        }
    }

    @Override
    public void dialogUnloaded(String string) {
        this.nYL.remove(string);
    }

    private void a(eSS eSS2, ezz ezz2, boolean bl) {
        exf_2 exf_22 = (exf_2)eSS2.fIB();
        if (exf_22 == null) {
            return;
        }
        String string = "timelineCellDialog2" + eSS2.Sn();
        if (bl) {
            ZH zH;
            Object object;
            bbC bbC2 = (bbC)((Object)eSS2);
            bby bby2 = bbC2.cZE();
            if (bby2 == null) {
                return;
            }
            if (ezz2 != null) {
                object = (bgy)ezz2;
                zH = ((bgy)object).ddI();
            } else {
                zH = bby2.dac();
            }
            if (fyw_0.gqw().to(string)) {
                fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
                object = (feq_1)fhs_22.uH(nYJ);
            } else {
                object = (feq_1)fyw_0.gqw().a(string, ccj_2.pe("timelineCellDialog2"), 8192L);
            }
            fse_1.gFu().b("timeline.fighter", new crn_2(exf_22, eSS2.bci() instanceof bgy ? (bgy)eSS2.bci() : null), string);
            ((feq_1)object).setTarget(zH);
            if (!this.nYK.contains(string)) {
                this.nYK.add(string);
            }
        } else if (this.nYK.remove(string)) {
            fyw_0.gqw().tl(string);
        }
    }

    private void a(cpu_2 cpu_22, boolean bl) {
        String string = "timelineCellDialog" + cpu_22.Sn();
        if (bl) {
            if (!this.nYK.contains(string)) {
                feq_1 feq_12 = (feq_1)fyw_0.gqw().a(string, ccj_2.pe("timelineCellDialog"), 8192L);
                fse_1.gFu().a("timeline.fighter", (Object)cpu_22, feq_12.getElementMap());
                feq_12.setTarget(cpu_22.dlM());
                this.nYK.add(string);
            }
        } else if (this.nYK.remove(string)) {
            fyw_0.gqw().tl(string);
        }
    }

    private void I(String string, boolean bl) {
    }

    public void ND(int n) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("timePointBarDialog");
        if (fhs_22 == null) {
            return;
        }
        if (n == 3) {
            this.f((fes_2)fhs_22.uH("extraTurnScoreImage" + (n - 2)));
            this.a((fes_2)fhs_22.uH("extraTurnScoreImage" + (n - 1)), 250);
            this.a((fes_2)fhs_22.uH("extraTurnScoreImage" + n), 500);
        } else {
            this.f((fes_2)fhs_22.uH("extraTurnScoreImage" + n));
        }
    }

    private void f(fes_2 fes_22) {
        this.a(fes_22, 0);
    }

    private void a(fes_2 fes_22, int n) {
        if (fes_22 == null) {
            return;
        }
        fys_0 fys_02 = fes_22.getAppearance();
        axb_2 axb_22 = awx_2.dnF;
        axb_2 axb_23 = awx_2.dnC;
        fys_02.x(fsa_2.class);
        fys_02.a(new fsa_2(axb_22, axb_23, fys_02, n, 250, 3, true, abn.cdr));
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17587: {
                dap dap2 = (dap)aam_22;
                this.a((cpu_2)dap2.dcP(), dap2.bCu());
                return false;
            }
            case 19231: {
                daY daY2 = (daY)aam_22;
                this.a(daY2.fav(), daY2.fau(), daY2.bCu());
                return false;
            }
            case 16526: {
                boolean bl = fse_1.gFu().dp("displaySecondTimeline");
                fse_1.gFu().f("displaySecondTimeline", !bl);
                return false;
            }
            case 19374: {
                boolean bl = fse_1.gFu().dp("timeline.displayStates");
                fse_1.gFu().f("timeline.displayStates", !bl);
                return false;
            }
            case 17661: {
                dcl_0 dcl_02 = (dcl_0)aam_22;
                switch (dcl_02.fcf().getKeyCode()) {
                    default: 
                }
                return false;
            }
            case 17354: {
                dcl_0 dcl_03 = (dcl_0)aam_22;
                switch (dcl_03.fcf().getKeyCode()) {
                    default: 
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aef_2 aef_22;
            aIs aIs2 = (aIs)aie_0.cfn().bmC();
            aIs2.em(true);
            aIs2.en(true);
            fyw_0.gqw().a(this);
            fse_1.gFu().f("displaySecondTimeline", false);
            fse_1.gFu().f("timeline.displayStates", true);
            this.jkw = (bua)fse_1.gFu().vY("fight.timeline");
            if (this.jkw != null) {
                aef_22 = (bsj_0)this.jkw.fNQ();
                for (cpu_2 cpu_22 : ((ety_0)((Object)aef_22)).fKv().a(new evb_0[0])) {
                    this.a(cpu_22, true);
                }
                this.jkw.dIF();
            }
            if ((aef_22 = aue_0.cVJ().cVK()) == null) {
                aue_0.cVJ().b(this);
                return;
            }
            fse_1.gFu().f("highlightedFighterId", 0L);
            ccj_2.g("timePointBarDialog", 270336L);
            fyw_0.gqw().d("wakfu.timeline", chn_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            int n;
            aIs aIs2 = (aIs)aie_0.cfn().bmC();
            aIs2.em(false);
            aIs2.en(false);
            fyw_0.gqw().b(this);
            fyw_0.gqw().tl("timePointBarDialog");
            fyw_0.gqw().tl("timePointBonusSelectionDialog");
            for (n = this.nYK.size() - 1; n >= 0; --n) {
                fyw_0.gqw().tl(this.nYK.get(n));
            }
            this.nYK.clear();
            for (n = this.nYL.size() - 1; n >= 0; --n) {
                fyw_0.gqw().tl(this.nYL.get(n));
            }
            this.nYL.clear();
            fyw_0.gqw().tc("wakfu.timeline");
        }
    }

    public bua dGQ() {
        return this.jkw;
    }
}

