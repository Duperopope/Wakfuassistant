/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyU
 */
public class cyu_0
extends nr_0 {
    private long mmP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmP = byteBuffer.getLong();
        return false;
    }

    public long eFN() {
        return this.mmP;
    }

    @Override
    public int d() {
        return 23923;
    }
}

