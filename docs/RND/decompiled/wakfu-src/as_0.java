/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal$ListAdapter$Converter
 */
import com.google.protobuf.Internal;

/*
 * Renamed from As
 */
class as_0
implements Internal.ListAdapter.Converter<Integer, aq_0> {
    as_0() {
    }

    public aq_0 a(Integer n) {
        aq_0 aq_02 = aq_0.lu(n);
        return aq_02 == null ? aq_0.arp : aq_02;
    }

    public /* synthetic */ Object convert(Object object) {
        return this.a((Integer)object);
    }
}

