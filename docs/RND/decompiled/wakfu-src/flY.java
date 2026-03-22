/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public class flY
extends flv_0<fmO> {
    static final flz sGm = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<flY> sGn = new flz_0();

    flY(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFq;
    }

    @Override
    public boolean a(fmO fmO2) {
        exP exP2;
        if (fmO2.gdy() != eUw.ruG) {
            return false;
        }
        foG foG2 = fmO2.gdx();
        if (foG2 == null) {
            return false;
        }
        exP exP3 = (exP)fmO2.elp();
        if (exP3 == (exP2 = fmO2.gdC())) {
            return false;
        }
        Collection<? extends exP> collection = fmO2.gdD();
        for (exP exP4 : collection) {
            exP exP5 = exP4;
            if (exP5.aFW() != 1 || !foG2.XV(exP5.doV().cqy())) continue;
            return true;
        }
        return false;
    }
}

