/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class fag
implements RU<ffV> {
    public static final fag rNz = new fag();

    private fag() {
    }

    @Override
    public int a(RS rS, ffV ffV2) {
        ArrayList arrayList = rS.pd(ffV2.avr());
        short s = ffV2.bfd();
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgg);
        if (ffV2.fWm() || ang_22 != null && !ang_22.b(null, null, null, null)) {
            return -4;
        }
        for (int i = 0; i < arrayList.size() && s > 0; ++i) {
            ffV ffV3 = (ffV)arrayList.get(i);
            s = (short)(s - (ffV3.n(ffV2) ? ffV3.fWa() : (short)0));
        }
        return s <= 0 || !rS.isFull() ? 1 : -1;
    }

    @Override
    public int a(RS rS, ffV ffV2, short s) {
        if (s < 0) {
            return -5;
        }
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgg);
        if (ffV2.fWm() || ang_22 != null && !ang_22.b(null, null, null, null)) {
            return -4;
        }
        RL rL = (RL)rS;
        ffV ffV3 = (ffV)rL.ai(s);
        if (ffV3 == null) {
            return 0;
        }
        if (!ffV2.n(ffV3)) {
            return -1;
        }
        return ffV2.bfd() <= ffV3.fWa() ? 1 : -1;
    }

    @Override
    public int a(RS rS, ffV ffV2, ffV ffV3) {
        throw new UnsupportedOperationException("Pas de remplacement");
    }

    @Override
    public int b(RS rS, ffV ffV2) {
        return rS.f(ffV2) ? 0 : -2;
    }

    @Override
    public boolean a(ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        throw new UnsupportedOperationException("Pas de v\u00e9rification de crit\u00e8re");
    }

    @Override
    public boolean a(RS<ffV> rS, qu_0 qu_02, qm_0 qm_02) {
        throw new UnsupportedOperationException("Pas de v\u00e9rification de crit\u00e8re");
    }
}

