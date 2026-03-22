/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmB
 */
class bmb_2
implements ekz_0 {
    private final bmw_1 iCe;

    bmb_2(bmw_1 bmw_12) {
        this.iCe = bmw_12;
    }

    @Override
    public void d(@NotNull eKW eKW2) {
        this.iCe.Eh(eKW2.d());
    }

    @Override
    public void t(int n, long l) {
        bms_1 bms_12 = this.iCe.Eg(n);
        if (bms_12 instanceof bmf_2) {
            long l2 = this.iCe.cZr().QI(n);
            int n2 = eKX.qi(l2) - eKX.qi(l2 - l);
            if (n2 == 0) {
                ((bmf_2)bms_12).dwY();
            } else {
                ((bmf_2)bms_12).dwZ();
            }
        }
    }

    @Override
    public void du(int n, int n2) {
        bms_1 bms_12 = this.iCe.Eg(n);
        if (bms_12 instanceof bmf_2) {
            ((bmf_2)bms_12).dwX();
        }
    }

    @Override
    public void Ef(int n) {
        bms_1 bms_12 = this.iCe.Eg(n);
        if (bms_12 instanceof bmf_2) {
            ((bmf_2)bms_12).dwW();
        }
    }
}

