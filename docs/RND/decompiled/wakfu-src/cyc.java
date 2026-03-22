/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyc
extends nr_0 {
    private long mmm;
    private long aDL;
    private long ijd;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmm = byteBuffer.getLong();
        this.aDL = byteBuffer.getLong();
        this.ijd = byteBuffer.getLong();
        return true;
    }

    public long HP() {
        return this.ijd;
    }

    public long Ya() {
        return this.aDL;
    }

    public long EW() {
        return this.mmm;
    }

    @Override
    public int d() {
        return 15269;
    }
}

