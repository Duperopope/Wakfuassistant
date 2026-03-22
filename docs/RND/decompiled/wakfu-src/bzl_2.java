/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bZL
 */
public class bzl_2
implements aeh_2 {
    public static final int lDW = -1;
    public static final int lDX = -2;
    public static final int lDY = 1009;
    private static final Logger lDZ = Logger.getLogger(bzl_2.class);
    private long brw;
    private adc_0 lEa;
    private int lEb = -1;
    private boolean lEc;
    private bzm_2 lEd;
    private ajo_0 lEe;
    private String p;
    private int lEf;
    private static final bzl_2 lEg = new bzl_2();
    public final String lEh = "zoneName";

    public void iP(boolean bl) {
        this.c(bl, 5000);
    }

    private void c(boolean bl, int n) {
        boolean bl2;
        boolean bl3 = bl2 = this.lEc != bl;
        if (bl2) {
            this.JL(n);
        }
        this.lEc = bl;
        if (bl2) {
            this.lEa = this.b(this.lEa);
            cAY.eHc().eHi();
        }
        if (this.lEa != null) {
            this.JK(this.lEa.cix);
        }
    }

    private void JK(int n) {
        if (this.lEc) {
            n = -2;
        }
        if (n == this.lEb) {
            return;
        }
        this.eqp();
        if (n != -1) {
            if (n == -2) {
                this.ean();
            } else {
                aiy_0.dYv.yC(n);
            }
        }
        this.lEb = n;
    }

    private void ean() {
        bzq_1 bzq_12 = bzq_1.lCJ;
        bzq_12.d(fsc.tbl);
        bzq_12.eP(0.9f);
        bzq_12.iM(true);
        this.lEd = new bzm_2();
        this.lEd.start();
    }

    private void JL(int n) {
        if (!this.lEc) {
            return;
        }
        this.lEd.rz(n);
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        bzq_1 bzq_12 = bzq_1.lCJ;
        bzq_12.iM(false);
        if (bof_12 != null) {
            bzq_12.a(bof_12.ehD(), n);
            bzq_12.eP(bof_12.blD());
        }
    }

    private void eqp() {
        if (this.lEb != -1) {
            XQ.bSY.qH(this.lEb);
            aiy_0.dYv.yB(this.lEb);
            this.lEb = -1;
        }
    }

    public void fy(long l) {
        XQ.bSY.clear();
        this.eqp();
        this.brw = l;
    }

    private void eqq() {
        if (this.lEe == null) {
            return;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA((short)wa_0.bhh());
        float f2 = bzq_22 == null ? 0.0f : (float)bzq_22.lEG;
        float f3 = aue_0.cVJ().cVK().getAltitude();
        short s = this.lEe.bun();
        short s2 = this.lEe.buo();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int n4 = -1; n4 < 2; n4 = (int)((short)(n4 + 1))) {
            for (int i = -1; i < 2; ++i) {
                ajo_0 ajo_02 = (ajo_0)adk.buy().x((short)(s + n4), (short)(s2 + i));
                if (ajo_02 == null) continue;
                float f4 = ajo_02.chw() * 100.0f;
                n2 += (int)((float)n4 * f4);
                n3 += (int)((float)i * f4);
                n = (int)((float)n + f4);
            }
        }
        n = (int)((float)n / 9.0f);
        acp_1 acp_12 = new acp_1(n2, n3, 0.0f).bWZ();
        cAY.eHc().a(new cCr(new aha_2(acp_12.aSc() * 10.0f, acp_12.aSd() * 10.0f, f3 - f2, true, 0), cCq.mzD, n));
    }

    public void eg(int n, int n2) {
        this.lEe = (ajo_0)adk.buy().bv(n, n2);
        this.eqq();
        caz_1.lId.P((short)(n / 18), (short)(n2 / 18));
        XQ.bSY.reset();
        aiy_0.dYv.reset();
    }

    public static bzl_2 eqr() {
        return lEg;
    }

    private adc_0 b(adc_0 adc_02) {
        if (adc_02 == null) {
            return null;
        }
        if (!this.lEc) {
            return adg_0.bup().rR(adc_02.cis);
        }
        adc_02 = new adc_0(adc_02.cis, adc_02.p, adc_02.cit, adc_02.ciu, adc_02.civ, cBi.muA.aJr(), -2, adc_02.ciy);
        return adc_02;
    }

    public adc_0 eqs() {
        return this.lEa;
    }

    public void eh(int n, int n2) {
        if (this.lEe == null) {
            return;
        }
        if (!this.lEe.bs(n, n2)) {
            this.lEe = (ajo_0)adk.buy().bv(n, n2);
            if (this.lEe != null) {
                this.eqq();
                caz_1.lId.P(this.lEe.bun(), this.lEe.buo());
            }
        }
        caz_1.lId.er(n, n2);
        int n3 = this.ei(n, n2);
        if (this.lEa != null && n3 == this.lEa.cis) {
            return;
        }
        adg_0 adg_02 = adg_0.bup();
        adc_0 adc_02 = adg_02.rR(n3);
        if (adc_02 != null) {
            cAY cAY2 = cAY.eHc();
            cAY2.cH((short)adc_02.cit);
            try {
                if (adc_02.ciu) {
                    cAY2.yj(adc_02.civ);
                } else {
                    cAY2.yj(-1);
                }
            }
            catch (Exception exception) {
                lDZ.error((Object)"Exception :", (Throwable)exception);
            }
            String string = aum_0.cWf().a(54, (long)n3, new Object[0]);
            if (!string.equals(this.p)) {
                this.p = string;
                this.ab(n, n2, n3);
            }
        } else {
            this.p = "";
        }
        fse_1.gFu().a((aef_2)this, "zoneName");
        adc_02 = this.b(adc_02);
        if (adc_02 == null ^ this.lEa == null || adc_02 != null && adc_02.ciw != this.lEa.ciw) {
            cAY.eHc().eHi();
        }
        this.JK(adc_02 == null ? -1 : adc_02.cix);
        this.lEa = adc_02;
    }

    private int ei(int n, int n2) {
        if (this.lEe == null) {
            lDZ.error((Object)("La map de coord cell(" + n + "," + n2 + ") n'est pas charg\u00e9e "));
            return -1;
        }
        if (caf_2.lFq.eqR()) {
            return 1009;
        }
        return this.lEe.bu(n, n2);
    }

    public final void iQ(boolean bl) {
        int n;
        if (this.lEa == null) {
            return;
        }
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        int n2 = n = bl ? aag_02.bqF() : 0;
        if (this.lEf == n) {
            return;
        }
        this.lEf = n;
        if (!aum_0.cWf().e(88, n)) {
            return;
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(this.p);
        if (this.lEf != 0) {
            ahv_22.ceH();
            ahv_22.ceu().yu(14);
            ahv_22.c(aum_0.cWf().a(88, (long)n, new Object[0]));
            ahv_22.cev();
        }
        this.b(ahv_22, 100, this.lEa.cis);
    }

    private boolean a(ahv_2 ahv_22, int n, int n2) {
        adc_0 adc_02 = adg_0.bup().rR(n2);
        short s = adc_02.ciy;
        if (s <= 0) {
            return false;
        }
        dgw.fcT().a(new dgs(dgx.okJ, ahv_22.ceL(), n, 2500, s));
        return true;
    }

    private void b(ahv_2 ahv_22, int n, int n2) {
        String string = this.JM(n2);
        if (string == null) {
            return;
        }
        dgw.fcT().a(new dgo(dgx.okI, ahv_22.ceL(), n, 2500, string));
    }

    private void ab(int n, int n2, int n3) {
        foP foP2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkZ() != null) {
            return;
        }
        if (this.p == null || this.p.length() == 0) {
            // empty if block
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(this.p);
        bJK bJK2 = bJJ.kmp.dN(n, n2);
        ahv_22.ceH();
        if (bJK2 != null && (foP2 = bJK2.doW()) != null) {
            ahv_22.ceu().yu(14);
            int n4 = foP2.gfT();
            bri_2 bri_22 = (bri_2)bgt_02.ffF();
            fjo_0 fjo_02 = fjt.syH.WG(n4);
            if (fjo_02 != null) {
                ahv_22.ih(brl_2.a(bri_22, fjo_02).bQk());
            } else {
                ahv_22.ih(brl_2.a(bri_22, fjo_0.sys).bQk());
            }
            ahv_22.c(aum_0.cWf().a(39, (long)n4, new Object[0]));
            ahv_22.cev();
        }
        if (!this.a(ahv_22, 500, n3)) {
            this.b(ahv_22, 500, n3);
        }
    }

    private String JM(int n) {
        adc_0 adc_02 = adg_0.bup().rR(n);
        cBi cBi2 = cBi.dT(adc_02.ciw);
        if (cBi2.eIb()) {
            return "AnimAmbiance-" + cBi2.aJr();
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(this.brw);
        int n2 = bzq_22.lEr;
        if (n2 == 0) {
            return null;
        }
        return "AnimInstance-" + n2;
    }

    public void clear() {
        this.lEe = null;
        this.p = "";
        this.lEa = null;
        this.c(false, 0);
        this.eqp();
    }

    @Override
    public String[] bxk() {
        return new String[]{"zoneName"};
    }

    @Override
    public Object eu(String string) {
        if (string.equalsIgnoreCase("zoneName")) {
            return this.p != null && this.p.length() > 0 ? this.p : null;
        }
        return null;
    }

    public String getName() {
        return this.p;
    }
}

