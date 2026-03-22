/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cPK
 */
public class cpk_1 {
    private final fzo_0 nif;
    private final fzo_0 nig;
    private final cry_1 nih;
    private boolean bTz;

    public cpk_1(fzo_0 fzo_02, fzo_0 fzo_03, cry_1 cry_12) {
        this.nif = fzo_02;
        this.nig = fzo_03;
        this.nih = cry_12;
    }

    public void start() {
        this.bTz = true;
        fhn_1.gzT().a(this.nif, true);
    }

    public void bhk() {
        this.bTz = false;
        fhn_1.gzT().bYz();
    }

    public void a(aIs aIs2, int n, int n2) {
        if (!this.bTz) {
            return;
        }
        crd_1 crd_12 = this.c(aIs2, n, n2);
        if (crd_12 != null) {
            fhn_1.gzT().a(this.nig, true);
        } else {
            fhn_1.gzT().a(this.nif, true);
        }
    }

    public void b(aIs aIs2, int n, int n2) {
        if (!this.bTz) {
            return;
        }
        crd_1 crd_12 = this.c(aIs2, n, n2);
        if (crd_12 != null) {
            this.nih.getValidAction(crd_12).ifPresent(cpm_1::run);
        }
        fhn_1.gzT().bYz();
        this.bTz = false;
    }

    @Nullable
    private crd_1 c(aIs aIs2, int n, int n2) {
        ArrayList<ZH> arrayList = aIs2.cY(n, n2);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            crd_1 crd_12;
            ZH zH;
            amg_1 amg_12 = zH = arrayList.get(i);
            if (zH instanceof bdj_2) {
                amg_12 = ((bdj_2)zH).dcP();
            }
            if (!(amg_12 instanceof crd_1) || !this.nih.a(crd_12 = (crd_1)((Object)amg_12))) continue;
            return crd_12;
        }
        return null;
    }
}

