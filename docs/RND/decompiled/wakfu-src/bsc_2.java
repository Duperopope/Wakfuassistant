/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bSc
 */
class bsc_2
implements Comparator<bsr_2> {
    bsc_2(brx_1 brx_12) {
    }

    public int a(bsr_2 bsr_22, bsr_2 bsr_23) {
        if (bsr_23.emJ() == bsr_22.emJ()) {
            return bsr_22.emI() - bsr_23.emI();
        }
        return bsr_23.emJ() - bsr_22.emJ();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bsr_2)object, (bsr_2)object2);
    }
}

