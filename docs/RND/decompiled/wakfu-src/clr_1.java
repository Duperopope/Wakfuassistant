/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLr
 */
class clr_1
implements fia_2 {
    final /* synthetic */ clq_1 nfg;

    clr_1(clq_1 clq_12) {
        this.nfg = clq_12;
    }

    @Override
    public boolean Mf(int n) {
        if (!fhj_2.gBa().af(this.nfg.nff.nfc)) {
            this.nfg.nff.nfc.b(this);
            this.nfg.nfe.run();
        }
        return true;
    }
}

