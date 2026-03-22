/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBG
 */
class bbg_1
implements adi_1 {
    private final bbc_1 jGt;

    bbg_1(bbc_1 bbc_12) {
        this.jGt = bbc_12;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12682: {
                this.a((cvP)aam_22);
                return false;
            }
        }
        return true;
    }

    private void a(cvP cvP2) {
        cxu_2 cxu_22 = cxu_2.eXE();
        if (!aue_0.cVJ().c(cxu_22)) {
            aue_0.cVJ().a(cxu_22);
            cxu_22.a(this.jGt);
        }
        cxu_22.l(cvP2.avr(), cvP2.bfd());
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "Frame{m_seedSpreader=" + String.valueOf(this.jGt) + "}";
    }
}

