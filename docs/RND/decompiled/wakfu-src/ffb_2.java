/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

/*
 * Renamed from fFb
 */
public abstract class ffb_2<T, U> {
    protected T uot;
    protected Consumer<T> uou;

    public void bc(T t) {
        this.uot = t;
        this.gvz();
        if (this.uou != null) {
            this.uou.accept(this.uot);
        }
    }

    public T gvA() {
        return this.uot;
    }

    public void z(Consumer<T> consumer) {
        this.uou = consumer;
    }

    protected void gvz() {
    }

    public abstract boolean aG(U var1);

    public abstract void jR(boolean var1);

    public abstract void brX();
}

