/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fee
implements fec {
    public static final aza_2<fec> rZN = new fef();
    private long duS;
    private int eQp;
    private short bol;
    private byte lZc;

    public fee(long l, int n, short s) {
        this.duS = l;
        this.eQp = n;
        this.bol = s;
        this.lZc = (byte)-1;
    }

    public fee(long l, int n, short s, byte by) {
        this.duS = l;
        this.eQp = n;
        this.bol = s;
        this.lZc = by;
    }

    fee() {
    }

    @Override
    public int DN() {
        return 15;
    }

    @Override
    public void fY(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.duS);
        byteBuffer.putInt(this.eQp);
        byteBuffer.putShort(this.bol);
        byteBuffer.put(this.lZc);
    }

    @Override
    public void fZ(ByteBuffer byteBuffer) {
        this.duS = byteBuffer.getLong();
        this.eQp = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
        this.lZc = byteBuffer.get();
    }

    @Override
    public fed fUt() {
        return fed.rZF;
    }

    public long bSZ() {
        return this.duS;
    }

    public int acs() {
        return this.eQp;
    }

    public short bfd() {
        return this.bol;
    }

    public byte eBg() {
        return this.lZc;
    }

    public String toString() {
        return "InventoryAddItemAction{m_itemId=" + this.duS + ", m_refId=" + this.eQp + ", m_quantity=" + this.bol + ", m_destinationPosition=" + this.lZc + "}";
    }
}

