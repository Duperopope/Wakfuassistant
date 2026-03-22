/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bSa
 */
class bsa_2
implements Comparator<brq_2> {
    bsa_2(brx_1 brx_12) {
    }

    public int a(brq_2 brq_22, brq_2 brq_23) {
        if (brq_22.elA() == null) {
            return -1;
        }
        if (brq_23.elA() == null) {
            return 1;
        }
        if (brq_22.elA().aIi() < brq_23.elA().aIi()) {
            return -1;
        }
        if (brq_23.elA().aIi() < brq_22.elA().aIi()) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brq_2)object, (brq_2)object2);
    }
}

