/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  gnu.trove.map.TLongObjectMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.google.common.primitives.Longs;
import gnu.trove.map.TLongObjectMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.BitSet;

final class eRU
extends QI {
    eRU(QE qE) {
        super(qE);
    }

    @Override
    protected void a(QD qD, byte by) {
        long[] lArray = this.bhJ.toArray();
        long[] lArray2 = this.bhI.toArray();
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap((TLongObjectMap)this.bhK);
        this.bhJ.clear();
        this.bhI.clear();
        this.bhK.clear();
        eRU.b(lArray, (TLongObjectHashMap<QD>)tLongObjectHashMap);
        eRU.a(lArray2, (TLongObjectHashMap<QD>)tLongObjectHashMap);
        eRU.a(qD, lArray2, (TLongObjectHashMap<QD>)tLongObjectHashMap);
    }

    private static void a(long[] lArray, TLongObjectHashMap<QD> tLongObjectHashMap) {
        Longs.asList((long[])lArray).sort(new eRV(tLongObjectHashMap));
    }

    private static void a(QD qD, long[] lArray, TLongObjectHashMap<QD> tLongObjectHashMap) {
        boolean bl = qD != null && ewR.b(qD.bbx());
        for (long l : lArray) {
            QD qD2 = (QD)tLongObjectHashMap.get(l);
            if (qD2 == null || qD2.LV() != l || qD2.bbQ() || qD2.bbj()) continue;
            if (bl) {
                QD.baX();
            }
            qD2.k(qD);
        }
    }

    private static void b(long[] lArray, TLongObjectHashMap<QD> tLongObjectHashMap) {
        for (long l : lArray) {
            QD qD = (QD)tLongObjectHashMap.get(l);
            if (qD == null || qD.LV() != l) continue;
            qD.bbP();
        }
    }

    private boolean a(byte by, QD qD, BitSet bitSet) {
        ero_0 ero_02 = (ero_0)qD;
        if (!ero_02.aZA()) {
            return false;
        }
        boolean bl = false;
        switch (by) {
            case 31: {
                if (ero_02.aZM() == null || !ero_02.aZM().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 11: {
                if (qD.aZJ() == null || !qD.aZJ().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 21: {
                if (qD.aZK() == null || !qD.aZK().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 61: {
                if (qD.bbw() == null || !qD.bbw().intersects(bitSet)) break;
                this.s(qD);
                bl = true;
                break;
            }
            case 41: {
                if (qD.aZL() == null || !qD.aZL().intersects(bitSet)) break;
                this.t(qD);
                bl = true;
            }
        }
        return bl;
    }

    @Override
    protected boolean b(BitSet bitSet, QD qD, byte by) {
        if (qD != null && ((ero_0)qD).a(eNi.qWu)) {
            return false;
        }
        boolean bl = false;
        for (QD qD2 : this.bhH) {
            ero_0 ero_02;
            if (!(qD2 instanceof ero_0) || qD == (ero_02 = (ero_0)qD2) || qD != null && qD.bbm() == ero_02 || qD != null && qD.bbE() || qD != null && qD.aZE() && !ero_02.a(eNi.qWp)) continue;
            if (ero_02.aZA()) {
                if (!this.a(by, (QD)ero_02, bitSet)) continue;
                bl = true;
                continue;
            }
            if (ero_02.aZz()) {
                if (!this.b(bitSet, by, ero_02)) continue;
                bl = true;
                continue;
            }
            if (!this.a(bitSet, by, ero_02)) continue;
            bl = true;
        }
        return bl;
    }
}

