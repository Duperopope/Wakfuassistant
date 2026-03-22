/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from adE
 */
class ade_0
implements Comparator<ahc_2> {
    static final ade_0 ckn = new ade_0();

    private ade_0() {
    }

    public int a(ahc_2 ahc_22, ahc_2 ahc_23) {
        return ahc_22.aGu() - ahc_23.aGu();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ahc_2)object, (ahc_2)object2);
    }
}

