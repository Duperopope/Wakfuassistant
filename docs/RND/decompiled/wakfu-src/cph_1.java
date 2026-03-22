/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cPH
 */
public class cph_1
implements fis_1 {
    private static final Logger nhW = Logger.getLogger(cph_1.class);
    private final aat_1<ZH> nhX = new aat_1();
    private final aat_1<crd_1> nhY = new aat_1();
    private final aat_1<cpm_1[]> nhZ = new aat_1();
    private short nia = 0;
    private int nib = 0;
    private fdp_1 nic = null;

    public void dET() {
        this.nic = fyw_0.gqw().gqM();
        this.nic.a(fzq_0.tKc, this, true);
        this.nic.a(fzq_0.tKf, this, false);
        if (this.nhY != null && this.nhY.bTW() > 0) {
            this.nic.setRadius(this.nhY.wD(this.nhY.bTW() - 1).chU());
        } else {
            this.nic.setRadius(0);
        }
        ZH zH = null;
        Object var2_2 = null;
        for (short s = 0; s < this.nhX.bTW(); s = (short)(s + 1)) {
            cpm_1[] cpm_1Array;
            int n = 0;
            crd_1 crd_12 = this.nhY.aL(s);
            if (crd_12 != null) {
                cpm_1Array = crd_12.chR();
                if (cpm_1Array == null) continue;
                if (zH == null) {
                    zH = this.nhX.aL(s);
                }
                for (int i = 0; i < cpm_1Array.length; ++i) {
                    cpm_1 cpm_12 = cpm_1Array[i];
                    cpm_12.aH(crd_12);
                    int n2 = 0;
                    try {
                        n2 = cpm_12.isUsable() ? 1 : 0;
                    }
                    catch (Exception exception) {
                        nhW.error((Object)("Exception lev\u00e9e en d\u00e9terminant si l'action " + cpm_12.getClass().getSimpleName() + " est usable"), (Throwable)exception);
                    }
                    int n3 = 0;
                    try {
                        n3 = cpm_12.bxO() ? 1 : 0;
                    }
                    catch (Exception exception) {
                        nhW.error((Object)("Exception lev\u00e9e en d\u00e9terminant si l'action " + cpm_12.getClass().getSimpleName() + " est runnable"), (Throwable)exception);
                    }
                    if (n2 == 0 || n3 == 0) continue;
                    if (n % 8 == 0) {
                        this.nic.gvb();
                    }
                    ++n;
                    this.nic.a(null, cpm_12.eLC(), cpm_12.eLv(), null, cpm_12.getStyle(), cpm_12.eLy(), new cpi_1(this, cpm_12), cpm_12.isEnabled());
                }
                continue;
            }
            cpm_1Array = this.nhZ.aL(s);
            if (cpm_1Array == null) continue;
            ZH zH2 = this.nhX.aL(s);
            for (cpm_1 cpm_13 : cpm_1Array) {
                if (!cpm_13.isUsable() || !cpm_13.bxO()) continue;
                if (zH == null) {
                    zH = zH2;
                }
                if (n % 8 == 0) {
                    this.nic.gvb();
                }
                ++n;
                this.nic.a(null, cpm_13.eLC(), cpm_13.eLv(), null, cpm_13.getStyle(), cpm_13.eLy(), new cpj_1(this, cpm_13), cpm_13.isEnabled());
            }
        }
        if (this.nic.getGroupSize() > 0) {
            cAY.eHc().nP(600072L);
            var2_2 = null;
            if (var2_2 != null) {
                fyw_0.gqw().a(this.nic, var2_2.x, var2_2.y);
            } else {
                fyw_0.gqw().a(this.nic);
            }
        }
        if (zH != null && zH.bqs()) {
            aIp.c(zH);
        }
    }

    public void a(crd_1 crd_12, ZH zH) {
        cpm_1[] cpm_1Array = crd_12.chR();
        if (cpm_1Array == null || cpm_1Array.length == 0) {
            return;
        }
        this.nhX.a(this.nia, zH);
        this.nhY.a(this.nia, crd_12);
        this.nia = (short)(this.nia + 1);
    }

    public void a(cpm_1[] cpm_1Array, ZH zH) {
        this.nhX.a(this.nia, zH);
        this.nhZ.a(this.nia, cpm_1Array);
        this.nia = (short)(this.nia + 1);
    }

    public final int eLr() {
        return this.nhY.bTW();
    }

    public final crd_1 Mh(int n) {
        return this.nhY.wD(n);
    }

    public final boolean eLs() {
        return this.nhY.bTW() > 0 || this.nhZ.bTW() > 0;
    }

    public void eLt() {
        if (this.nic != null) {
            this.nic.gAD();
            this.nic = null;
            this.bmX();
        }
    }

    private void bmX() {
        cwd_2.eVe().a((cph_1)null);
        for (short s = 0; s < this.nhX.bTW(); s = (short)(s + 1)) {
            ZH zH = this.nhX.aL(s);
            if (zH == null) continue;
            zH.bpV();
        }
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tKc) {
            ZH zH;
            fly_2 fly_22 = (fly_2)fiq_12;
            if (fly_22.gEv() < this.nhX.bTW() && (zH = this.nhX.aL((short)fly_22.gEv())) != null && zH.bqs()) {
                aIp.c(zH);
            }
            if ((zH = this.nhX.aL((short)this.nib)) != null) {
                zH.bpV();
            }
            this.nib = fly_22.gEv();
        }
        if (fiq_12.gBy() == fzq_0.tKf) {
            this.bmX();
        }
        return true;
    }
}

