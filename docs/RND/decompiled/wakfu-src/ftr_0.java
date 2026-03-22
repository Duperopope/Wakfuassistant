/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.TestOnly
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from ftr
 */
public class ftr_0 {
    @NotNull
    private static final ftr_0 tfQ = new ftr_0();
    @NotNull
    private final Int2ObjectOpenHashMap<ftq_0> tfR = new Int2ObjectOpenHashMap();

    @NotNull
    public static ftr_0 gmc() {
        return tfQ;
    }

    @NotNull
    public Optional<ftq_0> aam(int n) {
        return Optional.ofNullable((ftq_0)this.tfR.get(n));
    }

    public void a(@NotNull ftq_0 ftq_02) {
        this.tfR.put(ftq_02.cZa(), (Object)ftq_02);
    }

    public Optional<Integer> g(@NotNull ftv_0 ftv_02) {
        return this.b(ftv_02.gmk(), ftv_02.gmd());
    }

    public Optional<Integer> b(int n, @NotNull abi_1 abi_12) {
        return this.aam(n).map(ftq_02 -> ftq_02.gma().get(abi_12)).map(fts_0::glK);
    }

    public <T extends fsx_0> Optional<T> a(@NotNull fsy_0<T> fsy_02, @NotNull ftv_0 ftv_02) {
        return this.g(ftv_02).map(fsy_02::aag);
    }

    public boolean c(int n, @NotNull abi_1 abi_12) {
        ftq_0 ftq_02 = (ftq_0)this.tfR.get(n);
        if (ftq_02 == null) {
            return false;
        }
        return ftq_02.gma().containsKey(abi_12);
    }

    public void v(Consumer<ftq_0> consumer) {
        this.tfR.values().forEach(consumer);
    }

    @TestOnly
    public void clear() {
        this.tfR.clear();
    }
}

