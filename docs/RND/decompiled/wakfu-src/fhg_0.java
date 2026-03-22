/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from fhG
 */
public class fhg_0 {
    private final int spI;
    private final Set<ffS> spJ = new HashSet<ffS>();
    private rd_0 iRT;
    private int[] spK;
    private int[] spL;
    private boolean spM = false;

    public fhg_0(int n) {
        this.spI = n;
    }

    public fhg_0 np(boolean bl) {
        this.spM = bl;
        return this;
    }

    public fhg_0 f(rd_0 rd_02) {
        this.iRT = rd_02;
        return this;
    }

    public fhg_0 w(ffS ffS2) {
        this.spJ.add(ffS2);
        return this;
    }

    public fhg_0 R(int[] nArray) {
        this.spK = nArray;
        return this;
    }

    public fhg_0 S(int[] nArray) {
        this.spL = nArray;
        return this;
    }

    public int AK() {
        return this.spI;
    }

    public boolean fYE() {
        return this.spM;
    }

    public boolean x(ffS ffS2) {
        return this.spJ.contains(ffS2);
    }

    public Set<ffS> fYF() {
        return this.spJ;
    }

    public rd_0 dBe() {
        return this.iRT;
    }

    public int Fq() {
        return this.spK.length;
    }

    public int Vx(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid level : " + n);
        }
        if (n == 0 || n - 1 >= this.spK.length) {
            return 0;
        }
        return this.spK[n - 1];
    }

    public int Vy(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid level : " + n);
        }
        int n2 = 0;
        int n3 = Math.min(n, this.spK.length);
        for (int i = 0; i < n3; ++i) {
            n2 += this.spK[i];
        }
        return n2;
    }

    public short Vz(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid amount : " + n);
        }
        if (this.spK.length == 0) {
            return 0;
        }
        if (this.spK[0] > n) {
            return 0;
        }
        int n2 = 0;
        for (int i = 0; i < this.spK.length; ++i) {
            if ((n2 += this.spK[i]) <= n) continue;
            return (short)i;
        }
        return (short)this.spK.length;
    }

    public int[] fYG() {
        return this.spL;
    }

    public int VA(int n) {
        for (int i = 0; i < this.spL.length; ++i) {
            if (this.spL[i] <= n) continue;
            return i;
        }
        return this.spL.length;
    }

    public int VB(int n) {
        if (n < 0 || n >= this.spL.length) {
            return -1;
        }
        return this.spL[n];
    }
}

