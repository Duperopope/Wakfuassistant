/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blH
 */
public class blh_1
extends bli_1 {
    private static final Logger ivA = Logger.getLogger(blh_1.class);
    private final byte ivB;
    private final long ivC;

    public blh_1(fjm fjm2) {
        super(fjm2);
        this.ivC = fjm2.Sn();
        this.ivB = fjm2.aWO();
    }

    public blh_1(long l, String string, int n, byte by) {
        super(string, n);
        this.ivC = l;
        this.ivB = by;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals("smallIconUrl") || string.equals("characterSheetSmallIllustrationUrl")) {
            try {
                return String.format(auc_0.cVq().bS("breedPortraitIllustrationPath"), String.valueOf(this.ivM) + String.valueOf(this.ivB));
            }
            catch (fu_0 fu_02) {
                ivA.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)fu_02);
            }
        }
        return super.eu(string);
    }

    @Override
    public boolean dtZ() {
        return true;
    }

    @Override
    public long Sn() {
        return this.ivC;
    }

    @Override
    public bli_1 dtG() {
        blh_1 blh_12 = new blh_1(this.Sn(), this.getName(), this.xT(), this.ivB);
        return blh_12;
    }
}

