/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eML
 */
public final class eml_0 {
    public static boolean a(int n, exP exP2) {
        long l = fcK.rUe.sq(exP2.Xi());
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            return false;
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(((exP)t).aqZ());
        if (fse_02 == null) {
            return false;
        }
        if (!fse_02.eqx() && !fse_02.eqw()) {
            return true;
        }
        if (n == -1) {
            return exP2.cmL() == exP2.dnG();
        }
        return exP2.cmL() == n;
    }
}

