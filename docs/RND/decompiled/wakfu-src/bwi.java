/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class bwi {
    public static bwi z(@NotNull bgt_0 bgt_02) {
        return new bwk_0(bgt_02);
    }

    public static bwi k(@NotNull eJS eJS2) {
        return new bwj(eJS2);
    }

    @Contract(pure=true)
    public boolean dmc() {
        return this.dLD() != null;
    }

    @Contract(pure=true)
    public boolean aXd() {
        return this.dLE() != null;
    }

    @Contract(pure=true)
    @Nullable
    public abstract bgt_0 dLD();

    @Contract(pure=true)
    @Nullable
    public abstract eJS dLE();

    @Contract(pure=true)
    public abstract long Sn();

    @Contract(pure=true)
    public abstract long Xi();

    @Contract(pure=true)
    public abstract String getName();

    @Contract(pure=true)
    public abstract short cmL();

    @Contract(pure=true)
    public abstract boolean bbj();

    public abstract <T extends bgy> T dcP();
}

