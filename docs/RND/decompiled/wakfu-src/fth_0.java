/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fth
 */
public class fth_0 {
    @NotNull
    private static final fth_0 tfe = new fth_0();
    @NotNull
    private final Int2ObjectOpenHashMap<ftg_0> tff = new Int2ObjectOpenHashMap();

    @NotNull
    public static fth_0 glI() {
        return tfe;
    }

    @NotNull
    public Optional<ftg_0> aai(int n) {
        return Optional.ofNullable((ftg_0)this.tff.get(n));
    }

    public void a(@NotNull ftg_0 ftg_02) {
        this.tff.put(ftg_02.cZa(), (Object)ftg_02);
    }
}

