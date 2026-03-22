/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ccd
 */
public final class ccd_2
implements aeh_2 {
    private static final ccd_2 lND = new ccd_2();
    private static final int lNE = 9599;
    public static final String lNF = "shardsItemIcon";
    public static final String lNG = "powderItemIcon";
    public static final String lNH = "adminItemIcon";
    public static final String lNI = "keysItemIcon";
    public static final String lNJ = "testMonsterName";
    public static final String lNK = "regularMonsterName";
    private static final String[] lNL = new String[]{"shardsItemIcon", "powderItemIcon", "adminItemIcon", "keysItemIcon", "testMonsterName", "regularMonsterName"};

    public static ccd_2 eti() {
        return lND;
    }

    private ccd_2() {
    }

    @Override
    public String[] bxk() {
        return lNL;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "shardsItemIcon": {
                return ccd_2.a(cce_2.lNS);
            }
            case "powderItemIcon": {
                return ccd_2.a(cce_2.lNT);
            }
            case "keysItemIcon": {
                return ccd_2.KM(9599);
            }
            case "adminItemIcon": {
                return ccd_2.a(cce_2.lNW);
            }
            case "testMonsterName": {
                return ccd_2.b(cce_2.lOe);
            }
            case "regularMonsterName": {
                return ccd_2.b(cce_2.lOc);
            }
        }
        return null;
    }

    private static String a(cce_2 cce_22) {
        int n;
        aRY aRY2 = cce_22.etk()[0];
        if (aRY2 instanceof aqw_0) {
            n = ((aqw_0)aRY2).avr();
        } else if (aRY2 instanceof atc_0) {
            n = ((atc_0)aRY2).acs();
        } else {
            return "";
        }
        return ccd_2.KM(n);
    }

    private static String KM(int n) {
        Object r = fgD.fXh().Vd(n);
        return auc_0.cVq().zx(((fhc_0)r).aVt());
    }

    private static String b(cce_2 cce_22) {
        aRY aRY2 = cce_22.etk()[0];
        if (!(aRY2 instanceof aQV)) {
            return "";
        }
        int n = ((aQV)aRY2).d();
        return aum_0.cWf().a(7, (long)n, new Object[0]);
    }

    public void iZ(boolean bl) {
        if (bl) {
            fse_1.gFu().f("adminQuickMenu", lND);
            fyw_0.gqw().d("wakfu.adminQuickMenu", cdm_1.class);
        } else {
            fse_1.gFu().vX("adminQuickMenu");
            fyw_0.gqw().tc("wakfu.adminQuickMenu");
        }
    }
}

