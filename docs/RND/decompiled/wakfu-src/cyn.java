/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyn
extends nr_0 {
    private int ejM;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ejM = byteBuffer.getInt();
        return true;
    }

    public int oP() {
        return this.ejM;
    }

    @Override
    public int d() {
        return 15387;
    }
}

