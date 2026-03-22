/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZF
 */
class ezf_2
implements ezk_1 {
    private static final Logger rMy = Logger.getLogger(ezf_2.class);
    private String aCL;

    ezf_2() {
    }

    ezf_2(String string) {
        this.aCL = string;
    }

    @Override
    public byte[] apI() {
        byte[] byArray = BH.aP(this.aCL);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.aCL = BH.dc(byArray);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.sv(this.aCL);
        }
        catch (fae fae2) {
            rMy.error((Object)"Impossible de changer le message", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMq;
    }

    public String toString() {
        return "MessageChange{m_message='" + this.aCL + "'}";
    }
}

