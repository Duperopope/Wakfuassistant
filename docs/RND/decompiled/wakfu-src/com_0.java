/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coM
 */
public class com_0
extends nr_0 {
    private long aZQ;
    private abi_1 bmk;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZQ = byteBuffer.getLong();
        this.bmk = abi_1.wG(byteBuffer.get());
        return true;
    }

    @Override
    public int d() {
        return 12575;
    }

    public long aXb() {
        return this.aZQ;
    }

    public abi_1 bcB() {
        return this.bmk;
    }

    public int avZ() {
        return 0;
    }
}

