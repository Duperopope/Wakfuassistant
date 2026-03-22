/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class fqN {
    private static final int sVG = 1;
    private final Map<exx_2, fqG> sVH = new HashMap<exx_2, fqG>(1);
    private fqG sVI;
    private fqG sVJ;
    private boolean est;
    private boolean esu;
    private boolean esv;
    private boolean sVK;
    private float esx;
    private float esy;
    private float esz;
    private float esA;
    private boolean esB;
    private boolean esC;
    private boolean esD;
    private boolean esm;

    public fqN() {
    }

    public fqN(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(exx_2.rGj, f2, f3);
        this.a(exx_2.rGk, f6, f7);
        this.a(exx_2.rGl, f4, f5);
    }

    public void a(exx_2 exx_22, float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        this.sVH.put(exx_22, new fqG(f2, f3));
    }

    public float p(exx_2 exx_22) {
        fqG fqG2 = this.sVH.get(exx_22);
        if (fqG2 == null) {
            return 0.0f;
        }
        return fqG2.giT();
    }

    public float q(exx_2 exx_22) {
        fqG fqG2 = this.sVH.get(exx_22);
        if (fqG2 == null) {
            return 0.0f;
        }
        return fqG2.cwh();
    }

    public int c(exx_2 exx_22, int n) {
        fqG fqG2 = this.sVH.get(exx_22);
        return fqG2 == null ? 0 : fqG2.Ph(n);
    }

    public Map<exx_2, fqG> giX() {
        return this.sVH;
    }

    public fqG giY() {
        return this.sVJ;
    }

    public void bD(float f2, float f3) {
        this.sVJ = new fqG(f2, f3);
    }

    public fqG giZ() {
        return this.sVI;
    }

    public void bE(float f2, float f3) {
        this.sVI = new fqG(f2, f3);
    }

    public boolean cvV() {
        return this.est;
    }

    public void nK(boolean bl) {
        this.est = bl;
    }

    public boolean cvW() {
        return this.esu;
    }

    public boolean cvX() {
        return this.esv;
    }

    public void nL(boolean bl) {
        this.esu = bl;
    }

    public void nM(boolean bl) {
        this.esv = bl;
    }

    public boolean gja() {
        return this.sVK;
    }

    public void nN(boolean bl) {
        this.sVK = bl;
    }

    public float cvZ() {
        return this.esx;
    }

    public void fh(float f2) {
        this.esx = f2;
    }

    public float cwa() {
        return this.esy;
    }

    public void fi(float f2) {
        this.esy = f2;
    }

    public float cwb() {
        return this.esz;
    }

    public void fj(float f2) {
        this.esz = f2;
    }

    public float cwc() {
        return this.esA;
    }

    public void fk(float f2) {
        this.esA = f2;
    }

    public boolean cwd() {
        return this.esB;
    }

    public void nO(boolean bl) {
        this.esB = bl;
    }

    public boolean cwe() {
        return this.esC;
    }

    public void nP(boolean bl) {
        this.esC = bl;
    }

    public boolean cwf() {
        return this.esD;
    }

    public void nQ(boolean bl) {
        this.esD = bl;
    }

    public boolean cvO() {
        return this.esm;
    }

    public void nR(boolean bl) {
        this.esm = bl;
    }
}

