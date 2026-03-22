/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crZ
extends csa
implements afy_2 {
    private long mgH;
    private byte mgI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgI = byteBuffer.get();
        this.mgH = byteBuffer.getLong();
        this.eU(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13811;
    }

    @Override
    public byte caX() {
        return this.mgI;
    }

    @Override
    public long caY() {
        return this.mgH;
    }
}

