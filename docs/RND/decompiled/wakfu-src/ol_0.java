/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from OL
 */
public class ol_0
extends nr_0 {
    private String aFF;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.aFF = BH.dc(byArray2);
        return true;
    }

    public String HR() {
        return this.aFF;
    }

    @Override
    public int d() {
        return 1073;
    }
}

