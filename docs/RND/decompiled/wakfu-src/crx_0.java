/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crx
 */
public class crx_0
extends nr_0 {
    private boolean mgl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgl = byteBuffer.get() == 1;
        return true;
    }

    public boolean ezZ() {
        return this.mgl;
    }

    @Override
    public int d() {
        return 12860;
    }
}

