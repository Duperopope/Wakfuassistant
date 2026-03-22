/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public final class bJJ
implements fpa {
    public static final bJJ kmp = new bJJ();
    private static final Logger kmq = Logger.getLogger(bJJ.class);
    private final TLongObjectHashMap<bJK> kmr = new TLongObjectHashMap();
    private final TLongObjectHashMap<bJK> kms = new TLongObjectHashMap();
    private long hle;
    private long kmt = -1L;

    private bJJ() {
    }

    public TLongObjectIterator<bJK> eaT() {
        return this.kms.iterator();
    }

    private void eaU() {
        int[] nArray;
        this.kmr.clear();
        for (int n : nArray = fpk.sNF.ggk()) {
            bJK bJK2 = (bJK)fpk.sNF.Yn(n);
            if (bJK2.aqZ() != this.hle) continue;
            this.kmr.put((long)bJK2.d(), (Object)bJK2);
        }
    }

    public bJK HI(int n) {
        return (bJK)this.kmr.get((long)n);
    }

    public bJK dN(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.kmr.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bJK bJK2 = (bJK)tLongObjectIterator.value();
            if (!bJK2.dP(n, n2)) continue;
            return bJK2;
        }
        return null;
    }

    public bJK dO(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.kmr.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bJK bJK2 = (bJK)tLongObjectIterator.value();
            if (!bJK2.eaV().aq(n, n2)) continue;
            return bJK2;
        }
        return null;
    }

    public void lC(long l) {
        if (l == this.hle) {
            return;
        }
        this.hle = l;
        this.eaU();
        this.m(this.hle, true);
    }

    @Override
    public void a(foP foP2, fjo_0 fjo_02) {
        foM foM2 = foP2.gfS();
        if (foM2 == null) {
            return;
        }
        bJK bJK2 = (bJK)this.kmr.get((long)foM2.d());
        if (bJK2 == null) {
            return;
        }
        this.m(this.kmt, true);
    }

    public void lD(long l) {
        this.m(l, false);
    }

    private void m(long l, boolean bl) {
        int[] nArray;
        if (this.kmt == l && !bl) {
            return;
        }
        this.kmt = l;
        bih_2.dZf().a(bii_2.khB);
        this.kms.clear();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (int n : nArray = fpk.sNF.ggk()) {
            bJK bJK2 = (bJK)fpk.sNF.Yn(n);
            if (bJK2.aqZ() != l) continue;
            if (bJK2.doW() == null) {
                bJK2.f(bjx_0.klY.HD(bJK2.d()));
            }
            this.kms.put((long)n, (Object)bJK2);
            bJL bJL2 = new bJL(bJK2);
            foP foP2 = bJK2.doW();
            int n2 = foP2 != null ? foP2.gfT() : -1;
            bJM bJM2 = (bJM)tIntObjectHashMap.get(n2);
            if (bJM2 == null) {
                bJM2 = new bJM();
                tIntObjectHashMap.put(n2, (Object)bJM2);
                bJM2.fK(l);
            }
            bJM2.a(bJL2);
        }
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bih_2.dZf().a(bii_2.khB, ((bJM)tIntObjectIterator.value()).Sn(), (biq_1)tIntObjectIterator.value());
        }
        this.kmt = l;
    }
}

