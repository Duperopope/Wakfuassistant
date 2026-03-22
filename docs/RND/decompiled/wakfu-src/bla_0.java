/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from blA
 */
class bla_0
implements Comparator<bsu_0> {
    bla_0() {
    }

    public int a(bsu_0 bsu_02, bsu_0 bsu_03) {
        return bsu_03.aYs() > bsu_02.aYs() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bsu_0)object, (bsu_0)object2);
    }
}

