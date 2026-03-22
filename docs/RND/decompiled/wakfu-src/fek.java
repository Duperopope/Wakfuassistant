/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fek
implements fec {
    public static final aza_2<fec> rZR = new fel();
    private long duS;
    private byte lZc;

    public fek(long l, byte by) {
        this.duS = l;
        this.lZc = by;
    }

    fek() {
    }

    @Override
    public int DN() {
        return 9;
    }

    @Override
    public void fY(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.duS);
        byteBuffer.put(this.lZc);
    }

    @Override
    public void fZ(ByteBuffer byteBuffer) {
        this.duS = byteBuffer.getLong();
        this.lZc = byteBuffer.get();
    }

    @Override
    public fed fUt() {
        return fed.rZH;
    }

    public long bSZ() {
        return this.duS;
    }

    public byte eBg() {
        return this.lZc;
    }

    public String toString() {
        return "InventoryMoveItemAction{m_itemId=" + this.duS + ", m_destinationPosition=" + this.lZc + "}";
    }
}

