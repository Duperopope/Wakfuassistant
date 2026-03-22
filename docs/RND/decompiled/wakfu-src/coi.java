/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class coi
extends nr_0 {
    private fro mcF;
    private long mcG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcF = fro.ZC(byteBuffer.get());
        this.mcG = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12114;
    }

    public fro evS() {
        return this.mcF;
    }

    public long evT() {
        return this.mcG;
    }
}

