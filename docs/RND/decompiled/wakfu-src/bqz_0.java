/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bQZ
 */
class bqz_0
implements Comparator<bQW> {
    bqz_0(bqy_0 bqy_02) {
    }

    public int a(bQW bQW2, bQW bQW3) {
        ux_0 ux_02 = bQW2.ekm();
        ux_0 ux_03 = bQW3.ekm();
        if (ux_02 == null || ux_03 == null) {
            return 0;
        }
        if (ux_02.g(ux_03)) {
            return -1;
        }
        return 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bQW)object, (bQW)object2);
    }
}

