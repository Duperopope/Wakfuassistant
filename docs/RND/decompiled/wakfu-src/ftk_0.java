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
 * Renamed from ftk
 */
public class ftk_0 {
    @NotNull
    private static final ftk_0 tft = new ftk_0();
    @NotNull
    private final Int2ObjectOpenHashMap<ftj_0> tfu = new Int2ObjectOpenHashMap();
    @NotNull
    private final Int2ObjectOpenHashMap<ftj_0> tfv = new Int2ObjectOpenHashMap();

    @NotNull
    public static ftk_0 glR() {
        return tft;
    }

    @NotNull
    public Optional<ftj_0> aaj(int n) {
        return Optional.ofNullable((ftj_0)this.tfu.get(n));
    }

    @NotNull
    public Optional<ftj_0> aak(int n) {
        return Optional.ofNullable((ftj_0)this.tfv.get(n));
    }

    public void b(@NotNull ftj_0 ftj_02) {
        this.tfu.put(ftj_02.cZa(), (Object)ftj_02);
        this.tfv.put(ftj_02.glN(), (Object)ftj_02);
    }
}

