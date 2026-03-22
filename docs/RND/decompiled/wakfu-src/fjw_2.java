/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fJw
 */
public class fjw_2
extends fjs_2 {
    private static final Logger uEz = Logger.getLogger(fjw_2.class);
    public static final String TAG = "isFalse";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (object instanceof Boolean) {
            return (Boolean)object == false;
        }
        return false;
    }
}

