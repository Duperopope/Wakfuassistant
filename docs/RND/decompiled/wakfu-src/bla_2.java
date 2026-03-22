/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bLA
 */
class bla_2
implements Comparator<blx_2> {
    bla_2(bly_2 bly_22) {
    }

    public int a(blx_2 blx_22, blx_2 blx_23) {
        if (blx_22.ecI().cmL() < blx_23.ecI().cmL()) {
            return -1;
        }
        if (blx_22.ecI().cmL() > blx_23.ecI().cmL()) {
            return 1;
        }
        return blx_22.ecI().d() - blx_23.ecI().d();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_2)object, (blx_2)object2);
    }
}

