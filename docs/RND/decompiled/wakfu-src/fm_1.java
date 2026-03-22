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
 * Renamed from fm
 */
public final class fm_1
extends Enum<fm_1>
implements ProtocolMessageEnum {
    public static final /* enum */ fm_1 pu = new fm_1(1);
    public static final /* enum */ fm_1 pv = new fm_1(2);
    public static final /* enum */ fm_1 pw = new fm_1(3);
    public static final /* enum */ fm_1 px = new fm_1(4);
    public static final /* enum */ fm_1 py = new fm_1(5);
    public static final /* enum */ fm_1 pz = new fm_1(6);
    public static final /* enum */ fm_1 pA = new fm_1(7);
    public static final /* enum */ fm_1 pB = new fm_1(8);
    public static final /* enum */ fm_1 pC = new fm_1(9);
    public static final /* enum */ fm_1 pD = new fm_1(10);
    public static final /* enum */ fm_1 pE = new fm_1(11);
    public static final /* enum */ fm_1 pF = new fm_1(12);
    public static final /* enum */ fm_1 pG = new fm_1(13);
    public static final /* enum */ fm_1 pH = new fm_1(14);
    public static final /* enum */ fm_1 pI = new fm_1(15);
    public static final /* enum */ fm_1 pJ = new fm_1(16);
    public static final int pK = 1;
    public static final int pL = 2;
    public static final int pM = 3;
    public static final int pN = 4;
    public static final int pO = 5;
    public static final int pP = 6;
    public static final int pQ = 7;
    public static final int pR = 8;
    public static final int pS = 9;
    public static final int pT = 10;
    public static final int pU = 11;
    public static final int pV = 12;
    public static final int pW = 13;
    public static final int pX = 14;
    public static final int pY = 15;
    public static final int pZ = 16;
    private static final Internal.EnumLiteMap<fm_1> qa;
    private static final fm_1[] qb;
    private final int qc;
    private static final /* synthetic */ fm_1[] qd;

    public static fm_1[] values() {
        return (fm_1[])qd.clone();
    }

    public static fm_1 valueOf(String string) {
        return Enum.valueOf(fm_1.class, string);
    }

    public final int getNumber() {
        return this.qc;
    }

    @Deprecated
    public static fm_1 cd(int n) {
        return fm_1.ce(n);
    }

    public static fm_1 ce(int n) {
        switch (n) {
            case 1: {
                return pu;
            }
            case 2: {
                return pv;
            }
            case 3: {
                return pw;
            }
            case 4: {
                return px;
            }
            case 5: {
                return py;
            }
            case 6: {
                return pz;
            }
            case 7: {
                return pA;
            }
            case 8: {
                return pB;
            }
            case 9: {
                return pC;
            }
            case 10: {
                return pD;
            }
            case 11: {
                return pE;
            }
            case 12: {
                return pF;
            }
            case 13: {
                return pG;
            }
            case 14: {
                return pH;
            }
            case 15: {
                return pI;
            }
            case 16: {
                return pJ;
            }
        }
        return null;
    }

    public static Internal.EnumLiteMap<fm_1> cB() {
        return qa;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return (Descriptors.EnumValueDescriptor)fm_1.zv().getValues().get(this.ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return fm_1.zv();
    }

    public static final Descriptors.EnumDescriptor zv() {
        return (Descriptors.EnumDescriptor)fl_1.j().getEnumTypes().get(0);
    }

    public static fm_1 e(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != fm_1.zv()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return qb[enumValueDescriptor.getIndex()];
    }

    private fm_1(int n2) {
        this.qc = n2;
    }

    private static /* synthetic */ fm_1[] zw() {
        return new fm_1[]{pu, pv, pw, px, py, pz, pA, pB, pC, pD, pE, pF, pG, pH, pI, pJ};
    }

    static {
        qd = fm_1.zw();
        qa = new fn_1();
        qb = fm_1.values();
    }
}

