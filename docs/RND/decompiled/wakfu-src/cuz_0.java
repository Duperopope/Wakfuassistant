/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cuZ
 */
public class cuz_0
implements fpa_0 {
    private static final Logger mjG = Logger.getLogger(cuz_0.class);
    public static final cuz_0 mjH = new cuz_0();

    @Override
    public void a(fpv fpv2, boolean bl, int n) {
        cuz_0.a(fpv2, bl);
    }

    private static void a(fpv fpv2, boolean bl) {
        Object object = fse_1.gFu().vY("battlegroundView");
        if (object == null) {
            mjG.error((Object)("Received a score set but no battleground is present on properties :" + String.valueOf(fpv2)));
            return;
        }
        bfi_0 bfi_02 = (bfi_0)object;
        bfe_0 bfe_02 = bl ? bfi_02.dfM() : bfi_02.dfL();
        fse_1.gFu().a((aef_2)bfe_02, "score");
    }
}

