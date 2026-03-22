/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bGo
 */
public final class bgo_1
implements aqf_1<aqz_2, bgv_2> {
    private static final Logger jVg = Logger.getLogger(bgo_1.class);

    public bgv_2 e(aqz_2 aqz_22) {
        assert (aqz_22 != null);
        return bgo_1.j((aMU)aqz_22);
    }

    private static bgv_2 j(aMU aMU2) {
        EnumMap<ffj_0, ang_2> enumMap = bgo_1.k(aMU2);
        bgv_2 bgv_22 = bej_0.a(aMU2, enumMap);
        bgo_1.c(aMU2, bgv_22);
        bgo_1.a(aMU2, bgv_22);
        bgo_1.b(aMU2, bgv_22);
        return bgv_22;
    }

    private static void a(aMU aMU2, fhc_0 fhc_02) {
        int n = aMU2.d();
        for (amw_0 amw_02 : aMU2.cpE()) {
            fgM fgM2 = fgM.Vg(amw_02.cnI());
            bfc_1 bfc_12 = bft_0.a(amw_02.avZ(), fgM2);
            if (bfc_12 != null) {
                ang_2 ang_22 = null;
                try {
                    ang_22 = ehu_0.rY(amw_02.clB());
                }
                catch (Exception exception) {
                    jVg.error((Object)("Erreur de compilation du crit\u00e8rre sur l'action id=" + amw_02.cnI() + " de l'item id=" + n), (Throwable)exception);
                }
                bfc_12.v(amw_02.cnJ());
                bfc_12.j(ang_22);
                bfc_12.mZ(amw_02.cpI());
                bfc_12.na(amw_02.aZu());
                bfc_12.nb(amw_02.cpJ());
                bfc_12.nc(fgM2.fXs());
                bfc_12.mY(amw_02.cpK());
                fhc_02.a(bfc_12);
                fhc_02.nk(true);
                if (!(bfc_12 instanceof bge_1)) continue;
                bgo_1.a((bge_1)bfc_12);
                continue;
            }
            jVg.error((Object)("Chargement d'une action d'un type inconnu sur un item actionId=" + amw_02.cnI() + " referenceItemId=" + fhc_02.d()));
        }
    }

    private static void a(bge_1 bge_12) {
        bge_12.dTz().forEach((n, l) -> fdb.fSX().H((int)n, (long)l));
    }

    private static void b(aMU aMU2, fhc_0 fhc_02) {
        aoc_0 aoc_02 = new aoc_0();
        for (int n : aMU2.cjX()) {
            try {
                if (!aqb_1.bGD().a(n, aoc_02)) continue;
                enk_0 enk_02 = bat_2.cZD().Ay(n);
                if (enk_02 != null) {
                    fhc_02.v(enk_02);
                    continue;
                }
                jVg.error((Object)("Probl\u00e8me de chargement du ReferenceItem " + aMU2.d()));
            }
            catch (Exception exception) {
                jVg.error((Object)("Exception au chargement de l'effet " + n), (Throwable)exception);
            }
        }
    }

    private static void c(aMU aMU2, fhc_0 fhc_02) {
        int n = aMU2.d();
        for (int n2 : aMU2.cpw()) {
            fgg_0 fgg_02 = fgg_0.UZ(n2);
            if (fgg_02 == null) {
                jVg.error((Object)("Impossible de trouver la propri\u00e9t\u00e9 " + n2 + " d\u00e9finie pour l'item " + n));
                continue;
            }
            fhc_02.d(fgg_02);
        }
    }

    private static EnumMap<ffj_0, ang_2> k(aMU aMU2) {
        int n = aMU2.d();
        EnumMap<ffj_0, ang_2> enumMap = new EnumMap<ffj_0, ang_2>(ffj_0.class);
        String[] stringArray = aMU2.cph();
        if (stringArray != null) {
            int n2 = stringArray.length / 2;
            for (int i = 0; i < n2; ++i) {
                ang_2 ang_22;
                ffj_0 ffj_02;
                String string = stringArray[2 * i];
                String string2 = stringArray[2 * i + 1];
                try {
                    ffj_02 = ffj_0.valueOf(string);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    jVg.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration d'une action : type d'action inconnu : '" + string + "' Item : " + n), (Throwable)illegalArgumentException);
                    continue;
                }
                try {
                    ang_22 = ehu_0.rY(string2);
                }
                catch (Exception exception) {
                    jVg.error((Object)("Erreur lors de la compilation du crit\u00e8re sur l'action " + String.valueOf(ffj_02) + " de l'item " + n), (Throwable)exception);
                    continue;
                }
                enumMap.put(ffj_02, ang_22);
            }
        }
        return enumMap;
    }

    @Override
    public /* synthetic */ Object d(aqz_2 aqz_22) {
        return this.e(aqz_22);
    }
}

