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
 * Renamed from dbN
 */
public class dbn_0
extends dae_0 {
    @NotNull
    private final bgx_1 odS;
    @NotNull
    private final bgt_0 odT;
    @Nullable
    private final bde_0 odU;

    public dbn_0(@NotNull bgx_1 bgx_12, @NotNull bgt_0 bgt_02, @Nullable bde_0 bde_02) {
        this.odS = bgx_12;
        this.odT = bgt_02;
        this.odU = bde_02;
    }

    @NotNull
    public bgx_1 faX() {
        return this.odS;
    }

    @NotNull
    public bgt_0 faY() {
        return this.odT;
    }

    @Nullable
    public bde_0 faZ() {
        return this.odU;
    }

    @Override
    public int d() {
        return 16006;
    }
}

