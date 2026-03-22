/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cpm
extends nr_0 {
    private int ehT;
    private boolean lEc;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ehT = byteBuffer.getInt();
        this.lEc = byteBuffer.get() == 0;
        return true;
    }

    @Override
    public int d() {
        return 12145;
    }

    public int clk() {
        return this.ehT;
    }

    public boolean exj() {
        return this.lEc;
    }
}

