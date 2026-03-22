/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nz
 */
public class nz_0
extends nr_0 {
    private byte aYI;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 1, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYI = byteBuffer.get();
        return true;
    }

    public byte aWq() {
        return this.aYI;
    }

    @Override
    public int d() {
        return 303;
    }
}

