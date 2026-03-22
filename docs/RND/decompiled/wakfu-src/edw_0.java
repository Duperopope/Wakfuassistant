/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from eDW
 */
public class edw_0
extends eAH {
    private static final ArrayList<amz_1[]> pBe = new ArrayList();
    private ArrayList<amu_1> ksQ;
    private ArrayList<ffS> pBb;
    private boolean pBc;
    private boolean pBd = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pBe;
    }

    private ffS rT(String string) {
        for (ffS ffS2 : ffS.values()) {
            if (!ffS2.aXB().equalsIgnoreCase(string)) continue;
            return ffS2;
        }
        return null;
    }

    public edw_0(ArrayList<amx_1> arrayList) {
        amu_1 amu_12;
        if (this.r(arrayList) == 0) {
            this.ksQ = new ArrayList();
            for (amx_1 object : arrayList) {
                amu_12 = (amu_1)object;
                this.ksQ.add(amu_12);
            }
            this.pBb = null;
        }
        if (this.r(arrayList) == 1) {
            this.ksQ = new ArrayList();
            for (amx_1 amx_12 : arrayList) {
                if (amx_12.bDv() == amz_1.cJy) {
                    amu_12 = (amu_1)amx_12;
                    this.ksQ.add(amu_12);
                }
                if (amx_12.bDv() != amz_1.cJx) continue;
                anh_2 anh_22 = (anh_2)amx_12;
                if (anh_22.getValue().equalsIgnoreCase("inventory")) {
                    this.pBc = true;
                    continue;
                }
                if (anh_22.getValue().equalsIgnoreCase("target")) {
                    this.pBd = true;
                    continue;
                }
                if (this.pBb == null) {
                    this.pBb = new ArrayList();
                }
                this.pBb.add(this.rT(anh_22.getValue()));
            }
        }
    }

    private boolean a(fhy_0 fhy_02, Object object, Object object2, Object object3, Object object4) {
        for (fhy_0 fhy_03 = fhy_02; fhy_03 != null; fhy_03 = fhy_03.fZm()) {
            for (int n = 0; n < this.ksQ.size(); n = (int)((byte)(n + 1))) {
                if ((short)this.ksQ.get(n).d(object, object2, object3, object4) != fhy_03.aIi()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(ffS ffS2, fhy_0 fhy_02) {
        ffS[] ffSArray;
        if (fhy_02 != null && ffS2 != null && (ffSArray = fhy_02.fZs()) != null && ffSArray.length > 0) {
            for (int i = 0; i < ffSArray.length; ++i) {
                if (ffS2 != ffSArray[i]) continue;
                return false;
            }
        }
        return true;
    }

    public TIntArrayList fnO() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (amu_1 amu_12 : this.ksQ) {
            if (!amu_12.bDp()) continue;
            tIntArrayList.add((int)amu_12.d(null, null, null, null));
        }
        return tIntArrayList;
    }

    public ArrayList<ffS> fnP() {
        return this.pBb;
    }

    public edw_0() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        TLongObjectIterator<ffs_0> tLongObjectIterator;
        exP exP2;
        if (object == null) {
            if (!(object3 instanceof ehe_0)) throw new amf_2("on cherche l'\u00e9quipement d'un user null");
            exP2 = ((ehe_0)object3).fog();
        } else {
            if (!(object instanceof exP)) {
                throw new amf_2("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            exP2 = this.pBd && object2 instanceof exP ? (exP)object2 : (exP)object;
        }
        fft_0 fft_02 = exP2.dod();
        if (this.pBc && fft_02 != null) {
            tLongObjectIterator = fft_02.fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                object5 = (ffs_0)tLongObjectIterator.value();
                for (Object object6 : ((ffs_0)object5).fVb()) {
                    if (!this.a(((ffV)object6).dOg().dGh(), object, object2, object3, object4)) continue;
                    return 0;
                }
            }
        }
        if ((tLongObjectIterator = exP2.doC()) == null) {
            object5 = exP2.dmL();
            fhe fhe2 = exP2.dnP();
            if (object5 == null || fhe2 == null) return -2;
            if (this.pBb == null) {
                for (ffS ffS2 : ffS.values()) {
                    Long l = ((fhk)object5).t(ffS2);
                    Optional<ffV> optional = fhe2.B(l);
                    if (!optional.isPresent() || !this.a(optional.get().dOg().dGh(), object, object2, object3, object4)) continue;
                    return 0;
                }
                return -2;
            } else {
                for (ffS ffS3 : this.pBb) {
                    Long l = ((fhk)object5).t(ffS3);
                    Optional<ffV> optional = fhe2.B(l);
                    if (!optional.isPresent() || !this.a(ffS3, optional.get().dOg().dGh()) || !this.a(optional.get().dOg().dGh(), object, object2, object3, object4)) continue;
                    return 0;
                }
            }
            return -2;
        }
        if (this.pBb == null) {
            for (ffS ffS4 : ffS.values()) {
                if (tLongObjectIterator.ai(ffS4.aJr()) == null || !this.a(((ffV)tLongObjectIterator.ai(ffS4.aJr())).dOg().dGh(), object, object2, object3, object4)) continue;
                return 0;
            }
            return -2;
        } else {
            for (ffS ffS5 : this.pBb) {
                if (tLongObjectIterator.ai(ffS5.aJr()) == null || !this.a(ffS5, ((ffV)tLongObjectIterator.ai(ffS5.aJr())).dOg().dGh()) || !this.a(((ffV)tLongObjectIterator.ai(ffS5.aJr())).dOg().dGh(), object, object2, object3, object4)) continue;
                return 0;
            }
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFK;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pBe.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJA, amz_1.cJB};
        pBe.add(amz_1Array);
    }
}

