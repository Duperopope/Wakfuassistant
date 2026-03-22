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
 * Renamed from aA
 */
public final class aa_2
extends Enum<aa_2>
implements ProtocolMessageEnum {
    public static final /* enum */ aa_2 ef = new aa_2(0);
    public static final /* enum */ aa_2 eg = new aa_2(1);
    public static final /* enum */ aa_2 eh = new aa_2(2);
    public static final /* enum */ aa_2 ei = new aa_2(3);
    public static final /* enum */ aa_2 ej = new aa_2(4);
    public static final /* enum */ aa_2 ek = new aa_2(5);
    public static final /* enum */ aa_2 el = new aa_2(-1);
    public static final int em = 0;
    public static final int en = 1;
    public static final int eo = 2;
    public static final int ep = 3;
    public static final int eq = 4;
    public static final int er = 5;
    private static final Internal.EnumLiteMap<aa_2> es;
    private static final aa_2[] et;
    private final int eu;
    private static final /* synthetic */ aa_2[] ev;

    public static aa_2[] values() {
        return (aa_2[])ev.clone();
    }

    public static aa_2 valueOf(String string) {
        return Enum.valueOf(aa_2.class, string);
    }

    public final int getNumber() {
        if (this == el) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.eu;
    }

    @Deprecated
    public static aa_2 A(int n) {
        return aa_2.B(n);
    }

    public static aa_2 B(int n) {
        switch (n) {
            case 0: {
                return ef;
            }
            case 1: {
                return eg;
            }
            case 2: {
                return eh;
            }
            case 3: {
                return ei;
            }
            case 4: {
                return ej;
            }
            case 5: {
                return ek;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<aa_2> cB() {
        return es;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == el) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return (Descriptors.EnumValueDescriptor)aa_2.fA().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return aa_2.fA();
    }

    public static final Descriptors.EnumDescriptor fA() {
        return (Descriptors.EnumDescriptor)ax_1.fk().getEnumTypes().get(0);
    }

    public static aa_2 b(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != aa_2.fA()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return el;
        }
        return et[enumValueDescriptor.getIndex()];
    }

    private aa_2(int n2) {
        this.eu = n2;
    }

    private static /* synthetic */ aa_2[] fB() {
        return new aa_2[]{ef, eg, eh, ei, ej, ek, el};
    }

    static {
        ev = aa_2.fB();
        es = new ab_2();
        et = aa_2.values();
    }
}

