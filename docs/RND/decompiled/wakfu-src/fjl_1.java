/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fJL
 */
public class fjl_1
extends fjs_2 {
    private static final Logger uEU = Logger.getLogger(fjl_1.class);
    public static final String TAG = "isTrue";

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
            return (Boolean)object;
        }
        return false;
    }

    public fjs_2 gCI() {
        fjl_1 fjl_12 = new fjl_1();
        this.a(fjl_12);
        return fjl_12;
    }
}

