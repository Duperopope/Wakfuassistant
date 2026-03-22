/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from alf
 */
public class alf_2
extends alc_1 {
    private static final Logger cEM = Logger.getLogger(alf_2.class);
    private static final int cEN = 1;
    private final TLongObjectHashMap<alm_2> cEO = new TLongObjectHashMap();

    public void eU(String string) {
        apl_1 apl_12 = apl_1.dw(fo_0.by(string));
        int n = apl_12.aIA();
        int n2 = apl_12.aIA();
        for (int i = 0; i < n2; ++i) {
            long l = apl_12.bFQ();
            alm_2 alm_22 = new alm_2(apl_12);
            this.cEO.put(l, (Object)alm_22);
        }
        apl_12.close();
    }

    public void eV(String string) {
        fs_0 fs_02 = new fs_0(fq_0.bO(string));
        fs_02.mz(1);
        fs_02.mz(this.cEO.size());
        TLongObjectIterator tLongObjectIterator = this.cEO.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fs_02.cq(tLongObjectIterator.key());
            ((alm_2)tLongObjectIterator.value()).b(fs_02);
        }
        fs_02.close();
    }

    public void a(long l, alm_2 alm_22) {
        this.cEO.put(l, (Object)alm_22);
    }

    @Override
    public boolean n(int n, int n2, int n3, int n4) {
        boolean bl;
        alm_2 alm_22 = (alm_2)this.cEO.get((long)n);
        if (alm_22 == null) {
            return false;
        }
        boolean bl2 = bl = alm_22.bBQ() || alm_22.bBD();
        if (alm_22.bBR() != 0) {
            abg_2.bUP().a(() -> this.a(n2, n3, n4, alm_22), alm_22.bBR(), 1);
            return bl;
        }
        this.a(n2, n3, n4, alm_22);
        return bl;
    }

    private void a(int n, int n2, int n3, alm_2 alm_22) {
        long l;
        if (!this.bpD()) {
            return;
        }
        long[] lArray = alm_22.bBO();
        byte[] byArray = alm_22.bBP();
        int n4 = GC.mR(lArray.length);
        long l2 = System.currentTimeMillis();
        if (!this.f(l2, l = lArray[n4])) {
            return;
        }
        float f2 = (float)byArray[n4] / 100.0f;
        float f3 = GC.b(alm_22.bBT()[n4], alm_22.bBS()[n4]);
        long l3 = n3 != -1 ? l2 + (long)n3 : -1L;
        long l4 = alm_22.bBF() != 0 ? l3 - (long)alm_22.bBF() : -1L;
        IsoParticleSystem isoParticleSystem = agZ.bzy().sn(n);
        try {
            if (l != 0L) {
                ahm_1 ahm_12 = isoParticleSystem != null ? aiv_2.bBr().a(l, f2, f3, alm_22.bBD() ? 0 : 1, l3, l4, n2, (agn_1)isoParticleSystem, alm_22.bBG(), false) : aiv_2.bBr().a(l, f2, f3, alm_22.bBD() ? 0 : 1, l3, l4, n2);
                if (ahm_12 != null) {
                    this.a(n, ahm_12.ccq(), l2, l);
                }
            } else {
                cEM.warn((Object)"Null sound id");
            }
        }
        catch (Exception exception) {
            cEM.error((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }
}

