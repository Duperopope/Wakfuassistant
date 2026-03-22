/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvf
 */
public class cvf_0
extends nr_0 {
    private long jdD;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jdD = byteBuffer.getLong();
        return false;
    }

    public long eDN() {
        return this.jdD;
    }

    @Override
    public int d() {
        return 12230;
    }
}

