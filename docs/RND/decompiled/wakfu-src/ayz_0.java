/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYZ
 */
class ayz_0
implements aqg_1<aMg> {
    ayz_0() {
    }

    public void a(aMg aMg2) {
        int n = aMg2.d();
        int n2 = aMg2.ckr();
        aMi[] aMiArray = aMg2.cnl();
        aLD aLD2 = aMg2.ckt();
        int n3 = aYY.a(aLD2);
        eIx eIx2 = aYY.b(aLD2);
        byte by = aMg2.cnj();
        boolean bl = aMg2.cnk();
        fds_0 fds_02 = new fds_0(n, n2, eIx2, n3, by, aMiArray.length, bl);
        int n4 = aMiArray.length;
        for (int i = 0; i < n4; ++i) {
            short s;
            int n5;
            ang_2 ang_22;
            aMi aMi2 = aMiArray[i];
            int n6 = aMi2.cnm();
            int n7 = aMi2.cno();
            int n8 = aMi2.cnp();
            int n9 = aMi2.cnr();
            String string = aMi2.clB();
            amh_0[] amh_0Array = aMi2.cnn();
            amj_0[] amj_0Array = aMi2.cnq();
            if (amj_0Array.length == 0) {
                aYY.hyd.warn((Object)("[IE] " + fds_0.class.getSimpleName() + " " + aMg2.d() + " has an exchange without any resulting items: " + n6));
                continue;
            }
            try {
                ang_22 = ehu_0.rY(string);
            }
            catch (Exception exception) {
                aYY.hyd.error((Object)("Impossible de compiler le crit\u00e8re de l'\u00e9change " + n6), (Throwable)exception);
                continue;
            }
            fdt_0 fdt_02 = new fdt_0(n6, n7, n9, ang_22, n8, i);
            for (amh_0 amh_02 : amh_0Array) {
                n5 = amh_02.azv();
                s = amh_02.bfd();
                fdt_02.F(n5, s);
            }
            for (amj_0 amj_02 : amj_0Array) {
                n5 = amj_02.azv();
                s = amj_02.bfd();
                fgW fgW2 = fgW.go(amj_02.cns());
                fgW fgW3 = fgW2 == fgW.smf ? fgW.smf : fgW.e(fgW2.fXw(), fgW2.fXx(), true);
                boolean bl2 = amj_02.cnt();
                fdt_02.a(n5, s, fgW3, bl2);
            }
            fds_02.c(fdt_02);
        }
        fda_0.rWI.b(fds_02);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aMg)aqz_22);
    }
}

