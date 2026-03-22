/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crP
 */
public class crp_0
extends nr_0 {
    private long aDL;
    private int mgw;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDL = byteBuffer.getLong();
        this.mgw = byteBuffer.getInt();
        return true;
    }

    public long Ya() {
        return this.aDL;
    }

    public int eAn() {
        return this.mgw;
    }

    @Override
    public int d() {
        return 13460;
    }
}

