/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuc
 */
public class cuc_0
extends cud_0 {
    private long mgH;
    private byte mgI;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgI = byteBuffer.get();
        this.mgH = byteBuffer.getLong();
        this.eU(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13625;
    }

    public byte caX() {
        return this.mgI;
    }

    public long caY() {
        return this.mgH;
    }
}

