/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUQ
 */
class cuq_2
implements fbv_1 {
    final /* synthetic */ fes_2 nNW;
    final /* synthetic */ fes_2 nNX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cuq_2(cuo_2 cuo_22, fes_2 fes_22, fes_2 fes_23) {
        this.nNW = fes_22;
        this.nNX = fes_23;
    }

    @Override
    public void eg(byte by) {
        switch (by) {
            case 0: {
                this.nNW.setVisible(false);
                break;
            }
            case 2: {
                this.nNX.setVisible(false);
                break;
            }
            case 1: {
                this.nNW.setVisible(true);
                this.nNX.setVisible(true);
            }
        }
    }

    @Override
    public void eh(byte by) {
    }
}

