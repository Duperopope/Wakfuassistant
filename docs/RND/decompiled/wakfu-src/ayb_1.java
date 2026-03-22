/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayB
 */
public class ayb_1
extends ayu_1 {
    private final int dtm;
    private final int dtn;

    public ayb_1(float f2, boolean bl, int n, int n2) {
        super(f2, bl);
        this.dtm = n;
        this.dtn = n2;
    }

    @Override
    public void bSg() {
        int n;
        int n2;
        super.bSg();
        block0: do {
            if ((n = this.bXE.size() * this.dtn) < this.dtm) {
                n = this.dtm;
            }
            for (n2 = 0; n2 < n; ++n2) {
                aco_1 aco_12 = this.bSe();
                this.a(aco_12, 2.0f * this.dta);
                if (this.dsW.size() == 0 && this.e(aco_12)) continue block0;
            }
        } while (n2 != n);
    }
}

