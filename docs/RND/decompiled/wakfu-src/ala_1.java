/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alA
 */
public abstract class ala_1<SoundData>
extends alz_1<SoundData> {
    protected ala_1(LuaState luaState) {
        super(luaState);
    }

    protected abstract boolean a(@NotNull aix_2 var1);

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n) {
        return this.a(aix_22, n, 100, -1, Optional.empty());
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, int n2) {
        return this.a(aix_22, n, n2, -1, Optional.empty());
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, int n2, int n3) {
        return this.a(aix_22, n, n2, n3, Optional.empty());
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, @NotNull agn_1 agn_12) {
        return this.a(aix_22, n, 100, agn_12);
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, int n2, @NotNull agn_1 agn_12) {
        return this.a(aix_22, n, n2, -1, Optional.of(agn_12));
    }

    @NotNull
    protected Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, int n2, int n3, @NotNull agn_1 agn_12) {
        return this.a(aix_22, n, n2, n3, Optional.of(agn_12));
    }

    @NotNull
    private Optional<ahm_1> a(@NotNull aix_2 aix_22, int n, int n2, int n3, @NotNull Optional<agn_1> optional) {
        if (!this.a(aix_22)) {
            return Optional.empty();
        }
        long l = System.currentTimeMillis();
        if (!alb_2.bBL().f(l, aix_22.aYj())) {
            return Optional.empty();
        }
        alb_2.bBL().g(l, aix_22.aYj());
        float f2 = aix_22.bBt() * (float)n2 / 100.0f;
        ahm_1 ahm_12 = optional.isPresent() ? aiv_2.bBr().a(aix_22.aYj(), f2, aix_22.bBN(), 1, -1L, -1L, n, n3, optional.get(), aix_22.bBw()) : aiv_2.bBr().a(aix_22.aYj(), f2, aix_22.bBN(), 1, -1L, -1L, n, n3);
        return Optional.ofNullable(ahm_12);
    }
}

