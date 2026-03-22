/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from abJ
 */
public class abj_0
extends acw_0 {
    private static final int cep = 64;
    private final float[] ceq = new float[4096];
    private agf bUu;
    private float cer;
    private float ces;
    private float aAx = 0.0f;
    private float aAy = 0.0f;
    private int cet;
    private int ceu;
    private int cev;
    private int cew;
    private final acp_1 cex = new acp_1(-1.0f, 0.5f, 0.0f);
    private boolean cey = false;
    float cez = 0.5f;
    float ceA = 0.5f;
    float ceB = 0.1f;
    private int ceC = Integer.MIN_VALUE;
    private int ceD = Integer.MIN_VALUE;
    private float ceE;
    private float ceF;
    private float ceG;
    private float ceH;
    private final abw_1 ceI = new abk_0(this);
    private final abg_0 ceJ = new abg_0("cloud.tga", this.ceI);
    private final abi_0 ceK = this.ceJ;

    public abj_0() {
        this.cev = Integer.MAX_VALUE;
        this.cew = Integer.MAX_VALUE;
        Arrays.fill(this.ceq, 1.0f);
    }

    public void eh(String string) {
        if (this.ceK == this.ceJ) {
            this.ceJ.ei(string);
        }
    }

    public void b(agf agf2) {
        this.bUu = agf2;
    }

    public void aH(float f2, float f3) {
        this.cex.m(f2, f3, 0.0f);
    }

    public void cb(float f2) {
        if (!GC.e(f2, this.ceA)) {
            this.ceA = f2;
            this.cey = true;
        }
    }

    public void cc(float f2) {
        if (!GC.e(f2, this.cez)) {
            this.cez = f2;
            this.cey = true;
        }
    }

    public void cd(float f2) {
        if (!GC.e(f2 = GC.b(f2, 0.0f, 1.0f), this.ceB)) {
            this.ceB = f2;
            this.cey = true;
        }
    }

    @Override
    public void btl() {
        agf agf2 = this.bUu;
        if (agf2 == null) {
            return;
        }
        this.cev = GC.B(agf2.bsf()) - 32;
        this.cew = GC.B(agf2.bsg()) - 32;
        this.btm();
        int n = this.cev + this.cet;
        int n2 = this.cew + this.ceu;
        if (this.ceC != n || this.ceD != n2 || this.cey) {
            this.ceK.a(this.ceq, 64, 64, n, n2);
        }
        this.cey = false;
        this.ceC = n;
        this.ceD = n2;
    }

    @Override
    public void qF(int n) {
        float f2 = (float)n / 1000.0f;
        this.cer = this.cex.aSc() * f2;
        this.ces = this.cex.aSd() * f2;
    }

    private void btm() {
        this.aAx -= this.cer;
        this.aAy -= this.ces;
        int n = GC.B(this.aAx);
        this.cet += n;
        this.aAx -= (float)n;
        int n2 = GC.B(this.aAy);
        this.ceu += n2;
        this.aAy -= (float)n2;
        float f2 = this.aAx;
        float f3 = this.aAy;
        this.ceE = (1.0f - f2) * (1.0f - f3);
        this.ceF = (1.0f - f2) * f3;
        this.ceG = f2 * (1.0f - f3);
        this.ceH = f2 * f3;
    }

    @Override
    public int bpb() {
        return 100;
    }

    @Override
    public boolean bpa() {
        return this.cez == 0.0f && this.ceA == 0.0f;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        try {
            float[] fArray2 = this.ceq;
            int n5 = n - this.cev;
            if ((n5 %= 64) < 0) {
                n5 += 64;
            }
            int n6 = (n5 + 1) % 64;
            int n7 = n2 - this.cew;
            if ((n7 %= 64) < 0) {
                n7 += 64;
            }
            int n8 = (n7 + 1) % 64;
            int n9 = n5 + n7 * 64;
            int n10 = n5 + n8 * 64;
            int n11 = n6 + n7 * 64;
            int n12 = n6 + n8 * 64;
            float f2 = this.ceE * fArray2[n9] + this.ceF * fArray2[n10] + this.ceG * fArray2[n11] + this.ceH * fArray2[n12];
            fArray[0] = fArray[0] * f2;
            fArray[1] = fArray[1] * f2;
            fArray[2] = fArray[2] * f2;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

