/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crO
 */
public class cro_0
extends nr_0 {
    private short mgx;
    private short mgy;
    private short mgz;
    private short mgA;
    private short mgB;
    private short mgC;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgx = byteBuffer.getShort();
        this.mgy = byteBuffer.getShort();
        this.mgz = byteBuffer.getShort();
        this.mgA = byteBuffer.getShort();
        this.mgB = byteBuffer.getShort();
        this.mgC = byteBuffer.getShort();
        return true;
    }

    public short eAo() {
        return this.mgx;
    }

    public short eAp() {
        return this.mgy;
    }

    public short eAq() {
        return this.mgz;
    }

    public short eAr() {
        return this.mgA;
    }

    public short eAs() {
        return this.mgB;
    }

    public short eAt() {
        return this.mgC;
    }

    @Override
    public int d() {
        return 12578;
    }
}

