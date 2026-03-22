/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ON
 */
public class on_0
extends nr_0 {
    private long aDh;
    private String aFF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aFF = BH.dc(byArray2);
        this.aDh = byteBuffer.getLong();
        return true;
    }

    public String HR() {
        return this.aFF;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 1144;
    }
}

