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
 * Renamed from biT
 */
public class bit_0
implements aeh_2 {
    private static final Logger imU = Logger.getLogger(bit_0.class);
    public static final bit_0 imV = new bit_0();

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        try {
            return String.format(auc_0.cVq().bS("targetEffectIconsPath"), string);
        }
        catch (fu_0 fu_02) {
            imU.warn((Object)("Invalid icon name " + string), (Throwable)fu_02);
            return null;
        }
    }
}

