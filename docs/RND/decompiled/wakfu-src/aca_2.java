/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aCA
 */
public class aca_2
implements ace_2,
ach_2 {
    private acp_1 cvS = new acp_1();
    private acp_1 cvT = new acp_1();
    private acp_1 cvU = new acp_1();
    private acp_1 cvV = new acp_1();
    private float cfb;
    private float cfa;
    private float cvW;
    private float cvX;
    private float cvY;
    private float bqH;
    private float bqF;
    private float bqG;
    private float cvZ;
    private float cwa;
    private float cwb;
    private float cwc;
    private boolean cwd;
    private long dBw;
    private long dBx;

    public aca_2() {
        this.cwd = true;
    }

    public aca_2(aca_2 aca_22) {
        this.cvS.m(aca_22.cvS.aSc(), aca_22.cvS.aSd(), aca_22.cvS.aSe());
        this.cvT.m(aca_22.cvT.aSc(), aca_22.cvT.aSd(), aca_22.cvT.aSe());
        this.cvU.m(aca_22.cvU.aSc(), aca_22.cvU.aSd(), aca_22.cvU.aSe());
        this.cvV.m(aca_22.cvV.aSc(), aca_22.cvV.aSd(), aca_22.cvV.aSe());
        this.dBw = aca_22.bXG();
        this.dBx = aca_22.bXF();
        this.cwd = true;
    }

    @Override
    public acp_1 a(long l, abi_1 abi_12, anp_2 anp_22) {
        return acb_2.a(this, l, abi_12, anp_22);
    }

    @Override
    public void ht(long l) {
        this.dBw = l;
    }

    @Override
    public void hs(long l) {
        this.dBw += l;
        this.dBx += l;
    }

    @Override
    public long bXG() {
        return this.dBw;
    }

    @Override
    public boolean hr(long l) {
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.dBx - this.dBw) + ") > from=" + String.valueOf(this.cvS) + ", to=" + String.valueOf(this.cvU) + ", initVel=" + String.valueOf(this.cvT) + ", finalVel=" + String.valueOf(this.cvV) + ".";
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
        return this.cvS;
    }

    @Override
    public void b(acp_1 acp_12) {
        this.cvS = acp_12;
        this.cwd = true;
    }

    @Override
    public acp_1 bzL() {
        return this.cvT;
    }

    @Override
    public void c(acp_1 acp_12) {
        this.cvT = acp_12;
        this.cwd = true;
    }

    @Override
    public acp_1 bzM() {
        return this.cvU;
    }

    @Override
    public void d(acp_1 acp_12) {
        this.cvU = acp_12;
        this.cwd = true;
    }

    @Override
    public acp_1 bzN() {
        return this.cvV;
    }

    @Override
    public void e(acp_1 acp_12) {
        this.cvV = acp_12;
        this.cwd = true;
    }

    private void bzO() {
        float f2 = 1.0f;
        float f3 = this.cvS.aSc();
        float f4 = this.cvS.aSd();
        float f5 = this.cvS.aSe();
        float f6 = f3 + this.cvT.aSc() * 1.0f;
        float f7 = f4 + this.cvT.aSd() * 1.0f;
        float f8 = f5 + this.cvT.aSe() * 1.0f;
        float f9 = this.cvU.aSc();
        float f10 = this.cvU.aSd();
        float f11 = this.cvU.aSe();
        float f12 = f9 - this.cvV.aSc() * 1.0f;
        float f13 = f10 - this.cvV.aSd() * 1.0f;
        float f14 = f11 - this.cvV.aSe() * 1.0f;
        this.cfb = f9 - 3.0f * f12 + 3.0f * f6 - f3;
        this.cfa = 3.0f * f12 - 6.0f * f6 + 3.0f * f3;
        this.cvW = 3.0f * f6 - 3.0f * f3;
        this.cvX = f3;
        this.cvY = f10 - 3.0f * f13 + 3.0f * f7 - f4;
        this.bqH = 3.0f * f13 - 6.0f * f7 + 3.0f * f4;
        this.bqF = 3.0f * f7 - 3.0f * f4;
        this.bqG = f4;
        this.cvZ = f11 - 3.0f * f14 + 3.0f * f8 - f5;
        this.cwa = 3.0f * f14 - 6.0f * f8 + 3.0f * f5;
        this.cwb = 3.0f * f8 - 3.0f * f5;
        this.cwc = f5;
        this.cwd = false;
    }

    @Override
    public acp_1 fZ(long l) {
        if (this.cwd) {
            this.bzO();
        }
        if (l < this.dBw) {
            l = this.dBw;
        } else if (l > this.dBx) {
            l = this.dBx;
        }
        float f2 = (float)(l - this.dBw) / (float)(this.dBx - this.dBw);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return new acp_1(this.cfb * f4 + this.cfa * f3 + this.cvW * f2 + this.cvX, this.cvY * f4 + this.bqH * f3 + this.bqF * f2 + this.bqG, this.cvZ * f4 + this.cwa * f3 + this.cwb * f2 + this.cwc);
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
        if (!(arrayList.isEmpty() || nArray == null || (float)nArray[0] == this.cvU.aSc() && (float)nArray[1] == this.cvU.aSd() && (float)nArray[2] == this.cvU.aSe())) {
            nArray = new int[]{(int)this.cvU.aSc(), (int)this.cvU.aSd(), (int)this.cvU.aSe()};
            arrayList.add(nArray);
        }
        return arrayList;
    }
}

