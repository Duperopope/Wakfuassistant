/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public final class fak
extends Enum<fak> {
    public static final /* enum */ fak rOb = new fak(0, 40);
    public static final /* enum */ fak rOc = new fak(1, 40);
    public static final /* enum */ fak rOd = new fak(2, 40);
    public static final /* enum */ fak rOe = new fak(3, 40);
    public static final /* enum */ fak rOf = new fak(4, 5);
    public static final /* enum */ fak rOg = new fak(5, 7);
    public static final /* enum */ fak rOh = new fak(6, 8);
    public static final /* enum */ fak rOi = new fak(7, 5);
    public static final /* enum */ fak rOj = new fak(8, 7);
    public static final /* enum */ fak rOk = new fak(9, 8);
    public static final /* enum */ fak rOl = new fak(10, 5);
    public static final /* enum */ fak rOm = new fak(11, 7);
    public static final /* enum */ fak rOn = new fak(12, 8);
    public static final /* enum */ fak rOo = new fak(13, 5);
    public static final /* enum */ fak rOp = new fak(14, 7);
    public static final /* enum */ fak rOq = new fak(15, 8);
    public static final /* enum */ fak rOr = new fak(16, 5);
    public static final /* enum */ fak rOs = new fak(17, 7);
    public static final /* enum */ fak rOt = new fak(18, 8);
    public static final /* enum */ fak rOu = new fak(19, 5);
    public static final /* enum */ fak rOv = new fak(20, 7);
    public static final /* enum */ fak rOw = new fak(21, 8);
    public static final /* enum */ fak rOx = new fak(22, 5);
    public static final /* enum */ fak rOy = new fak(23, 7);
    public static final /* enum */ fak rOz = new fak(24, 8);
    public static final /* enum */ fak rOA = new fak(25, 5);
    public static final /* enum */ fak rOB = new fak(26, 7);
    public static final /* enum */ fak rOC = new fak(27, 8);
    public static final /* enum */ fak rOD = new fak(28, 20);
    public static final /* enum */ fak rOE = new fak(29, 30);
    public static final /* enum */ fak rOF = new fak(30, 20);
    public static final /* enum */ fak rOG = new fak(31, 30);
    public static final /* enum */ fak rOH = new fak(32, 20);
    public static final /* enum */ fak rOI = new fak(33, 30);
    public static final /* enum */ fak rOJ = new fak(34, 20);
    public static final /* enum */ fak rOK = new fak(35, 30);
    public static final /* enum */ fak rOL = new fak(36, 40);
    public static final Map<fak, fak> rOM;
    public final int rON;
    public final short rOO;
    private faj rOP;
    private fal rOQ;
    private static final /* synthetic */ fak[] rOR;

    public static fak[] values() {
        return (fak[])rOR.clone();
    }

    public static fak valueOf(String string) {
        return Enum.valueOf(fak.class, string);
    }

    private fak(int n2, int n3) {
        this.rON = n2;
        this.rOO = GC.cu(n3);
    }

    public static fak TL(int n) {
        for (fak fak2 : fak.values()) {
            if (n != fak2.rON) continue;
            return fak2;
        }
        return null;
    }

    void a(faj faj2) {
        this.rOP = faj2;
    }

    void a(fal fal2) {
        this.rOQ = fal2;
    }

    public faj fQS() {
        return this.rOP;
    }

    public fal efN() {
        return this.rOQ;
    }

    private static /* synthetic */ fak[] fQT() {
        return new fak[]{rOb, rOc, rOd, rOe, rOf, rOg, rOh, rOi, rOj, rOk, rOl, rOm, rOn, rOo, rOp, rOq, rOr, rOs, rOt, rOu, rOv, rOw, rOx, rOy, rOz, rOA, rOB, rOC, rOD, rOE, rOF, rOG, rOH, rOI, rOJ, rOK, rOL};
    }

    static {
        rOR = fak.fQT();
        EnumMap<fak, fak> enumMap = new EnumMap<fak, fak>(fak.class);
        enumMap.put(rOf, rOg);
        enumMap.put(rOg, rOh);
        enumMap.put(rOi, rOj);
        enumMap.put(rOj, rOk);
        enumMap.put(rOl, rOm);
        enumMap.put(rOm, rOn);
        enumMap.put(rOo, rOp);
        enumMap.put(rOp, rOq);
        enumMap.put(rOr, rOs);
        enumMap.put(rOs, rOt);
        enumMap.put(rOu, rOv);
        enumMap.put(rOv, rOw);
        enumMap.put(rOx, rOy);
        enumMap.put(rOy, rOz);
        enumMap.put(rOA, rOB);
        enumMap.put(rOB, rOC);
        enumMap.put(rOD, rOE);
        enumMap.put(rOF, rOG);
        enumMap.put(rOH, rOI);
        enumMap.put(rOJ, rOK);
        rOM = Collections.unmodifiableMap(enumMap);
        fal.bkZ();
        faj.bkZ();
    }
}

