/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class feg
implements fec {
    public static final aza_2<fec> rZO = new feh();
    private long iJl;

    public feg(long l) {
        this.iJl = l;
    }

    feg() {
    }

    public long dzt() {
        return this.iJl;
    }

    @Override
    public int DN() {
        return 8;
    }

    @Override
    public void fY(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.iJl);
    }

    @Override
    public void fZ(ByteBuffer byteBuffer) {
        this.iJl = byteBuffer.getLong();
    }

    @Override
    public fed fUt() {
        return fed.rZI;
    }

    public String toString() {
        return "InventoryAddMoneyAction{m_kamas=" + this.iJl + "}";
    }
}

