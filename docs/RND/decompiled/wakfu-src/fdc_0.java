/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fdc
 */
public class fdc_0
extends fdz_0 {
    public static final String rUZ = "elementId";
    public static final String rVa = "userId";
    private final fdf[] rVb;

    public fdc_0(int n, eIx eIx2, int n2, fdf[] fdfArray) {
        super(n, 0, eIx2, n2);
        this.rVb = fdfArray;
    }

    public fdf[] fTa() {
        return this.rVb;
    }

    private short fTb() {
        int n = 0;
        for (fdf fdf2 : this.rVb) {
            n += fdf2.fTk();
        }
        return (short)n;
    }

    public fde_0 eL(short s) {
        for (fdf fdf2 : this.rVb) {
            for (fde_0 fde_02 : fdf2.rVs) {
                if (fde_02.fTe() != s) continue;
                return fde_02;
            }
        }
        return null;
    }

    public fdf eM(short s) {
        for (fdf fdf2 : this.rVb) {
            for (fde_0 fde_02 : fdf2.rVs) {
                if (fde_02.fTe() != s) continue;
                return fdf2;
            }
        }
        return null;
    }

    public rw_0 dNn() {
        return rw_0.Y((short)0);
    }

    public rw_0[] dNf() {
        rw_0[] rw_0Array = new rw_0[this.fTb()];
        System.arraycopy(rw_0.values(), 0, rw_0Array, 0, rw_0Array.length);
        return rw_0Array;
    }

    public String toString() {
        return "GenericActivableParameter{} " + super.toString();
    }
}

