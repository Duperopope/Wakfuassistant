/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class afm<P extends vx_0<P>, T extends afW>
extends VW<P>
implements ady_0<T> {
    protected final List<afp<T, P>> cqb = new ArrayList<afp<T, P>>();

    protected afm() {
    }

    protected abstract T bxH();

    public final boolean a(afp<T, P> afp2) {
        return this.cqb.contains(afp2);
    }

    public final void b(afp<T, P> afp2) {
        this.cqb.add(afp2);
    }

    public final void c(afp<T, P> afp2) {
        this.cqb.remove(afp2);
    }

    public final void bxI() {
        this.cqb.clear();
    }

    public void a(T t, P p2, P p3) {
        for (int i = 0; i < this.cqb.size(); ++i) {
            this.cqb.get(i).b(t, p2, p3);
        }
    }
}

