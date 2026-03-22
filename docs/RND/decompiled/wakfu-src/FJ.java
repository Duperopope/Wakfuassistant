/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

class FJ
implements Function<FH, Iterable<T>> {
    final /* synthetic */ FU aBR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    FJ(FI fI, FU fU) {
        this.aBR = fU;
    }

    public Iterable<T> a(FH fH) {
        return this.aBR.b(fH);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((FH)object);
    }
}

