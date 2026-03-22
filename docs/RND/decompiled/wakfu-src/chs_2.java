/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cHS
 */
public class chs_2
implements Comparator<fcv_1> {
    private static chs_2 nby = new chs_2();

    public int a(fcv_1 fcv_12, fcv_1 fcv_13) {
        cpu_2 cpu_22 = (cpu_2)fcv_12.getItemValue();
        cpu_2 cpu_23 = (cpu_2)fcv_13.getItemValue();
        return cpu_22.c(exx_2.rGI) - cpu_23.c(exx_2.rGI);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fcv_1)object, (fcv_1)object2);
    }
}

