/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ffD
 */
public abstract class ffd_0<IT extends ffh_0, MI extends ffc_0> {
    protected static final Logger sfS = Logger.getLogger(ffd_0.class);
    private final eyy_0 sfT = new eyy_0(200, 30, 10, 6);
    protected final TLongObjectHashMap<MI> sfU = new TLongObjectHashMap();
    protected final ArrayList<fgx_0> sfV = new ArrayList(1);
    final Sp sfW = new ffe_0(this);

    protected ffd_0() {
        this.a(new fff_0(this));
    }

    public final eyy_0 fVw() {
        return this.sfT;
    }

    public final void a(fgx_0 fgx_02) {
        if (!this.sfV.contains(fgx_02)) {
            this.sfV.add(fgx_02);
        }
    }

    public final void b(fgx_0 fgx_02) {
        this.sfV.remove(fgx_02);
    }

    public final void d(MI MI) {
        this.sfU.put(((ffc_0)MI).Lx(), MI);
        for (fgx_0 fgx_02 : this.sfV) {
            fgx_02.b((ffc_0)MI);
        }
    }

    public final void e(MI MI) {
        this.ti(((ffc_0)MI).Lx());
    }

    public final void ti(long l) {
        ffc_0 ffc_02 = (ffc_0)this.sfU.remove(l);
        for (fgx_0 fgx_02 : this.sfV) {
            fgx_02.c(ffc_02);
        }
    }

    public final void Y(TObjectProcedure<MI> tObjectProcedure) {
        if (!this.sfU.isEmpty()) {
            this.sfU.forEachValue(tObjectProcedure);
        }
    }

    public final TLongObjectIterator<MI> fVx() {
        return this.sfU.iterator();
    }

    public final int fVy() {
        return this.sfU.size();
    }

    public final void fVz() {
        this.sfT.clear();
        this.sfU.forEachValue((TObjectProcedure)new ffg_0(this));
        this.sfU.clear();
    }

    public final MI tj(long l) {
        return (MI)((ffc_0)this.sfU.get(l));
    }

    public final azx_1<MI, IT> tk(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffh_0 ffh_02 = (ffh_0)((ffc_0)tLongObjectIterator.value()).dN(l);
            if (ffh_02 == null) continue;
            return new azx_1<ffc_0, ffh_0>((ffc_0)tLongObjectIterator.value(), ffh_02);
        }
        return null;
    }

    public final boolean UT(int n) {
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((ffc_0)tLongObjectIterator.value()).pb(n)) continue;
            return true;
        }
        return false;
    }

    public final azx_1<MI, IT> tl(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffh_0 ffh_02 = (ffh_0)((ffc_0)tLongObjectIterator.value()).dL(l);
            if (ffh_02 == null) continue;
            return new azx_1<ffc_0, ffh_0>((ffc_0)tLongObjectIterator.value(), ffh_02);
        }
        return null;
    }

    public final int fVA() {
        int n = 0;
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((ffc_0)tLongObjectIterator.value()).aVo();
        }
        return n;
    }

    public final int fVB() {
        int n = 0;
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            n += ((ffc_0)tLongObjectIterator.value()).bfa();
        }
        return n;
    }

    public final azx_1<Long, Short> tm(long l) {
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            short s = ((ffc_0)tLongObjectIterator.value()).dK(l);
            if (s == -1) continue;
            return new azx_1<Long, Short>(((ffc_0)tLongObjectIterator.value()).Lx(), s);
        }
        return null;
    }

    public final boolean fVC() {
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            if (!((ffc_0)tLongObjectIterator.value()).bfb()) continue;
            return true;
        }
        return false;
    }

    public short fVD() {
        short s;
        TLongObjectIterator tLongObjectIterator = this.sfU.iterator();
        int s2 = Short.MAX_VALUE;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            short s3 = ((ffc_0)tLongObjectIterator.value()).fVt();
            if (s3 >= s) continue;
            s = s3;
        }
        return s;
    }
}

