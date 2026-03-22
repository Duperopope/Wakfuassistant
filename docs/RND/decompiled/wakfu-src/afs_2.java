/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aFS
 */
public final class afs_2 {
    private static Logger dJL = Logger.getLogger((String)"ParticleScripts");
    private static final afs_2 dJM = new afs_2();
    private static final String dJN = "particles/";

    private afs_2() {
    }

    public static afs_2 caN() {
        return dJM;
    }

    public String xN(int n) {
        assert (afs_1.can().bYf() != null);
        return String.format("%s%d%s", dJN, n, afs_1.can().bLX());
    }

    @Nullable
    private afx_1 xD(int n) {
        return afs_1.can().a(this.xN(n), (afr_1[])null, true);
    }

    public boolean b(int n, int[] nArray) {
        afq_2[] afq_2Array = this.a(n, nArray, "playAps");
        if (afq_2Array == null) {
            return false;
        }
        if (afq_2Array.length == 0) {
            return false;
        }
        afq_2 afq_22 = afq_2Array[0];
        if (afq_22.caK() != aff_2.dJA) {
            return false;
        }
        return (Boolean)afq_2Array[0].getValue();
    }

    private afq_2[] a(int n, int[] nArray, String string) {
        afx_1 afx_12 = this.xD(n);
        if (afx_12 == null) {
            return null;
        }
        afq_2[] afq_2Array = new afq_2[nArray.length];
        for (int i = 0; i < afq_2Array.length; ++i) {
            afq_2Array[i] = new afq_2(nArray[i]);
        }
        afq_2[] afq_2Array2 = afx_12.a(string, afq_2Array, new afp_2[0]);
        afx_12.cat();
        return afq_2Array2;
    }

    public void clear() {
    }
}

