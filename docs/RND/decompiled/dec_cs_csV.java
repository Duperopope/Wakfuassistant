/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csV
extends Nr {
    private byte hOe;
    private long aDh;
    private byte lWh;
    private byte[] mhK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.hOe = byteBuffer.get();
        this.aDh = byteBuffer.getLong();
        this.lWh = byteBuffer.get();
        this.mhK = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.mhK);
        return true;
    }

    @Override
    public int d() {
        return 12808;
    }

    public byte deO() {
        return this.hOe;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] eBI() {
        return this.mhK;
    }

    public byte evu() {
        return this.lWh;
    }
}
