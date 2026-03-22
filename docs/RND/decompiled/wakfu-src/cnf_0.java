/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnf
 */
public class cnf_0
extends nv_0 {
    private boolean mbr;

    public void jp(boolean bl) {
        this.mbr = bl;
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put((byte)(this.mbr ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 12600;
    }
}

