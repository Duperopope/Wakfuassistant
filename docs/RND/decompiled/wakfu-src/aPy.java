/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aPy
implements Comparator {
    aPy(aPw aPw2) {
    }

    public int compare(Object object, Object object2) {
        if (object != null && object2 != null && object instanceof apc_0 && object2 instanceof apc_0) {
            apc_0 apc_02 = (apc_0)object;
            apc_0 apc_03 = (apc_0)object2;
            if (apc_02.getName() != null && apc_03.getName() != null) {
                return apc_02.getName().compareTo(apc_03.getName());
            }
        }
        return 0;
    }
}

