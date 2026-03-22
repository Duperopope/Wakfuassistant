/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Descriptors$EnumDescriptor
 *  com.google.protobuf.Descriptors$EnumValueDescriptor
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.ProtocolMessageEnum
 */
import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/*
 * Renamed from AQ
 */
public final class aq_0
extends Enum<aq_0>
implements ProtocolMessageEnum {
    public static final /* enum */ aq_0 arp = new aq_0(1);
    public static final /* enum */ aq_0 arq = new aq_0(2);
    public static final /* enum */ aq_0 arr = new aq_0(3);
    public static final /* enum */ aq_0 ars = new aq_0(4);
    public static final int art = 1;
    public static final int aru = 2;
    public static final int arv = 3;
    public static final int arw = 4;
    private static final Internal.EnumLiteMap<aq_0> arx;
    private static final aq_0[] ary;
    private final int arz;
    private static final /* synthetic */ aq_0[] arA;

    public static aq_0[] values() {
        return (aq_0[])arA.clone();
    }

    public static aq_0 valueOf(String string) {
        return Enum.valueOf(aq_0.class, string);
    }

    public final int getNumber() {
        return this.arz;
    }

    @Deprecated
    public static aq_0 lu(int n) {
        return aq_0.lv(n);
    }

    public static aq_0 lv(int n) {
        switch (n) {
            case 1: {
                return arp;
            }
            case 2: {
                return arq;
            }
            case 3: {
                return arr;
            }
            case 4: {
                return ars;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<aq_0> cB() {
        return arx;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)aq_0.aEZ().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return aq_0.aEZ();
    }

    public static final Descriptors.EnumDescriptor aEZ() {
        return (Descriptors.EnumDescriptor)zS.j().getEnumTypes().get(0);
    }

    public static aq_0 j(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != aq_0.aEZ()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return ary[enumValueDescriptor.getIndex()];
    }

    private aq_0(int n2) {
        this.arz = n2;
    }

    private static /* synthetic */ aq_0[] aFa() {
        return new aq_0[]{arp, arq, arr, ars};
    }

    static {
        arA = aq_0.aFa();
        arx = new AR();
        ary = aq_0.values();
    }
}

