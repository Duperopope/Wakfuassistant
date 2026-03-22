/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwc
 */
public class cwc_0
extends nr_0 {
    private byte[] mkL;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.mkL = new byte[n];
            byteBuffer.get(this.mkL);
        }
        return true;
    }

    public byte[] eEF() {
        return this.mkL;
    }

    @Override
    public int d() {
        return 13783;
    }
}

