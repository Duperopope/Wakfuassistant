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
 * Renamed from zD
 */
public final class zd_2
extends Enum<zd_2>
implements ProtocolMessageEnum {
    public static final /* enum */ zd_2 aoC = new zd_2(1);
    public static final /* enum */ zd_2 aoD = new zd_2(2);
    public static final int aoE = 1;
    public static final int aoF = 2;
    private static final Internal.EnumLiteMap<zd_2> aoG;
    private static final zd_2[] aoH;
    private final int aoI;
    private static final /* synthetic */ zd_2[] aoJ;

    public static zd_2[] values() {
        return (zd_2[])aoJ.clone();
    }

    public static zd_2 valueOf(String string) {
        return Enum.valueOf(zd_2.class, string);
    }

    public final int getNumber() {
        return this.aoI;
    }

    @Deprecated
    public static zd_2 kR(int n) {
        return zd_2.kS(n);
    }

    public static zd_2 kS(int n) {
        switch (n) {
            case 1: {
                return aoC;
            }
            case 2: {
                return aoD;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<zd_2> cB() {
        return aoG;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)zd_2.azK().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return zd_2.azK();
    }

    public static final Descriptors.EnumDescriptor azK() {
        return (Descriptors.EnumDescriptor)zc_2.j().getEnumTypes().get(0);
    }

    public static zd_2 i(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != zd_2.azK()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return aoH[enumValueDescriptor.getIndex()];
    }

    private zd_2(int n2) {
        this.aoI = n2;
    }

    private static /* synthetic */ zd_2[] azL() {
        return new zd_2[]{aoC, aoD};
    }

    static {
        aoJ = zd_2.azL();
        aoG = new ze_2();
        aoH = zd_2.values();
    }
}

