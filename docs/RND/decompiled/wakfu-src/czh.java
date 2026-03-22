/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class czh
extends nr_0 {
    private short mmX;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmX = byteBuffer.getShort();
        return false;
    }

    public short eFY() {
        return this.mmX;
    }

    @Override
    public int d() {
        return 22720;
    }

    @Override
    public String toString() {
        return "FreeCompanionBreedIdMessage{m_freeCompanionBreedId=" + this.mmX + "}";
    }
}

