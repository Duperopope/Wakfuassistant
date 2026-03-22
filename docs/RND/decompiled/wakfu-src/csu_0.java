/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csU
 */
public class csu_0
extends nr_0 {
    private long aDh;
    private byte lWf;
    private fhk jzA;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.lWf = byteBuffer.get();
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.jzA = fhj.eN(byArray2);
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public byte eBH() {
        return this.lWf;
    }

    public fhk dmL() {
        return this.jzA;
    }

    @Override
    public int d() {
        return 12733;
    }
}

