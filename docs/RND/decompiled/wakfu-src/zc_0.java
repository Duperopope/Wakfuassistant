/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Zc
 */
public final class zc_0
extends zb_0<Yi> {
    public zc_0(String string) {
        super(string);
    }

    public final Yi boV() {
        return new Yi();
    }

    @Override
    public final void a(Yi yi, ByteBuffer byteBuffer) {
        yi.axm = byteBuffer.get();
    }

    @Override
    public void a(fs_0 fs_02, String string) {
        fs_02.g(Byte.parseByte(string));
    }

    @Override
    public /* synthetic */ Yh boU() {
        return this.boV();
    }
}

