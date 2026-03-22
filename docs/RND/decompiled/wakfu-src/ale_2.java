/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from ale
 */
public class ale_2
extends alb_2 {
    private final TLongObjectHashMap<alj_2> cEK = new TLongObjectHashMap();
    private static final int cEL = 1;

    public void eU(String string) {
        apl_1 apl_12 = apl_1.dw(fo_0.by(string));
        int n = apl_12.aIA();
        int n2 = apl_12.aIA();
        for (int i = 0; i < n2; ++i) {
            long l = apl_12.bFQ();
            int n3 = apl_12.aIA();
            alj_2 alj_22 = alk_2.cES.a(n3, apl_12);
            this.cEK.put(l, (Object)alj_22);
        }
        apl_12.close();
    }

    public void eV(String string) {
        fs_0 fs_02 = new fs_0(fq_0.bO(string));
        fs_02.mz(1);
        fs_02.mz(this.cEK.size());
        TLongObjectIterator tLongObjectIterator = this.cEK.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fs_02.cq(tLongObjectIterator.key());
            fs_02.mz(((alj_2)tLongObjectIterator.value()).aeV());
            ((alj_2)tLongObjectIterator.value()).b(fs_02);
        }
        fs_02.close();
    }

    public void a(long l, alj_2 alj_22) {
        this.cEK.put(l, (Object)alj_22);
    }

    @Override
    protected void b(arj_2 arj_22, long l) {
        alj_2 alj_22 = (alj_2)this.cEK.get(l);
        if (alj_22 == null) {
            return;
        }
        alj_22.a(arj_22, this.cEE);
    }
}

