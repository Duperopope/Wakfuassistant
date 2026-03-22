/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aCz
 */
public class acz_2
implements ach_2 {
    protected static final Logger dBz = Logger.getLogger(acz_2.class);
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
    private float aQa;
    private boolean cwd;
    private long dBw;
    private long dBx;

    public acz_2() {
        this.cwd = true;
    }

    public acz_2(acz_2 acz_22) {
        this.cvS.m(acz_22.cvS.aSc(), acz_22.cvS.aSd(), acz_22.cvS.aSe());
        this.cvT.m(acz_22.cvT.aSc(), acz_22.cvT.aSd(), acz_22.cvT.aSe());
        this.cvU.m(acz_22.cvU.aSc(), acz_22.cvU.aSd(), acz_22.cvU.aSe());
        this.cvV.m(acz_22.cvV.aSc(), acz_22.cvV.aSd(), acz_22.cvV.aSe());
        this.dBw = acz_22.bXG();
        this.dBx = acz_22.bXF();
        this.cwd = true;
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
        float f5 = f3 + this.cvT.aSc() * 1.0f;
        float f6 = f4 + this.cvT.aSd() * 1.0f;
        float f7 = this.cvU.aSc();
        float f8 = this.cvU.aSd();
        float f9 = f7 - this.cvV.aSc() * 1.0f;
        float f10 = f8 - this.cvV.aSd() * 1.0f;
        this.cfb = f7 - 3.0f * f9 + 3.0f * f5 - f3;
        this.cfa = 3.0f * f9 - 6.0f * f5 + 3.0f * f3;
        this.cvW = 3.0f * f5 - 3.0f * f3;
        this.cvX = f3;
        this.cvY = f8 - 3.0f * f10 + 3.0f * f6 - f4;
        this.bqH = 3.0f * f10 - 6.0f * f6 + 3.0f * f4;
        this.bqF = 3.0f * f6 - 3.0f * f4;
        this.bqG = f4;
        this.aQa = this.cvU.aSe() - this.cvS.aSe();
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
        return new acp_1(this.cfb * f4 + this.cfa * f3 + this.cvW * f2 + this.cvX, this.cvY * f4 + this.bqH * f3 + this.bqF * f2 + this.bqG, this.cvS.aSe() + this.aQa * f2);
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

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.dBx - this.dBw) + ") > from=" + String.valueOf(this.cvS) + ", to=" + String.valueOf(this.cvU) + ", initVel=" + String.valueOf(this.cvT) + ", finalVel=" + String.valueOf(this.cvV) + ", initialTime=" + this.dBw + ", finalTime=" + this.dBx + ".";
    }
}

