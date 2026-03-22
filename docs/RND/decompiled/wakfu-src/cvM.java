/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvM
extends nr_0 {
    private int eiB;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eiB = byteBuffer.getInt();
        return true;
    }

    public int clS() {
        return this.eiB;
    }

    @Override
    public int d() {
        return 12761;
    }
}

