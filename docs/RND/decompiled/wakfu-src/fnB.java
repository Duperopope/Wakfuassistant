/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public final class fnB
extends Enum<fnB>
implements aoq_1 {
    public static final /* enum */ fnB sJS = new fnB(0, "gemme de salle marchande", 4262, 11098);
    public static final /* enum */ fnB sJT = new fnB(1, "gemme de salle de d\u00e9corations", 4263, 11100);
    public static final /* enum */ fnB sJU = new fnB(2, "gemme de salle d'artisanat", 4264);
    public static final /* enum */ fnB sJV = new fnB(3, "gemme de salle de Sufokia", 27572);
    public static final /* enum */ fnB sJW = new fnB(4, "gemme de salle jardin", 4266, 11099);
    public static final /* enum */ fnB sJX = new fnB(5, "gemme de salle Amakna", 27573);
    public static final /* enum */ fnB sJY = new fnB(6, "gemme de salle Br\u00e2kmar", 27574);
    public static final /* enum */ fnB sJZ = new fnB(7, "gemme de salle Bonta", 27575);
    private static final TIntObjectHashMap<fnB> sKa;
    public final byte sKb;
    public final byte sKc;
    private final int[] sKd;
    private final String sKe;
    private static final /* synthetic */ fnB[] sKf;

    public static fnB[] values() {
        return (fnB[])sKf.clone();
    }

    public static fnB valueOf(String string) {
        return Enum.valueOf(fnB.class, string);
    }

    private fnB(byte by, String string2, int ... nArray) {
        this.sKb = by;
        this.sKc = (byte)(1 << by);
        this.sKd = nArray;
        this.sKe = string2;
    }

    public int dut() {
        return this.sKd[0];
    }

    public byte aPy() {
        return this.sKb;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.sKd[0]);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return this.sKe;
    }

    public static fnB Xq(int n) {
        return (fnB)sKa.get(n);
    }

    public static fnB geF() {
        return sJS;
    }

    private static /* synthetic */ fnB[] geG() {
        return new fnB[]{sJS, sJT, sJU, sJV, sJW, sJX, sJY, sJZ};
    }

    static {
        sKf = fnB.geG();
        sKa = new TIntObjectHashMap();
        for (fnB fnB2 : fnB.values()) {
            for (int n : fnB2.sKd) {
                sKa.put(n, (Object)fnB2);
            }
        }
    }
}

