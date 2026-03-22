/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cvX
extends nr_0 {
    private zd_2 mkH;
    private int mkI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mkI = byteBuffer.getInt();
        this.mkH = zd_2.kS(byteBuffer.get());
        return false;
    }

    public zd_2 eEy() {
        return this.mkH;
    }

    public int eEz() {
        return this.mkI;
    }

    @Override
    public int d() {
        return 13721;
    }
}

