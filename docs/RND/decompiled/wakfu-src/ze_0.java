/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ze
 */
public final class ze_0
extends zb_0<yk_0> {
    public ze_0(String string) {
        super(string);
    }

    public final yk_0 boX() {
        return new yk_0();
    }

    @Override
    public final void a(yk_0 yk_02, ByteBuffer byteBuffer) {
        yk_02.aRx = byteBuffer.getShort();
    }

    @Override
    public void a(fs_0 fs_02, String string) {
        fs_02.k(Short.parseShort(string));
    }

    @Override
    public /* synthetic */ Yh boU() {
        return this.boX();
    }
}

