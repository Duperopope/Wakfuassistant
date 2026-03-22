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
 * Renamed from cQ
 */
public final class cq_2
extends Enum<cq_2>
implements ProtocolMessageEnum {
    public static final /* enum */ cq_2 iN = new cq_2(0);
    public static final /* enum */ cq_2 iO = new cq_2(1);
    public static final /* enum */ cq_2 iP = new cq_2(2);
    public static final /* enum */ cq_2 iQ = new cq_2(-1);
    public static final int iR = 0;
    public static final int iS = 1;
    public static final int iT = 2;
    private static final Internal.EnumLiteMap<cq_2> iU;
    private static final cq_2[] iV;
    private final int iW;
    private static final /* synthetic */ cq_2[] iX;

    public static cq_2[] values() {
        return (cq_2[])iX.clone();
    }

    public static cq_2 valueOf(String string) {
        return Enum.valueOf(cq_2.class, string);
    }

    public final int getNumber() {
        if (this == iQ) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.iW;
    }

    @Deprecated
    public static cq_2 af(int n) {
        return cq_2.ag(n);
    }

    public static cq_2 ag(int n) {
        switch (n) {
            case 0: {
                return iN;
            }
            case 1: {
                return iO;
            }
            case 2: {
                return iP;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<cq_2> cB() {
        return iU;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == iQ) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return (Descriptors.EnumValueDescriptor)cq_2.oc().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return cq_2.oc();
    }

    public static final Descriptors.EnumDescriptor oc() {
        return (Descriptors.EnumDescriptor)ae_1.j().getEnumTypes().get(1);
    }

    public static cq_2 d(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != cq_2.oc()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return iQ;
        }
        return iV[enumValueDescriptor.getIndex()];
    }

    private cq_2(int n2) {
        this.iW = n2;
    }

    private static /* synthetic */ cq_2[] od() {
        return new cq_2[]{iN, iO, iP, iQ};
    }

    static {
        iX = cq_2.od();
        iU = new cr_2();
        iV = cq_2.values();
    }
}

