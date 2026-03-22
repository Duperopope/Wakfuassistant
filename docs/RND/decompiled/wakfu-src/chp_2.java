/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cHP
 */
public class chp_2
implements Comparator<cpv_2> {
    static final chp_2 nbo = new chp_2();

    public int a(cpv_2 cpv_22, cpv_2 cpv_23) {
        int n = cpv_22.dHA() - cpv_23.dHA();
        if (n != 0) {
            return n;
        }
        return cpv_22.dHz() - cpv_23.dHz();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cpv_2)object, (cpv_2)object2);
    }
}

