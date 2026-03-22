/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bEo
 */
public final class beo_0 {
    private static final axb_2 jNR = new fhl_2(ett_1.olW);
    private static final EnumMap<fgj, axb_2> jNS = new EnumMap(fgj.class);

    private beo_0() {
    }

    @NotNull
    public static axb_2 d(fgj fgj2) {
        return jNS.getOrDefault(fgj2, jNR);
    }

    @NotNull
    public static String e(fgj fgj2) {
        return beo_0.d(fgj2).bQk();
    }

    static {
        for (fgj fgj2 : fgj.values()) {
            jNS.put(fgj2, new fhl_2(fgj2.fWR()));
        }
    }
}

