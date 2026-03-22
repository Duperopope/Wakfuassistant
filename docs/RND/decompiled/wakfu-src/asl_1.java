/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from asL
 */
public class asl_1 {
    private static final Logger cZx = Logger.getLogger(asl_1.class);
    public static final String cZy = "gColorScale";
    private final ase_1[] cZz;
    private final int[] cZA;
    private final float[] cZB;

    public static asl_1 b(asl_1 asl_12) {
        if (asl_12 == null) {
            return null;
        }
        return new asl_1(asl_12);
    }

    public float bX(String string) {
        int n = this.ge(string);
        if (n >= 0) {
            return this.cZB[n];
        }
        return 0.0f;
    }

    public asl_1(ase_1 ... ase_1Array) {
        this.cZz = new ase_1[ase_1Array.length + 1];
        this.cZz[0] = new ase_1(cZy, asf_1.cZr);
        System.arraycopy(ase_1Array, 0, this.cZz, 1, ase_1Array.length);
        int n = this.cZz.length;
        this.cZA = new int[n];
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            this.cZA[i] = n2;
            n2 += this.cZz[i].cZq.bDw();
        }
        this.cZB = new float[n2];
        this.c(cZy, 2.0f);
    }

    private asl_1(asl_1 asl_12) {
        this.cZz = (ase_1[])asl_12.cZz.clone();
        this.cZA = (int[])asl_12.cZA.clone();
        this.cZB = (float[])asl_12.cZB.clone();
    }

    public final void c(String string, float f2) {
        int n = this.ge(string);
        assert (this.gf(string) == asf_1.cZr);
        if (n >= 0) {
            this.cZB[n] = f2;
        }
    }

    public final void a(String string, float f2, float f3) {
        int n = this.ge(string);
        assert (this.gf(string) == asf_1.cZs);
        if (n >= 0) {
            this.cZB[n] = f2;
            this.cZB[n + 1] = f3;
        }
    }

    public final void a(String string, float f2, float f3, float f4) {
        int n = this.ge(string);
        assert (this.gf(string) == asf_1.cZt);
        if (n >= 0) {
            this.cZB[n] = f2;
            this.cZB[n + 1] = f3;
            this.cZB[n + 2] = f4;
        }
    }

    public final void a(String string, float f2, float f3, float f4, float f5) {
        int n = this.ge(string);
        assert (this.gf(string) == asf_1.cZu);
        if (n >= 0) {
            this.cZB[n] = f2;
            this.cZB[n + 1] = f3;
            this.cZB[n + 2] = f4;
            this.cZB[n + 3] = f5;
        }
    }

    public final void a(String string, float[] fArray) {
        this.a(string, fArray, asf_1.cZt);
    }

    public final void b(String string, float[] fArray) {
        this.a(string, fArray, asf_1.cZu);
    }

    public final void c(String string, float[] fArray) {
        this.a(string, fArray, asf_1.cZv);
    }

    public final void a(asm_1 asm_12) {
        int n = this.cZz.length;
        for (int i = 0; i < n; ++i) {
            asm_12.a(this.cZz[i], this.cZA[i], this.cZB);
        }
    }

    private void a(String string, float[] fArray, asf_1 asf_12) {
        int n = this.ge(string);
        if (n >= 0) {
            assert (this.gf(string) == asf_12);
            assert (fArray.length == asf_12.bDw());
            for (float this.cZB[n + var5_5] : fArray) {
            }
        }
    }

    private int ge(String string) {
        int n = this.cZz.length;
        for (int i = 0; i < n; ++i) {
            if (!this.cZz[i].cXV.equals(string)) continue;
            return this.cZA[i];
        }
        cZx.error((Object)("pas de variable nomm\u00e9 " + string));
        return -1;
    }

    private asf_1 gf(String string) {
        int n = this.cZz.length;
        for (int i = 0; i < n; ++i) {
            if (!this.cZz[i].cXV.equals(string)) continue;
            return this.cZz[i].cZq;
        }
        return null;
    }
}

