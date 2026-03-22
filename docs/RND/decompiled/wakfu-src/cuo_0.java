/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuo
 */
public class cuo_0
extends nr_0 {
    private byte lUJ;
    private long mbm;

    public byte evk() {
        return this.lUJ;
    }

    public long eDe() {
        return this.mbm;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lUJ = byteBuffer.get();
        this.mbm = byteBuffer.getLong();
        if (this.lUJ == 0) {
            byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
            byteBuffer.get(byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 12028;
    }
}

