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
 * Renamed from bEv
 */
public class bev_1
implements aeh_2 {
    private static final Logger jOv = Logger.getLogger(bev_1.class);
    public static final bev_1 jOw = new bev_1();

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        try {
            return auc_0.cVq().aZ(Short.parseShort(string));
        }
        catch (NumberFormatException numberFormatException) {
            jOv.error((Object)("Error when displaying icon of item type " + string), (Throwable)numberFormatException);
            return null;
        }
    }
}

