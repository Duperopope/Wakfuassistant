/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public final class fal
extends Enum<fal> {
    public static final /* enum */ fal rOS = new fal(0, fak.rOb, fak.rOc, fak.rOd, fak.rOe);
    public static final /* enum */ fal rOT = new fal(1, fak.rOf, fak.rOi, fak.rOl, fak.rOo, fak.rOr, fak.rOu, fak.rOx, fak.rOA);
    public static final /* enum */ fal rOU = new fal(2, fak.rOD, fak.rOF, fak.rOH, fak.rOJ);
    public static final /* enum */ fal rOV = new fal(3, fak.rOL);
    private final byte rOW;
    private final fak[] rOX;
    private static final /* synthetic */ fal[] rOY;

    public static fal[] values() {
        return (fal[])rOY.clone();
    }

    public static fal valueOf(String string) {
        return Enum.valueOf(fal.class, string);
    }

    private fal(byte by, fak ... fakArray) {
        this.rOW = by;
        this.rOX = fakArray;
    }

    static void bkZ() {
        fal fal2 = rOS;
    }

    public static fal fX(byte by) {
        for (fal fal2 : fal.values()) {
            if (fal2.rOW != by) continue;
            return fal2;
        }
        return null;
    }

    public byte aJr() {
        return this.rOW;
    }

    public fak[] fQU() {
        return this.rOX;
    }

    public static fak a(fal fal2, List<fak> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            fak fak2 = list.get(i);
            if (!ArrayUtils.contains((Object[])fal2.fQU(), (Object)((Object)fak2))) continue;
            return fak2;
        }
        return null;
    }

    private static /* synthetic */ fal[] fQV() {
        return new fal[]{rOS, rOT, rOU, rOV};
    }

    static {
        rOY = fal.fQV();
        for (fal fal2 : fal.values()) {
            for (fak fak2 : fal2.fQU()) {
                fak2.a(fal2);
            }
        }
    }
}

