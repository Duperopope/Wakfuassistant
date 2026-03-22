/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fol
 */
class fol_0
implements fnt_0 {
    private static final Logger sLd = Logger.getLogger(fol_0.class);
    private String p;

    fol_0() {
    }

    fol_0(String string) {
        this.p = string;
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
    public void a(fnm_0 fnm_02) {
        try {
            fnm_02.sR(this.p);
        }
        catch (foD foD2) {
            sLd.error((Object)"Impossible de changer le nom du familier", (Throwable)foD2);
        }
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKM;
    }

    public String toString() {
        return "PetNameChangeEvent{m_name='" + this.p + "'}";
    }
}

