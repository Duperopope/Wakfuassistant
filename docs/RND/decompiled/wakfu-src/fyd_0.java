/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyD
 */
@fyf_0
public class fyd_0 {
    public static final String PACKAGE = "xulor";
    private static final fye_0 tCU = new fye_0();

    public static boolean unloadDialog(fiq_1 fiq_12) {
        Object t = fiq_12.gBE();
        if (t != null) {
            String string = ((fhv_1)t).getElementMap().getId();
            fyw_0.gqw().J(string, false);
        }
        return false;
    }

    public static void switchDrawer(fiq_1 fiq_12, fbg_2 fbg_22) {
        fbg_22.gsG();
    }

    private static boolean a(fes_2 fes_22, frx_1 frx_12, float f2, fdz_1 fdz_12) {
        if (fdz_12 != null && !fdz_12.isTextReduced()) {
            return false;
        }
        if (fes_22 != null && frx_12 != null && !fbj_1.getInstance().isDragging()) {
            abb_2.bUA().b(tCU);
            tCU.setPopup(frx_12);
            tCU.setWidget(fes_22);
            if (f2 == 0.0f) {
                frx_12.b(fes_22);
            } else {
                abb_2.bUA().a(tCU, (long)(1000.0f * f2), -1, 1L);
            }
        }
        return false;
    }

    public static boolean popup(fiq_1 fiq_12, frx_1 frx_12, String string) {
        return fyd_0.a(fiq_12, frx_12, Float.valueOf(string).floatValue());
    }

    private static azx_1<frx_1, fes_2> b(fiq_1 fiq_12, frx_1 frx_12) {
        Object t = fiq_12.gBE();
        if (!(t instanceof fes_2)) {
            return null;
        }
        fes_2 fes_22 = (fes_2)t;
        azx_1<frx_1, fes_2> azx_12 = new azx_1<frx_1, fes_2>();
        if (fes_22.getPopup() != null) {
            azx_12.Q(fes_22.getPopup());
            azx_12.N(fes_22);
        } else if (frx_12 != null) {
            azx_12.Q(frx_12);
            azx_12.N(frx_12.getParentOfType(fes_2.class));
        }
        return azx_12;
    }

    private static boolean a(fiq_1 fiq_12, frx_1 frx_12, float f2) {
        azx_1<frx_1, fes_2> azx_12 = fyd_0.b(fiq_12, frx_12);
        if (azx_12 == null) {
            return false;
        }
        fyd_0.popup(azx_12.getFirst(), azx_12.aHI(), f2);
        return false;
    }

    public static boolean popup(fiq_1 fiq_12) {
        Object t = fiq_12.gBE();
        if (!(t instanceof fes_2)) {
            return false;
        }
        frx_1 frx_12 = ((fes_2)t).getPopup();
        if (frx_12 != null) {
            fyd_0.popup(fiq_12, frx_12);
        }
        return false;
    }

    public static boolean popup(fiq_1 fiq_12, frx_1 frx_12) {
        return fyd_0.a(fiq_12, frx_12, 0.0f);
    }

    public static boolean popup(frx_1 frx_12, fes_2 fes_22, float f2) {
        return fyd_0.a(fes_22, frx_12, f2, null);
    }

    public static boolean popup(frx_1 frx_12, fes_2 fes_22) {
        return fyd_0.popup(frx_12, fes_22, 0.0f);
    }

    public static boolean popup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22) {
        return fyd_0.popup(frx_12, fes_22);
    }

    public static boolean popupIfReduced(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22, fdz_1 fdz_12) {
        return fyd_0.a(fes_22, frx_12, 0.0f, fdz_12);
    }

    public static boolean popupIfReduced(fiq_1 fiq_12, frx_1 frx_12, fdz_1 fdz_12) {
        azx_1<frx_1, fes_2> azx_12 = fyd_0.b(fiq_12, frx_12);
        if (azx_12 == null) {
            return false;
        }
        return fyd_0.a(azx_12.aHI(), azx_12.getFirst(), 0.0f, fdz_12);
    }

    public static boolean popupIfReduced(fiq_1 fiq_12, frx_1 frx_12, fdz_1 fdz_12, String string) {
        azx_1<frx_1, fes_2> azx_12 = fyd_0.b(fiq_12, frx_12);
        if (azx_12 == null) {
            return false;
        }
        return fyd_0.a(azx_12.aHI(), azx_12.getFirst(), Bw.a((Object)string, 0.0f), fdz_12);
    }

    public static boolean popupIfReduced(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22, fdz_1 fdz_12, String string) {
        return fyd_0.a(fes_22, frx_12, Bw.a((Object)string, 0.0f), fdz_12);
    }

    public static boolean popup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22, String string) {
        return fyd_0.a(fes_22, frx_12, Bw.a((Object)string, 0.0f), null);
    }

    public static boolean closePopup(@Nullable fiq_1 fiq_12) {
        abb_2.bUA().b(tCU);
        fbj_1.getInstance().getPopupContainer().eKH();
        return false;
    }

    public static boolean closePopup(fiq_1 fiq_12, frx_1 frx_12) {
        abb_2.bUA().b(tCU);
        fbj_1.getInstance().getPopupContainer().eKH();
        return false;
    }

    public static boolean openClosePopup(fiq_1 fiq_12, frx_1 frx_12) {
        if (fbj_1.getInstance().isDragging()) {
            return false;
        }
        Object t = fiq_12.gBE();
        if (!(t instanceof fes_2)) {
            return false;
        }
        frx_1 frx_13 = ((fes_2)t).getPopup();
        if (frx_13 == null) {
            frx_13 = frx_12;
        }
        frx_13.a((fes_2)t);
        return false;
    }

    public static void playSound(fiq_1 fiq_12, String string) {
        int n = Bw.b((Object)string, -1);
        if (n != -1) {
            fhy_2.gBq().nW(n);
        }
    }

    public static void showWidget(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(true);
        }
    }

    public static void hideWidget(fiq_1 fiq_12, fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(false);
        }
    }

    public static boolean toggleVisible(fiq_1 fiq_12, fes_2 fes_22) {
        return fyd_0.toggleVisible(fes_22);
    }

    public static boolean toggleVisible(fes_2 fes_22) {
        if (fes_22 != null) {
            fes_22.setVisible(!fes_22.isVisible());
        }
        return false;
    }

    public static boolean setupLook(fiq_1 fiq_12, fey_2 fey_22, String string) {
        return false;
    }

    public static boolean foldUnfold(fiq_1 fiq_12) {
        fbo_2 fbo_22 = fiq_12.gBE().getParentOfType(fbo_2.class);
        if (fbo_22 != null) {
            if (fbo_22.isFolded()) {
                fbo_22.gsV();
            } else {
                fbo_22.gsU();
            }
        }
        return false;
    }

    public static boolean unfold(fiq_1 fiq_12) {
        fbo_2 fbo_22 = fiq_12.gBE().getParentOfType(fbo_2.class);
        if (fbo_22 != null && fbo_22.isFolded()) {
            fbo_22.gsV();
        }
        return false;
    }

    public static boolean fold(fiq_1 fiq_12) {
        fbo_2 fbo_22 = fiq_12.gBE().getParentOfType(fbo_2.class);
        if (fbo_22 != null && !fbo_22.isFolded()) {
            fbo_22.gsU();
        }
        return false;
    }

    public static void doNothing(fiq_1 fiq_12) {
    }
}

