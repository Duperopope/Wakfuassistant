/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from anc
 */
class anc_2
implements Comparator<ana_2> {
    anc_2() {
    }

    public int a(ana_2 ana_22, ana_2 ana_23) {
        long l = ana_22.bDG();
        long l2 = ana_23.bDG();
        return Long.compare(l2, l);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ana_2)object, (ana_2)object2);
    }
}

