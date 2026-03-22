/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fks
 */
public abstract class fks_0<R extends gs_0>
extends fkl_0 {
    @Override
    public final void as(ByteBuffer byteBuffer) {
        R r = this.gck();
        this.a(r);
        r.aF(byteBuffer);
    }

    @Override
    public final void g(ByteBuffer byteBuffer, int n) {
        R r = this.gck();
        r.b(byteBuffer, n);
        this.b(r);
    }

    @Override
    public final int DN() {
        R r = this.gck();
        this.a(r);
        return r.DN();
    }

    protected abstract R gck();

    protected abstract void a(R var1);

    protected abstract void b(R var1);
}

