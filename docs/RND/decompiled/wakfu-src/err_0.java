/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.hash.TLongHash;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from eRR
 */
final class err_0 {
    private static final Logger riR = Logger.getLogger(err_0.class);
    private final ers_0 riS;

    err_0(ers_0 ers_02) {
        this.riS = ers_02;
    }

    public byte[] ml(boolean bl) {
        HashMap<QD, byte[]> hashMap = new HashMap<QD, byte[]>();
        HashMap<QD, byte[]> hashMap2 = new HashMap<QD, byte[]>();
        TLongHashSet tLongHashSet = new TLongHashSet();
        this.b(bl, hashMap2, tLongHashSet);
        this.a(bl, hashMap, tLongHashSet);
        return this.a(bl, hashMap, hashMap2);
    }

    private byte[] a(boolean bl, Map<QD, byte[]> map, Map<QD, byte[]> map2) {
        azg_1 azg_12 = new azg_1();
        int n = map2.size() + map.size();
        azg_12.aG((short)n);
        this.a(map2, azg_12);
        this.a(map, azg_12);
        return this.a(bl, map, map2, azg_12);
    }

    private void a(boolean bl, Map<QD, byte[]> map, TLongHashSet tLongHashSet) {
        for (QD qD : this.riS) {
            eNl eNl2;
            ero_0 ero_02 = (ero_0)qD;
            boolean bl2 = ero_02.d() == enf_0.qPC.d();
            if (bl2 || !this.a(bl, ero_02) || err_0.a((TLongHash)tLongHashSet, eNl2 = (eNl)ero_02.bbf())) continue;
            byte[] byArray = ero_02.apI();
            map.put(ero_02, byArray);
        }
    }

    private void b(boolean bl, Map<QD, byte[]> map, TLongHashSet tLongHashSet) {
        for (QD qD : this.riS) {
            ero_0 ero_02 = (ero_0)qD;
            boolean bl2 = ero_02.d() == enf_0.qPC.d();
            if (!bl2) continue;
            if (!ero_02.fHt() && !this.a(bl, ero_02)) {
                tLongHashSet.add((long)((erh_0)ero_02).fGk().gjy());
                continue;
            }
            byte[] byArray = ero_02.apI();
            map.put(ero_02, byArray);
        }
    }

    private byte[] a(boolean bl, Map<QD, byte[]> map, Map<QD, byte[]> map2, azg_1 azg_12) {
        boolean bl2;
        int n = azg_12.bTc();
        boolean bl3 = bl2 = n >= 0 && n <= 50000;
        if (!bl2) {
            riR.warn((Object)("RunningEffectManager size is greater than Short.MAX_VALUE, it's SO HEAVY ! Bytes size : " + n + ", effects qty : " + this.riS.aVo()));
            this.a(bl, map, map2, n);
            return err_0.fHC();
        }
        return azg_12.bTe();
    }

    private static byte[] fHC() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort((short)0);
        return byteBuffer.array();
    }

    private void a(boolean bl, Map<QD, byte[]> map, Map<QD, byte[]> map2, int n) {
        err_0.b(map2, map);
    }

    private static void b(Map<QD, byte[]> map, Map<QD, byte[]> map2) {
        err_0.K(map);
        err_0.K(map2);
    }

    private static void K(Map<QD, byte[]> map) {
        Object object = "Effects : ";
        for (Map.Entry<QD, byte[]> entry : map.entrySet()) {
            QD qD = entry.getKey();
            byte[] byArray = entry.getValue();
            object = (String)object + "e:" + qD.bbN() + ", s:" + byArray.length + ";";
        }
        riR.warn(object);
    }

    private void a(Map<QD, byte[]> map, azg_1 azg_12) {
        for (Map.Entry<QD, byte[]> entry : map.entrySet()) {
            QD qD = entry.getKey();
            azg_12.vC(qD.d());
            azg_12.aG((short)entry.getValue().length);
            azg_12.dH(entry.getValue());
            if (this.riS.qA(qD.LV())) {
                azg_12.vC((int)Math.max(0L, this.riS.qz(qD.LV()) - System.currentTimeMillis()));
                continue;
            }
            azg_12.vC(0);
        }
    }

    private boolean a(boolean bl, ero_0 ero_02) {
        erh_0 erh_02;
        fqU fqU2;
        if (bl) {
            return !(ero_02 instanceof epa_0) && !ero_02.aZQ();
        }
        if (this.riS.fHE()) {
            return ero_02.fHt() || err_0.j(ero_02);
        }
        if (ero_02 instanceof erh_0 && (fqU2 = (erh_02 = (erh_0)ero_02).fGk()).cwt()) {
            return true;
        }
        return !ero_02.fHt() && !ero_02.fHw() && !ero_02.fHv() && !ero_02.fHA() && !ero_02.fHx() && !ero_02.cwJ() && !ero_02.fHy() && !ero_02.fHz();
    }

    private static boolean j(ero_0 ero_02) {
        if (ero_02 instanceof erh_0) {
            return true;
        }
        eNl eNl2 = (eNl)ero_02.bbf();
        if (eNl2 == null) {
            return false;
        }
        return eNl2 instanceof fqU;
    }

    private static boolean a(TLongHash tLongHash, Qk qk) {
        return qk != null && qk.bab() == 1 && tLongHash.contains((long)((fqU)qk).gjy());
    }

    public byte[] fHD() {
        HashMap<QD, byte[]> hashMap = new HashMap<QD, byte[]>();
        HashMap<QD, byte[]> hashMap2 = new HashMap<QD, byte[]>();
        this.c(hashMap, hashMap2);
        return this.a(false, hashMap, hashMap2);
    }

    private void c(Map<QD, byte[]> map, Map<QD, byte[]> map2) {
        for (QD qD : this.riS) {
            ero_0 ero_02 = (ero_0)qD;
            boolean bl = ero_02.d() == enf_0.qPC.d();
            byte[] byArray = ero_02.apI();
            if (bl) {
                map2.put(ero_02, byArray);
                continue;
            }
            map.put(ero_02, byArray);
        }
    }
}

