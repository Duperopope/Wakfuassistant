/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cRS
 */
public abstract class crs_2
implements adi_1 {
    private static Logger oO = Logger.getLogger(crs_2.class);
    protected bgy htx = null;
    protected ake_0 nDR = null;
    public static final byte nDS = 0;
    public static final byte nDT = 1;
    public static final byte nDU = 2;
    private acd_1 nDV = null;
    private boolean nDW = false;

    protected crs_2() {
    }

    public void bW(bgy bgy2) {
        this.htx = bgy2;
    }

    protected abstract Qk bbf();

    protected abstract void ad(int var1, int var2, short var3);

    protected abstract void eMY();

    protected abstract byte eMZ();

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void eNa() {
        if (this.nDR != null) {
            this.nDR.ciS();
        }
        this.eNg();
    }

    protected abstract String eNb();

    protected abstract String eNc();

    @Nullable
    public acd_1 eNd() {
        return this.nDV;
    }

    public bgy eNe() {
        return this.htx;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17000: {
                this.eNf();
                return true;
            }
            case 16902: {
                if (this.htx == null) {
                    return true;
                }
                dcm_0 dcm_02 = (dcm_0)aam_22;
                acd_1 acd_12 = cub_1.eSi().eF(dcm_02.bqM(), dcm_02.bqN());
                acd_1 acd_13 = cub_1.eSi().eSj();
                if (Objects.equals(acd_13, acd_12) && dcm_02.fch()) {
                    this.eNi();
                }
                aue_0.cVJ().b(this);
            }
        }
        return true;
    }

    private void eNf() {
        this.eNk();
        bgy bgy2 = (bgy)this.htx.dkZ().ax(this.nDV);
        bgy bgy3 = (bgy)this.htx.dkZ().ax(cub_1.eSi().eSj());
        if (bgy3 == bgy2) {
            return;
        }
        if (bgy2 != null) {
            bdn_2.d(bgy2.ddI());
        }
        if (bgy3 != null) {
            this.nDV = new acd_1(cub_1.eSi().eSj());
            bdn_2.c(bgy3.ddI());
        } else {
            this.nDV = null;
        }
        this.eNg();
    }

    private void eNg() {
        fib_2.gBU().eKH();
        String string = this.eNc();
        if (string != null) {
            this.ap(string, this.eNb());
        } else {
            fhn_1.gzT().bYz();
        }
        this.eNh();
    }

    private void eNh() {
        fib_2.gBU().setText(this.eNb());
    }

    public void eNi() {
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        short s = 0;
        acd_1 acd_12 = cub_1.eSi().eSj();
        if (acd_12 != null && this.nDR.M(acd_12)) {
            n = acd_12.getX();
            n2 = acd_12.getY();
            s = acd_12.bdi();
            bl = true;
        }
        if (bl) {
            this.ad(n, n2, s);
            this.eMY();
        }
        aue_0.cVJ().b(this);
    }

    public boolean eNj() {
        return this.nDW;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!this.nDW) {
            acd_1 acd_12;
            bdj_2 bdj_22;
            WP wP;
            this.nDW = true;
            cue_2.eSA().eSI();
            if (aue_0.cVJ().c(cue_2.eSA())) {
                aue_0.cVJ().b(cue_2.eSA());
            }
            if ((wP = cxq_1.eWO().eWP()) instanceof bdj_2 && amf_1.c((amg_1)(bdj_22 = (bdj_2)wP), acd_12 = cub_1.eSi().eSj()) > 0) {
                bdn_2.d(bdj_22);
            }
            this.eNf();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (this.nDW) {
            ZH zH;
            Object object;
            this.nDR.ciS();
            fhn_1.gzT().bYz();
            fib_2.gBU().eKH();
            aue_0.cVJ().a(cue_2.eSA());
            this.nDW = false;
            WP wP = cxq_1.eWO().eWP();
            if (wP instanceof bdj_2 && !((ZH)(object = (bdj_2)wP)).bqr()) {
                bdn_2.d((bdj_2)object);
            }
            if ((zH = ((aIs)(object = (aIs)aie_0.cfn().bmC())).cgz()) != null && zH instanceof bdj_2) {
                bdn_2.c((bdj_2)zH);
            }
        }
    }

    private void ap(String string, String string2) {
        if (string == null) {
            return;
        }
        switch (this.eMZ()) {
            case 0: 
            case 2: {
                fhn_1.gzT().a(fzo_0.tHz, true);
                break;
            }
            case 1: {
                fhn_1.gzT().a(fzo_0.tHt, true);
            }
        }
        fib_2.gBU().a(string, string2, 10, -30, faa_2.tLK);
    }

    public void eNk() {
        acd_1 acd_12 = cub_1.eSi().eSj();
        if (acd_12 != null && this.nDR.M(acd_12)) {
            this.nDR.b(Collections.singletonList((eNl)this.bbf()), this.htx, acd_12);
        } else {
            this.nDR.ciT();
        }
    }

    public void eNl() {
        this.eNg();
        this.nDR.ciS();
    }

    public abstract boolean eNm();

    public void eNn() {
        if (!this.eNj()) {
            return;
        }
        this.eNa();
    }
}

