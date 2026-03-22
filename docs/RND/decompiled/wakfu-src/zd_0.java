/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Zd
 */
public final class zd_0
extends zb_0<yj_0> {
    public zd_0(String string) {
        super(string);
    }

    public final yj_0 boW() {
        return new yj_0();
    }

    @Override
    public void a(yj_0 yj_02, ByteBuffer byteBuffer) {
        yj_02.awY = byteBuffer.getFloat();
    }

    @Override
    public void a(fs_0 fs_02, String string) {
        fs_02.b(Float.parseFloat(string));
    }

    @Override
    public /* synthetic */ Yh boU() {
        return this.boW();
    }
}

