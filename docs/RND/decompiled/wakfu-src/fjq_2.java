/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from fJq
 */
public class fjq_2
extends fjm_2 {
    public static final String TAG = "CollectionCondition";
    public static final String uEf = "size";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.uEh) {
            object = this.uEg;
        }
        if (this.cpF != null && this.cpF.equalsIgnoreCase(uEf)) {
            if (object instanceof Collection) {
                return this.uEb.isValid(((Collection)object).size());
            }
            if (object instanceof Object[]) {
                return this.uEb.isValid(((Object[])object).length);
            }
            return false;
        }
        return false;
    }
}

