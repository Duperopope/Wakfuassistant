/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctN
 */
public class ctn_0
extends nr_0 {
    private fkL lfY;

    public fkL emF() {
        return this.lfY;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lfY = fkL.ue(byteBuffer.getLong());
        return true;
    }

    @Override
    public int d() {
        return 13049;
    }
}

