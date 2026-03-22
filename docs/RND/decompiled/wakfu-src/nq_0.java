/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nq
 */
public class nq_0
extends nr_0 {
    public static final byte aYn = 0;
    public static final byte aYo = 1;
    public static final byte aYp = 2;
    private byte aYq;
    private String aCL;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 3, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYq = byteBuffer.get();
        Short s = byteBuffer.getShort();
        byte[] byArray2 = new byte[s & 0xFFFF];
        byteBuffer.get(byArray2);
        this.aCL = BH.dc(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 304;
    }

    public byte aVY() {
        return this.aYq;
    }

    public String getMessage() {
        return this.aCL;
    }
}

