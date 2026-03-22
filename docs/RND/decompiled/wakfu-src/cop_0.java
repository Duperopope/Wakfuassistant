/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cop
 */
public class cop_0
extends nr_0 {
    private long aDh;
    private boolean mcR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mcR = byteBuffer.get() == 1;
        return false;
    }

    @Override
    public int d() {
        return 12991;
    }

    public long KU() {
        return this.aDh;
    }

    public boolean doP() {
        return this.mcR;
    }
}

