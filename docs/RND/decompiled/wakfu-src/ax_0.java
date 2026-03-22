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
 * Renamed from AX
 */
public final class ax_0
extends Enum<ax_0>
implements ProtocolMessageEnum {
    public static final /* enum */ ax_0 arQ = new ax_0(1);
    public static final /* enum */ ax_0 arR = new ax_0(2);
    public static final /* enum */ ax_0 arS = new ax_0(3);
    public static final /* enum */ ax_0 arT = new ax_0(4);
    public static final /* enum */ ax_0 arU = new ax_0(5);
    public static final int arV = 1;
    public static final int arW = 2;
    public static final int arX = 3;
    public static final int arY = 4;
    public static final int arZ = 5;
    private static final Internal.EnumLiteMap<ax_0> asa;
    private static final ax_0[] asb;
    private final int asc;
    private static final /* synthetic */ ax_0[] asd;

    public static ax_0[] values() {
        return (ax_0[])asd.clone();
    }

    public static ax_0 valueOf(String string) {
        return Enum.valueOf(ax_0.class, string);
    }

    public final int getNumber() {
        return this.asc;
    }

    @Deprecated
    public static ax_0 lH(int n) {
        return ax_0.lI(n);
    }

    public static ax_0 lI(int n) {
        switch (n) {
            case 1: {
                return arQ;
            }
            case 2: {
                return arR;
            }
            case 3: {
                return arS;
            }
            case 4: {
                return arT;
            }
            case 5: {
                return arU;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<ax_0> cB() {
        return asa;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)ax_0.aFL().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return ax_0.aFL();
    }

    public static final Descriptors.EnumDescriptor aFL() {
        return (Descriptors.EnumDescriptor)zS.j().getEnumTypes().get(1);
    }

    public static ax_0 k(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != ax_0.aFL()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return asb[enumValueDescriptor.getIndex()];
    }

    private ax_0(int n2) {
        this.asc = n2;
    }

    private static /* synthetic */ ax_0[] aFM() {
        return new ax_0[]{arQ, arR, arS, arT, arU};
    }

    static {
        asd = ax_0.aFM();
        asa = new ay_0();
        asb = ax_0.values();
    }
}

