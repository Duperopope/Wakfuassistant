/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coU
 */
public class cou_0
extends nr_0 {
    private long mcA;
    private int bap;
    private int baq;
    private short ban;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        this.bap = byteBuffer.getInt();
        this.baq = byteBuffer.getInt();
        this.ban = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 13792;
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
}

