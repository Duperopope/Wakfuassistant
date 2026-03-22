/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fme
extends flv_0<fmQ> {
    static final flz sGs = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<fme> sGt = new fmf();

    fme(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFn;
    }

    @Override
    public boolean a(fmQ fmQ2) {
        if (!fmQ2.gdy().fLf()) {
            return false;
        }
        exP exP2 = fmQ2.gdF();
        if (fmQ2.gdG() == exP2.bcP()) {
            return false;
        }
        return exP2.ffF().gaX();
    }
}

