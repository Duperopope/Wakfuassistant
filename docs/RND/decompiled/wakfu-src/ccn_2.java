/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from cCN
 */
final class ccn_2
extends Record {
    final boolean mRt;
    final boolean mRu;

    ccn_2(boolean bl, boolean bl2) {
        this.mRt = bl;
        this.mRu = bl2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ccn_2.class, "width;height", "mRt", "mRu"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ccn_2.class, "width;height", "mRt", "mRu"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ccn_2.class, "width;height", "mRt", "mRu"}, this, object);
    }

    public boolean eJJ() {
        return this.mRt;
    }

    public boolean eJK() {
        return this.mRu;
    }
}

