/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBX
 */
class fbx_2
implements fis_1 {
    final /* synthetic */ fbw_2 tXd;

    fbx_2(fbw_2 fbw_22) {
        this.tXd = fbw_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tXd.tWW && this.tXd.isVisible()) {
            this.tXd.eKH();
        }
        return false;
    }
}

