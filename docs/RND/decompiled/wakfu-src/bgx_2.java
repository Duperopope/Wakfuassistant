/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGx
 */
public class bgx_2
extends fhe {
    private final Map<Long, ffV> jVQ = new HashMap<Long, ffV>();
    private final Map<Long, ffV> jVR = new HashMap<Long, ffV>();

    private bgx_2() {
    }

    public static bgx_2 a(fhe fhe2) {
        bgx_2 bgx_22 = new bgx_2();
        bgx_22.aDh = fhe2.KU();
        bgx_22.maw.putAll(fhe2.fXE());
        return bgx_22;
    }

    @Override
    public boolean aW(@NotNull ffV ffV2) {
        long l = ffV2.LV();
        if (this.jVR.containsKey(l)) {
            this.jVR.remove(l);
        } else {
            this.jVQ.put(l, ffV2);
        }
        return true;
    }

    @Override
    public boolean b(long l, @Nullable fib fib2) {
        if (this.jVR.containsKey(l)) {
            return this.aW(this.jVR.get(l));
        }
        Object t = fcL.rUh.sw(this.aDh);
        if (t == null) {
            return false;
        }
        Object t2 = fcI.ac(((exP)t).Xi(), l);
        if (t2 == null) {
            return false;
        }
        ffV ffV2 = ((exP)t2).dod().tb(l);
        if (ffV2 != null) {
            return this.aW(ffV2);
        }
        return false;
    }

    @Override
    public Optional<ffV> A(Long l) {
        if (this.jVQ.containsKey(l)) {
            return Optional.of(this.jVQ.remove(l));
        }
        if (!this.maw.containsKey(l)) {
            return Optional.empty();
        }
        ffV ffV2 = (ffV)this.maw.get(l);
        this.jVR.put(l, ffV2);
        return Optional.of(ffV2);
    }

    @Override
    public Optional<ffV> B(Long l) {
        if (this.maw.containsKey(l)) {
            return Optional.ofNullable((ffV)this.maw.get(l));
        }
        return Optional.ofNullable(this.jVQ.get(l));
    }

    @Override
    public boolean C(Long l) {
        return this.maw.containsKey(l) && !this.jVR.containsKey(l) || this.jVQ.containsKey(l);
    }

    @Override
    public boolean D(Long l) {
        return this.maw.containsKey(l);
    }

    @Override
    public void b(fhe fhe2) {
        fhe2.fXE().forEach((l, ffV2) -> this.jVQ.remove(l));
        this.jVR.keySet().removeIf(l -> !fhe2.C((Long)l));
        super.b(fhe2);
    }

    @Override
    public boolean c(Function<ffV, Boolean> function) {
        for (ffV ffV2 : this.maw.values()) {
            if (this.jVR.containsKey(ffV2.LV()) || function.apply(ffV2).booleanValue()) continue;
            return false;
        }
        for (ffV ffV2 : this.jVQ.values()) {
            if (function.apply(ffV2).booleanValue()) continue;
            return false;
        }
        return true;
    }

    @Generated
    public String toString() {
        return "TemporaryEquipmentInventory(m_temporarilyAddedItems=" + String.valueOf(this.jVQ) + ", m_temporarilyRemovedItems=" + String.valueOf(this.jVR) + ")";
    }
}

