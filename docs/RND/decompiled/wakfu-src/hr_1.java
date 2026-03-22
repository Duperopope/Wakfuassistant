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
 * Renamed from hr
 */
public final class hr_1
extends Enum<hr_1>
implements ProtocolMessageEnum {
    public static final /* enum */ hr_1 uw = new hr_1(1);
    public static final /* enum */ hr_1 ux = new hr_1(2);
    public static final /* enum */ hr_1 uy = new hr_1(3);
    public static final int uz = 1;
    public static final int uA = 2;
    public static final int uB = 3;
    private static final Internal.EnumLiteMap<hr_1> uC;
    private static final hr_1[] uD;
    private final int uE;
    private static final /* synthetic */ hr_1[] uF;

    public static hr_1[] values() {
        return (hr_1[])uF.clone();
    }

    public static hr_1 valueOf(String string) {
        return Enum.valueOf(hr_1.class, string);
    }

    public final int getNumber() {
        return this.uE;
    }

    @Deprecated
    public static hr_1 dw(int n) {
        return hr_1.dx(n);
    }

    public static hr_1 dx(int n) {
        switch (n) {
            case 1: {
                return uw;
            }
            case 2: {
                return ux;
            }
            case 3: {
                return uy;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<hr_1> cB() {
        return uC;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)hr_1.Ij().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return hr_1.Ij();
    }

    public static final Descriptors.EnumDescriptor Ij() {
        return (Descriptors.EnumDescriptor)hh_1.j().getEnumTypes().get(0);
    }

    public static hr_1 f(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != hr_1.Ij()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return uD[enumValueDescriptor.getIndex()];
    }

    private hr_1(int n2) {
        this.uE = n2;
    }

    private static /* synthetic */ hr_1[] Ik() {
        return new hr_1[]{uw, ux, uy};
    }

    static {
        uF = hr_1.Ik();
        uC = new hs_1();
        uD = hr_1.values();
    }
}

