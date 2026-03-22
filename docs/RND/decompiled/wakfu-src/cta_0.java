/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctA
 */
public class cta_0
extends nr_0 {
    private long aDh;
    private byte mit;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mit = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13764;
    }

    public long KU() {
        return this.aDh;
    }

    public byte eCo() {
        return this.mit;
    }
}

