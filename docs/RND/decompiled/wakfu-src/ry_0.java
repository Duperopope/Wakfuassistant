/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Ry
 */
public final class ry_0
extends Enum<ry_0>
implements aoq_1 {
    public static final /* enum */ ry_0 blA = new ry_0(0, 0);
    public static final /* enum */ ry_0 blB = new ry_0(1, 0);
    public static final /* enum */ ry_0 blC = new ry_0(2, 4);
    public static final /* enum */ ry_0 blD = new ry_0(4, 6);
    public static final /* enum */ ry_0 blE = new ry_0(8, 2);
    public static final /* enum */ ry_0 blF = new ry_0(16, 1);
    public static final /* enum */ ry_0 blG = new ry_0(32, 7);
    public static final /* enum */ ry_0 blH = new ry_0(64, 3);
    public static final /* enum */ ry_0 blI = new ry_0(128, 5);
    public static final /* enum */ ry_0 blJ = new ry_0(15, 0);
    public static final /* enum */ ry_0 blK = new ry_0(240, 0);
    public static final /* enum */ ry_0 blL = new ry_0(256, 0);
    private final short blM;
    private final byte blN;
    private static final /* synthetic */ ry_0[] blO;

    public static ry_0[] values() {
        return (ry_0[])blO.clone();
    }

    public static ry_0 valueOf(String string) {
        return Enum.valueOf(ry_0.class, string);
    }

    private ry_0(short s, byte by) {
        this.blM = s;
        this.blN = by;
    }

    public static ry_0 Z(short s) {
        for (ry_0 ry_02 : ry_0.values()) {
            if (ry_02.beb() != s) continue;
            return ry_02;
        }
        return null;
    }

    public short beb() {
        return this.blM;
    }

    public byte bec() {
        return this.blN;
    }

    @Override
    public String aXA() {
        return Short.toString(this.blM);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    public static ArrayList<ry_0> aa(short s) {
        ArrayList<ry_0> arrayList = new ArrayList<ry_0>();
        for (ry_0 ry_02 : ry_0.values()) {
            if (ry_02 == blJ || ry_02 == blK || ry_02 == blA || (ry_02.beb() & s) != ry_02.beb()) continue;
            arrayList.add(ry_02);
        }
        return arrayList;
    }

    private static /* synthetic */ ry_0[] bed() {
        return new ry_0[]{blA, blB, blC, blD, blE, blF, blG, blH, blI, blJ, blK, blL};
    }

    static {
        blO = ry_0.bed();
    }
}

