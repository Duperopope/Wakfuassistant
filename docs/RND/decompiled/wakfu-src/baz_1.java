/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAZ
 */
class baz_1
implements adi_1 {
    private final baw_1 jFO;

    baz_1(baw_1 baw_12) {
        this.jFO = baw_12;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 14359: {
                this.a((ctr_0)aam_22);
                return false;
            }
        }
        return true;
    }

    private void a(ctr_0 ctr_02) {
        cww_2 cww_22 = cww_2.eWq();
        cww_22.X(ctr_02.eCF());
        aue_0.cVJ().a(cww_22);
        aue_0.cVJ().b(this);
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "Frame{m_board=" + String.valueOf(this.jFO) + "}";
    }
}

