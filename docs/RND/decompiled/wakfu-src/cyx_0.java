/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyX
 */
public final class cyx_0
extends nr_0 {
    private byte mmQ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmQ = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 22575;
    }

    public byte evi() {
        return this.mmQ;
    }
}

