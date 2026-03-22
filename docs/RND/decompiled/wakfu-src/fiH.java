/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fiH<D extends SH> {
    protected static final Logger ssH = Logger.getLogger(fiH.class);
    private final int ssI;
    protected final Map<Integer, D> ssJ = new LinkedHashMap<Integer, D>();

    public fiH() {
        this(0);
    }

    public fiH(int n) {
        this.ssI = n;
    }

    public int d() {
        return this.ssI;
    }

    public int aVo() {
        return this.ssJ.size();
    }

    public void a(@NotNull D d2) {
        this.ssJ.put(d2.d(), d2);
    }

    public boolean v(Object object, Object object2, Object object3, Object object4) {
        return !this.ssJ.isEmpty();
    }

    public D Wa(int n) {
        return (D)((SH)this.ssJ.get(n));
    }

    public Map<Integer, D> fZX() {
        return this.ssJ;
    }

    public Optional<D> fZY() {
        return this.w(null, null, null, null);
    }

    public Optional<D> w(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (this.ssJ.isEmpty()) {
            return Optional.empty();
        }
        ArrayList<fiI<D>> arrayList = new ArrayList<fiI<D>>();
        int n = 0;
        for (SH sH : this.ssJ.values()) {
            if (!this.a(sH, object, object2, object3, object4)) continue;
            arrayList.add(new fiI<SH>(sH, n += sH.bdn()));
        }
        return this.bc(arrayList);
    }

    public Optional<Integer> x(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        return this.w(object, object2, object3, object4).map(SH::d);
    }

    public Optional<D> b(@NotNull Collection<? extends exP> collection, @NotNull Collection<? extends exP> collection2, @Nullable Object object, @Nullable Object object2) {
        if (this.ssJ.isEmpty()) {
            return Optional.empty();
        }
        ArrayList<fiI<D>> arrayList = new ArrayList<fiI<D>>();
        int n = 0;
        for (SH sH : this.ssJ.values()) {
            for (exP exP2 : collection) {
                for (exP exP3 : collection2) {
                    if (!this.a(sH, exP2, exP3, object, object2)) continue;
                    arrayList.add(new fiI<SH>(sH, n += sH.bdn()));
                }
            }
        }
        return this.bc(arrayList);
    }

    private Optional<D> bc(List<fiI<D>> list) {
        int n;
        int n2 = n = list.isEmpty() ? 0 : list.getLast().gaa();
        if (n == 0) {
            return Optional.empty();
        }
        int n3 = ve_0.pV(n);
        for (fiI<D> fiI2 : list) {
            if (fiI2.gaa() < n3) continue;
            return Optional.of((SH)fiI2.fZZ());
        }
        ssH.warn((Object)("Trying to drop from a non-empty table where weights are non-positive: " + String.valueOf(this)));
        return Optional.empty();
    }

    protected boolean a(D d2, @Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        short s = d2.bdn();
        ang_2 ang_22 = d2.bdo();
        return s > 0 && (ang_22 == null || ang_22.b(object, object2, object3, object4));
    }

    public String toString() {
        return "DropTable{m_id=" + this.ssI + ", m_drops=" + String.valueOf(this.ssJ) + "}";
    }
}

