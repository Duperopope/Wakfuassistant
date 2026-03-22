/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSN
 */
class csn_1
implements fia_2 {
    final /* synthetic */ csm_1 nGM;

    csn_1(csm_1 csm_12) {
        this.nGM = csm_12;
    }

    @Override
    public boolean Mf(int n) {
        fhs_2 fhs_22 = this.nGM.nGI.getElementMap();
        fdf_1 fdf_12 = (fdf_1)fhs_22.uH("characterList");
        int n2 = fdf_12.getWidgetChildren().size();
        if (n2 == 0 || fdf_12.getSelected() == null) {
            return true;
        }
        for (int i = 0; i < n2; ++i) {
            fdf_12.getWidgetChildren().get(i).setUsePositionTween(true);
        }
        fcq_2 fcq_22 = (fcq_2)fdf_12.getParent();
        fcq_22.setVerticalScrollBarPosition(1.0f - (float)fdf_12.getSelected().getItemValueIndex() / (float)(n2 - 1));
        this.nGM.nGI.b(this);
        return false;
    }
}

