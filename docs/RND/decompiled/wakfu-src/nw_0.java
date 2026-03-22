/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NW
 */
public class nw_0
extends nr_0 {
    private String aZg;
    private String aCL;
    private long aZh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZh = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.aZg = BH.dc(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.aCL = BH.dc(byArray3);
        return true;
    }

    @Override
    public int d() {
        return 615;
    }

    public String aWL() {
        return this.aZg;
    }

    public String getMessage() {
        return this.aCL;
    }

    public long aWM() {
        return this.aZh;
    }
}

