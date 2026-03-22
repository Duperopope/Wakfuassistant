/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Np
 */
public class np_0
extends nv_0 {
    private String aYl;
    private byte aYm;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.aYl.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length + 2);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        return this.a(this.aYm, byteBuffer.array());
    }

    @Override
    public int d() {
        return 365;
    }

    public void cS(String string) {
        this.aYl = string;
    }

    public void C(byte by) {
        this.aYm = by;
    }
}

