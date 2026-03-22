/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import java.util.OptionalLong;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bui
 */
public abstract class bui_0<T>
implements bug_0<T> {
    @Nullable
    private final Long joT;
    @Nullable
    private final Long joU;

    protected bui_0(@Nullable Long l, @Nullable Long l2) {
        this.joT = l;
        this.joU = l2;
    }

    protected abstract OptionalLong ao(T var1);

    protected abstract OptionalLong an(T var1);

    @Override
    public boolean ah(T t) {
        OptionalLong optionalLong = this.ao(t);
        OptionalLong optionalLong2 = this.an(t);
        if (optionalLong.isEmpty() && optionalLong2.isEmpty()) {
            return true;
        }
        long l = optionalLong.orElse(Long.MIN_VALUE);
        long l2 = optionalLong2.orElse(Long.MAX_VALUE);
        long l3 = this.joT == null ? Long.MIN_VALUE : this.joT;
        long l4 = this.joU == null ? Long.MAX_VALUE : this.joU;
        return l <= l4 && l3 <= l2;
    }

    @Override
    public boolean isValid() {
        return this.joT != null || this.joU != null;
    }

    @Nullable
    public Long dIO() {
        return this.joT;
    }

    @Nullable
    public Long dIP() {
        return this.joU;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bui_0 bui_02 = (bui_0)object;
        return Objects.equals(this.joT, bui_02.joT) && Objects.equals(this.joU, bui_02.joU);
    }

    public int hashCode() {
        return Objects.hash(this.joT, this.joU);
    }
}

