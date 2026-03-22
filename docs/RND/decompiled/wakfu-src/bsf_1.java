/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSF
 */
public class bsf_1
implements aeh_2 {
    private static final bsf_1 lhP = new bsf_1();
    public static final String lhQ = "uiScaleSliderValuesCount";
    public static final String lhR = "currentUiScaleText";
    public static final String lhS = "minUiScaleText";
    public static final String lhT = "maxUiScaleText";

    public static bsf_1 emZ() {
        return lhP;
    }

    private bsf_1() {
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "uiScaleSliderValuesCount": {
                return 26;
            }
            case "currentUiScaleText": {
                float f2 = ((bsg_1)aie_0.cfn().bmH()).c(aff.cpL);
                return "(" + bsf_1.eG(f2) + ")";
            }
            case "minUiScaleText": {
                return bsf_1.eG(-5.0f);
            }
            case "maxUiScaleText": {
                return bsf_1.eG(20.0f);
            }
        }
        return null;
    }

    private static String eG(float f2) {
        float f3 = 1.0f + fhv_2.fU(f2);
        return Math.round(100.0f * f3) + "%";
    }

    @Override
    public String[] bxk() {
        return new String[]{lhR, lhQ, lhS, lhT};
    }
}

