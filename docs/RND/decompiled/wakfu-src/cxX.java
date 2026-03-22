/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxX
extends nr_0 {
    private boolean hWF = false;
    private long mmc;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.hWF = byteBuffer.get() != 0;
        this.mmc = byteBuffer.getLong();
        return false;
    }

    public boolean eFj() {
        return this.hWF;
    }

    public long eFc() {
        return this.mmc;
    }

    @Override
    public int d() {
        return 12139;
    }
}

