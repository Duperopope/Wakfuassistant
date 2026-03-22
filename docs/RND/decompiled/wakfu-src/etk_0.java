/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteByteIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteByteIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eTk
 */
public class etk_0
extends ps_0<pv_0> {
    protected static final Logger rmW = Logger.getLogger(etk_0.class);
    private pw_0 rmX = null;

    public void d(pw_0 pw_02) {
        this.rmX = pw_02;
    }

    private void b(pv_0 pv_02, px_0 px_02) {
        if (this.rmX != null) {
            this.rmX.a(pv_02, px_02);
        }
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
        boolean bl = true;
        for (wj_1 wj_12 : wi_12.aic) {
            etl_0 etl_02 = etl_0.Sq(wj_12.Ri);
            if (etl_02 != null) {
                this.beP.put(wj_12.Ri, wj_12.aid);
                continue;
            }
            rmW.error((Object)("erreur \u00e0 la d\u00e9s\u00e9rialisation : property inconnue : " + wj_12.Ri));
            bl = false;
        }
        this.b(null, px_0.beS);
        return bl;
    }

    @Override
    public byte c(pv_0 pv_02) {
        byte by = super.c(pv_02);
        this.b(pv_02, px_0.beT);
        return by;
    }

    @Override
    public byte d(pv_0 pv_02) {
        byte by = super.d(pv_02);
        this.b(pv_02, px_0.beV);
        return by;
    }

    @Override
    public void e(pv_0 pv_02) {
        super.e(pv_02);
        this.b(pv_02, px_0.beU);
    }

    @Override
    public void reset() {
        super.reset();
        this.b(null, px_0.beW);
    }
}

