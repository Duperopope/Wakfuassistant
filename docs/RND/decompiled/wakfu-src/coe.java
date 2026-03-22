/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class coe
extends nr_0 {
    private long mcA;
    private int bap;
    private int baq;
    private short ban;
    private byte bay;
    private aea_0 lVj;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 23) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.ban = byteBuffer.getShort();
        this.bay = byteBuffer.get();
        this.lVj = aea_0.rZ(byteBuffer.getInt());
        return true;
    }

    @Override
    public int d() {
        return 12461;
    }

    public long evP() {
        return this.mcA;
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

    public byte coI() {
        return this.bay;
    }

    public aea_0 bwe() {
        return this.lVj;
    }
}

