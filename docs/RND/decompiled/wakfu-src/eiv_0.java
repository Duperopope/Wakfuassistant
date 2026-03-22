/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eIV
 */
public class eiv_0 {
    public static final eiv_0 qyh = new eiv_0();
    private final ArrayList<eit_0> qyi = new ArrayList();
    private final ArrayList<eit_0> qyj = new ArrayList();

    public void a(eit_0 eit_02) {
        this.qyi.add(eit_02);
    }

    public void b(eit_0 eit_02) {
        this.qyj.add(eit_02);
    }

    public eik_0 sg(String string) {
        if (string == null) {
            return eii_0.b(eij_0.qxg);
        }
        int n = this.qyi.size();
        for (int i = 0; i < n; ++i) {
            eik_0 eik_02 = this.qyi.get(i).sf(string);
            if (eik_02.fwM() == eij_0.qxi && i != n - 1) continue;
            return eik_02;
        }
        return eii_0.b(eij_0.qxi);
    }

    public eik_0 sh(String string) {
        if (string == null) {
            return eii_0.b(eij_0.qxg);
        }
        int n = this.qyj.size();
        for (int i = 0; i < n; ++i) {
            eik_0 eik_02 = this.qyj.get(i).sf(string);
            if (eik_02.fwM() == eij_0.qxi && i != n - 1) continue;
            return eik_02;
        }
        return eii_0.b(eij_0.qxi);
    }
}

