/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crr
extends cqQ {
    private short mgd;
    private byte[] mge;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.mgd = byteBuffer.getShort();
        if (byteBuffer.remaining() > 0) {
            this.mge = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.mge);
        }
        return true;
    }

    public byte[] ezQ() {
        return this.mge;
    }

    @Override
    public int d() {
        return 12383;
    }

    public short ezR() {
        return this.mgd;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rso;
    }
}

