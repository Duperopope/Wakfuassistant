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
 * Renamed from bVD
 */
class bvd_2
implements bfw_0 {
    final /* synthetic */ afq_2[] lsh;
    final /* synthetic */ afx_1 lsi;
    final /* synthetic */ int lsj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvd_2(bvc_1 bvc_12, afq_2[] afq_2Array, afx_1 afx_12, int n) {
        this.lsh = afq_2Array;
        this.lsi = afx_12;
        this.lsj = n;
    }

    @Override
    public void V(@NotNull acd_1 acd_12) {
        this.W(acd_12);
    }

    @Override
    public void B(@NotNull bdj_2 bdj_22) {
        this.lsh[0] = new afq_2(bdj_22.Sn());
        this.lsi.xK(this.lsj);
    }

    @Override
    public void W(@Nullable acd_1 acd_12) {
        this.lsi.xL(this.lsj);
    }
}

