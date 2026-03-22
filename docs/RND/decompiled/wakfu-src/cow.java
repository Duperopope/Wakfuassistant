/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cow
extends nr_0 {
    private int mcX;
    private int mcY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcX = byteBuffer.getInt();
        this.mcY = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12614;
    }

    public int ewm() {
        return this.mcX;
    }

    public int ewn() {
        return this.mcY;
    }
}

