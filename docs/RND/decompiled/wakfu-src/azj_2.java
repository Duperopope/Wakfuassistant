/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azj
 */
public class azj_2 {
    private static final int dvb = 10;
    protected float[] dvc;
    protected int duV;
    protected int cRf;
    protected int duW;

    public azj_2() {
        this.dvc = new float[10];
        this.duV = 10;
        this.cRf = 0;
        this.duW = 10;
    }

    public azj_2(azj_2 azj_22) {
        this.duV = this.cRf = azj_22.cRf;
        this.dvc = new float[azj_22.cRf];
        this.duW = azj_22.duW;
    }

    public azj_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.dvc = new float[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = 10;
    }

    public azj_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.dvc = new float[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = n2;
    }

    public void dj(float f2) {
        this.vA(this.cRf + 1);
        this.dvc[this.cRf] = f2;
        ++this.cRf;
    }

    public void X(float[] fArray) {
        int n = fArray.length;
        this.vA(this.cRf + n);
        System.arraycopy(fArray, 0, this.dvc, this.cRf, n);
        this.cRf += n;
    }

    public void i(float[] fArray, int n) {
        this.vA(this.cRf + n);
        System.arraycopy(fArray, 0, this.dvc, this.cRf, n);
        this.cRf += n;
    }

    public void c(float[] fArray, int n, int n2) {
        this.vA(this.cRf + n2);
        System.arraycopy(fArray, n, this.dvc, this.cRf, n2);
        this.cRf += n2;
    }

    public void a(azj_2 azj_22) {
        this.c(azj_22.dvc, 0, azj_22.cRf);
    }

    public float vH(int n) {
        if (n >= this.cRf) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.dvc[n];
    }

    public int aVo() {
        return this.cRf;
    }

    public float[] bTi() {
        return this.dvc;
    }

    public float[] bTj() {
        float[] fArray = new float[this.cRf];
        System.arraycopy(this.dvc, 0, fArray, 0, this.cRf);
        return fArray;
    }

    private void vA(int n) {
        if (n > this.duV) {
            this.duV = n + this.duW;
            float[] fArray = new float[this.duV];
            System.arraycopy(this.dvc, 0, fArray, 0, this.cRf);
            this.dvc = fArray;
        }
    }
}

