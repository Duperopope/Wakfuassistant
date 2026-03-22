/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NY
 */
public class ny_1
extends nr_0 {
    private byte aYh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYh = byteBuffer.get();
        return true;
    }

    public byte aVT() {
        return this.aYh;
    }

    @Override
    public int d() {
        return 666;
    }
}

