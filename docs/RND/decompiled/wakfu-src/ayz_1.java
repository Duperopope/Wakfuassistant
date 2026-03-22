/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayz
 */
public class ayz_1
extends ayu_1 {
    private final int dtl;

    public ayz_1(float f2, boolean bl, int n) {
        super(f2, bl);
        this.dtl = n;
    }

    @Override
    public void bSg() {
        super.bSg();
        int n = (int)(0.7 / (double)(this.dta * this.dta));
        for (int i = 0; i < n; ++i) {
            aco_1 aco_12 = new aco_1(0.0f, 0.0f);
            float f2 = 0.0f;
            int n2 = 1 + this.bXE.size() * this.dtl;
            for (int j = 0; j < n2; ++j) {
                aco_1 aco_13 = this.bSe();
                float f3 = this.b(aco_13, 4.0f * this.dta);
                if (j != 0 && !(f3 > f2)) continue;
                f2 = f3;
                aco_12 = aco_13;
            }
            this.e(aco_12);
        }
    }
}

