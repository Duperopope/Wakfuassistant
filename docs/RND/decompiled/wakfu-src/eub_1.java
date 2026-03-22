/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eUB
 */
public class eub_1
implements anx_1<qu_0> {
    private static final Logger rwz = Logger.getLogger(eub_1.class);
    public static final long rwA = 1L;
    public static final long rwB = 2L;
    public static final long rwC = 4L;
    public static final long rwD = 8L;
    public static final long rwE = 16L;
    public static final long rwF = 32L;
    public static final long rwG = 64L;
    public static final long rwH = 128L;
    public static final long rwI = 256L;
    public static final long rwJ = 4096L;
    public static final long rwK = 8192L;
    public static final long rwL = 16384L;
    public static final long rwM = 0x400000000L;
    public static final long rwN = 0x10000000000L;
    public static final long rwO = 0x20000000000L;
    public static final long rwP = 0x40000000000L;
    public static final long rwQ = 0x80000000000L;
    public static final long rwR = 0x100000000000L;
    public static final long rwS = 0x200000000000L;
    public static final long rwT = 0x400000000000L;
    public static final long rwU = 0x800000000000L;
    public static final long rwV = 0x1000000000000L;
    public static final long rwW = 0x2000000000000L;
    public static final long rwX = 0x4000000000000L;
    public static final long rwY = 0x8000000000000L;
    protected final long[] rwZ;
    private static final long[] rxa = new long[0];

    public eub_1(long[] lArray) {
        this.rwZ = lArray == null || lArray.length == 0 ? rxa : lArray;
    }

    @Override
    public boolean gs(long l) {
        for (int i = 0; i < this.rwZ.length; ++i) {
            if ((this.rwZ[i] & l) == 0L) continue;
            return true;
        }
        return false;
    }

    @Override
    public azx_1<any_1, ArrayList<qu_0>> a(anu_1 anu_12, anu_1 anu_13) {
        any_1 any_12 = any_1.cKT;
        if (this.rwZ == null || this.rwZ == rxa) {
            return new azx_1<any_1, ArrayList<qu_0>>(any_1.cKR, new ArrayList());
        }
        if (!anu_12.bEf()) {
            return new azx_1<any_1, ArrayList<qu_0>>(any_1.cKT, new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.rwZ.length; ++i) {
            qu_0 qu_02;
            long l = this.rwZ[i];
            if ((2L & l) != 0L && anu_12 != anu_13 || (0x100L & l) != 0L && anu_12 == anu_13 || (0x80L & l) != 0L && (anu_12 == anu_13 || anu_13 == null || !(anu_12 instanceof ant_1) || !(anu_13 instanceof ant_1) || ((ant_1)anu_12).bcP() != ((ant_1)anu_13).bcP()) || (0x40000000000L & l) != 0L && (anu_13 == null || !(anu_13 instanceof exP) || anu_12 != ((exP)anu_13).dlL()) || (0x200000000000L & l) != 0L && (anu_13 == null || !(anu_13 instanceof exP) || anu_12 != ((exP)anu_13).dlI()) || (4L & l) != 0L && (anu_13 == null || !(anu_12 instanceof ant_1) || !(anu_13 instanceof ant_1) || ((ant_1)anu_12).bcP() != ((ant_1)anu_13).bcP()) || (8L & l) != 0L && (anu_13 == null || !(anu_12 instanceof ant_1) || !(anu_13 instanceof ant_1) || ((ant_1)anu_12).bcP() == ((ant_1)anu_13).bcP()) || (0x10L & l) != 0L && (!(anu_12 instanceof exP) || anu_12.Sn() <= 0L) || (0x20000000000L & l) != 0L && (!(anu_12 instanceof exP) || anu_12.Sn() > 0L) || (0x20L & l) != 0L && (!(anu_12 instanceof exP) || !((exP)anu_12).dOp()) || (0x100000000000L & l) != 0L && (!(anu_12 instanceof exP) || ((exP)anu_12).dOp()) || (0x1000L & l) != 0L && (!(anu_12 instanceof exP) || !((exP)(qu_02 = (exP)anu_12)).dOp() || qu_02.dlL() != anu_13 || ((exP)anu_12).baI() || ((exP)anu_12).baM()) || (0x4000L & l) != 0L && (!(anu_12 instanceof exP) || !((exP)anu_12).baI()) || (0x10000000000L & l) != 0L && (!(anu_12 instanceof exP) || !((exP)anu_12).baH()) || (0x400000000L & l) != 0L && (!(anu_13 instanceof exP) || anu_12 instanceof exP && ((exP)(qu_02 = (exP)anu_12)).dOp() && qu_02.dlL() == anu_13) || (0x40L & l) != 0L && !(anu_12 instanceof QQ) || (0x800000000000L & l) != 0L && !(anu_12 instanceof exP) || (0x80000000000L & l) != 0L && (!(anu_12 instanceof QQ) || ((QQ)anu_12).bci() != anu_13) || (0x400000000000L & l) != 0L && (!(anu_13 instanceof QQ) || ((QQ)anu_13).bci() != anu_12) || (0x1000000000000L & l) != 0L && (!(anu_13 instanceof QQ) || ((QQ)anu_13).bci() == anu_12) || (0x4000000000000L & l) != 0L && ((rj_0)((Object)anu_12)).bcQ() < 0 || (0x2000000000000L & l) != 0L && anu_12 instanceof QQ || anu_12 instanceof QQ && !((QQ)(qu_02 = (QQ)anu_12)).bcU() && (0x8000000000000L & l) == 0L) continue;
            if ((1L & l) != 0L) {
                if (anu_13 instanceof exP && anu_12 instanceof exP && ((exP)(qu_02 = (exP)anu_12)).a(exe_1.rDv)) continue;
                any_12 = any_1.cKV;
                continue;
            }
            return new azx_1<any_1, ArrayList<qu_0>>(any_1.cKR, arrayList);
        }
        return new azx_1<any_1, ArrayList<qu_0>>(any_12, arrayList);
    }

    private static boolean a(anu_1 anu_12, short s) {
        if (!(anu_12 instanceof exP)) {
            return false;
        }
        eyp eyp2 = ((exP)anu_12).doV();
        if (eyp2 == null) {
            return false;
        }
        return s == eyp2.aWP();
    }
}

