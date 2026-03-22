/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctE
 */
public class cte_0
extends nr_0 {
    private long aDh;
    private byte[] miv;

    public void db(long l) {
        this.aDh = l;
    }

    public void em(byte[] byArray) {
        this.miv = byArray;
    }

    public long KU() {
        return this.aDh;
    }

    public byte[] eCr() {
        return this.miv;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.miv = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.miv);
        return true;
    }

    @Override
    public int d() {
        return 15689;
    }
}

