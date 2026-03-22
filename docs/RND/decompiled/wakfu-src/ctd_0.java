/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctD
 */
public class ctd_0
extends nr_0 {
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13959;
    }

    public long KU() {
        return this.aDh;
    }
}

