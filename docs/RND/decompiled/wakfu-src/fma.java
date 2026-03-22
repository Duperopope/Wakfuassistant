/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fma
extends flv_0<fmP> {
    static final flz sGo = new flz(new aop_1("Nothing", new aou_1[0]));
    public static final fmm_0<fma> sGp = new fmb();

    fma(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
    }

    @Override
    public flA gdh() {
        return flA.sFj;
    }

    @Override
    public boolean a(fmP fmP2) {
        exP exP2;
        exP exP3 = (exP)fmP2.elp();
        exP exP4 = fmP2.gdB();
        if (exP4 == null) {
            sEv.error((Object)"Attacker null lors du test de loi d'incruste !!!");
            return false;
        }
        exP exP5 = fmP2.gdC();
        if (exP5 == null) {
            sEv.error((Object)"Defender null lors du test de loi d'incruste !!!");
            return false;
        }
        exP exP6 = exP2 = exP3.bcP() == exP4.bcP() ? exP4 : exP5;
        if (!(exP3 instanceof Vg) || !(exP2 instanceof Vg)) {
            return false;
        }
        long l = ((Vg)((Object)exP3)).b(Vf.bxK);
        long l2 = ((Vg)((Object)exP2)).b(Vf.bxK);
        if (fmP2.gdy() == eUw.ruS) {
            return false;
        }
        if (l == 0L) {
            return true;
        }
        return l != l2;
    }
}

