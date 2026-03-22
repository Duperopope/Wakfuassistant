/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class eIi
extends Enum<eIi> {
    public static final /* enum */ eIi qvx = new eIi(-1);
    public static final /* enum */ eIi qvy = new eIi(20);
    public static final /* enum */ eIi qvz = new eIi(35);
    public static final /* enum */ eIi qvA = new eIi(50);
    public static final /* enum */ eIi qvB = new eIi(65);
    public static final /* enum */ eIi qvC = new eIi(80);
    public static final /* enum */ eIi qvD = new eIi(95);
    public static final /* enum */ eIi qvE = new eIi(110);
    public static final /* enum */ eIi qvF = new eIi(125);
    public static final /* enum */ eIi qvG = new eIi(140);
    public static final /* enum */ eIi qvH = new eIi(155);
    public static final /* enum */ eIi qvI = new eIi(170);
    public static final /* enum */ eIi qvJ = new eIi(185);
    public static final /* enum */ eIi qvK = new eIi(200);
    public static final /* enum */ eIi qvL = new eIi(215);
    public static final /* enum */ eIi qvM = new eIi(230);
    public static final eIi[] qvN;
    private final short qvO;
    private static final /* synthetic */ eIi[] qvP;

    public static eIi[] values() {
        return (eIi[])qvP.clone();
    }

    public static eIi valueOf(String string) {
        return Enum.valueOf(eIi.class, string);
    }

    private eIi(int n2) {
        this.qvO = (short)n2;
    }

    public short cmL() {
        return this.qvO;
    }

    public static eIi PO(int n) {
        for (eIi eIi2 : qvN) {
            if (eIi2.qvO != n) continue;
            return eIi2;
        }
        return null;
    }

    public static short dB(short s) {
        eIi eIi2 = null;
        for (eIi eIi3 : qvN) {
            if (eIi3.qvO == s) {
                return eIi3.qvO;
            }
            if (eIi3.qvO < s) continue;
            int n = Math.abs(eIi3.qvO - s);
            if (eIi2 == null) {
                eIi2 = eIi3;
                continue;
            }
            if (n >= Math.abs(eIi2.qvO - s)) continue;
            eIi2 = eIi3;
        }
        return eIi2 != null ? eIi2.qvO : (short)ewo_0.oBF.i(ewr_0.oCk);
    }

    @NotNull
    public static eIi dC(short s) {
        eIi eIi2 = null;
        for (eIi eIi3 : qvN) {
            if (eIi3.qvO == s) {
                return eIi3;
            }
            if (eIi3.qvO > s) continue;
            int n = Math.abs(eIi3.qvO - s);
            if (eIi2 == null) {
                eIi2 = eIi3;
                continue;
            }
            if (n >= Math.abs(eIi2.qvO - s)) continue;
            eIi2 = eIi3;
        }
        return eIi2 != null ? eIi2 : qvx;
    }

    public static Bu<Short, Short> dD(short s) {
        for (int i = 0; i < qvN.length - 1; ++i) {
            if (eIi.qvN[i].qvO >= s || eIi.qvN[i + 1].qvO < s) continue;
            return new Bu<Short, Short>((short)(eIi.qvN[i].qvO + 1), eIi.qvN[i + 1].qvO);
        }
        return new Bu<Short, Short>(eIi.qvN[eIi.qvN.length - 1].qvO, (short)ewo_0.oBF.i(ewr_0.oCk));
    }

    public String toString() {
        return "BuildSheetLevelEnum{m_level=" + this.qvO + "}";
    }

    private static /* synthetic */ eIi[] fwn() {
        return new eIi[]{qvx, qvy, qvz, qvA, qvB, qvC, qvD, qvE, qvF, qvG, qvH, qvI, qvJ, qvK, qvL, qvM};
    }

    static {
        qvP = eIi.fwn();
        qvN = eIi.values();
    }
}

