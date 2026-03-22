/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUv
 */
public class auv_0
implements aeh_2 {
    private static final String gyQ = "languageCode";
    private static final String gyR = "isFrenchVisible";
    private static final String gyS = "isEnglishVisible";
    private static final String gyT = "isSpanishVisible";
    private static final String gyU = "isPortugueseVisible";
    private static final String gyV = "visibleLanguageCount";
    private static final String gyW = "isLanguageRestricted";
    private final vb_0 gyX;

    public auv_0(vb_0 vb_02) {
        this.gyX = vb_02;
    }

    @Override
    public String[] bxk() {
        return new String[]{gyQ, gyR, gyS, gyT, gyU, gyV};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(gyQ)) {
            return this.gyX.aUXX().aUP().toLowerCase();
        }
        if (string.equals(gyR)) {
            return auv_0.m(Mv.aVk);
        }
        if (string.equals(gyS)) {
            return auv_0.m(Mv.aVl);
        }
        if (string.equals(gyT)) {
            return auv_0.m(Mv.aVm);
        }
        if (string.equals(gyU)) {
            return auv_0.m(Mv.aVn);
        }
        if (string.equals(gyV)) {
            return (auv_0.m(Mv.aVk) ? 1 : 0) + (auv_0.m(Mv.aVl) ? 1 : 0) + (auv_0.m(Mv.aVm) ? 1 : 0) + (auv_0.m(Mv.aVn) ? 1 : 0);
        }
        if (string.equals(gyW)) {
            return fse_1.gFu().dp("isClientLanguageRestricted");
        }
        return null;
    }

    private static boolean m(Mv mv) {
        if (fse_1.gFu().dp("isClientLanguageRestricted") && mv != aup_0.cWl()) {
            return false;
        }
        return ewo_0.z(mv);
    }
}

