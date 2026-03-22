/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSU
 */
class csu_2 {
    private static final float nHB = 0.3f;
    private static final int nHC = 3;
    private static final int nHD = 6;
    private final abi_1[] nHE = abi_1.bVP();
    private int lYY;
    private float cvZ;
    private int dvq;
    private final byte nHF;
    final /* synthetic */ csp_1 nHG;

    csu_2(csp_1 csp_12, byte by) {
        this.nHG = csp_12;
        this.nHF = by;
        this.lYY = abi_1.dzl.wp();
        csp_12.nHj.setDirection(this.lYY);
    }

    void ePg() {
        ++this.dvq;
        if (this.dvq == 3) {
            this.nHG.a(csp_1.eOD(), this.nHF);
        }
        if (this.dvq > 6) {
            this.nHG.ePa();
            this.lYY = abi_1.dzl.wp();
            this.nHG.nHj.setDirection(this.lYY);
            this.nHG.nHj.setAnimName("AnimLevelUp");
            fse_1.gFu().aT("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
            fse_1.gFu().aT("characterCreation.editablePlayerInfo", "actorLinkage");
            return;
        }
        this.cvZ += 0.3f;
        int n = GC.B(GC.E(this.cvZ) * 100.0f);
        abg_2.bUP().a(() -> {
            if (this.lYY > this.nHE.length - 1) {
                this.lYY = 0;
            }
            this.nHG.nHj.setDirection(this.nHE[this.lYY].wp());
            ++this.lYY;
            this.ePg();
        }, n, 1);
    }
}

