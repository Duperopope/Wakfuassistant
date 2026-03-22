/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwk
 */
class bwk_0
extends bwi {
    @NotNull
    private final bgt_0 jwO;

    bwk_0(@NotNull bgt_0 bgt_02) {
        this.jwO = bgt_02;
    }

    @Override
    @NotNull
    public bgt_0 dLD() {
        return this.jwO;
    }

    @Override
    @Nullable
    public eJS dLE() {
        return null;
    }

    @Override
    public long Sn() {
        return this.jwO.Sn();
    }

    @Override
    public long Xi() {
        return this.jwO.Xi();
    }

    @Override
    public String getName() {
        return this.jwO.getName();
    }

    @Override
    public short cmL() {
        return this.jwO.cmL();
    }

    @Override
    public <T extends bgy> T dcP() {
        return (T)this.jwO;
    }

    @Override
    public boolean bbj() {
        return this.jwO.Sn() <= 0L || this.jwO.aZj() <= 0L;
    }
}

