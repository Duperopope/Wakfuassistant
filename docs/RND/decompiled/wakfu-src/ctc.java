/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class ctc
extends nr_0 {
    private fpP mhP;
    private int brR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhP = fpP.hm(byteBuffer.get());
        this.brR = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13915;
    }

    public int avr() {
        return this.brR;
    }

    public fpP eBN() {
        return this.mhP;
    }
}

