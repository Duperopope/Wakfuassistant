/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYw
 */
public class byw_1
implements aeh_2 {
    public static final String lzC = "text";
    public static final String lzD = "hasButton";
    @NotNull
    final byz_1 lzE;
    private final long lzF;

    byw_1(@NotNull byz_1 byz_12, long l) {
        this.lzE = byz_12;
        this.lzF = l;
    }

    @Nullable
    public bya_1 eoZ() {
        return this.lzE.epg();
    }

    public long KU() {
        return this.lzF;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{lzC, lzD}, (Object)string2, n)) {
            case 0 -> this.lzE.epf();
            case 1 -> this.lzE.epg() != null;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{lzC, lzD};
    }
}

