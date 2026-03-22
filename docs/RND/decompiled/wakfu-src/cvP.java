/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvP
extends nr_0 {
    private int brR;
    private short bol;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.brR = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
        return true;
    }

    public int avr() {
        return this.brR;
    }

    public short bfd() {
        return this.bol;
    }

    @Override
    public int d() {
        return 12682;
    }
}

