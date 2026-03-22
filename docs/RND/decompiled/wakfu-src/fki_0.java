/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fki
 */
class fki_0
implements Comparator<fkd_0> {
    fki_0() {
    }

    public int a(fkd_0 fkd_02, fkd_0 fkd_03) {
        if (fkd_02 == fkd_03) {
            return 0;
        }
        return Integer.compare(fkd_02.clW(), fkd_03.clW());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fkd_0)object, (fkd_0)object2);
    }
}

