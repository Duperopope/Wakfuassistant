/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fkr
 */
public class fkr_0 {
    private static final Logger sBK = Logger.getLogger(fkr_0.class);
    private final fjo_0 sBL;

    public fkr_0(fjo_0 fjo_02) {
        this.sBL = fjo_02;
    }

    public final byte[] b(fkp_0 fkp_02) {
        int n = 1;
        for (fkq_0 fkq_02 : fkp_02.gch()) {
            fkl_0 object = this.sBL.a(fkq_02);
            if (object != null) {
                n += object.DN();
                continue;
            }
            sBK.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la NationPart correspondant \u00e0 " + String.valueOf((Object)fkq_02) + " de la forme " + String.valueOf((Object)fkp_02)));
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)fkp_02.ordinal());
        for (fkq_0 fkq_02 : fkp_02.gch()) {
            fkl_0 fkl_02 = this.sBL.a(fkq_02);
            if (fkl_02 != null) {
                fkl_02.as(byteBuffer);
                continue;
            }
            sBK.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la NationPart correspondant \u00e0 " + String.valueOf(fkl_02) + " de la forme " + String.valueOf((Object)fkp_02)));
        }
        return byteBuffer.array();
    }

    public final void k(byte[] byArray, int n) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.get() & 0xFF;
        if (n2 < 0 || n2 >= fkp_0.values().length) {
            sBK.error((Object)("Num\u00e9ro de part invalide : " + n2));
            return;
        }
        fkp_0 fkp_02 = fkp_0.values()[n2];
        for (fkq_0 fkq_02 : fkp_02.gch()) {
            fkl_0 fkl_02 = this.sBL.a(fkq_02);
            if (fkl_02 != null) {
                fkl_02.g(byteBuffer, n);
                fkl_02.gcg();
                continue;
            }
            sBK.error((Object)("Impossible de trouver la NationPart correspondant \u00e0 " + String.valueOf((Object)fkq_02)));
        }
    }

    public byte[] a(fkl_0 fkl_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(fkl_02.DN());
        fkl_02.as(byteBuffer);
        return byteBuffer.array();
    }

    public void a(fkl_0 fkl_02, byte[] byArray, int n) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        fkl_02.g(byteBuffer, n);
        fkl_02.gcg();
    }
}

