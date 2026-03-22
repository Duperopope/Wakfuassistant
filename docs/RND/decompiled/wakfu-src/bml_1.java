/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.HashMap;

/*
 * Renamed from bMl
 */
public class bml_1
extends ers_0 {
    private long dxy;
    private int kwu;
    private final TLongLongHashMap kwv = new TLongLongHashMap();
    private bmp_0 kww;

    public bml_1(qu_0 qu_02) {
        super(qu_02);
    }

    @Override
    public void clear() {
        this.kwv.clear();
        if (this.kww != null) {
            this.kww.clear();
        }
        super.clear();
    }

    @Override
    public void bch() {
        this.kwv.clear();
        if (this.kww != null) {
            this.kww.clear();
        }
        super.bch();
    }

    @Override
    public void eer() {
        abb_2.bUA().hk(this.dxy);
        super.eer();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!(aam_22 instanceof aba_2)) {
            return false;
        }
        if (((aba_2)aam_22).bUx() != this.dxy) {
            return super.b(aam_22);
        }
        if (!this.kwv.isEmpty()) {
            ++this.kwu;
            HashMap<Long, QD> hashMap = new HashMap<Long, QD>();
            for (long l : this.kwv.keys()) {
                QD qD = (QD)this.bhi.get(l);
                if (qD == null) continue;
                hashMap.put(this.lN(l), qD);
            }
            if (aie_0.cfo().cVK() != null) {
                aie_0.cfo().cVK().a(new exg_2(hashMap));
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean o(long l, boolean bl) {
        this.kwv.remove(l);
        return super.o(l, bl);
    }

    @Override
    public void p(QD qD) {
        long l = 0L;
        ero_0 ero_02 = (ero_0)qD;
        if (ero_02.bbh() != null) {
            if (!ero_02.bbY() && ero_02.fGo()) {
                l = ero_02.fGm();
                this.kwv.put(ero_02.LV(), (long)this.kwu + l / 1000L);
            }
            super.p(qD);
        }
    }

    @Override
    public void a(qu_0 qu_02, qm_0 qm_02) {
        this.dxy = abb_2.bUA().a(this, 1000L, 0);
        this.kwu = 0;
        this.kww = null;
        super.a(qu_02, qm_02);
    }

    public void a(bmp_0 bmp_02) {
        this.kww = bmp_02;
    }

    public long lN(long l) {
        if (this.kwv.get(l) > (long)this.kwu) {
            return this.kwv.get(l) - (long)this.kwu;
        }
        return -1L;
    }
}

