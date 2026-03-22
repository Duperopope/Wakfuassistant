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
 * Renamed from fto
 */
public class fto_0 {
    @NotNull
    private static final fto_0 tfF = new fto_0();
    @NotNull
    private final Int2ObjectOpenHashMap<ftn_0> tfG = new Int2ObjectOpenHashMap();

    @NotNull
    public static fto_0 glX() {
        return tfF;
    }

    @NotNull
    public Optional<ftn_0> aal(int n) {
        return Optional.ofNullable((ftn_0)this.tfG.get(n));
    }

    public void a(@NotNull ftn_0 ftn_02) {
        this.tfG.put(ftn_02.cZa(), (Object)ftn_02);
    }
}

