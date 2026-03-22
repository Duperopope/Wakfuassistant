/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class aVi {
    protected static final Logger hsF = Logger.getLogger(aVi.class);
    private static final aVi hsG = new aVi();
    private final TIntObjectHashMap<afz_1> hsH = new TIntObjectHashMap();

    private aVi() {
    }

    public static aVi cWF() {
        return hsG;
    }

    public afw_2 a(bsj_0 bsj_02, aft_2 aft_22) {
        if (bsj_02 == null || aft_22 == null) {
            return null;
        }
        return this.a(bsj_02.d(), aft_22);
    }

    public afw_2 a(int n, aft_2 aft_22) {
        afz_1 afz_12 = this.zX(n);
        return afz_12.c(aft_22);
    }

    public void m(bsS bsS2) {
        if (bsS2 == null) {
            return;
        }
        this.zW(bsS2.d());
    }

    public void zW(int n) {
        afz_1 afz_12 = this.zX(n);
        afz_12.cbg();
    }

    private afz_1 zX(int n) {
        afz_1 afz_12 = (afz_1)this.hsH.get(n);
        if (afz_12 == null) {
            afz_12 = new afz_1();
            this.hsH.put(n, (Object)afz_12);
        }
        return afz_12;
    }

    public void zY(int n) {
        afz_1 afz_12 = (afz_1)this.hsH.get(n);
        if (afz_12 != null) {
            afz_12.cbb();
        }
        this.hsH.remove(n);
    }

    public void zZ(int n) {
        afz_1 afz_12 = (afz_1)this.hsH.remove(n);
        if (afz_12 != null) {
            afz_12.cbd();
        }
    }
}

