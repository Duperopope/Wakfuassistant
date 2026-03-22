/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQx
 */
public class bqx_2
implements aeh_2 {
    private static final String kVH = "kamasPrice";
    private static final String kVI = "ogrinesQuantity";
    static final bqx_2 kVJ = new bqx_2();

    @Override
    public String[] bxk() {
        return new String[]{kVH, kVI};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kVH)) {
            return "-";
        }
        if (string.equals(kVI)) {
            return "-";
        }
        return null;
    }
}

