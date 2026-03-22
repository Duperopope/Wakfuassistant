/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVF
 */
class bvf_2
implements bfw_0 {
    final /* synthetic */ afq_2[] lsk;
    final /* synthetic */ afx_1 lsl;
    final /* synthetic */ int lsm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvf_2(bve_1 bve_12, afq_2[] afq_2Array, afx_1 afx_12, int n) {
        this.lsk = afq_2Array;
        this.lsl = afx_12;
        this.lsm = n;
    }

    @Override
    public void V(@NotNull acd_1 acd_12) {
        this.X(acd_12);
    }

    private void X(acd_1 acd_12) {
        this.lsk[0] = new afq_2(acd_12.getX());
        this.lsk[1] = new afq_2(acd_12.getY());
        this.lsk[2] = new afq_2(acd_12.bdi());
        this.lsk[3] = new afq_2(0);
        this.lsl.xK(this.lsm);
    }

    @Override
    public void B(@NotNull bdj_2 bdj_22) {
        this.W(null);
    }

    @Override
    public void W(@Nullable acd_1 acd_12) {
        if (acd_12 != null) {
            this.X(acd_12);
        } else {
            this.lsl.xL(this.lsm);
        }
    }
}

