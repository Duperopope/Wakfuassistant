/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;
import java.nio.ByteBuffer;

/*
 * Renamed from cyH
 */
public class cyh_0
extends nv_0 {
    private long aDh;
    private String aFD;
    private long mmG;
    private String mmH;

    @Override
    public byte[] aVX() {
        byte[] byArray = BH.aP(this.aFD);
        byte[] byArray2 = BH.aP(Strings.nullToEmpty((String)this.mmH));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + byArray.length + 8 + 2 + byArray2.length);
        byteBuffer.putLong(this.aDh);
        byteBuffer.putShort((short)(byArray.length & 0xFF));
        byteBuffer.put(byArray);
        byteBuffer.putLong(this.mmG);
        byteBuffer.putShort((short)(byArray2.length & 0xFF));
        byteBuffer.put(byArray2);
        return this.a((byte)2, byteBuffer.array());
    }

    @Override
    public int d() {
        return 23792;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public void oD(String string) {
        this.mmH = string;
    }

    public void nK(long l) {
        this.mmG = l;
    }
}

