/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

public class fnE {
    public static final int sKi = 25;
    private final TByteObjectHashMap<fnC> sKj = new TByteObjectHashMap();
    private final TLongObjectHashMap<fnD> sKk = new TLongObjectHashMap();

    public fnC b(fnG fnG2) {
        return (fnC)this.sKj.get(fnG2.sKn);
    }

    public fnD us(long l) {
        return (fnD)this.sKk.get(l);
    }

    public void a(fnC fnC2) {
        this.sKj.put(fnC2.geH().sKn, (Object)fnC2);
    }

    public void a(fnD fnD2) {
        this.sKk.put(fnD2.Sn(), (Object)fnD2);
    }

    public void kd(long l) {
        this.sKk.remove(l);
    }

    public void c(tw_1 tw_12) {
        this.e(tw_12);
        this.f(tw_12);
    }

    public void d(tw_1 tw_12) {
        this.g(tw_12);
        this.h(tw_12);
    }

    private void e(tw_1 tw_12) {
        tw_12.abY.clear();
        TByteObjectIterator tByteObjectIterator = this.sKj.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            tx_2 tx_22 = new tx_2();
            ((fnC)tByteObjectIterator.value()).a(tx_22.aca);
            tw_12.abY.add(tx_22);
        }
    }

    private void f(tw_1 tw_12) {
        tw_12.abZ.clear();
        TLongObjectIterator tLongObjectIterator = this.sKk.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ty_1 ty_12 = new ty_1();
            ((fnD)tLongObjectIterator.value()).a(ty_12.acb);
            tw_12.abZ.add(ty_12);
        }
    }

    private void g(tw_1 tw_12) {
        this.sKj.clear();
        for (int i = 0; i < tw_12.abY.size(); ++i) {
            fnC fnC2 = new fnC();
            fnC2.b(tw_12.abY.get((int)i).aca);
            this.a(fnC2);
        }
    }

    private void h(tw_1 tw_12) {
        this.sKk.clear();
        for (int i = 0; i < tw_12.abZ.size(); ++i) {
            fnD fnD2 = new fnD();
            fnD2.b(tw_12.abZ.get((int)i).acb);
            this.a(fnD2);
        }
    }

    public azz_1<fnD> geI() {
        azz_1<fnD> azz_12 = new azz_1<fnD>(new fnF());
        TLongObjectIterator tLongObjectIterator = this.sKk.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            azz_12.add((fnD)tLongObjectIterator.value());
        }
        return azz_12;
    }

    public String toString() {
        return "DimBagRights{m_groupRights=" + this.sKj.size() + ", m_individualRights=" + this.sKk.size() + "}";
    }
}

