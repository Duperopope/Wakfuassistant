/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyO
 */
public final class cyo_0
extends nv_0 {
    private String aFD;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aFD);
        int n = 1 + byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public int d() {
        return 23928;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    @Override
    public String toString() {
        return "WhoisRequestMessage{m_characterName='" + this.aFD + "'}";
    }
}

