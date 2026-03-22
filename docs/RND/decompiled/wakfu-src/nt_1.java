/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NT
 */
public class nt_1
extends nr_0 {
    private boolean aZe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZe = byteBuffer.get() != 0;
        return true;
    }

    public boolean aWH() {
        return this.aZe;
    }

    @Override
    public int d() {
        return 648;
    }
}

