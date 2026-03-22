/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fHQ
 */
class fhq_1
implements Comparator<fhp_2> {
    public static final fhq_1 uzw = new fhq_1();

    private fhq_1() {
    }

    public int a(fhp_2 fhp_22, fhp_2 fhp_23) {
        return (int)(fhp_23.getHeight() * fhp_23.getWidth() - fhp_22.getHeight() * fhp_22.getWidth());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fhp_2)object, (fhp_2)object2);
    }
}

