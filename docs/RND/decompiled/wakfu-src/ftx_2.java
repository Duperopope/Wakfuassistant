/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fTX
 */
public class ftx_2 {
    private static final ftx_2 vhn = new ftx_2();
    private final ArrayList<ftw_1> vho = new ArrayList();

    public static ftx_2 gHx() {
        return vhn;
    }

    private ftx_2() {
    }

    public void a(ftw_1 ftw_12) {
        this.vho.add(ftw_12);
    }

    public void l(fhq_2 fhq_22) {
        int n = this.vho.size();
        for (int i = 0; i < n; ++i) {
            this.vho.get(i).k(fhq_22);
        }
    }
}

