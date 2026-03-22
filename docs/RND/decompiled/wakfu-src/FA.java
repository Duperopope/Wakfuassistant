/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

class FA
implements Predicate<Fy> {
    final /* synthetic */ FB aBC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    FA(FB fB) {
        this.aBC = fB;
    }

    public boolean b(Fy fy) {
        return fy.aKZ() == this.aBC;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.b((Fy)object);
    }
}

