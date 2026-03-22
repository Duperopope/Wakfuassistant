/*
 * Decompiled with CFR 0.152.
 */
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Renamed from fkh
 */
public final class fkh_0 {
    private static final SortedSet<fkd_0> sAF = new TreeSet<fkd_0>(new fki_0());

    public static void gce() {
        fkj_0[] fkj_0Array = new fkj_0[]{fkj_0.sAQ, fkj_0.sAP, fkj_0.sAO, fkj_0.sAN, fkj_0.sAM};
        fke_0 fke_02 = new fke_0(1, -10000, 1, "publicEnemy", "ff0000", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{fkj_0.sAP, fkj_0.sAO, fkj_0.sAN, fkj_0.sAM};
        fke_02 = new fke_0(2, -5000, 1, "criminal", "ff6000", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{fkj_0.sAN, fkj_0.sAM};
        fke_02 = new fke_0(3, -250, 1, "gangster", "ffd200", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{fkj_0.sAM};
        fke_02 = new fke_0(4, -50, 1, "fellow", "14C800", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{};
        fke_02 = new fke_0(5, 50, 1, "inhabitant", "14C800", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{fkj_0.sAL};
        fke_02 = new fke_0(6, 100, 1, "citoyen", "14C800", fkj_0Array);
        sAF.add(fke_02);
        fkj_0Array = new fkj_0[]{fkj_0.sAL};
        fke_02 = new fke_0(7, 500, 2, "citoyen", "14C800", fkj_0Array);
        sAF.add(fke_02);
        fkf_0.gcc().a(sAF);
        fkf_0.gcc().gcd();
    }
}

