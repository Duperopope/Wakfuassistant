/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aPE
 */
public final class ape_0 {
    private ape_0() {
    }

    public static void aU(short s) {
        ezj_0 ezj_02 = ezj_0.Pl(s);
        if (ezj_02 == null) {
            return;
        }
        if (ezj_02 == ezj_0.ptU) {
            return;
        }
        ape_0.a(ezj_02);
    }

    public static void a(@NotNull ezj_0 ezj_02) {
        String string = "error.worldPropertyType." + ezj_02.name();
        String string2 = aum_0.cWf().c(string, new Object[0]);
        aPh.czg().iY(string2);
        byj_1.epo().a(byc_1.c(byh_1.lAC, string2));
    }
}

