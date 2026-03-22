/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caA
 */
class caa_1 {
    final cag_2 lGJ;
    final cag_2 lGK;
    final cag_2 lGL;
    final cag_2 lGM;
    fam_0[] lGN;

    caa_1(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        this.lGJ = (cag_2)fsu2;
        this.lGK = (cag_2)fsu3;
        this.lGL = (cag_2)fsu4;
        this.lGM = (cag_2)fsu5;
    }

    void a(@NotNull fam_0[] fam_0Array) {
        this.lGN = fam_0Array;
    }

    private int a(cag_2 cag_22) {
        return cag_22 == null ? 0 : cag_22.eqU().ert();
    }

    int bno() {
        int n;
        int n2 = n = GC.a(this.a(this.lGJ), this.a(this.lGK), this.a(this.lGL), this.a(this.lGM));
        for (fam_0 fam_02 : this.lGN) {
            caj_2 caj_22 = (caj_2)fam_02;
            int n3 = ((cal_2)caj_22.fRg()).bno() + caj_22.bKF();
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2 + 1;
    }
}

