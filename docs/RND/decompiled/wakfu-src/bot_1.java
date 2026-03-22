/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from boT
 */
public final class bot_1
extends Enum<bot_1> {
    public static final /* enum */ bot_1 iTt = new bot_1();
    public static final /* enum */ bot_1 iTu = new bot_1();
    public static final /* enum */ bot_1 iTv = new bot_1();
    public static final /* enum */ bot_1 iTw = new bot_1();
    private static final bot_1[] iTx;
    private static final /* synthetic */ bot_1[] iTy;

    public static bot_1[] values() {
        return (bot_1[])iTy.clone();
    }

    public static bot_1 valueOf(String string) {
        return Enum.valueOf(bot_1.class, string);
    }

    public static Optional<bot_1> dh(@NotNull String string) {
        for (bot_1 bot_12 : iTx) {
            if (!bot_12.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bot_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bot_1[] dCj() {
        return new bot_1[]{iTt, iTu, iTv, iTw};
    }

    static {
        iTy = bot_1.dCj();
        iTx = bot_1.values();
    }
}

