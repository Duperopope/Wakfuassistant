/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cCL
 */
public class ccl_2
implements aeh_2 {
    private static final Logger mRj = Logger.getLogger(ccl_2.class);
    public static final ccl_2 mRk = new ccl_2();

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return ccl_2.ph(string);
    }

    @Nullable
    private static String ph(String string) {
        try {
            return String.format(auc_0.cVq().bS("langIconsPath"), string.toUpperCase());
        }
        catch (fu_0 fu_02) {
            mRj.warn((Object)fu_02.getMessage());
            return null;
        }
    }

    @Nullable
    public static String x(@Nullable Mv mv) {
        return mv == null ? null : ccl_2.ph(mv.aUK());
    }
}

