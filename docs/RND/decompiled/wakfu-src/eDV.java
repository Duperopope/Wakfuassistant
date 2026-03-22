/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class eDV
extends eAH {
    private static final ArrayList<amz_1[]> pAZ = new ArrayList();
    private ArrayList<amu_1> pyQ;
    private amq_2 pBa;
    private ArrayList<ffS> pBb = null;
    private boolean pBc = false;
    private boolean pBd = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pAZ;
    }

    private ffS rT(String string) {
        for (ffS ffS2 : ffS.values()) {
            if (!ffS2.aXB().equalsIgnoreCase(string)) continue;
            return ffS2;
        }
        return null;
    }

    public eDV(ArrayList<amx_1> arrayList) {
        amx_1 amx_12;
        int n;
        byte by = this.r(arrayList);
        if (arrayList.get(0).bDv() == amz_1.cJA) {
            this.pyQ = null;
            this.pBa = (amq_2)arrayList.get(0);
            var3_3 = 1;
        } else {
            this.pyQ = new ArrayList();
            for (n = 0; n < arrayList.size() && arrayList.get(n).bDv() == amz_1.cJy; ++n) {
                amx_12 = (amu_1)arrayList.get(n);
                this.pyQ.add((amu_1)amx_12);
            }
            var3_3 = n;
        }
        if (by == 0) {
            this.pBb = null;
        } else if (by == 1) {
            for (n = var3_3; n < arrayList.size() && arrayList.get(n).bDv() == amz_1.cJx; ++n) {
                ffS ffS2;
                amx_12 = (anh_2)arrayList.get(n);
                if (((anh_2)amx_12).getValue().equalsIgnoreCase("inventory")) {
                    this.pBc = true;
                    continue;
                }
                if (((anh_2)amx_12).getValue().equalsIgnoreCase("target")) {
                    this.pBd = true;
                    continue;
                }
                if (this.pBb == null) {
                    this.pBb = new ArrayList();
                }
                if ((ffS2 = this.rT(((anh_2)amx_12).getValue())) == null) {
                    throw new IllegalArgumentException("Nom de slot qui ne correspond a rien " + ((anh_2)amx_12).getValue());
                }
                this.pBb.add(ffS2);
            }
        }
    }

    public eDV() {
    }

    public TIntArrayList fnN() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        int n = this.pyQ.size();
        for (int i = 0; i < n; ++i) {
            amu_1 amu_12 = this.pyQ.get(i);
            if (!amu_12.bDo()) continue;
            tIntArrayList.add((int)amu_12.d(null, null, null, null));
        }
        return tIntArrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        fgd_0 fgd_02;
        TLongArrayList tLongArrayList;
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
        if (this.pyQ != null) {
            tLongArrayList = new TLongArrayList();
            for (int n = 0; n < this.pyQ.size(); n = (int)((byte)(n + 1))) {
                tLongArrayList.add(this.pyQ.get(n).d(object, object2, object3, object4));
            }
        } else {
            tLongArrayList = this.pBa.f(object, object2, object3, object4);
        }
        if (this.pBc) {
            TLongObjectIterator<ffs_0> tLongObjectIterator = fft_02.fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
                for (Object object5 : ffs_02.fVb()) {
                    if (object5 == null || !tLongArrayList.contains((long)((ffV)object5).avr())) continue;
                    return 0;
                }
            }
            for (int i = 0; i < tLongArrayList.size(); ++i) {
                if (fea_0.ah(exP2.aZj(), (int)tLongArrayList.getQuick(i)) <= 0) continue;
                return 0;
            }
        }
        if ((fgd_02 = exP2.doC()) == null) {
            fhk fhk2 = object4 instanceof fhk ? (fhk)object4 : exP2.dmL();
            fhe fhe2 = exP2.dnP();
            if (fhk2 == null || fhe2 == null) return -1;
            if (this.pBb == null) {
                for (ffS ffS2 : ffS.values()) {
                    Long l = fhk2.t(ffS2);
                    Optional<ffV> optional = fhe2.B(l);
                    if (!optional.isPresent() || !tLongArrayList.contains((long)optional.get().avr())) continue;
                    return 0;
                }
                return -1;
            } else {
                for (ffS ffS3 : this.pBb) {
                    Long l = fhk2.t(ffS3);
                    Optional<ffV> optional = fhe2.B(l);
                    if (!optional.isPresent() || !tLongArrayList.contains((long)optional.get().avr())) continue;
                    return 0;
                }
            }
            return -1;
        }
        if (this.pBb == null) {
            for (ffS ffS4 : ffS.values()) {
                if (fgd_02.ai(ffS4.aJr()) == null || !tLongArrayList.contains((long)((ffV)fgd_02.ai(ffS4.aJr())).dOg().d())) continue;
                return 0;
            }
            return -1;
        } else {
            for (ffS ffS5 : this.pBb) {
                if (fgd_02.ai(ffS5.aJr()) == null || !tLongArrayList.contains((long)((ffV)fgd_02.ai(ffS5.aJr())).dOg().d())) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFJ;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pAZ.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJA, amz_1.cJB};
        pAZ.add(amz_1Array);
    }
}

