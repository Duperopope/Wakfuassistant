/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fem
implements fec {
    public static final aza_2<fec> rZS = new fen();
    private long duS;
    private int eQp;
    private short bol;
    private long lZd;
    private byte lZc;

    public fem(long l, int n, short s, long l2, byte by) {
        this.duS = l;
        this.eQp = n;
        this.bol = s;
        this.lZd = l2;
        this.lZc = by;
    }

    fem() {
    }

    public long bSZ() {
        return this.duS;
    }

    public short bfd() {
        return this.bol;
    }

    public long eAP() {
        return this.lZd;
    }

    public byte eBg() {
        return this.lZc;
    }

    @Override
    public int DN() {
        return 23;
    }

    @Override
    public void fY(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.duS);
        byteBuffer.putInt(this.eQp);
        byteBuffer.putShort(this.bol);
        byteBuffer.putLong(this.lZd);
        byteBuffer.put(this.lZc);
    }

    @Override
    public void fZ(ByteBuffer byteBuffer) {
        this.duS = byteBuffer.getLong();
        this.eQp = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
        this.lZd = byteBuffer.getLong();
        this.lZc = byteBuffer.get();
    }

    public int acs() {
        return this.eQp;
    }

    @Override
    public fed fUt() {
        return fed.rZG;
    }

    public String toString() {
        return "InventoryRemoveItemAction{m_itemId=" + this.duS + ", m_refId=" + this.eQp + ", m_quantity=" + this.bol + ", m_destinationId=" + this.lZd + ", m_destinationPosition=" + this.lZc + "}";
    }
}

