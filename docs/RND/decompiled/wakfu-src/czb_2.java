/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZB
 */
public abstract class czb_2 {
    private static final Logger obw = Logger.getLogger(czb_2.class);

    public static boolean m(aam_2 aam_22) {
        return aam_22.d() == 17661 || aam_22.d() == 17354;
    }

    public static boolean n(aam_2 aam_22) {
        return aam_22.d() == 16346 || aam_22.d() == 16990 || aam_22.d() == 19373 || aam_22.d() == 16902 || aam_22.d() == 16172 || aam_22.d() == 19986;
    }

    public static boolean o(aam_2 aam_22) {
        return czb_2.n(aam_22) || czb_2.m(aam_22);
    }
}

