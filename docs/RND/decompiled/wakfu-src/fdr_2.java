/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDr
 */
class fdr_2
implements fis_1 {
    final /* synthetic */ fgm_2 ueD;
    final /* synthetic */ fad_1 ueE;
    final /* synthetic */ String ueF;
    final /* synthetic */ String ueG;
    final /* synthetic */ fdq_1 ueH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdr_2(fdq_1 fdq_12, fgm_2 fgm_22, fad_1 fad_12, String string, String string2) {
        this.ueH = fdq_12;
        this.ueD = fgm_22;
        this.ueE = fad_12;
        this.ueF = string;
        this.ueG = string2;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.ueH.h(new fls_1(this.ueH, this.ueD.getColumnId()));
        int n = this.ueH.nam.size();
        for (int i = 0; i < n; ++i) {
            fad_1 fad_12 = this.ueH.nam.get(i);
            if (this.ueE == fad_12) continue;
            if (!this.ueF.equals(fad_12.getStyle())) {
                fad_12.setPixmap(null);
            }
            fad_12.setStyle(this.ueF, false);
        }
        if (this.ueH.ueh != null) {
            this.ueH.dwq = this.ueH.ueh.b(this.ueH.jLZ, this.ueD.getColumnId());
            StringBuilder stringBuilder = new StringBuilder("table");
            if (this.ueG != null) {
                stringBuilder.append(this.ueG);
            }
            stringBuilder.append("$");
            if (this.ueH.ueh.gxx()) {
                stringBuilder.append("directSortButton");
            } else {
                stringBuilder.append("indirectSortButton");
            }
            this.ueE.setStyle(stringBuilder.toString(), true);
            this.ueH.setValuesDirty();
        }
        return false;
    }
}

