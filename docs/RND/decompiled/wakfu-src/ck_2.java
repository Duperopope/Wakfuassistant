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
 * Renamed from cK
 */
public final class ck_2
extends Enum<ck_2>
implements ProtocolMessageEnum {
    public static final /* enum */ ck_2 iy = new ck_2(0);
    public static final /* enum */ ck_2 iz = new ck_2(1);
    public static final /* enum */ ck_2 iA = new ck_2(-1);
    public static final int iB = 0;
    public static final int iC = 1;
    private static final Internal.EnumLiteMap<ck_2> iD;
    private static final ck_2[] iE;
    private final int iF;
    private static final /* synthetic */ ck_2[] iG;

    public static ck_2[] values() {
        return (ck_2[])iG.clone();
    }

    public static ck_2 valueOf(String string) {
        return Enum.valueOf(ck_2.class, string);
    }

    public final int getNumber() {
        if (this == iA) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.iF;
    }

    @Deprecated
    public static ck_2 ab(int n) {
        return ck_2.ac(n);
    }

    public static ck_2 ac(int n) {
        switch (n) {
            case 0: {
                return iy;
            }
            case 1: {
                return iz;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<ck_2> cB() {
        return iD;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == iA) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return (Descriptors.EnumValueDescriptor)ck_2.nK().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return ck_2.nK();
    }

    public static final Descriptors.EnumDescriptor nK() {
        return (Descriptors.EnumDescriptor)ae_1.j().getEnumTypes().get(0);
    }

    public static ck_2 c(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != ck_2.nK()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return iA;
        }
        return iE[enumValueDescriptor.getIndex()];
    }

    private ck_2(int n2) {
        this.iF = n2;
    }

    private static /* synthetic */ ck_2[] nL() {
        return new ck_2[]{iy, iz, iA};
    }

    static {
        iG = ck_2.nL();
        iD = new cl_1();
        iE = ck_2.values();
    }
}

