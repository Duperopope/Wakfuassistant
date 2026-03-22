/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAs
 */
class bas_0
implements adi_1 {
    private final bap_1 jEW;

    bas_0(bap_1 bap_12) {
        this.jEW = bap_12;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 14698: {
                this.a((crn_0)aam_22);
                return false;
            }
        }
        return true;
    }

    private void a(crn_0 crn_02) {
        cvr_1 cvr_12 = cvr_1.eTM();
        if (aue_0.cVJ().c(cvr_12)) {
            cvr_12.a(new bQX(crn_02.eAn()));
            cvr_12.eRC();
        } else {
            cvr_12.a(this.jEW);
            cvr_12.a(new bQX(crn_02.eAn()));
            aue_0.cVJ().a(cvr_12);
        }
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "Frame{m_collector=" + String.valueOf(this.jEW) + "}";
    }
}

