/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from bYd
 */
public final class byd_2
extends Enum<byd_2> {
    public static final /* enum */ byd_2 lxW = new byd_2(2, Mv.aVk);
    public static final /* enum */ byd_2 lxX = new byd_2(3, Mv.aVl);
    public static final /* enum */ byd_2 lxY = new byd_2(4, Mv.aVm);
    public static final /* enum */ byd_2 lxZ = new byd_2(5, Mv.aVn);
    public static final /* enum */ byd_2 lya = new byd_2(6, Mv.aVp);
    public static final /* enum */ byd_2 lyb = new byd_2(7, Mv.aVo);
    public final int lyc;
    private final Mv[] lyd;
    private static final /* synthetic */ byd_2[] lye;

    public static byd_2[] values() {
        return (byd_2[])lye.clone();
    }

    public static byd_2 valueOf(String string) {
        return Enum.valueOf(byd_2.class, string);
    }

    private byd_2(int n2, Mv ... mvArray) {
        this.lyc = n2;
        this.lyd = (Mv[])mvArray.clone();
    }

    public static byd_2 u(Mv mv) {
        byd_2[] byd_2Array = byd_2.values();
        for (int i = 0; i < byd_2Array.length; ++i) {
            byd_2 byd_22 = byd_2Array[i];
            if (!ArrayUtils.contains((Object[])byd_22.lyd, (Object)((Object)mv))) continue;
            return byd_22;
        }
        return lxX;
    }

    private static /* synthetic */ byd_2[] eoL() {
        return new byd_2[]{lxW, lxX, lxY, lxZ, lya, lyb};
    }

    static {
        lye = byd_2.eoL();
    }
}

