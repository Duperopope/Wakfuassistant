/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteByteIterator
 */
import gnu.trove.iterator.TByteByteIterator;
import java.util.Set;

/*
 * Renamed from ezG
 */
public class ezg_0<T extends pv_0>
extends ps_0<T> {
    public static final Set<pv_0> psi = Set.of(ezj_0.psz);
    public static final byte psj = 0;
    public static final byte psk = 1;
    public static final byte psl = 4;
    private final ezh_0 psm = new ezh_0();
    private final aab_2<pw_0> psn = new aab_2<pw_0>(this.psm);

    public static ezg_0 a(byte by, pw_0 pw_02) {
        ezg_0 ezg_02;
        switch (by) {
            case 0: {
                ezg_02 = new ezg_0();
                break;
            }
            case 1: {
                ezg_02 = new ezg_0();
                break;
            }
            default: {
                beO.fatal((Object)"type de manager de propri\u00e9t\u00e9 inconnu");
                return null;
            }
        }
        ezg_02.psn.aa(pw_02);
        return ezg_02;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.psn.clear();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.psn.clear();
    }

    public void a(pw_0 pw_02) {
        this.psn.aa(pw_02);
    }

    @Override
    public boolean b(pw_0 pw_02) {
        return this.psn.ab(pw_02);
    }

    private void b(T t, px_0 px_02) {
        if (this.psm.pso != null) {
            beO.error((Object)"Attention, \u00e9crasement de propri\u00e9t\u00e9 dans le notifier", (Throwable)new Exception());
        }
        this.psm.pso = t;
        this.psm.mdr = px_02;
        this.psn.bUe();
        this.psm.pso = null;
        this.psm.mdr = px_0.beR;
    }

    @Override
    public boolean a(wi_1 wi_12) {
        wi_12.clear();
        TByteByteIterator tByteByteIterator = this.beP.iterator();
        int n = this.beP.size();
        while (n-- > 0) {
            tByteByteIterator.advance();
            wj_1 wj_12 = new wj_1();
            wj_12.Ri = tByteByteIterator.key();
            wj_12.aid = tByteByteIterator.value();
            wi_12.aic.add(wj_12);
        }
        return true;
    }

    @Override
    public boolean b(wi_1 wi_12) {
        this.beP.clear();
        for (wj_1 wj_12 : wi_12.aic) {
            this.beP.put(wj_12.Ri, wj_12.aid);
        }
        this.b(null, px_0.beS);
        return true;
    }

    @Override
    public byte c(T t) {
        byte by = super.c(t);
        this.b(t, px_0.beT);
        return by;
    }

    @Override
    public byte d(T t) {
        byte by = super.d(t);
        this.b(t, px_0.beV);
        return by;
    }

    @Override
    public void e(T t) {
        super.e(t);
        this.b(t, px_0.beU);
    }

    @Override
    public void reset() {
        super.reset();
        this.b(null, px_0.beW);
    }
}

