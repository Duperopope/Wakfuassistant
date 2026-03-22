/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crs
extends nr_0 {
    private int eiB;
    private ewx_1 hDE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eiB = byteBuffer.getInt();
        this.hDE = ewx_1.fN(byteBuffer.get());
        return true;
    }

    public int clS() {
        return this.eiB;
    }

    public ewx_1 ezS() {
        return this.hDE;
    }

    @Override
    public int d() {
        return 12041;
    }
}

