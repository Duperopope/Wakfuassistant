/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aCC
 */
public class acc_2
implements ach_2 {
    private final acp_1 dBC = new acp_1();
    private final acp_1 dBD = new acp_1();
    private final acp_1 dBE = new acp_1();
    private final acp_1 dBF = new acp_1();
    private long dBw;
    private long dBx;

    public acc_2() {
        this.dBx = 0L;
        this.dBw = 0L;
    }

    public acc_2(acc_2 acc_22) {
        this.dBC.m(acc_22.dBC.aSc(), acc_22.dBC.aSd(), acc_22.dBC.aSe());
        this.dBD.m(acc_22.dBD.aSc(), acc_22.dBD.aSd(), acc_22.dBD.aSe());
        this.dBE.m(acc_22.dBE.aSc(), acc_22.dBE.aSd(), acc_22.dBE.aSe());
        this.dBF.m(acc_22.dBF.aSc(), acc_22.dBF.aSd(), acc_22.dBF.aSe());
        this.dBw = acc_22.bXG();
        this.dBx = acc_22.bXF();
    }

    @Override
    public void ht(long l) {
        this.dBw = l;
    }

    @Override
    public long bXG() {
        return this.dBw;
    }

    @Override
    public void hu(long l) {
        this.dBx = l;
    }

    @Override
    public long bXF() {
        return this.dBx;
    }

    @Override
    public acp_1 bzK() {
        return this.dBC;
    }

    @Override
    public acp_1 bzL() {
        return this.dBD;
    }

    @Override
    public acp_1 bzM() {
        return this.dBE;
    }

    @Override
    public acp_1 bzN() {
        return this.dBF;
    }

    @Override
    public void b(acp_1 acp_12) {
        this.dBC.g(acp_12);
    }

    @Override
    public void c(acp_1 acp_12) {
        this.dBD.g(acp_12);
    }

    @Override
    public void d(acp_1 acp_12) {
        this.dBE.g(acp_12);
    }

    @Override
    public void e(acp_1 acp_12) {
        this.dBF.g(acp_12);
    }

    @Override
    public acp_1 fZ(long l) {
        if (l < this.dBw) {
            l = this.dBw;
        }
        if (this.dBx == this.dBw || this.dBF.bWV() == 0.0f && l >= this.dBx) {
            return new acp_1(this.dBE);
        }
        float f2 = (float)(l - this.dBw) / (float)(this.dBx - this.dBw);
        return new acp_1(this.dBC.aSc() + this.dBD.aSc() * f2, this.dBC.aSd() + this.dBD.aSd() * f2, this.dBC.aSe() + this.dBD.aSe() * f2);
    }

    public double hv(long l) {
        return (double)(l - this.dBw) / (double)(this.dBx - this.dBw);
    }

    @Override
    public long Tz() {
        return this.dBx - this.dBw;
    }

    @Override
    public List<int[]> wY(int n) {
        int n2 = 0;
        int n3 = 0;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] nArray = null;
        for (long i = this.dBw; i < this.dBx; i += (long)n) {
            acp_1 acp_12 = this.fZ(i);
            int n4 = (int)acp_12.aSc();
            int n5 = (int)acp_12.aSd();
            int n6 = (int)acp_12.aSe();
            if (i > this.dBw && n4 == n2 && n5 == n3) continue;
            nArray = new int[]{n4, n5, n6};
            arrayList.add(nArray);
            n2 = n4;
            n3 = n5;
        }
        if (!(arrayList.isEmpty() || nArray == null || (float)nArray[0] == this.dBE.aSc() && (float)nArray[1] == this.dBE.aSd() && (float)nArray[2] == this.dBE.aSe())) {
            nArray = new int[]{(int)this.dBE.aSc(), (int)this.dBE.aSd(), (int)this.dBE.aSe()};
            arrayList.add(nArray);
        }
        return arrayList;
    }

    public void hs(long l) {
        this.dBw += l;
        this.dBx += l;
    }

    public List<acc_2> Q(double d2) {
        double d3 = this.dBE.k(this.dBC).bWY();
        int n = (int)Math.ceil(d3 / d2);
        ArrayList<acc_2> arrayList = new ArrayList<acc_2>(n);
        if (n == 0) {
            arrayList.add(this);
            return arrayList;
        }
        double d4 = d3 / (double)n;
        long l = this.Tz() / (long)n;
        acp_1 acp_12 = this.dBE.k(this.dBC);
        acp_12.bWX();
        acp_1 acp_13 = this.dBC;
        long l2 = this.dBw;
        for (int i = 0; i < n; ++i) {
            acc_2 acc_22 = new acc_2();
            acc_22.b(acp_13);
            acc_22.ht(l2);
            if (i != n - 1) {
                acc_22.e(this.dBD);
                acp_1 acp_14 = acp_13.j(acp_12.dD((float)d4));
                acc_22.d(acp_14);
                acc_22.hu(l2 + l);
            } else {
                acc_22.hu(this.dBx);
                acc_22.e(this.dBF);
                acc_22.d(this.dBE);
            }
            acc_22.c(acc_22.bzM().k(acc_22.bzK()));
            l2 += l;
            acp_13 = acc_22.bzM();
            arrayList.add(acc_22);
        }
        return arrayList;
    }

    public double bXH() {
        return this.dBE.k(this.dBC).bWY();
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.dBx - this.dBw) + ") > from=" + String.valueOf(this.dBC) + ", to=" + String.valueOf(this.dBE) + ", initVel=" + String.valueOf(this.dBD) + ", finalVel=" + String.valueOf(this.dBF) + ", initialTime=" + this.dBw + ", finalTime=" + this.dBx;
    }
}

