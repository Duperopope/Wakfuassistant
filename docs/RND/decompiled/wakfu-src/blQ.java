/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class blQ
extends Enum<blQ> {
    public static final /* enum */ blQ iwP = new blQ();
    public static final /* enum */ blQ iwQ = new blQ();
    public static final /* enum */ blQ iwR = new blQ();
    public static final /* enum */ blQ iwS = new blQ();
    public static final /* enum */ blQ iwT = new blQ();
    public static final /* enum */ blQ iwU = new blQ();
    private static final /* synthetic */ blQ[] iwV;

    public static blQ[] values() {
        return (blQ[])iwV.clone();
    }

    public static blQ valueOf(String string) {
        return Enum.valueOf(blQ.class, string);
    }

    @Nullable
    public static blQ lX(@NotNull String string) {
        for (blQ blQ2 : blQ.values()) {
            if (!blQ2.name().equalsIgnoreCase(string)) continue;
            return blQ2;
        }
        return null;
    }

    private static /* synthetic */ blQ[] duu() {
        return new blQ[]{iwP, iwQ, iwR, iwS, iwT, iwU};
    }

    static {
        iwV = blQ.duu();
    }
}

