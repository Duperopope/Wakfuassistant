/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crh
extends cqQ {
    private long mfX;
    private long mfY;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 28, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mfX = byteBuffer.getLong();
        this.mfY = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12160;
    }

    public long ezC() {
        return this.mfX;
    }

    public long ezD() {
        return this.mfY;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsg;
    }
}

