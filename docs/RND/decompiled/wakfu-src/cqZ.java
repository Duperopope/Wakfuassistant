/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqZ
extends cqQ {
    private long btF;
    private byte hsr;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 21, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.hsr = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 13438;
    }

    public long OO() {
        return this.btF;
    }

    public byte ezq() {
        return this.hsr;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsh;
    }
}

