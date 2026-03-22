/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Of
 */
public class of_0
extends nn_0 {
    private String aZo;
    private long aZp;

    public String aWR() {
        return this.aZo;
    }

    public long aWS() {
        return this.aZp;
    }

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aZo = BH.dc(byArray2);
        this.aZp = byteBuffer.getLong();
        return this.b(byArray, byteBuffer.position());
    }

    @Override
    public int d() {
        return 705;
    }
}

