/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqT
extends cqQ {
    private long mfG;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mfG = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13432;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rss;
    }

    public long ezh() {
        return this.mfG;
    }
}

