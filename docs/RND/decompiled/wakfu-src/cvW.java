/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvW
extends nr_0 {
    private frs mkG;
    private long cwe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkG = frs.hB(byteBuffer.get());
        this.cwe = byteBuffer.getLong();
        return false;
    }

    public frs eEx() {
        return this.mkG;
    }

    public long Tz() {
        return this.cwe;
    }

    @Override
    public int d() {
        return 13240;
    }
}

