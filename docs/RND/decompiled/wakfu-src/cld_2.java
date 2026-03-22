/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLd
 */
class cld_2
implements fia_2 {
    final /* synthetic */ clc_2 nfb;

    cld_2(clc_2 clc_22) {
        this.nfb = clc_22;
    }

    @Override
    public boolean Mf(int n) {
        if (!fhj_2.gBa().af(this.nfb.nfa.neX)) {
            this.nfb.nfa.neX.b(this);
            this.nfb.neZ.run();
        }
        return true;
    }
}

