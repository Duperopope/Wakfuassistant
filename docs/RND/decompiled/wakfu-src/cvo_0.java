/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvO
 */
public class cvo_0
extends nr_0 {
    private long bgK;
    private byte mkv;
    private long mkw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bgK = byteBuffer.getLong();
        this.mkv = byteBuffer.get();
        this.mkw = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12313;
    }

    public long Lx() {
        return this.bgK;
    }

    public byte eEp() {
        return this.mkv;
    }

    public long eEq() {
        return this.mkw;
    }
}

