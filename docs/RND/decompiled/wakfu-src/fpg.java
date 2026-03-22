/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import org.jetbrains.annotations.Nullable;

public class fpg<Protector extends foP>
extends fgj_0 {
    private final TByteObjectHashMap<foH> sND = new TByteObjectHashMap();

    public fpg(Protector Protector, aza_2<foH<Protector>> aza_22, @Nullable foL foL2) {
        fpf[] fpfArray = fpf.values();
        for (int i = 0; i < fpfArray.length; ++i) {
            fpf fpf2 = fpfArray[i];
            if (foL2 != null && !foL2.a((foP)Protector, fpf2)) continue;
            foH<Protector> foH2 = aza_22.createNew();
            foH2.f(Protector);
            this.sND.put(fpf2.sNB, foH2);
        }
    }

    public boolean b(fpf fpf2) {
        return this.sND.contains(fpf2.sNB);
    }

    public long c(fpf fpf2) {
        foH foH2 = (foH)this.sND.get(fpf2.sNB);
        return foH2 == null ? 0L : foH2.cWp().exS();
    }

    public boolean a(fpf fpf2, int n) {
        foH foH2 = (foH)this.sND.get(fpf2.sNB);
        return foH2 != null && foH2.cWp().ts(n);
    }

    public boolean b(fpf fpf2, int n) {
        foH foH2 = (foH)this.sND.get(fpf2.sNB);
        if (foH2.cWp().exS() + (long)n > Integer.MAX_VALUE) {
            return false;
        }
        return foH2 != null && foH2.cWp().pK(n);
    }

    public boolean c(fpf fpf2, int n) {
        foH foH2 = (foH)this.sND.get(fpf2.sNB);
        return foH2 != null && foH2.cWp().tt(n);
    }

    @Override
    public boolean ts(long l) {
        return super.ts(Math.min(1000000000L, l));
    }

    public void Bb(int n) {
        fpf[] fpfArray = fpf.values();
        for (int i = 0; i < fpfArray.length; ++i) {
            this.a(fpfArray[i], 0);
        }
        this.ts(n);
    }

    public foH d(fpf fpf2) {
        return (foH)this.sND.get(fpf2.sNB);
    }

    public void a(xh_1 xh_12) {
        xh_12.ajr = GC.cw(this.exS());
        TByteObjectIterator tByteObjectIterator = this.sND.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            xi_2 xi_22 = new xi_2();
            xi_22.ajt = tByteObjectIterator.key();
            xi_22.ajr = GC.cw(((foH)tByteObjectIterator.value()).cWp().exS());
            xh_12.ajs.add(xi_22);
        }
    }

    public void b(xh_1 xh_12) {
        for (int i = 0; i < xh_12.ajs.size(); ++i) {
            xi_2 xi_22 = xh_12.ajs.get(i);
            fpf fpf2 = fpf.hj(xi_22.ajt);
            if (fpf2 == null) {
                skg.error((Object)("No context associated for id " + xi_22.ajt + ", cashAmount : " + xi_22.ajr));
                continue;
            }
            this.a(fpf2, xi_22.ajr);
        }
        this.ts(xh_12.ajr);
    }
}

