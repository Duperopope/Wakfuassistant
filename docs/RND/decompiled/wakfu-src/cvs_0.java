/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvs
 */
public class cvs_0
extends nr_0 {
    private byte[] ayE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ayE = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.ayE);
        return true;
    }

    @Override
    public int d() {
        return 13878;
    }

    public byte[] aKU() {
        return this.ayE;
    }
}

