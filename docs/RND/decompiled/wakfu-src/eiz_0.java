/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;

/*
 * Renamed from eIZ
 */
public class eiz_0<T extends exP> {
    private final T qym;
    private final Table<ffS, Byte, eiy_0> qyn = HashBasedTable.create();

    public eiz_0(T t) {
        this.qym = t;
    }

    public void a(ffS ffS2, fhi_0 fhi_02) {
        fhi_02.dTS().forEach((by, fhn_02) -> fhn_02.y(ffS2).forEach(eiy_02 -> this.qyn.put((Object)ffS2, by, eiy_02)));
    }

    public void p(ffS ffS2) {
        ArrayList arrayList = new ArrayList();
        this.qyn.row((Object)ffS2).forEach((by, eiy_02) -> {
            this.b((eiy_0)eiy_02);
            arrayList.add(by);
        });
        arrayList.forEach(by -> this.qyn.row((Object)ffS2).remove(by));
    }

    public void fwU() {
        this.qyn.clear();
    }

    public void fwV() {
        this.qyn.values().forEach(this::a);
    }

    public void fwW() {
        this.qyn.values().forEach(this::b);
    }

    public void a(eiy_0 eiy_02) {
        int n;
        exx_2 exx_22 = eiy_02.fwS();
        int n2 = eiy_02.getValue();
        if (n2 > 0) {
            this.a(exx_22, n2);
        }
        if (n2 < 0) {
            this.b(exx_22, n2);
        }
        if ((n = eiy_02.fwT()) != 0) {
            this.c(exx_22, n);
        }
    }

    public void b(eiy_0 eiy_02) {
        int n;
        exx_2 exx_22 = eiy_02.fwS();
        int n2 = eiy_02.getValue();
        if (n2 > 0) {
            this.b(exx_22, n2);
        }
        if (n2 < 0) {
            this.a(exx_22, n2);
        }
        if ((n = eiy_02.fwT()) != 0) {
            this.c(exx_22, -n);
        }
    }

    private void a(exx_2 exx_22, Integer n) {
        exf_2 exf_22 = ((exP)this.qym).e(exx_22);
        if (exf_22 == null) {
            return;
        }
        exf_22.nt(n);
    }

    private void b(exx_2 exx_22, Integer n) {
        exf_2 exf_22 = ((exP)this.qym).e(exx_22);
        if (exf_22 == null) {
            return;
        }
        exf_22.oq(n);
    }

    private void c(exx_2 exx_22, Integer n) {
        exf_2 exf_22 = ((exP)this.qym).e(exx_22);
        if (exf_22 == null) {
            return;
        }
        exf_22.or(n);
    }
}

