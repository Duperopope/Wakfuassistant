/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fnP
 */
public class fnp_0 {
    public static boolean a(fnl_0 fnl_02, int n) {
        Object r = fgD.fXh().Vd(n);
        fgl_0 fgl_02 = ((fhc_0)r).fUZ();
        return fgl_02 != null && fgl_02.dTl() == fgM.skR || fnl_02.geL().XF(n);
    }

    public static boolean b(fnl_0 fnl_02, int n) {
        Object r = fgD.fXh().Vd(n);
        fgl_0 fgl_02 = ((fhc_0)r).fUZ();
        return fgl_02 != null && fgl_02.dTl() == fgM.skQ || fnl_02.geL().XG(n);
    }

    public static boolean i(fnl_0 fnl_02) {
        return fnl_02.geL().agM() <= fnl_02.agM();
    }

    public static boolean j(fnl_0 fnl_02) {
        return fnl_02.aVe() == fnl_02.cmL();
    }

    public static boolean a(fnl_0 fnl_02, ux_0 ux_02) {
        uw_0 uw_02 = new uw_0(fnl_02.geN());
        uw_02.bjx();
        uz_0 uz_02 = uw_02.l(ux_02);
        if (fnl_02.geQ()) {
            uz_0 uz_03 = fnl_02.geP().l(ux_02);
            uz_02.h(uz_03);
        }
        return uw_02.bjD() == ux_02.bjD() && uw_02.bjG() == ux_02.bjG() && uw_02.bjI() == ux_02.bjI();
    }

    public static boolean k(fnl_0 fnl_02) {
        if (fnl_02.agK() == 0) {
            return false;
        }
        int[] nArray = fnl_02.geL().gfB();
        return ArrayUtils.contains((int[])nArray, (int)fnl_02.agK());
    }
}

