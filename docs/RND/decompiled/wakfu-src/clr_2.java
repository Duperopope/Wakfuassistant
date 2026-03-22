/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLR
 */
class clr_2
implements fia_2 {
    final /* synthetic */ clq_2 nfv;

    clr_2(clq_2 clq_22) {
        this.nfv = clq_22;
    }

    @Override
    public boolean Mf(int n) {
        if (!fhj_2.gBa().af(this.nfv.nfu.nfr)) {
            this.nfv.nfu.nfr.b(this);
            this.nfv.nft.run();
        }
        return true;
    }
}

