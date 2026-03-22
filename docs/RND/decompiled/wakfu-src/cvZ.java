/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cvZ
extends nr_0 {
    private long aDh;
    private String eNO;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.eNO = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 12061;
    }

    public long KU() {
        return this.aDh;
    }

    public String eEA() {
        return this.eNO;
    }
}

