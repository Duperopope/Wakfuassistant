/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aCf
 */
public class acf_1 {
    private acf_1() {
    }

    @Nullable
    public static acd_1 a(acd_1 acd_12, Collection<acd_1> collection) {
        if (collection.isEmpty()) {
            return null;
        }
        int n = Integer.MAX_VALUE;
        acd_1 acd_13 = null;
        for (acd_1 acd_14 : collection) {
            int n2 = acd_14.A(acd_12);
            if (n2 >= n) continue;
            acd_13 = acd_14;
            n = n2;
        }
        return acd_13;
    }
}

