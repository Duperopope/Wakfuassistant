/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwb
 */
public class cwb_0
extends nr_0 {
    private long aDh;
    private int ehO;
    private int mkJ;
    private boolean mkK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.ehO = byteBuffer.getInt();
        this.mkJ = byteBuffer.getInt();
        this.mkK = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13427;
    }

    public long KU() {
        return this.aDh;
    }

    public int clf() {
        return this.ehO;
    }

    public int eED() {
        return this.mkJ;
    }

    public boolean eEE() {
        return this.mkK;
    }
}

