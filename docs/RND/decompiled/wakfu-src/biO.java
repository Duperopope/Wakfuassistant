/*
 * Decompiled with CFR 0.152.
 */
public class biO {
    public static String y(int n, boolean bl) {
        boolean bl2 = true;
        return biO.a(n, bl, true, ett_1.opC);
    }

    public static String a(int n, boolean bl, ett_1 ett_12) {
        boolean bl2 = true;
        return biO.a(n, bl, true, ett_12);
    }

    public static String a(int n, boolean bl, boolean bl2, ett_1 ett_12) {
        Object object;
        axb_2 axb_22 = n < 0 ? fhm_2.uwB.a(ett_1.opD) : fhm_2.uwB.a(ett_12);
        Object object2 = object = bl2 ? n + "%" : String.valueOf(n);
        if (bl) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceC().e(axb_22).c((CharSequence)object);
            return ahv_22.ceL();
        }
        return object;
    }

    public static String dn(int n, int n2) {
        axb_2 axb_22 = n < 0 ? fhm_2.uwB.a(ett_1.opD) : fhm_2.uwB.a(ett_1.opC);
        String string = aum_0.cWf().c("resist.for.charac.sheet", n, n2);
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().e(axb_22).c(string);
        return ahv_22.ceL();
    }

    public static String a(int n, boolean bl, boolean bl2, boolean bl3) {
        Object object;
        Object object2 = object = bl2 ? n + "%" : String.valueOf(n);
        if (bl3) {
            axb_2 axb_22 = n < 0 ? fhm_2.uwB.a(ett_1.opD) : fhm_2.uwB.a(ett_1.opC);
            if (bl) {
                ahv_2 ahv_22 = new ahv_2();
                ahv_22.ceC().e(axb_22).c((CharSequence)object);
                return ahv_22.ceL();
            }
            return object;
        }
        return object;
    }

    public static String i(int n, int n2, boolean bl) {
        String string = aum_0.cWf().c("resist.for.charac.sheet", n, n2);
        ahv_2 ahv_22 = new ahv_2();
        if (bl) {
            axb_2 axb_22 = n < 0 ? fhm_2.uwB.a(ett_1.opD) : fhm_2.uwB.a(ett_1.opC);
            ahv_22.ceC().e(axb_22).c(string);
            return ahv_22.ceL();
        }
        return string;
    }

    public static String a(int n, ett_1 ett_12) {
        ahv_2 ahv_22 = new ahv_2();
        if (n < 0) {
            ahv_22.ceC().e(fhm_2.uwB.a(ett_1.opD));
        } else if (n > 0) {
            ahv_22.ceC().e(fhm_2.uwB.a(ett_12));
        }
        ahv_22.yx(n);
        return ahv_22.ceL();
    }
}

