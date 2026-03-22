/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.log4j.Logger;

/*
 * Renamed from eSr
 */
public final class esr_0
implements esp_0 {
    private static final Logger rkd = Logger.getLogger(esr_0.class);
    private static final int rke = -50;
    private final qu_0 rkf;
    private final qu_0 rkg;
    private final eNd rkh;
    private final enk_0 rki;
    private eNd rkj;
    private eNd rkc;
    private boolean rkk;
    private int rdk;
    private boolean rhl;
    private boolean rkl;
    private int rkb;
    private int rkm;
    private int rdl;
    private int aQL;
    private boolean rkn;

    public esr_0(qu_0 qu_02, qu_0 qu_03, eNd eNd2, enk_0 enk_02) {
        this.rkg = qu_03;
        this.rkf = qu_02;
        this.rkh = eNd2;
        this.rki = enk_02;
        this.rkj = this.rkh;
        this.rkc = this.rkh;
    }

    @Override
    public void fHM() {
        int n;
        if (this.rkh == eNd.qPd) {
            this.rkc = eqb_0.a(this.rkf);
            this.rkj = eqb_0.b(this.rkg);
        } else if (this.rkh == eNd.qPe) {
            this.rkj = this.rkc = eqb_0.a(this.rkf);
        }
        int n2 = (this.rdk & 2) == 0 ? 0 : this.fHW();
        int n3 = (this.rdk & 1) == 0 ? 0 : this.fHR();
        double d2 = esr_0.aa(n2, this.rkl);
        float f2 = this.aQL;
        f2 *= (float)((double)(1.0f + (float)n3 / 100.0f) * d2);
        int n4 = this.fHZ();
        f2 *= (float)(100 + n4) / 100.0f;
        int n5 = n = (this.rdk & 1) == 0 ? 0 : this.fHY();
        int n6 = (this.rdk & 1) == 0 ? 0 : (this.rkn ? this.fHS() : 0);
        int n7 = (this.rdk & 2) == 0 ? 0 : this.fHX();
        int n8 = (this.rdk & 1) == 0 ? 0 : this.rdl;
        int n9 = Math.max(n6 + n + n8, -50);
        this.aQL = Math.max(1, VJ.bt(f2 *= (float)(100 + n9 - n7) / 100.0f));
    }

    private int fHS() {
        if (this.rkf.a(exx_2.rHx)) {
            return this.rkf.c(exx_2.rHx);
        }
        return 0;
    }

    public static double aa(int n, boolean bl) {
        double d2 = StrictMath.pow(0.8f, (float)n / 100.0f);
        double d3 = esr_0.b(d2, 2);
        return bl ? d3 : Math.max(d3, 0.1);
    }

    private static double b(double d2, int n) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        return bigDecimal.setScale(n, RoundingMode.CEILING).doubleValue();
    }

    private int fHT() {
        so_0 so_02 = this.fHV();
        if (so_02 == null) {
            return 0;
        }
        int n = 0;
        switch (so_02) {
            case bpF: {
                if (!this.rkf.a(exx_2.rGt)) break;
                n = this.rkf.c(exx_2.rGt);
            }
        }
        return n;
    }

    private int fHU() {
        so_0 so_02 = this.fHV();
        if (so_02 == null) {
            return 0;
        }
        int n = 0;
        if (so_02 == so_0.bpF && this.rkg.a(exx_2.rGu)) {
            n = this.rkg.c(exx_2.rGu);
        }
        return n;
    }

    private so_0 fHV() {
        if (this.rkc == eNd.qOY || !this.rkk) {
            return null;
        }
        sp_0 sp_02 = this.rkg.baD();
        if (sp_02 == null) {
            return null;
        }
        so_0 so_02 = sp_02.o(this.rkf.bcC(), this.rkf.bcD(), this.rkf.bcE());
        if (so_02 == null) {
            rkd.error((Object)"Impossible de r\u00e9cup\u00e9rer un partLocalisation...");
            return null;
        }
        return so_02;
    }

    private int fHW() {
        exx_2 exx_22;
        int n = this.rkm;
        n += this.fHU();
        if (this.rkg.a(exx_2.rGB)) {
            n += this.rkg.c(exx_2.rGB);
        }
        if (this.rkj != null && this.rkg.a(exx_22 = this.rkj.fAV())) {
            n += this.rkg.c(exx_22);
        }
        if (this.rhl && this.rkg.a(exx_2.rHs)) {
            n += this.rkg.c(exx_2.rHs);
        }
        return n;
    }

    private int fHR() {
        int n = this.rkb;
        n += this.fHT();
        if (this.rkf.a(exx_2.rGw)) {
            n += this.rkf.c(exx_2.rGw);
        }
        if (this.rkc != null && this.rkc != eNd.qOY) {
            n += eqb_0.a(this.rkc.fAU(), this.rkf);
        }
        if (this.rhl) {
            if (this.rkf.a(exx_2.rGR)) {
                n += this.rkf.c(exx_2.rGR);
            }
        } else if (this.rkf.a(exx_2.rHy)) {
            n += this.rkf.c(exx_2.rHy);
        }
        if (eqb_0.a(this.rki, eNi.qWJ) && this.rkf.a(exx_2.rHB)) {
            n += this.rkf.c(exx_2.rHB);
        }
        if (eqb_0.a(this.rki, eNi.qWs) && this.rkf.a(exx_2.rHC)) {
            n += this.rkf.c(exx_2.rHC);
        }
        if (eqb_0.b(this.rkf, this.rkg, this.rki) && this.rkf.a(exx_2.rHz)) {
            n += this.rkf.c(exx_2.rHz);
        }
        if (eqb_0.a(this.rkf, this.rkg, this.rki) && this.rkf.a(exx_2.rHA)) {
            n += this.rkf.c(exx_2.rHA);
        }
        if (this.rkf.a(exx_2.rHD)) {
            int n2 = eqb_0.b(this.rkf, true);
            int n3 = eqb_0.a(this.rkf, true);
            float f2 = (float)n3 / (float)n2 * 100.0f;
            if (f2 < 50.0f) {
                n += this.rkf.c(exx_2.rHD);
            }
        }
        return n;
    }

    private int fHX() {
        if (this.rkg.a(exx_2.rGP)) {
            return this.rkg.c(exx_2.rGP);
        }
        return 0;
    }

    private int fHY() {
        if (this.rkf.a(exx_2.rGO)) {
            return this.rkf.c(exx_2.rGO);
        }
        return 0;
    }

    private int fHZ() {
        so_0 so_02 = this.fHV();
        if (so_02 == null) {
            return 0;
        }
        switch (so_02) {
            case bpF: {
                return 25;
            }
            case bpH: 
            case bpG: {
                return 10;
            }
        }
        return 0;
    }

    @Override
    public eNd fHN() {
        return this.rkj;
    }

    @Override
    public eNd fHO() {
        return this.rkc;
    }

    @Override
    public int getValue() {
        return this.aQL;
    }

    @Override
    public void Si(int n) {
        this.rdk = n;
    }

    @Override
    public void mm(boolean bl) {
        this.rkk = bl;
    }

    @Override
    public void setValue(int n) {
        this.aQL = n;
    }

    @Override
    public void Sj(int n) {
        this.rdl = n;
    }

    @Override
    public void mg(boolean bl) {
        this.rhl = bl;
    }

    @Override
    public void Sk(int n) {
        this.rkm = n;
    }

    @Override
    public void Sl(int n) {
        this.rkb = n;
    }

    @Override
    public void mn(boolean bl) {
        this.rkl = bl;
    }

    @Override
    public void mo(boolean bl) {
        this.rkn = bl;
    }
}

