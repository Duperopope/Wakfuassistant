/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cst
extends Nr {
    private int brR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.brR = byteBuffer.getInt();
        return true;
    }

    public int avr() {
        return this.brR;
    }

    @Override
    public int d() {
        return 13608;
    }
}
