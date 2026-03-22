/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coK
 */
public class cok_0
extends nr_0 {
    private int Nf;
    private long aZQ;
    private boolean mdl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.Nf = byteBuffer.getInt();
        this.aZQ = byteBuffer.getLong();
        this.mdl = byteBuffer.get() != 0;
        return true;
    }

    @Override
    public int d() {
        return 12872;
    }

    public int apw() {
        return this.Nf;
    }

    public long aXb() {
        return this.aZQ;
    }

    public boolean ewA() {
        return this.mdl;
    }
}

