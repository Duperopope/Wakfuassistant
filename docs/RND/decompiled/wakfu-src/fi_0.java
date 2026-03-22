/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Ordering
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Fi
 */
public class fi_0 {
    private final TShortObjectHashMap<fk_0> aAJ = new TShortObjectHashMap();
    private final TIntObjectHashMap<fk_0> aAK = new TIntObjectHashMap();
    private int awP = -1;
    private fk_0[] aAL;

    @NotNull
    private static Function<fk_0, Integer> aIu() {
        return new fj_0();
    }

    public int aIn() {
        return this.awP;
    }

    public List<fk_0> aIt() {
        return Collections.unmodifiableList(Arrays.asList(this.aAL));
    }

    public void a(fk_0 ... fk_0Array) {
        for (fk_0 fk_02 : fk_0Array) {
            if (fk_02 == null) continue;
            this.aAJ.put(fk_02.aIi(), (Object)fk_02);
            this.aAK.put(fk_02.aIj(), (Object)fk_02);
        }
        this.aAL = (fk_0[])fk_0Array.clone();
        this.awP = fk_0Array.length == 0 ? -1 : ((fk_0)Ordering.natural().onResultOf(fi_0.aIu()).nullsFirst().max(Arrays.asList(this.aAL))).aIn();
    }

    @Nullable
    public fk_0 mJ(int n) {
        return (fk_0)this.aAK.get(n);
    }

    @Nullable
    public fk_0 v(short s) {
        return (fk_0)this.aAJ.get(s);
    }

    public void clear() {
        this.awP = -1;
        this.aAL = null;
        this.aAJ.clear();
        this.aAK.clear();
    }
}

