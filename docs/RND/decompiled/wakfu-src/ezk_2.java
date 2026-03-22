/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eZK
 */
final class ezk_2
implements ezk_1 {
    private String p;

    ezk_2(String string) {
        this.p = string;
    }

    ezk_2() {
    }

    @Override
    public byte[] apI() {
        byte[] byArray = BH.aP(this.p);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.p = BH.dc(byArray);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        eyy_22.su(this.p);
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMr;
    }

    public String toString() {
        return "NameChange{m_name='" + this.p + "'}";
    }
}

