/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyi
extends nr_0 {
    private long mmr;
    private kg_0 mms;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mmr = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.mms = kg_0.bw(byArray2);
        return true;
    }

    public long efY() {
        return this.mmr;
    }

    public kg_0 abp() {
        return this.mms;
    }

    @Override
    public int d() {
        return 15608;
    }
}

