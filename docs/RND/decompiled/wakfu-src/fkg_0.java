/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fkg
 */
class fkg_0
implements Comparator<fkd_0> {
    fkg_0(fkf_0 fkf_02) {
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

