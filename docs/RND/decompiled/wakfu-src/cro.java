/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cro
extends cqQ {
    private int mfZ;
    byte[] hvy;
    long bhR;
    long hvA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        this.bhR = byteBuffer.getLong();
        this.hvA = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12107;
    }

    @Override
    public int avZ() {
        return this.mfZ;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsv;
    }

    public int ezG() {
        return this.mfZ;
    }

    public byte[] ezH() {
        return this.hvy;
    }

    public long Qy() {
        return this.bhR;
    }

    public long ezJ() {
        return this.hvA;
    }
}

