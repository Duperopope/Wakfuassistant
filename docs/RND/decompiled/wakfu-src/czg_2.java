/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZg
 */
class czg_2
extends fab_0 {
    czg_2(faz_0 faz_02) {
        super(faz_02);
    }

    public void b(short s, int n, short s2, short s3, long l, long l2) {
        try {
            this.a((far_0)new caj_2(l, s, n, s2, s3), l2);
        }
        catch (fcc_0 fcc_02) {
            czc_2.oac.error((Object)("Probl\u00e8me dr'ajout du groupe refId=" + s + "en x=" + s2 + ", y=" + s3 + " uid=" + l), (Throwable)fcc_02);
        }
    }

    public void oN(long l) {
        try {
            this.oP(l);
            this.rQ(l);
        }
        catch (fcc_0 fcc_02) {
            czc_2.oac.error((Object)("Probl\u00e8me de suppression du batiment uid=" + l), (Throwable)fcc_02);
        }
    }

    private void oP(long l) {
        fav_0 fav_02 = this.rS(l);
        fav_02.fRl().forEach(fat_02 -> fav_02.fQ(fat_02.Lx()));
    }
}

