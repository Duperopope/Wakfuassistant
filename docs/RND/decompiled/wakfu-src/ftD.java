/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

public final class ftD {
    private static final Logger tgk = Logger.getLogger(ftD.class);

    private ftD() {
    }

    public static float a(short s, Collection<Short> collection, boolean bl) {
        if (collection == null) {
            return 1.0f;
        }
        try {
            int n = 0;
            for (short s2 : collection) {
                if (s >= s2) continue;
                ++n;
            }
            if (bl) {
                int n2 = Math.min(n, mi_1.aWY.length - 1);
                return mi_1.aWY[n2];
            }
            int n3 = Math.min(n, mi_1.aWZ.length - 1);
            return mi_1.aWZ[n3];
        }
        catch (Exception exception) {
            tgk.error((Object)"Exception during reroll xp factor compute", (Throwable)exception);
            return 1.0f;
        }
    }
}

