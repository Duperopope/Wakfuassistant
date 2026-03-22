/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cpl
extends nr_0 {
    private int epK;
    private boolean lEc;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.epK = byteBuffer.getInt();
        this.lEc = byteBuffer.get() == 0;
        return true;
    }

    @Override
    public int d() {
        return 13045;
    }

    public int ctn() {
        return this.epK;
    }

    public boolean exj() {
        return this.lEc;
    }
}

