/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crR
 */
public class crr_0
extends nr_0 {
    private byte bIj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bIj = byteBuffer.get();
        return true;
    }

    public byte bks() {
        return this.bIj;
    }

    @Override
    public int d() {
        return 12396;
    }
}

