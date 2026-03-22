/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eJA
extends eJE
implements RU<ffV> {
    public eJA(fdl fdl2) {
        super(fdl2);
    }

    @Override
    public boolean b(fgj_0 fgj_02, long l) {
        return true;
    }

    @Override
    public boolean c(fgj_0 fgj_02, long l) {
        return !this.qAe.bfb() && fgj_02.exS() >= l;
    }

    @Override
    public int a(RS<ffV> rS, long l, short s) {
        int n;
        ffV ffV2 = rS.dN(l);
        if (ffV2 == null) {
            return -2;
        }
        short s2 = ffV2.bfd();
        int n2 = Math.min(s, s2);
        int n3 = n2 == s2 ? this.b(rS, ffV2) : (n = n2 < s2 ? 0 : -1);
        if (n < 0) {
            return n;
        }
        return 0;
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
        return s <= 0 || !rS.isFull() ? 0 : -1;
    }

    @Override
    public int a(RS rS, ffV ffV2, short s) {
        return -1;
    }

    @Override
    public int a(RS rS, ffV ffV2, ffV ffV3) {
        throw new UnsupportedOperationException("Pas de remplacement");
    }

    @Override
    public int b(RS rS, ffV ffV2) {
        return !this.qAe.bfb() && rS.f(ffV2) ? 0 : -1;
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

