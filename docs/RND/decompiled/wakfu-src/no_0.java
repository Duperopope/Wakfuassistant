/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NO
 */
public class no_0
extends nn_0 {
    protected byte aYY;

    public byte aWz() {
        return this.aYY;
    }

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYY = byteBuffer.get();
        return this.b(byArray, byteBuffer.position());
    }

    @Override
    public int d() {
        return 668;
    }
}

