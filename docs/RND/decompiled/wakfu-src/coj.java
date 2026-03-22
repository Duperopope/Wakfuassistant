/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coj
extends nr_0 {
    private int iIn;
    private int iIo;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iIn = byteBuffer.getInt();
        this.iIo = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13826;
    }

    public int aqT() {
        return this.iIn;
    }

    public int aqV() {
        return this.iIo;
    }
}

