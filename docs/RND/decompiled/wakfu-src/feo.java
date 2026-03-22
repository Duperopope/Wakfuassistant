/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class feo
implements fec {
    public static final aza_2<fec> rZT = new fep();
    private long iJl;

    public feo(long l) {
        this.iJl = l;
    }

    feo() {
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
        return fed.rZJ;
    }

    public String toString() {
        return "InventoryRemoveMoneyAction{m_kamas=" + this.iJl + "}";
    }
}

