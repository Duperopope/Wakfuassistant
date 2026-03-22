/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

/*
 * Renamed from flW
 */
public class flw_0
extends flv_0<fmO> {
    static final flz sGk = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<flw_0> sGl = new flX();

    flw_0(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFp;
    }

    @Override
    public boolean a(fmO fmO2) {
        exP exP2;
        if (fmO2.gdy() != eUw.ruG) {
            return false;
        }
        exP exP3 = (exP)fmO2.elp();
        if (exP3 == (exP2 = fmO2.gdC())) {
            return false;
        }
        Collection<? extends exP> collection = fmO2.gdD();
        for (exP exP4 : collection) {
            euc_1 euc_12 = exP4;
            if (euc_12.aFW() != 1) continue;
            return true;
        }
        return false;
    }
}

