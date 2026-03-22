/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eZi
 */
public class ezi_2
implements ezk_1 {
    private long ioh;

    ezi_2() {
    }

    ezi_2(long l) {
        this.ioh = l;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.ioh);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.ioh = byteBuffer.getLong();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        eyy_22.kH(this.ioh);
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMs;
    }

    public String toString() {
        return "BlazonChange{m_blazon=" + this.ioh + "}";
    }
}

