/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fEu
 */
class feu_2
implements ffe_2 {
    final /* synthetic */ String umi;
    final /* synthetic */ fes_2 umj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    feu_2(fes_2 fes_22, String string) {
        this.umj = fes_22;
        this.umi = string;
    }

    @Override
    public void onParentChanged(@Nullable fhv_1 fhv_12, @Nullable fhv_1 fhv_13) {
        if (fhv_13 == null) {
            return;
        }
        this.umj.b(this);
        this.umj.setVisibilityLinked(this.umi);
    }
}

