/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Ot
 */
public class ot_0
extends nv_0 {
    public boolean aZy = true;
    private byte aZz;
    private boolean aZH;
    private String aZI;
    private String aZF;
    private long aZJ = -1L;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aZI);
        byte[] byArray2 = BH.aP(this.aZF);
        int n = 3 + byArray.length + 1 + byArray2.length + 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put(this.aZz);
        byteBuffer.put((byte)(this.aZH ? 1 : 0));
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        byteBuffer.putLong(this.aZJ);
        if (this.aZy) {
            return this.a((byte)6, byteBuffer.array());
        }
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public final int d() {
        return 1028;
    }

    public void F(byte by) {
        this.aZz = by;
    }

    public void aP(boolean bl) {
        this.aZH = bl;
    }

    public void cY(String string) {
        this.aZI = string;
    }

    public void dc(long l) {
        this.aZJ = l;
    }

    public void cZ(String string) {
        this.aZF = string;
    }

    public void aO(boolean bl) {
        this.aZy = bl;
    }
}

