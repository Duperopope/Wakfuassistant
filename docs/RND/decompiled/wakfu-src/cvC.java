/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvC
extends nr_0 {
    private int asJ;
    private int mkp;
    private String hXB;
    private int hXC;
    private short hXA;
    private int mkq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.asJ = byteBuffer.getInt();
        this.mkp = byteBuffer.getInt();
        byte by = byteBuffer.get();
        if (by > 0) {
            byte[] byArray2 = new byte[by];
            byteBuffer.get(byArray2);
            this.hXB = BH.dc(byArray2);
        }
        this.hXC = byteBuffer.getInt();
        this.hXA = byteBuffer.getShort();
        this.mkq = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12078;
    }

    public int aGD() {
        return this.asJ;
    }

    public String div() {
        return this.hXB;
    }

    public short coS() {
        return this.hXA;
    }

    public int eEi() {
        return this.mkq;
    }

    public int diw() {
        return this.hXC;
    }

    public int eEj() {
        return this.mkp;
    }
}

