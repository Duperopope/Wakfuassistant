/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crm
extends cqQ {
    private int mfZ;
    byte[] hvy;
    private boolean mga;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mga = byteBuffer.get() == 1;
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        return true;
    }

    @Override
    public int d() {
        return 13970;
    }

    @Override
    public int avZ() {
        return this.mfZ;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsf;
    }

    public int ezG() {
        return this.mfZ;
    }

    public byte[] ezH() {
        return this.hvy;
    }

    public boolean ezI() {
        return this.mga;
    }
}

