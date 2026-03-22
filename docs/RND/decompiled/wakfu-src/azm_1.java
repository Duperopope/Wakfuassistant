/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azm
 */
public final class azm_1 {
    private static final int dvk = 10;
    private int[] dvl;
    private int duV;
    private int cRf;
    private int duW;

    public azm_1() {
        this.dvl = new int[10];
        this.duV = 10;
        this.cRf = 0;
        this.duW = 10;
    }

    public azm_1(azm_1 azm_12) {
        this.duV = this.cRf = azm_12.cRf;
        this.dvl = new int[azm_12.cRf];
        this.duW = azm_12.duW;
    }

    public azm_1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.dvl = new int[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = 10;
    }

    public azm_1(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.dvl = new int[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = n2;
    }

    public void vL(int n) {
        this.vA(this.cRf + 1);
        this.dvl[this.cRf] = n;
        ++this.cRf;
    }

    public void s(int[] nArray) {
        int n = nArray.length;
        this.vA(this.cRf + n);
        System.arraycopy(nArray, 0, this.dvl, this.cRf, n);
        this.cRf += n;
    }

    public void e(int[] nArray, int n) {
        this.vA(this.cRf + n);
        System.arraycopy(nArray, 0, this.dvl, this.cRf, n);
        this.cRf += n;
    }

    public void b(int[] nArray, int n, int n2) {
        this.vA(this.cRf + n2);
        System.arraycopy(nArray, n, this.dvl, this.cRf, n2);
        this.cRf += n2;
    }

    public void a(azm_1 azm_12) {
        this.b(azm_12.dvl, 0, azm_12.cRf);
    }

    public void ux(int n) {
        if (n < 0 || n >= this.cRf) {
            throw new ArrayIndexOutOfBoundsException("Can't remove value outside of range (0, size). Size =" + this.cRf + " index : " + n);
        }
        if (n == this.cRf - 1) {
            --this.cRf;
            return;
        }
        System.arraycopy(this.dvl, n + 1, this.dvl, n, this.cRf - n - 1);
        --this.cRf;
    }

    public int vM(int n) {
        return this.dvl[n];
    }

    public int pF(int n) {
        if (n >= this.cRf) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.dvl[n];
    }

    public int aVo() {
        return this.cRf;
    }

    public void clear() {
        this.cRf = 0;
    }

    public int[] bTp() {
        return this.dvl;
    }

    public int[] bTq() {
        int[] nArray = new int[this.cRf];
        System.arraycopy(this.dvl, 0, nArray, 0, this.cRf);
        return nArray;
    }

    private void vA(int n) {
        if (n > this.duV) {
            this.duV = n + this.duW;
            int[] nArray = new int[this.duV];
            System.arraycopy(this.dvl, 0, nArray, 0, this.cRf);
            this.dvl = nArray;
        }
    }
}

