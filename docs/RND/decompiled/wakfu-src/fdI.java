/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public class fdI
extends fdz_0 {
    @NotNull
    private final @Unmodifiable List<fdJ> rXt;
    @NotNull
    private final @Unmodifiable Map<rw_0, fdJ> rXu;

    public fdI(int n, int n2, eIx eIx2, int n3, Collection<fdJ> collection) {
        super(n, n2, eIx2, n3);
        this.rXt = new ArrayList<fdJ>(collection);
        this.rXt.sort(Comparator.comparingInt(fdJ2 -> fdJ2.fTU().cZc()).thenComparingInt(fdJ2 -> fdJ2.fTU().cZa()));
        int n4 = Math.min(this.rXt.size(), rw_0.blx.length);
        HashMap<rw_0, fdJ> hashMap = new HashMap<rw_0, fdJ>(n4);
        List<fdJ> list = this.rXt.subList(0, n4);
        for (int i = 0; i < list.size(); ++i) {
            fdJ fdJ3 = list.get(i);
            rw_0 rw_02 = rw_0.blx[i];
            hashMap.put(rw_02, fdJ3);
        }
        this.rXu = Map.copyOf(hashMap);
    }

    @NotNull
    public @Unmodifiable List<fdJ> fTR() {
        return this.rXt;
    }

    @NotNull
    public @Unmodifiable Set<rw_0> fTS() {
        return Set.copyOf(this.rXu.keySet());
    }

    public Optional<fdJ> g(rw_0 rw_02) {
        return Optional.ofNullable(this.rXu.getOrDefault(rw_02, null));
    }

    @NotNull
    public @Unmodifiable Map<rw_0, fdJ> fTT() {
        return this.rXu;
    }
}

