/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from foh
 */
class foh_0
implements fnt_0 {
    private static final Logger sKZ = Logger.getLogger(foh_0.class);
    private int sLa;

    foh_0() {
    }

    foh_0(int n) {
        this.sLa = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.sLa);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sLa = byteBuffer.getInt();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        try {
            if (this.sLa != 0) {
                fnm_02.Xs(this.sLa);
            } else {
                fnm_02.geS();
            }
        }
        catch (foD foD2) {
            sKZ.error((Object)"Impossible de changer le dernier repas du familier", (Throwable)foD2);
        }
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKS;
    }

    public String toString() {
        return "PetEquipmentChange{m_equipmentRefItemId=" + this.sLa + "}";
    }
}

