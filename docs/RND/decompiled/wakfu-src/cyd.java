/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cyd
extends nr_0 {
    private String aFF;
    private long aDL;
    private long mmn;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aFF = BH.dc(byArray2);
        this.aDL = byteBuffer.getLong();
        this.mmn = byteBuffer.getLong();
        return false;
    }

    @Override
    public int d() {
        return 1027;
    }

    public String HR() {
        return this.aFF;
    }

    public long Ya() {
        return this.aDL;
    }

    public long eFm() {
        return this.mmn;
    }
}

