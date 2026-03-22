/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuV
 */
public class cuv_0
extends nr_0 {
    private long cJM;
    private byte[] mjB;
    private byte[] mjC;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.cJM = byteBuffer.getLong();
        this.mjB = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mjB);
        this.mjC = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mjC);
        return true;
    }

    @Override
    public int d() {
        return 13078;
    }

    public long bDG() {
        return this.cJM;
    }

    public byte[] eDA() {
        return this.mjB;
    }

    public byte[] eDB() {
        return this.mjC;
    }
}

