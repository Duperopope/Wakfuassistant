/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvB
extends nr_0 {
    private byte ckE;
    private int mkm;
    private int mkn;
    private uw_0 mko;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.ckE = byteBuffer.get();
        this.mkm = byteBuffer.getInt();
        this.mkn = byteBuffer.getInt();
        this.mko = uw_0.fn(byteBuffer.getLong());
        return true;
    }

    @Override
    public int d() {
        return 13009;
    }

    public byte bvd() {
        return this.ckE;
    }

    public int eEf() {
        return this.mkm;
    }

    public int eEg() {
        return this.mkn;
    }

    public uw_0 eEh() {
        return this.mko;
    }
}

