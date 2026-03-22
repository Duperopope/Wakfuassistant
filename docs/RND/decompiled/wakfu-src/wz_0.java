/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Wz
 */
public class wz_0 {
    protected final ArrayList<wy_0> bOr = new ArrayList();
    protected int bro;
    protected int brp;
    protected int brq;
    protected int brr;
    protected int brs;
    protected int brt;

    public wz_0() {
        this.reset();
    }

    public ww_0 aO(int n, int n2) {
        if (n < this.bro || n >= this.bro + this.brs) {
            return null;
        }
        if (n2 < this.brp || n2 >= this.brp + this.brt) {
            return null;
        }
        wy_0 wy_02 = this.aP(n, n2);
        if (wy_02 != null) {
            return wy_02.bmp();
        }
        return null;
    }

    public boolean aK(int n, int n2) {
        return n >= this.bro && n < this.bro + this.brs && n2 >= this.brp && n2 < this.brp + this.brt;
    }

    public wy_0 aP(int n, int n2) {
        int n3 = this.ad(n, n2);
        if (n3 < 0 || n3 >= this.bOr.size()) {
            return null;
        }
        return this.bOr.get(n3);
    }

    public boolean g(int n, int n2, short s) {
        wy_0 wy_02 = this.aP(n, n2);
        return wy_02 == null || wy_02.u(n, n2, s);
    }

    public boolean h(int n, int n2, short s) {
        wy_0 wy_02 = this.aP(n, n2);
        return wy_02 == null || wy_02.u(n, n2, s);
    }

    public int bgm() {
        return this.bro;
    }

    public int bgn() {
        return this.brp;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    public int bgo() {
        return this.bgm() + this.getWidth() - 1;
    }

    public int bgp() {
        return this.bgn() + this.getHeight() - 1;
    }

    public void reset() {
        this.bOr.clear();
        this.bro = Integer.MAX_VALUE;
        this.brp = Integer.MAX_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.brr = Integer.MIN_VALUE;
        this.brs = 0;
        this.brt = 0;
    }

    public void a(wy_0 wy_02, int n, int n2) {
        this.bOr.add(wy_02);
        n2 *= 18;
        if ((n *= 18) < this.bro) {
            this.bro = n;
        }
        if (n > this.brq) {
            this.brq = n;
        }
        if (n2 < this.brp) {
            this.brp = n2;
        }
        if (n2 > this.brr) {
            this.brr = n2;
        }
        this.brs = 18 + this.brq - this.bro;
        this.brt = 18 + this.brr - this.brp;
        assert (this.bOr.size() < 100) : "C'est pas un peu abus\u00e9, comme taille : " + this.bOr.size() + " ?????";
        assert (this.ad(n, n2) == this.bOr.size() - 1) : " Map ajout\u00e9e non valide. index : " + this.ad(n, n2) + " attendu : " + (this.bOr.size() - 1);
    }

    protected int ad(int n, int n2) {
        if (n < this.bro) {
            return -1;
        }
        if (n2 < this.brp) {
            return -1;
        }
        int n3 = (n - this.bro) / 18;
        int n4 = (n2 - this.brp) / 18;
        assert (n3 >= 0);
        assert (n4 >= 0);
        return n4 * (this.brs / 18) + n3;
    }
}

