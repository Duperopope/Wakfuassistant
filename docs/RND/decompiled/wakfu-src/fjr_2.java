/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Collection;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from fJr
 */
public class fjr_2
extends fjs_2 {
    public static final String TAG = "contains";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().isArray()) {
            return ArrayUtils.contains((Object[])((Object[])object), (Object)this.aGT);
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return collection.contains(this.aGT);
        }
        return false;
    }
}

