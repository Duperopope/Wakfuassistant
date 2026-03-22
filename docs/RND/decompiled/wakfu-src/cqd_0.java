/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqd
 */
public class cqd_0
extends nr_0 {
    private long lXG;
    private long aZj;
    private boolean bmw;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        this.bmw = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13407;
    }

    public long exN() {
        return this.lXG;
    }

    public long fD() {
        return this.aZj;
    }

    public boolean aLB() {
        return this.bmw;
    }
}

