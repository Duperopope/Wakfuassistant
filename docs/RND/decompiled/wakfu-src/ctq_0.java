/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctQ
 */
public class ctq_0
extends nr_0 {
    private int epQ;
    private long miH;

    public int Xt() {
        return this.epQ;
    }

    public long eCE() {
        return this.miH;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epQ = byteBuffer.getInt();
        this.miH = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12983;
    }
}

