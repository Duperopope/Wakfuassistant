/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caI
 */
class cai_1
extends ajo_0
implements fss_0 {
    private static final Logger lHj = Logger.getLogger(cai_1.class);
    static final adi[] lHk = new adi[0];
    static final adC[] lHl = new adC[0];
    static final adG[] lHm = new adG[0];
    static final adq[] lHn = new adq[0];
    private fam_0[] lHo;

    cai_1() {
    }

    @Override
    public void a(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        this.eat = fsu.e(fsu2, fsu3, fsu4, fsu5);
        cag_2 cag_22 = (cag_2)fsu2;
        cag_2 cag_23 = (cag_2)fsu3;
        cag_2 cag_24 = (cag_2)fsu4;
        cag_2 cag_25 = (cag_2)fsu5;
        this.a(this.a(cag_22, cag_23, cag_24, cag_25));
        this.a(this.c(cag_22, cag_23, cag_24, cag_25));
        this.a(this.d(cag_22, cag_23, cag_24, cag_25));
        this.a(this.b(cag_22, cag_23, cag_24, cag_25));
        this.e(cag_22, cag_23, cag_24, cag_25);
        this.ib(this.a(cag_22, cag_23, cag_24, cag_25, caj_1.lFG));
        this.ic(this.a(cag_22, cag_23, cag_24, cag_25, caj_1.lFH));
        this.id(this.a(cag_22, cag_23, cag_24, cag_25, caj_1.lFI));
        this.ie(this.a(cag_22, cag_23, cag_24, cag_25, caj_1.lFJ));
    }

    private adq[] a(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25) {
        return lHn;
    }

    private adi[] b(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25) {
        os_1[] os_1Array;
        os_1[] os_1Array2;
        os_1[] os_1Array3;
        os_1[] os_1Array4 = cag_22 == null ? lHk : cag_22.eqT().buw();
        int n = os_1Array4.length + (os_1Array3 = cag_23 == null ? lHk : cag_23.eqT().buw()).length + (os_1Array2 = cag_24 == null ? lHk : cag_24.eqT().buw()).length + (os_1Array = cag_25 == null ? lHk : cag_25.eqT().buw()).length;
        if (n == 0) {
            return lHk;
        }
        os_1[] os_1Array5 = new adi[n];
        this.a(os_1Array5, os_1Array4, os_1Array3, os_1Array2, os_1Array);
        return os_1Array5;
    }

    private adG[] c(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25) {
        os_1[] os_1Array;
        os_1[] os_1Array2;
        os_1[] os_1Array3;
        os_1[] os_1Array4 = cag_22 == null ? lHm : cag_22.eqT().but();
        int n = os_1Array4.length + (os_1Array3 = cag_23 == null ? lHm : cag_23.eqT().but()).length + (os_1Array2 = cag_24 == null ? lHm : cag_24.eqT().but()).length + (os_1Array = cag_25 == null ? lHm : cag_25.eqT().but()).length;
        if (n == 0) {
            return lHm;
        }
        os_1[] os_1Array5 = new adG[n];
        this.a(os_1Array5, os_1Array4, os_1Array3, os_1Array2, os_1Array);
        return os_1Array5;
    }

    private adC[] d(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25) {
        os_1[] os_1Array;
        os_1[] os_1Array2;
        os_1[] os_1Array3;
        os_1[] os_1Array4 = cag_22 == null ? lHl : cag_22.eqT().bus();
        int n = os_1Array4.length + (os_1Array3 = cag_23 == null ? lHl : cag_23.eqT().bus()).length + (os_1Array2 = cag_24 == null ? lHl : cag_24.eqT().bus()).length + (os_1Array = cag_25 == null ? lHl : cag_25.eqT().bus()).length;
        if (n == 0) {
            return lHl;
        }
        os_1[] os_1Array5 = new adC[n];
        this.a(os_1Array5, os_1Array4, os_1Array3, os_1Array2, os_1Array);
        return os_1Array5;
    }

    private void a(os_1[] os_1Array, os_1[] os_1Array2, os_1[] os_1Array3, os_1[] os_1Array4, os_1[] os_1Array5) {
        os_1 os_12;
        int n;
        int n2 = 0;
        for (n = 0; n < os_1Array2.length; ++n) {
            os_12 = os_1Array2[n].aXt();
            os_12.bal = (byte)(os_12.bal + 0);
            os_12.bam = (byte)(os_12.bam + 0);
            os_1Array[n2++] = os_12;
        }
        for (n = 0; n < os_1Array3.length; ++n) {
            os_12 = os_1Array3[n].aXt();
            os_12.bal = (byte)(os_12.bal + 9);
            os_12.bam = (byte)(os_12.bam + 0);
            os_1Array[n2++] = os_12;
        }
        for (n = 0; n < os_1Array4.length; ++n) {
            os_12 = os_1Array4[n].aXt();
            os_12.bal = (byte)(os_12.bal + 0);
            os_12.bam = (byte)(os_12.bam + 9);
            os_1Array[n2++] = os_12;
        }
        for (n = 0; n < os_1Array5.length; ++n) {
            os_12 = os_1Array5[n].aXt();
            os_12.bal = (byte)(os_12.bal + 9);
            os_12.bam = (byte)(os_12.bam + 9);
            os_1Array[n2++] = os_12;
        }
    }

    @Override
    public void a(@NotNull fam_0[] fam_0Array) {
        this.lHo = fam_0Array;
    }

    private long a(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25, caj_1 caj_12) {
        long l = 0L;
        short s = cag_22 == null ? (short)0 : cag_22.eqT().a(caj_12);
        short s2 = cag_23 == null ? (short)0 : cag_23.eqT().a(caj_12);
        short s3 = cag_24 == null ? (short)0 : cag_24.eqT().a(caj_12);
        short s4 = cag_25 == null ? (short)0 : cag_25.eqT().a(caj_12);
        for (int i = 0; i < 18; i += 3) {
            for (int j = 0; j < 18; j += 3) {
                int n = ewt_0.fe(i, j);
                boolean bl = this.a(i, j, s, s2, s3, s4);
                l = GC.a(l, n, bl);
            }
        }
        return l;
    }

    private boolean a(int n, int n2, short s, short s2, short s3, short s4) {
        short s5 = n < 9 ? (n2 < 9 ? s : s3) : (n2 < 9 ? s2 : s4);
        int n3 = n % 9;
        int n4 = n2 % 9;
        int n5 = ewt_0.fe(n3, n4);
        return GC.a(s5, n5);
    }

    private void e(cag_2 cag_22, cag_2 cag_23, cag_2 cag_24, cag_2 cag_25) {
        float f2 = 0.0f;
        f2 += cag_22 != null ? cag_22.eqT().chw() : 0.0f;
        f2 += cag_23 != null ? cag_23.eqT().chw() : 0.0f;
        f2 += cag_24 != null ? cag_24.eqT().chw() : 0.0f;
        this.ek(f2 += cag_25 != null ? cag_25.eqT().chw() : 0.0f);
    }

    @Override
    public short V(int n, int n2, int n3) {
        if (this.lHo.length != 0) {
            for (fam_0 fam_02 : this.lHo) {
                int n4 = n + this.ccg * 18;
                int n5 = n2 + this.cch * 18;
                if (!fam_02.am(n4, n5, n3)) continue;
                return 0;
            }
        }
        return super.V(n, n2, n3);
    }
}

