/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aCF
 */
public class acf_2
implements ace_2 {
    protected static final float[][] dBI = new float[][]{{2.0f, -3.0f, 0.0f, 1.0f}, {2.0f, 3.0f, 0.0f, 0.0f}, {1.0f, -2.0f, 1.0f, 0.0f}, {1.0f, -1.0f, 0.0f, 0.0f}};
    private static final acp_1 dBJ = new acp_1();
    private static final acp_1 dBK = new acp_1();
    protected final ArrayList<acg_2> dBL;
    protected float dBM;
    protected long dBN;
    protected long dBB;

    public acf_2(List<acc_2> list, long l) {
        Object object;
        this.dBB = l;
        this.dBM = 0.0f;
        this.dBN = 0L;
        this.dBL = new ArrayList();
        if (list.size() == 1) {
            object = list.get(0);
            List<acc_2> list2 = ((acc_2)object).Q(((acc_2)object).bXH() / 2.0);
            list.clear();
            list.addAll(list2);
        }
        object = null;
        for (int i = 0; i < list.size(); ++i) {
            ach_2 ach_22 = list.get(i);
            acg_2 acg_22 = new acg_2();
            acg_22.a(ach_22.bzK());
            if (i != 0) {
                ((acg_2)object).dI(((acg_2)object).bts().k(acg_22.bts()).bWY());
                this.dBM += ((acg_2)object).bXO();
            }
            this.dBN += ach_22.Tz();
            this.dBL.add(acg_22);
            object = acg_22;
            if (i != list.size() - 1) continue;
            acg_2 acg_23 = new acg_2();
            acg_23.a(ach_22.bzM());
            ((acg_2)object).dI(((acg_2)object).bts().k(acg_23.bts()).bWY());
            this.dBM += ((acg_2)object).bXO();
            this.dBL.add(acg_23);
        }
        this.bXJ();
    }

    protected void bXJ() {
        acp_1 acp_12;
        Object object;
        acg_2 acg_22;
        Object object2;
        acg_2 acg_23;
        for (int i = 1; i < this.dBL.size() - 1; ++i) {
            acg_23 = this.dBL.get(i - 1);
            object2 = this.dBL.get(i);
            acg_22 = this.dBL.get(i + 1);
            object = acg_22.bts().k(((acg_2)object2).bts());
            ((acp_1)object).bWX();
            acp_12 = acg_23.bts().k(((acg_2)object2).bts());
            acp_12.bWX();
            acp_1 acp_13 = ((acp_1)object).k(acp_12);
            acp_13.bWX();
            ((acg_2)object2).o(acp_13);
        }
        acg_2 acg_24 = this.dBL.get(0);
        acg_23 = this.dBL.get(1);
        object2 = acg_23.bts().k(acg_24.bts());
        ((acp_1)object2).K(1.0f / acg_24.bXO());
        ((acp_1)object2).K(3.0);
        ((acp_1)object2).i(acg_23.bXN());
        ((acp_1)object2).K(0.5);
        acg_24.o((acp_1)object2);
        acg_22 = this.dBL.get(this.dBL.size() - 1);
        object = this.dBL.get(this.dBL.size() - 2);
        acp_12 = acg_22.bts().k(((acg_2)object).bts());
        acp_12.K(1.0f / ((acg_2)object).bXO());
        acp_12.K(3.0);
        acp_12.i(((acg_2)object).bXN());
        acp_12.K(0.5);
        acg_22.o(acp_12);
    }

    @Override
    public acp_1 fZ(long l) {
        int n;
        if (l >= this.dBB + this.dBN) {
            return this.dBL.get(this.dBL.size() - 1).bts();
        }
        if (l < this.dBB) {
            return this.dBL.get(0).bts();
        }
        long l2 = l - this.dBB;
        float f2 = (float)l2 / (float)this.dBN;
        float f3 = f2 * this.dBM;
        float f4 = 0.0f;
        for (n = 0; n < this.dBL.size() - 1 && f4 + this.dBL.get(n).bXO() < f3; ++n) {
            f4 += this.dBL.get(n).bXO();
        }
        float f5 = f3 - f4;
        acg_2 acg_22 = this.dBL.get(n);
        acg_2 acg_23 = this.dBL.get(n + 1);
        dBJ.g(acg_22.bXN());
        dBJ.K(acg_22.bXO());
        dBK.g(acg_23.bXN());
        dBK.K(acg_22.bXO());
        return this.a(acg_22.bts(), dBJ, acg_23.bts(), dBK, f5 /= acg_22.bXO());
    }

    protected acp_1 a(acp_1 acp_12, acp_1 acp_13, acp_1 acp_14, acp_1 acp_15, float f2) {
        float f3 = 2.0f * acp_12.aSc() - 2.0f * acp_14.aSc() + acp_13.aSc() + acp_15.aSc();
        float f4 = 2.0f * acp_12.aSd() - 2.0f * acp_14.aSd() + acp_13.aSd() + acp_15.aSd();
        float f5 = 2.0f * acp_12.aSe() - 2.0f * acp_14.aSe() + acp_13.aSe() + acp_15.aSe();
        float f6 = -3.0f * acp_12.aSc() + 3.0f * acp_14.aSc() - 2.0f * acp_13.aSc() - acp_15.aSc();
        float f7 = -3.0f * acp_12.aSd() + 3.0f * acp_14.aSd() - 2.0f * acp_13.aSd() - acp_15.aSd();
        float f8 = -3.0f * acp_12.aSe() + 3.0f * acp_14.aSe() - 2.0f * acp_13.aSe() - acp_15.aSe();
        float f9 = acp_13.aSc();
        float f10 = acp_13.aSd();
        float f11 = acp_13.aSe();
        float f12 = acp_12.aSc();
        float f13 = acp_12.aSd();
        float f14 = acp_12.aSe();
        float f15 = f2;
        float f16 = f2 * f2;
        float f17 = f16 * f2;
        return new acp_1(f3 * f17 + f6 * f16 + f9 * f15 + f12, f4 * f17 + f7 * f16 + f10 * f15 + f13, acp_12.aSe());
    }

    @Override
    public acp_1 a(long l, abi_1 abi_12, anp_2 anp_22) {
        return acb_2.a(this, l, abi_12, anp_22);
    }

    @Override
    public void hs(long l) {
        this.dBB += l;
    }

    @Override
    public acp_1 bzK() {
        return this.dBL.get(0).bts();
    }

    @Override
    public acp_1 bzM() {
        return this.dBL.get(this.dBL.size() - 1).bts();
    }

    @Override
    public long bXF() {
        return this.dBB + this.dBN;
    }

    @Override
    public long bXG() {
        return this.dBB;
    }

    @Override
    public boolean hr(long l) {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TimeUniformSpline={");
        for (acg_2 acg_22 : this.dBL) {
            stringBuilder.append("( position=").append(acg_22.bts()).append(" velocity=").append(acg_22.bXN()).append(", length=").append(acg_22.bXO()).append(" ), ");
        }
        return stringBuilder.append("}").toString();
    }

    public ArrayList<acg_2> bXK() {
        return this.dBL;
    }

    public long bXL() {
        return this.dBN;
    }

    public double bXM() {
        return this.dBM;
    }
}

