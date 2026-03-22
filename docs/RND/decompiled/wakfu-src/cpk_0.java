/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpK
 */
public class cpk_0
extends nr_0 {
    private int mee;
    private int mef;
    private short bol;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mee = byteBuffer.get();
        this.mef = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
        return true;
    }

    @Override
    public int d() {
        return 12287;
    }

    public eka_0 exy() {
        return eka_0.values()[this.mee];
    }

    public int exz() {
        return this.mef;
    }

    public short bfd() {
        return this.bol;
    }
}

