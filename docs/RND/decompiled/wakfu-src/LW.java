/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public final class LW<T>
implements Serializable {
    private static final long aRv = -7083049094761113748L;
    @Nullable
    private T aGT;

    public LW() {
    }

    public LW(@Nullable T t) {
        this.aGT = t;
    }

    @Contract(pure=true)
    @Nullable
    public T aTx() {
        return this.aGT;
    }

    @Nullable
    @Contract(value="null -> null;!null -> !null")
    public T v(@Nullable T t) {
        this.aGT = t;
        return this.aGT;
    }

    public String toString() {
        return String.valueOf(this.aGT);
    }
}

