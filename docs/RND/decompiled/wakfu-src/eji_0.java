/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from eJi
 */
public class eji_0
implements ejg_0 {
    private final Map<eje_0, ejh_0> qyE = new EnumMap<eje_0, ejh_0>(eje_0.class);

    @Override
    public int a(eje_0 eje_02, int n, int n2) {
        ejh_0 ejh_02 = this.qyE.get((Object)eje_02);
        if (ejh_02 == null) {
            return 0;
        }
        return ejh_02.fl(n, n2);
    }

    @Override
    public void clear() {
        this.qyE.clear();
    }

    @Override
    public void b(eje_0 eje_02, int n, int n2) {
        ejh_0 ejh_02 = this.qyE.get((Object)eje_02);
        if (ejh_02 == null) {
            ejh_02 = new ejh_0();
            this.qyE.put(eje_02, ejh_02);
        }
        ejh_02.fk(n, n2);
    }

    @Override
    public void a(eje_0 eje_02, int n, int n2, int n3) {
        ejh_0 ejh_02 = this.qyE.get((Object)eje_02);
        if (ejh_02 == null) {
            ejh_02 = new ejh_0();
            this.qyE.put(eje_02, ejh_02);
        }
        ejh_02.ak(n, n2, n3);
    }
}

