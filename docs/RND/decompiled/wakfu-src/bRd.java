/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bRd
extends bRf<fby_0> {
    public static final String kYZ = "iconUrl";
    public static final String kZa = "surface";
    public static final String kZb = "description";
    public static final String kZc = "sidoaNeed";
    public static final String kZd = "buildDelay";
    public static final String kZe = "conditions";
    public static final String kZf = "effects";
    public static final String kZg = "ressourcesCost";
    public static final String kZh = "evolutionName";
    public static final String[] kZi = bRd.w("iconUrl", "surface", "description", "sidoaNeed", "buildDelay", "conditions", "effects", "ressourcesCost", "evolutionName");
    private final bQI kZj;

    @Override
    public String[] bxk() {
        return kZi;
    }

    public bRd(fby_0 fby_02) {
        super(fby_02);
        this.kZj = bRb.kYS.cs(fbo_0.d(fby_02).aIi());
    }

    @Override
    public Object eu(String string) {
        Object object = super.eu(string);
        if (object != null) {
            return object;
        }
        if (string.equals(kZb)) {
            return aum_0.cWf().a(123, (long)((fby_0)this.kZu).fSr(), new Object[0]);
        }
        if (string.equals(kZe)) {
            ahv_2 ahv_22 = new ahv_2();
            bQP bQP2 = czc_2.eYH().eYQ();
            ((fby_0)this.kZu).V(new bRe(this, ahv_22));
            return ahv_22.bXe() > 0 ? ahv_22.ceL() : null;
        }
        if (string.equals(kZc)) {
            if (this.kZj == null) {
                return 0;
            }
            fbk_0 fbk_02 = this.kZj.ejU();
            if (fbk_02 == null) {
                return 0;
            }
            fbk_0 fbk_03 = fbo_0.f(fbk_02);
            ahv_2 ahv_23 = new ahv_2();
            if (this.kZt != null && this.kZt.b(fsY.teN)) {
                ahv_23.ih(awx_2.dnJ.bQk());
            }
            ahv_23.aO(fbk_03.fSc());
            return ahv_23.ceL();
        }
        if (string.equals(kZg)) {
            int n = ((fby_0)this.kZu).fSp();
            if (n == 0) {
                return null;
            }
            fbk_0 fbk_04 = fbo_0.e((fby_0)this.kZu);
            int n2 = fsl_0.b(fbk_04, bRb.kYS.ekv());
            String string2 = aum_0.cWf().cQ(n2);
            ahv_2 ahv_24 = new ahv_2();
            if (this.kZt != null && this.kZt.b(fsY.teQ)) {
                ahv_24.ih(awx_2.dnJ.bQk());
            }
            ahv_24.c(string2);
            return ahv_24.ceL();
        }
        if (string.equals(kZh)) {
            fbk_0 fbk_05 = this.ekA();
            if (fbk_05 == null) {
                return null;
            }
            fbu_0 fbu_02 = fbw_0.rSQ.eF(fbk_05.aIi());
            if (fbu_02 == null) {
                return null;
            }
            fbk_0 fbk_06 = fbw_0.rSQ.eE(fbu_02.fSk());
            if (fbk_06 == null) {
                return null;
            }
            return aum_0.cWf().a(126, (long)fbk_06.aIi(), new Object[0]);
        }
        return this.kZj.eu(string);
    }

    @Override
    public boolean ekx() {
        return this.kZt == null || !this.kZt.b(fsY.teL);
    }

    @Override
    public int eky() {
        return czc_2.eYH().cU(this.kZj.ejU().aIi());
    }

    @Override
    public String getName() {
        return this.kZj.getName();
    }

    @Override
    public bRf ekz() {
        bRd bRd2 = new bRd((fby_0)this.kZu);
        return bRd2;
    }

    public fbk_0 ekA() {
        return fbo_0.d((fby_0)this.kZu);
    }

    @Override
    public bQV ekB() {
        return bQV.kXM;
    }

    public int ekC() {
        return fbo_0.e((fby_0)this.kZu).aIi();
    }

    fsZ Jc(int n) {
        if (this.kZt == null) {
            return null;
        }
        ArrayList<fsX> arrayList = this.kZt.glx();
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            fsZ fsZ2;
            fsX fsX2 = arrayList.get(i);
            if (fsX2.glC() != fsY.teP || (fsZ2 = (fsZ)fsX2).cov() != n) continue;
            return fsZ2;
        }
        return null;
    }
}

