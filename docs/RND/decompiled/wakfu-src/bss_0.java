/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bss
 */
class bss_0
implements Comparator<bsu_0> {
    bss_0() {
    }

    public int a(bsu_0 bsu_02, bsu_0 bsu_03) {
        return bsu_02.aYs() - bsu_03.aYs();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bsu_0)object, (bsu_0)object2);
    }
}

