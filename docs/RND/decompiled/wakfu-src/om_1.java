/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Om
 */
public class om_1
extends nr_0 {
    private short aZu;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZu = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 785;
    }

    public short aWX() {
        return this.aZu;
    }
}

