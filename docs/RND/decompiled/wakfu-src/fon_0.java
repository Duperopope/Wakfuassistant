/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fon
 */
class fon_0
implements fnt_0 {
    private static final Logger sLg = Logger.getLogger(fon_0.class);
    private int sKG;

    fon_0() {
    }

    fon_0(int n) {
        this.sKG = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.sKG);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sKG = byteBuffer.getInt();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        try {
            if (this.sKG > 0) {
                fnm_02.Xw(this.sKG);
            } else {
                fnm_02.geU();
            }
        }
        catch (foD foD2) {
            sLg.error((Object)"Impossible de changer l'objet de sommeil du familier", (Throwable)foD2);
        }
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKU;
    }

    public String toString() {
        return "PetSleepRefItemIdChange{m_sleepRefItemId=" + this.sKG + "}";
    }
}

