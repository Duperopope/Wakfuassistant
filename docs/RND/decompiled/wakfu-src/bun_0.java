/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bun
 */
public abstract class bun_0<T>
implements bug_0<T> {
    @Nullable
    private final Boolean jpb;

    protected bun_0(@Nullable Boolean bl) {
        this.jpb = bl;
    }

    protected abstract boolean ak(T var1);

    @Override
    public boolean ah(T t) {
        if (this.jpb == null) {
            return true;
        }
        return this.ak(t) == this.jpb.booleanValue();
    }

    @Override
    public boolean isValid() {
        return this.jpb != null;
    }

    @Nullable
    public Boolean dIS() {
        return this.jpb;
    }
}

