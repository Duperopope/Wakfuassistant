/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$ListAdapter$Converter
 */
import com.google.protobuf.Internal;

/*
 * Renamed from At
 */
class at_0
implements Internal.ListAdapter.Converter<Integer, ax_0> {
    at_0() {
    }

    public ax_0 b(Integer n) {
        ax_0 ax_02 = ax_0.lH(n);
        return ax_02 == null ? ax_0.arQ : ax_02;
    }

    public /* synthetic */ Object convert(Object object) {
        return this.b((Integer)object);
    }
}

