/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cnv
 */
public class cnv_0
extends nv_0 {
    private long duS;
    private String lVB;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.lVB);
        ByteBuffer byteBuffer = ByteBuffer.allocate(8 + byArray.length);
        byteBuffer.putLong(this.duS);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13444;
    }

    public void nb(long l) {
        this.duS = l;
    }

    public void ou(String string) {
        this.lVB = string;
    }
}

