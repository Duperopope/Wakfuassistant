/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxY
 */
public class cxy_0
extends nr_0 {
    private int bIl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bIl = byteBuffer.getInt();
        return false;
    }

    @Override
    public int d() {
        return 14309;
    }

    public int bku() {
        return this.bIl;
    }
}

