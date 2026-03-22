/*
 * Decompiled with CFR 0.152.
 */
final class bgZ
extends eyj_0 {
    private final on_2 ifF;
    final /* synthetic */ bgt_0 ifG;

    bgZ(bgt_0 bgt_02, on_2 on_22) {
        this.ifG = bgt_02;
        this.ifF = on_22;
        this.ifF.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dom().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifG.ieV.fVk();
        for (sy_2 sy_22 : this.ifF.RJ.ZI) {
            sv_2 sv_22 = sy_22.ZJ;
            ffs_0 ffs_02 = this.ifG.ieV.sY(sv_22.ZC);
            if (ffs_02 == null) {
                ffs_02 = new bde_0(0L, 0, ffl_0.sgm, 0);
                if (!ffs_02.b(sv_22)) {
                    bgt_0.don().error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du bag uniqueId=" + sv_22.ZC + ", on ignore les bags restants"));
                    return;
                }
                this.ifG.ieV.f(ffs_02);
                ffs_02.a(bry_0.jeH);
            } else {
                ffs_02.beQ();
                ffs_02.b(sv_22);
            }
            ffs_02.fVa();
            bdq_0.dRC().c(ffs_02);
        }
        this.ifG.ieV.hz(true);
        fse_1.gFu().a((aef_2)this.ifG.ieV, this.ifG.ieV.bxk());
        if (cvu_2.eQx()) {
            cvu_2.eTO().dCb();
        }
    }
}

