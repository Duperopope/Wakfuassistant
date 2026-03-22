/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cHQ
 */
public class chq_2
implements Comparator<cpv_2> {
    private static chq_2 nbp = new chq_2();

    public int a(cpv_2 cpv_22, cpv_2 cpv_23) {
        cpu_2 cpu_22 = cpv_22.dHC();
        cpu_2 cpu_23 = cpv_23.dHC();
        return cpu_22.c(exx_2.rGI) - cpu_23.c(exx_2.rGI);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cpv_2)object, (cpv_2)object2);
    }
}

