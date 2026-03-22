/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cvo
extends nr_0 {
    private int bap;
    private int baq;
    private short ban;
    private short ksh;
    private long krh;
    private int kri;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.ban = byteBuffer.getShort();
        this.ksh = byteBuffer.getShort();
        this.krh = byteBuffer.getLong();
        this.kri = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13607;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public short bdi() {
        return this.ban;
    }

    public short ecx() {
        return this.ksh;
    }

    public long awI() {
        return this.krh;
    }

    public int awK() {
        return this.kri;
    }
}

