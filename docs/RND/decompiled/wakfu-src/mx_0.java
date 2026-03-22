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
 * Renamed from mx
 */
public final class mx_0
extends Enum<mx_0>
implements ProtocolMessageEnum {
    public static final /* enum */ mx_0 Lc = new mx_0(0);
    public static final /* enum */ mx_0 Ld = new mx_0(1);
    public static final /* enum */ mx_0 Le = new mx_0(2);
    public static final /* enum */ mx_0 Lf = new mx_0(3);
    public static final int Lg = 0;
    public static final int Lh = 1;
    public static final int Li = 2;
    public static final int Lj = 3;
    private static final Internal.EnumLiteMap<mx_0> Lk;
    private static final mx_0[] Ll;
    private final int Lm;
    private static final /* synthetic */ mx_0[] Ln;

    public static mx_0[] values() {
        return (mx_0[])Ln.clone();
    }

    public static mx_0 valueOf(String string) {
        return Enum.valueOf(mx_0.class, string);
    }

    public final int getNumber() {
        return this.Lm;
    }

    @Deprecated
    public static mx_0 ih(int n) {
        return mx_0.ii(n);
    }

    public static mx_0 ii(int n) {
        switch (n) {
            case 0: {
                return Lc;
            }
            case 1: {
                return Ld;
            }
            case 2: {
                return Le;
            }
            case 3: {
                return Lf;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<mx_0> cB() {
        return Lk;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)mx_0.amc().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return mx_0.amc();
    }

    public static final Descriptors.EnumDescriptor amc() {
        return (Descriptors.EnumDescriptor)ms.j().getEnumTypes().get(0);
    }

    public static mx_0 h(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != mx_0.amc()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return Ll[enumValueDescriptor.getIndex()];
    }

    private mx_0(int n2) {
        this.Lm = n2;
    }

    private static /* synthetic */ mx_0[] amd() {
        return new mx_0[]{Lc, Ld, Le, Lf};
    }

    static {
        Ln = mx_0.amd();
        Lk = new my_0();
        Ll = mx_0.values();
    }
}

