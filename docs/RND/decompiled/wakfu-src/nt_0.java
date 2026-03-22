/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nt
 */
public class nt_0
extends nr_0 {
    public static final byte aYu = 0;
    public static final byte aYv = 1;
    public static final byte aYw = 2;
    public static final byte aYx = 3;
    private byte aYq;
    private String aCL;
    private int aXS = 0xFFFFFF;
    private boolean aYy;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYq = byteBuffer.get();
        if (this.aYq == 3) {
            this.aXS = byteBuffer.getInt();
        }
        this.aCL = BH.eD(byteBuffer);
        this.aYy = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 348;
    }

    public byte aVY() {
        return this.aYq;
    }

    public String getMessage() {
        return this.aCL;
    }

    public int AM() {
        return this.aXS;
    }

    public boolean aWa() {
        return this.aYy;
    }
}

