/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bSb
 */
class bsb_2
implements Comparator<bsr_2> {
    bsb_2(brx_1 brx_12) {
    }

    public int a(bsr_2 bsr_22, bsr_2 bsr_23) {
        return bsr_23.emI() - bsr_22.emI();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bsr_2)object, (bsr_2)object2);
    }
}

