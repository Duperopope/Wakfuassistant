/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ol
 */
public class ol_1
extends nr_0 {
    private byte aZt;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZt = byteBuffer.get();
        return true;
    }

    public byte aWW() {
        return this.aZt;
    }

    @Override
    public int d() {
        return 686;
    }
}

