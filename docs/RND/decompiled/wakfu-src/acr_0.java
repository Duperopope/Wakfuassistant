/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from acr
 */
class acr_0
implements Comparator<acv_0> {
    acr_0() {
    }

    public int a(acv_0 acv_02, acv_0 acv_03) {
        return acv_02.bpb() - acv_03.bpb();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((acv_0)object, (acv_0)object2);
    }
}

