/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqs
 */
public class cqs_0
extends nr_0 {
    private byte aYh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYh = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13693;
    }

    public byte aVT() {
        return this.aYh;
    }
}

