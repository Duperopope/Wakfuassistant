/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eHg
 */
public class ehg_0
extends eak_0 {
    private static final List<amz_1[]> pFk = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pFk;
    }

    public ehg_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    public ehg_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2;
        if (object == null) {
            if (!(object3 instanceof ehe_0)) throw new amf_2("on cherche l'\u00e9quipement d'un user null");
            exP2 = ((ehe_0)object3).fog();
        } else {
            if (!(object instanceof exP)) {
                throw new amf_2("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            exP2 = (exP)object;
        }
        fft_0 fft_02 = exP2.dod();
        TLongObjectIterator<ffs_0> tLongObjectIterator = fft_02.fVg();
        long l = 0L;
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            l += (long)(ffs_02.bfa() - ffs_02.aVo());
        }
        return l;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFK;
    }
}

