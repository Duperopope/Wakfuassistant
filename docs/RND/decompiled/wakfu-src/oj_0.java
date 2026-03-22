/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Oj
 */
public class oj_0
extends nr_0 {
    private boolean aZs;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZs = byteBuffer.get() == 1;
        return true;
    }

    public boolean aWV() {
        return this.aZs;
    }

    @Override
    public int d() {
        return 719;
    }
}

