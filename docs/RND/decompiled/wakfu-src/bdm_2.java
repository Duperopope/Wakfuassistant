/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bdm
 */
public final class bdm_2 {
    private static final Logger hKS = Logger.getLogger(bdm_2.class);

    private bdm_2() {
    }

    public static boolean V(bgy bgy2) {
        if (bgy2 == null) {
            return false;
        }
        if (!bgy2.djT()) {
            return false;
        }
        if (bgy2.eap() == null) {
            return false;
        }
        if (bdm_2.a(bgy2, cuk_2.eSS())) {
            return true;
        }
        if (bdm_2.a(bgy2, cud_1.eSz())) {
            return true;
        }
        return bdm_2.a(bgy2, cuj_1.eSQ());
    }

    private static boolean a(@NotNull bgy bgy2, crs_2 crs_22) {
        if (!aue_0.cVJ().c(crs_22)) {
            return false;
        }
        if (!bgy2.eap().equals(crs_22.eNd())) {
            return false;
        }
        if (bgy2.d((anz_1)crs_22.eNe()) != so_0.bpF) {
            return false;
        }
        return crs_22.eNm();
    }

    public static void e(ahv_2 ahv_22) {
        try {
            ahv_22.a(auk_0.zU(168), 16, 16, null);
        }
        catch (fu_0 fu_02) {
            hKS.error((Object)"Cannot add backstabbing icon to overhead dialog", (Throwable)fu_02);
        }
    }

    public static boolean a(aWw aWw2) {
        ero_0 ero_02 = aWw2.cXu();
        if (!bms_0.c(ero_02)) {
            return false;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (enk_02 == null || !enk_02.aZT()) {
            return false;
        }
        if (ero_02.bbd() == null) {
            return false;
        }
        sp_0 sp_02 = ero_02.bbd().baD();
        if (sp_02 == null) {
            return false;
        }
        so_0 so_02 = sp_02.k(aWw2.cXv());
        return so_02 == so_0.bpF;
    }
}

