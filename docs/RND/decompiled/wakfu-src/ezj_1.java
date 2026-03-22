/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZj
 */
class ezj_1
implements ezk_1 {
    private static final Logger rMc = Logger.getLogger(ezj_1.class);
    private String aNf;

    ezj_1() {
    }

    ezj_1(String string) {
        this.aNf = string;
    }

    @Override
    public byte[] apI() {
        byte[] byArray = BH.aP(this.aNf);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.aNf = BH.dc(byArray);
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.st(this.aNf);
        }
        catch (fae fae2) {
            rMc.error((Object)"Impossible de changer la description", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMp;
    }

    public String toString() {
        return "DescriptionChange{m_description='" + this.aNf + "'}";
    }
}

