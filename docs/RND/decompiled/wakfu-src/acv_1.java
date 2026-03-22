/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from aCv
 */
public class acv_1
implements acu_1 {
    public static final double dBi = Double.POSITIVE_INFINITY;
    private static final AffineTransform dBj = new AffineTransform();
    private static final Comparator<acs_1> dBk = new acw_1();
    private final ArrayList<acs_1> dBl = new ArrayList();
    private final CubicCurve2D dBm = new CubicCurve2D.Double();
    private final double[] dBn = new double[6];
    private String p;
    private double dBo;
    private double dBp;
    private double dBq;
    private double dBr;
    private double dBs;
    private double dBt;

    public acv_1(String string, double d2, double d3, double d4, double d5) {
        this.p = string;
        this.b(d2, d3, d4, d5);
        this.reset();
    }

    public acv_1(String string) {
        this(string, 0.0, 1.0, 0.0, 1.0);
    }

    public double bXw() {
        return this.dBs;
    }

    public double bXx() {
        return this.dBt;
    }

    public void f(double d2, double d3) {
        this.dBs = d2;
        this.dBt = d3;
    }

    public void setName(String string) {
        this.p = string;
    }

    public String getName() {
        return this.p;
    }

    public void b(acs_1 acs_12) {
        this.dBl.add(acs_12);
    }

    public void b(double d2, double d3, double d4, double d5) {
        this.dBo = d2;
        this.dBq = d3;
        this.dBp = d4;
        this.dBr = d5;
    }

    public double bXy() {
        return this.dBo;
    }

    public double bXz() {
        return this.dBp;
    }

    public double bXA() {
        return this.dBq;
    }

    public double bXB() {
        return this.dBr;
    }

    public boolean g(double d2, double d3) {
        return this.dBo <= d2 && d2 <= this.dBq && this.dBp <= d3 && d3 <= this.dBr;
    }

    void reset() {
        this.dBl.clear();
        acs_1 acs_12 = new acs_1(this.dBo, this.dBr);
        this.dBl.add(acs_12);
        acs_12 = new acs_1(this.dBq, this.dBr);
        this.dBl.add(acs_12);
        this.bXC();
    }

    @Override
    public float bY(float f2) {
        return (float)this.P(f2);
    }

    public double z(double d2) {
        if (d2 < this.dBl.get(0).bXl()) {
            return this.dBl.get(0).bXm();
        }
        for (int i = 1; i < this.dBl.size(); ++i) {
            if (!(d2 < this.dBl.get(i).bXl())) continue;
            return this.a(this.dBl.get(i - 1), this.dBl.get(i), d2);
        }
        return this.dBl.get(this.dBl.size() - 1).bXm();
    }

    public double P(double d2) {
        double d3 = this.z(d2);
        if (d3 < this.dBp) {
            return this.dBp;
        }
        if (d3 > this.dBr) {
            return this.dBr;
        }
        return d3;
    }

    public PathIterator a(acs_1 acs_12, acs_1 acs_13) {
        this.dBm.setCurve(acs_12.bXl(), acs_12.bXm(), acs_12.bXp(), acs_12.bXq(), acs_13.bXn(), acs_13.bXo(), acs_13.bXl(), acs_13.bXm());
        return this.dBm.getPathIterator(dBj, 0.01);
    }

    private double a(acs_1 acs_12, acs_1 acs_13, double d2) {
        PathIterator pathIterator = this.a(acs_12, acs_13);
        double d3 = acs_12.bXl();
        double d4 = acs_12.bXm();
        while (!pathIterator.isDone()) {
            pathIterator.currentSegment(this.dBn);
            pathIterator.next();
            if (d2 < this.dBn[0]) {
                double d5 = (d2 - d3) / (this.dBn[0] - d3);
                return GC.a(d4, this.dBn[1], d5);
            }
            d3 = this.dBn[0];
            d4 = this.dBn[1];
        }
        double d6 = (d2 - d3) / (acs_13.bXl() - d3);
        return GC.a(d4, acs_13.bXm(), d6);
    }

    public boolean c(acs_1 acs_12) {
        if (this.dBl.size() == 2) {
            return false;
        }
        for (int i = this.dBl.size() - 1; i >= 0; --i) {
            if (this.dBl.get(i) != acs_12) continue;
            if (i == this.dBl.size() - 1) {
                this.dBl.get(i - 1).N(1.0);
            }
            if (i == 0) {
                this.dBl.get(1).N(0.0);
            }
            this.dBl.remove(i);
            break;
        }
        return true;
    }

    public int d(acs_1 acs_12) {
        for (int i = 0; i < this.dBl.size(); ++i) {
            if (this.dBl.get(i) != acs_12) continue;
            return i;
        }
        return -1;
    }

    public void bXC() {
        this.dBl.sort(dBk);
    }

    public acs_1 wX(int n) {
        return this.dBl.get(n);
    }

    public int aVo() {
        return this.dBl.size();
    }

    public void clear() {
        this.dBl.clear();
    }

    public acv_1 bXD() {
        acv_1 acv_12 = new acv_1("");
        acv_12.a(this);
        return acv_12;
    }

    public void a(acv_1 acv_12) {
        this.p = acv_12.p;
        this.clear();
        this.dBo = acv_12.dBo;
        this.dBq = acv_12.dBq;
        this.dBp = acv_12.dBp;
        this.dBr = acv_12.dBr;
        for (int i = 0; i < acv_12.aVo(); ++i) {
            this.b(acv_12.wX(i).bXv());
        }
    }

    public void bq(float f2, float f3) {
        if ((double)f2 == this.dBo && (double)f3 == this.dBq) {
            return;
        }
        double d2 = (double)(f3 - f2) / (this.dBq - this.dBo);
        double d3 = (double)f2 - this.dBo * d2;
        for (int i = 0; i < this.aVo(); ++i) {
            acs_1 acs_12 = this.wX(i);
            acs_12.a(acs_12.bXl() * d2 + d3, acs_12.bXm());
            if (acs_12.bXs()) {
                acs_12.b(acs_12.bXn() * d2 + d3, acs_12.bXo());
            }
            if (!acs_12.bXt()) continue;
            acs_12.c(acs_12.bXp() * d2 + d3, acs_12.bXq());
        }
        this.dBo = f2;
        this.dBq = f3;
    }

    public void b(acv_1 acv_12) {
        if (acv_12 == this) {
            return;
        }
        this.clear();
        double d2 = this.dBr == Double.POSITIVE_INFINITY ? 1.0 : this.dBr;
        double d3 = this.dBp == Double.POSITIVE_INFINITY ? 1.0 : this.dBp;
        double d4 = acv_12.dBq - acv_12.dBo;
        double d5 = (this.dBq - this.dBo) / d4;
        double d6 = acv_12.dBr - acv_12.dBp;
        double d7 = (d2 - this.dBp) / d6;
        double d8 = this.dBo - acv_12.dBo * d5;
        double d9 = this.dBp - acv_12.dBp * d7;
        for (int i = 0; i < acv_12.aVo(); ++i) {
            acs_1 acs_12 = acv_12.wX(i).bXv();
            acs_12.a(acs_12.bXl() * d5 + d8, acs_12.bXm() * d7 + d9);
            if (acs_12.bXs()) {
                acs_12.b(acs_12.bXn() * d5 + d8, acs_12.bXo() * d7 + d9);
            }
            if (acs_12.bXt()) {
                acs_12.c(acs_12.bXp() * d5 + d8, acs_12.bXq() * d7 + d9);
            }
            this.b(acs_12);
        }
    }

    public boolean c(acv_1 acv_12) {
        if (acv_12.aVo() != this.aVo()) {
            return false;
        }
        if (this.dBo != acv_12.dBo || this.dBq != acv_12.dBq) {
            return false;
        }
        if (this.dBp != acv_12.dBp || this.dBr != acv_12.dBr) {
            return false;
        }
        for (int i = 0; i < this.aVo(); ++i) {
            if (this.wX(i).a(acv_12.wX(i))) continue;
            return false;
        }
        return true;
    }

    public boolean bDp() {
        for (int i = 0; i < this.dBl.size() - 1; ++i) {
            acs_1 acs_12 = this.dBl.get(i);
            double d2 = acs_12.bXm();
            if (d2 != this.dBl.get(i + 1).bXm()) {
                return false;
            }
            if (acs_12.bXs() && acs_12.bXo() != d2) {
                return false;
            }
            if (!acs_12.bXt() || acs_12.bXq() == d2) continue;
            return false;
        }
        return true;
    }

    public boolean bWq() {
        for (int i = 0; i < this.dBl.size(); ++i) {
            acs_1 acs_12 = this.dBl.get(i);
            if (acs_12.bXl() != acs_12.bXm()) {
                return false;
            }
            if (acs_12.bXs()) {
                return false;
            }
            if (!acs_12.bXt()) continue;
            return false;
        }
        return true;
    }

    public double[] bXE() {
        double[] dArray = new double[]{Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (int i = 0; i < this.dBl.size() - 1; ++i) {
            acs_1 acs_12 = this.dBl.get(i);
            acs_1 acs_13 = this.dBl.get(i + 1);
            PathIterator pathIterator = this.a(acs_12, acs_13);
            while (!pathIterator.isDone()) {
                pathIterator.currentSegment(this.dBn);
                pathIterator.next();
                if (this.dBn[1] < dArray[0]) {
                    dArray[0] = this.dBn[1];
                }
                if (!(this.dBn[1] > dArray[1])) continue;
                dArray[1] = this.dBn[1];
            }
        }
        return dArray;
    }

    public String toString() {
        return acx_1.d(this);
    }

    public /* synthetic */ Object clone() {
        return this.bXD();
    }
}

