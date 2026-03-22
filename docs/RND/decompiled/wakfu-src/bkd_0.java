/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bKD
 */
public class bkd_0 {
    @NotNull
    private static final bkd_0 kpn = new bkd_0();
    @NotNull
    private static final Logger kpo = LoggerFactory.getLogger(bkd_0.class);
    @NotNull
    private final Int2ObjectArrayMap<bkc_0> kpp = new Int2ObjectArrayMap();
    @NotNull
    private final Map<bkc_0, List<ftq_0>> kpq = new HashMap<bkc_0, List<ftq_0>>();
    @Nullable
    private @Unmodifiable List<bkc_0> kpr;

    @NotNull
    public static bkd_0 ebG() {
        return kpn;
    }

    public boolean HN(int n) {
        return this.kpp.containsKey(n);
    }

    @NotNull
    public Optional<bkc_0> HO(int n) {
        return Optional.ofNullable((bkc_0)this.kpp.get(n));
    }

    public void b(@NotNull bkc_0 bkc_02) {
        this.kpp.put(bkc_02.cZa(), (Object)bkc_02);
    }

    public void a(int n, @NotNull ftq_0 ftq_02) {
        Optional<bkc_0> optional = this.HO(n);
        if (optional.isEmpty()) {
            kpo.warn("Unable to register following {} ({}) in following {} ({}) because this {} is unknown", new Object[]{ftq_0.class.getName(), ftq_02.cZa(), bkc_0.class.getName(), n, bkc_0.class.getName()});
            return;
        }
        bkc_0 bkc_03 = optional.get();
        this.kpq.computeIfAbsent(bkc_03, bkc_02 -> new ArrayList()).add(ftq_02);
    }

    @NotNull
    public @Unmodifiable List<ftq_0> c(bkc_0 bkc_02) {
        return Collections.unmodifiableList(this.kpq.getOrDefault(bkc_02, Collections.emptyList()));
    }

    private void bXC() {
        this.kpr = this.kpp.values().stream().sorted(bkc_0.kpm).toList();
    }

    @NotNull
    public @Unmodifiable List<bkc_0> ebH() {
        if (this.kpr == null || this.kpr.size() != this.kpp.size()) {
            this.bXC();
        }
        return this.kpr;
    }
}

