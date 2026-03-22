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
 * Renamed from P
 */
public final class p_0
extends Enum<p_0>
implements ProtocolMessageEnum {
    public static final /* enum */ p_0 bF = new p_0(0);
    public static final /* enum */ p_0 bG = new p_0(1);
    public static final /* enum */ p_0 bH = new p_0(2);
    public static final /* enum */ p_0 bI = new p_0(-1);
    public static final int bJ = 0;
    public static final int bK = 1;
    public static final int bL = 2;
    private static final Internal.EnumLiteMap<p_0> bM;
    private static final p_0[] bN;
    private final int bO;
    private static final /* synthetic */ p_0[] bP;

    public static p_0[] values() {
        return (p_0[])bP.clone();
    }

    public static p_0 valueOf(String string) {
        return Enum.valueOf(p_0.class, string);
    }

    public final int getNumber() {
        if (this == bI) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.bO;
    }

    @Deprecated
    public static p_0 l(int n) {
        return p_0.m(n);
    }

    public static p_0 m(int n) {
        switch (n) {
            case 0: {
                return bF;
            }
            case 1: {
                return bG;
            }
            case 2: {
                return bH;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<p_0> cB() {
        return bM;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == bI) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return (Descriptors.EnumValueDescriptor)p_0.cC().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return p_0.cC();
    }

    public static final Descriptors.EnumDescriptor cC() {
        return (Descriptors.EnumDescriptor)M.ck().getEnumTypes().get(0);
    }

    public static p_0 a(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != p_0.cC()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return bI;
        }
        return bN[enumValueDescriptor.getIndex()];
    }

    private p_0(int n2) {
        this.bO = n2;
    }

    private static /* synthetic */ p_0[] cD() {
        return new p_0[]{bF, bG, bH, bI};
    }

    static {
        bP = p_0.cD();
        bM = new q_0();
        bN = p_0.values();
    }
}

