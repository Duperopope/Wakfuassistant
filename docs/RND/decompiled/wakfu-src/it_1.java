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
 * Renamed from it
 */
public final class it_1
extends Enum<it_1>
implements ProtocolMessageEnum {
    public static final /* enum */ it_1 yx = new it_1(0);
    public static final /* enum */ it_1 yy = new it_1(1);
    public static final /* enum */ it_1 yz = new it_1(2);
    public static final int yA = 0;
    public static final int yB = 1;
    public static final int yC = 2;
    private static final Internal.EnumLiteMap<it_1> yD;
    private static final it_1[] yE;
    private final int yF;
    private static final /* synthetic */ it_1[] yG;

    public static it_1[] values() {
        return (it_1[])yG.clone();
    }

    public static it_1 valueOf(String string) {
        return Enum.valueOf(it_1.class, string);
    }

    public final int getNumber() {
        return this.yF;
    }

    @Deprecated
    public static it_1 ex(int n) {
        return it_1.ey(n);
    }

    public static it_1 ey(int n) {
        switch (n) {
            case 0: {
                return yx;
            }
            case 1: {
                return yy;
            }
            case 2: {
                return yz;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<it_1> cB() {
        return yD;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)it_1.OK().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return it_1.OK();
    }

    public static final Descriptors.EnumDescriptor OK() {
        return (Descriptors.EnumDescriptor)iq_2.Ob().getEnumTypes().get(0);
    }

    public static it_1 g(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != it_1.OK()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return yE[enumValueDescriptor.getIndex()];
    }

    private it_1(int n2) {
        this.yF = n2;
    }

    private static /* synthetic */ it_1[] OL() {
        return new it_1[]{yx, yy, yz};
    }

    static {
        yG = it_1.OL();
        yD = new iu_1();
        yE = it_1.values();
    }
}

