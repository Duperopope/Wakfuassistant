/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eCo
 */
public class eco_0
extends eak_0 {
    private static final List<amz_1[]> pyP = new ArrayList<amz_1[]>();
    private ArrayList<amu_1> pyQ;
    private amq_2 pyR;

    @Override
    protected List<amz_1[]> bDC() {
        return pyP;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eco_0(List<amx_1> list) {
        if (this.r(list) == 0) {
            if (list.get(0).bDv() == amz_1.cJA) {
                this.pyQ = null;
                this.pyR = (amq_2)list.get(0);
            } else {
                this.pyQ = new ArrayList();
                this.pyR = null;
                for (amx_1 amx_12 : list) {
                    amu_1 amu_12 = (amu_1)amx_12;
                    this.pyQ.add(amu_12);
                }
            }
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Optional<exP> optional = this.n(object, object3);
        if (optional.isEmpty()) {
            return 0L;
        }
        TLongArrayList tLongArrayList = this.o(object, object2, object3, object4);
        return this.a(optional.get(), tLongArrayList);
    }

    private Optional<exP> n(@Nullable Object object, @Nullable Object object2) {
        fhx fhx2;
        Object object3;
        if (object instanceof exP) {
            exP exP2 = (exP)object;
            return Optional.of(exP2);
        }
        if (object instanceof fhx && (object3 = (fhx2 = (fhx)object).fYb()) instanceof exP) {
            exP exP3 = (exP)object3;
            return Optional.of(exP3);
        }
        if (object == null) {
            if (object2 instanceof ehe_0) {
                object3 = (ehe_0)object2;
                return Optional.ofNullable(object3.fog());
            }
            throw new amf_2("Criteria is trying to get item quantity of null user, ids=" + String.valueOf(this.pyQ) + ", idsalt=" + String.valueOf(this.pyR));
        }
        throw new amf_2("Criteria is trying to get item quantity of something that is not a character: " + String.valueOf(object) + ", ids=" + String.valueOf(this.pyQ) + ", idsalt=" + String.valueOf(this.pyR));
    }

    protected int a(exP exP2, TLongArrayList tLongArrayList) {
        int n;
        fft_0 fft_02 = exP2.dod();
        if (fft_02 == null) {
            return 0;
        }
        int n2 = 0;
        for (n = 0; n < tLongArrayList.size(); ++n) {
            Object object2;
            ArrayList<Object> arrayList;
            gq_0<vu_1> gq_02;
            int n3 = (int)tLongArrayList.get(n);
            TLongObjectIterator<ffs_0> tLongObjectIterator = fft_02.fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                gq_02 = (ffs_0)tLongObjectIterator.value();
                arrayList = ((ffs_0)gq_02).fVb().pd(n3);
                if (arrayList == null) continue;
                for (Object object2 : arrayList) {
                    n2 += ((ffV)object2).bfd();
                }
            }
            gq_02 = exP2.doC();
            if (gq_02 != null && (arrayList = ((RM)((Object)gq_02)).pd(n3)) != null) {
                for (Object object2 : arrayList) {
                    n2 += ((ffV)object2).bfd();
                }
            }
            Iterator<Object> iterator = exP2.dmL();
            object2 = exP2.dnP();
            if (iterator == null || object2 == null) continue;
            List<ffV> list = ((fhk)((Object)iterator)).b((fhe)object2, n3);
            for (ffV ffV2 : list) {
                n2 += ffV2.bfd();
            }
        }
        if (exP2 instanceof ffh) {
            fec_0 fec_02 = (fec_0)((ffh)((Object)exP2)).a(fez_0.sep);
            for (int i = 0; i < tLongArrayList.size(); ++i) {
                ffm ffm2 = fec_02.UB((int)tLongArrayList.get(i));
                if (ffm2 == null) continue;
                n2 += ffm2.bfd();
            }
        }
        for (n = 0; n < tLongArrayList.size(); ++n) {
            n2 += fea_0.ah(exP2.aZj(), (int)tLongArrayList.get(n));
        }
        return n2;
    }

    public TLongArrayList o(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList;
        if (this.pyR != null) {
            tLongArrayList = this.pyR.f(object, object2, object3, object4);
        } else {
            tLongArrayList = new TLongArrayList();
            for (int i = 0; i < this.pyQ.size(); ++i) {
                long l = this.pyQ.get(i).d(object, object2, object3, object4);
                tLongArrayList.add(l);
            }
        }
        return tLongArrayList;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGs;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pyP.add(amz_1Array);
    }
}

