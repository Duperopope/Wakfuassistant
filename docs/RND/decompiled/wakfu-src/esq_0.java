/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eSq
 */
public class esq_0
implements esp_0 {
    private static final Logger rjW = Logger.getLogger(esq_0.class);
    private final qu_0 rjX;
    private final qu_0 rjY;
    private final eNd rjZ;
    private final enk_0 rka;
    private int rdk;
    private boolean rhl;
    private int rkb;
    private int rdl;
    private int aQL;
    private eNd rkc;

    public esq_0(qu_0 qu_02, qu_0 qu_03, eNd eNd2, enk_0 enk_02) {
        this.rjY = qu_03;
        this.rjX = qu_02;
        this.rjZ = eNd2;
        this.rka = enk_02;
        this.rkc = this.rjZ;
    }

    @Override
    public void fHM() {
        if (this.rjZ == eNd.qPd || this.rjZ == eNd.qPe) {
            this.rkc = eqb_0.a(this.rjX);
        }
        int n = (this.rdk & 1) == 0 ? 0 : this.fHR();
        float f2 = this.aQL;
        f2 *= 1.0f + (float)n / 100.0f;
        int n2 = (this.rdk & 1) == 0 ? 0 : this.fHQ();
        int n3 = (this.rdk & 1) == 0 ? 0 : this.rdl;
        f2 = (float)((double)(f2 * (float)(100 + n2 + n3)) / 100.0);
        int n4 = (this.rdk & 2) == 0 ? 0 : this.fHP();
        f2 -= f2 * (float)n4 / 100.0f;
        this.aQL = Math.max(1, VJ.bt(f2));
    }

    private int fHP() {
        if (this.rjY.a(exx_2.rGG)) {
            return (int)((float)this.rjY.c(exx_2.rGG) / 10.0f);
        }
        return 0;
    }

    private int fHQ() {
        if (this.rjX.a(exx_2.rHK)) {
            return this.rjX.c(exx_2.rHK);
        }
        return 0;
    }

    private int fHR() {
        int n = this.rkb;
        if (this.rjX.a(exx_2.rGw)) {
            n += this.rjX.c(exx_2.rGw);
        }
        if (this.rjX.a(exx_2.rGv)) {
            n += this.rjX.c(exx_2.rGv);
        }
        if (this.rkc != null && this.rkc != eNd.qOY) {
            n += eqb_0.a(this.rkc.fAU(), this.rjX);
        }
        if (this.rhl) {
            if (this.rjX.a(exx_2.rGR)) {
                n += this.rjX.c(exx_2.rGR);
            }
        } else if (this.rjX.a(exx_2.rHy)) {
            n += this.rjX.c(exx_2.rHy);
        }
        if (eqb_0.a(this.rka, eNi.qWJ) && this.rjX.a(exx_2.rHB)) {
            n += this.rjX.c(exx_2.rHB);
        }
        if (eqb_0.a(this.rka, eNi.qWs) && this.rjX.a(exx_2.rHC)) {
            n += this.rjX.c(exx_2.rHC);
        }
        if (eqb_0.b(this.rjX, this.rjY, this.rka) && this.rjX.a(exx_2.rHz)) {
            n += this.rjX.c(exx_2.rHz);
        }
        if (eqb_0.a(this.rjX, this.rjY, this.rka) && this.rjX.a(exx_2.rHA)) {
            n += this.rjX.c(exx_2.rHA);
        }
        if (this.rjX.a(exx_2.rHD)) {
            int n2 = eqb_0.b(this.rjX, true);
            int n3 = eqb_0.a(this.rjX, true);
            float f2 = (float)n3 / (float)n2 * 100.0f;
            if (f2 < 50.0f) {
                n += this.rjX.c(exx_2.rHD);
            }
        }
        return n;
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
    }

    @Override
    public void Sl(int n) {
        this.rkb = n;
    }

    @Override
    @Nullable
    public eNd fHN() {
        return null;
    }

    @Override
    public eNd fHO() {
        return this.rkc;
    }

    @Override
    public void mn(boolean bl) {
    }

    @Override
    public void mo(boolean bl) {
    }
}

