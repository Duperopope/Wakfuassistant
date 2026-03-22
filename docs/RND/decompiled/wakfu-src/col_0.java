/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from col
 */
public class col_0
extends nr_0 {
    private long aDh;
    private int epe;
    private int htM;

    public int getValue() {
        return this.epe;
    }

    public int evY() {
        return this.htM;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.epe = byteBuffer.getInt();
        this.htM = byteBuffer.getInt();
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13251;
    }
}

