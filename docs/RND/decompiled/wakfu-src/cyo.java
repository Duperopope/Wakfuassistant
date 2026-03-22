/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyo
extends nr_0 {
    private int mmw;
    private long eNm;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmw = byteBuffer.getInt();
        this.eNm = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 14167;
    }

    public int eFv() {
        return this.mmw;
    }

    public long eFw() {
        return this.eNm;
    }
}

