/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NX
 */
public class nx_0
extends nr_0 {
    private int aZi;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZi = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 728;
    }

    public int aWN() {
        return this.aZi;
    }
}

