/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public class fmc
extends flv_0<fmP> {
    static final flz sGq = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<fmc> sGr = new fmd();

    fmc(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFi;
    }

    @Override
    public boolean a(fmP fmP2) {
        if (!fmP2.gdy().fLf()) {
            return false;
        }
        Collection<? extends exP> collection = fmP2.gdE();
        for (exP exP2 : collection) {
            fjm fjm2 = exP2;
            if (!fjm2.ffF().gaX()) continue;
            return true;
        }
        return false;
    }
}

