/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDO
 */
class fdo_2
implements fis_1 {
    final /* synthetic */ fcv_1 uij;
    final /* synthetic */ fdn_1 uik;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdo_2(fdn_1 fdn_12, fcv_1 fcv_12) {
        this.uik = fdn_12;
        this.uij = fcv_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        int n = this.uik.uii.ncz.indexOf(this.uij);
        fgr_1 fgr_12 = this.uik.uii.uhM.get(n + this.uik.uii.crT);
        boolean bl = true;
        if (fgr_12.gzJ()) {
            boolean bl2 = bl = !fgr_12.edc();
            if (bl || !this.uik.uii.uhU) {
                fgr_12.hW(bl);
                if (this.uik.uii.uhQ) {
                    if (bl) {
                        fgr_1 fgr_13 = var5_5 = !this.uik.uii.uhS.isEmpty() ? this.uik.uii.uhS.get(this.uik.uii.uhS.size() - 1) : null;
                        if (var5_5 != fgr_12.gzK()) {
                            do {
                                fgr_1 fgr_14 = var5_5 = !this.uik.uii.uhS.isEmpty() ? this.uik.uii.uhS.remove(this.uik.uii.uhS.size() - 1) : null;
                                if (var5_5 == null) continue;
                                var5_5.hW(false);
                            } while (var5_5 != null && var5_5.gzK() != fgr_12.gzK());
                        }
                        this.uik.uii.uhS.add(fgr_12);
                    } else {
                        do {
                            fgr_1 fgr_15 = var5_5 = !this.uik.uii.uhS.isEmpty() ? this.uik.uii.uhS.remove(this.uik.uii.uhS.size() - 1) : null;
                            if (var5_5 == null) continue;
                            var5_5.hW(false);
                        } while (var5_5 != null && var5_5 != fgr_12);
                    }
                }
            }
        }
        boolean bl3 = !fgr_12.bqr() && (bl || this.uik.uii.uhU) || this.uik.uii.uhV;
        fgr_12.setSelected(bl3);
        if (this.uik.uii.uhP && (!this.uik.uii.uhV || fgr_12 != this.uik.uii.uhR)) {
            if (bl3) {
                if (this.uik.uii.uhR != null) {
                    this.uik.uii.uhR.setSelected(false);
                }
                this.uik.uii.uhR = fgr_12;
            } else {
                if (this.uik.uii.uhR != null) {
                    this.uik.uii.uhR.setSelected(false);
                }
                this.uik.uii.uhR = null;
            }
            this.uik.uii.h(new flz_2(this.uik.uii));
        }
        this.uik.uii.setContentDirty();
        return false;
    }
}

