/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvF
extends nr_0 {
    private int asJ;
    private int mkp;
    private String hXB;
    private int hXC;

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
        return true;
    }

    @Override
    public int d() {
        return 13998;
    }

    public int aGD() {
        return this.asJ;
    }

    public int eEj() {
        return this.mkp;
    }

    public String div() {
        return this.hXB;
    }

    public int diw() {
        return this.hXC;
    }
}

