/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csX
 */
public class csx_0
extends nr_0 {
    private long mhM = -1L;
    private int mhN = -1;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhM = byteBuffer.getLong();
        this.mhN = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13997;
    }

    public long eBK() {
        return this.mhM;
    }

    public int eBL() {
        return this.mhN;
    }

    @Override
    public String toString() {
        return "MimiSymbicResultMessage{m_itemStatUid=" + this.mhM + ", m_itemSkinRefId=" + this.mhN + "}";
    }
}

