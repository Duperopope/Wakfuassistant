/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cyq
extends nr_0 {
    private long aHT;
    private byte[] mcK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aHT = byteBuffer.getLong();
        this.mcK = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mcK);
        return false;
    }

    public long aqZ() {
        return this.aHT;
    }

    public byte[] evX() {
        return this.mcK;
    }

    @Override
    public int d() {
        return 14876;
    }
}

