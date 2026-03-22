/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDT
 */
class fdt_1
implements fis_1 {
    final /* synthetic */ fdp_1 uiC;

    fdt_1(fdp_1 fdp_12) {
        this.uiC = fdp_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fmb_1 fmb_12 = new fmb_1(this.uiC);
        fmb_12.aVI();
        this.uiC.h(fmb_12);
        fyw_0.gqw().tl(fdp_1.b(this.uiC).getId());
        return false;
    }
}

