/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public class flU
extends flv_0<fmO> {
    static final flz sGi = new flz(new aop_1("Empty", new aou_1[0]));
    public static final fmm_0<flU> sGj = new flV();

    flU(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFf;
    }

    @Override
    public boolean a(fmO fmO2) {
        Object object;
        if (!fmO2.gdy().fLf()) {
            return false;
        }
        exP exP2 = (exP)fmO2.elp();
        if (exP2 == fmO2.gdC()) {
            return false;
        }
        fjo_0 fjo_02 = ((exP)fmO2.elp()).ffL();
        if (exP2 == fmO2.gdB()) {
            object = fmO2.gdC().ffF();
            if (!fjo_0.a(object.ems(), fjo_02)) {
                return false;
            }
            if (object.emF() != null) {
                return true;
            }
        }
        object = fmO2.gdD();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            fjm fjm2 = (fjm)e2;
            fjn_0 fjn_02 = fjm2.ffF();
            if (!fjo_0.a(fjn_02.ems(), fjo_02) || fjn_02.emF() == null) continue;
            return true;
        }
        return false;
    }
}

