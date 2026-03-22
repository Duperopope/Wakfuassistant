/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fgq
 */
class fgq_0
implements Comparator<fgp_0> {
    fgq_0() {
    }

    public int a(fgp_0 fgp_02, fgp_0 fgp_03) {
        if (fgp_02 == fgp_03) {
            return 0;
        }
        if (fgp_02 == null) {
            return 1;
        }
        if (fgp_03 == null) {
            return -1;
        }
        return Integer.signum(fgp_03.sjw - fgp_02.sjw);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fgp_0)object, (fgp_0)object2);
    }
}

