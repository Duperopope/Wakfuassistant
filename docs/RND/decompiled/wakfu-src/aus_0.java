/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUs
 */
public final class aus_0
implements aeh_2 {
    public static final String gyB = "key";
    public static final String gyC = "en";
    public static final String gyD = "fr";
    public static final String gyE = "es";
    public static final String gyF = "pt";
    public static final String[] gyG = new String[]{"key", "en", "fr", "es", "pt"};
    @NotNull
    private final String gyH;
    @NotNull
    final String gyI;
    final Map<Mv, String> gyJ = new EnumMap<Mv, String>(Mv.class);
    final List<String> gyK = new ArrayList<String>();

    public aus_0(@NotNull String string) {
        this.gyH = string;
        this.gyI = BH.aT(string);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{gyB, gyC, gyD, gyE, gyF}, (Object)string2, n)) {
            case 0 -> this.gyH;
            case 1 -> this.gyJ.get((Object)Mv.aVl);
            case 2 -> this.gyJ.get((Object)Mv.aVk);
            case 3 -> this.gyJ.get((Object)Mv.aVm);
            case 4 -> this.gyJ.get((Object)Mv.aVn);
            default -> null;
        };
    }

    public String getKey() {
        return this.gyH;
    }

    @Override
    public String[] bxk() {
        return gyG;
    }
}

