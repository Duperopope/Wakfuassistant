/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NC
 */
public class nc_1
extends nv_0 {
    private String aYL;
    private String aYM;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aYL);
        byte[] byArray2 = BH.aP(this.aYM);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + byArray.length + 1 + byArray2.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)byArray2.length);
        byteBuffer.put(byArray2);
        return this.a((byte)4, byteBuffer.array());
    }

    @Override
    public int d() {
        return 637;
    }

    public void cU(String string) {
        this.aYL = string;
    }

    public void cV(String string) {
        this.aYM = string;
    }
}

