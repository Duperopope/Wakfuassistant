/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crn
extends cqQ {
    private int mfZ;
    private byte[] hvy;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        return true;
    }

    @Override
    public int d() {
        return 12138;
    }

    @Override
    public int avZ() {
        return this.mfZ;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsu;
    }

    public int ezG() {
        return this.mfZ;
    }

    public byte[] ezH() {
        return this.hvy;
    }
}

