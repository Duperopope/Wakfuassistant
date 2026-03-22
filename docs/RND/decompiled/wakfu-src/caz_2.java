/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caz
 */
public class caz_2
extends ach_0
implements fss_0 {
    private static final Logger lGH = Logger.getLogger(caz_2.class);
    private caa_1 lGI;

    @Override
    public void a(fsu fsu2, fsu fsu3, fsu fsu4, fsu fsu5) {
        this.lGI = new caa_1(fsu2, fsu3, fsu4, fsu5);
    }

    @Override
    public void a(@NotNull fam_0[] fam_0Array) {
        this.lGI.a(fam_0Array);
        this.a(this.lGI);
        this.lGI = null;
    }

    private void a(caa_1 caa_12) {
        this.chk = new acG[this.lGI.bno() * 324];
        int n = this.btP();
        int n2 = this.btQ();
        this.a(caa_12.lGJ, n, n2);
        this.a(caa_12.lGK, n + 9, n2);
        this.a(caa_12.lGL, n, n2 + 9);
        this.a(caa_12.lGM, n + 9, n2 + 9);
        for (fam_0 fam_02 : caa_12.lGN) {
            caj_2 caj_22 = (caj_2)fam_02;
            cay_2 cay_22 = ((cal_2)caj_22.fRg()).eqU();
            this.a(fam_02.fRc(), fam_02.fRd(), caj_22.bKF(), cay_22);
        }
    }

    private void a(cag_2 cag_22, int n, int n2) {
        if (cag_22 == null) {
            return;
        }
        this.a(n, n2, 0, cag_22.eqU());
    }

    private void a(int n, int n2, int n3, cay_2 cay_22) {
        int n4;
        int n5;
        ArrayList<acG> arrayList = cay_22.erv();
        if (arrayList.isEmpty()) {
            return;
        }
        int n6 = arrayList.size();
        for (n5 = 0; n5 < n6; ++n5) {
            acG acG2 = arrayList.get(n5);
            n4 = this.chl.indexOf(acG2);
            if (n4 != -1) continue;
            this.chl.add(acG2);
        }
        n5 = cay_22.ert();
        for (n6 = 0; n6 < cay_22.bcN(); ++n6) {
            int n7 = n6 + n2;
            if (n7 < this.btQ() || n7 >= this.btQ() + 18) continue;
            for (n4 = 0; n4 < cay_22.eru(); ++n4) {
                int n8 = n4 + n;
                if (n8 < this.btP() || n8 >= this.btP() + 18) continue;
                for (int i = 0; i < n5; ++i) {
                    int n9;
                    acG acG3 = cay_22.ac(n4, n6, i);
                    if (acG3 != null && (n9 = this.chl.indexOf(acG3)) != -1) {
                        acG3 = (acG)this.chl.get(n9);
                    }
                    this.chk[this.u((int)n8, (int)n7, (int)(n3 + i))] = acG3;
                }
            }
        }
    }
}

