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
 * Renamed from blI
 */
public abstract class bli_1
implements aeh_2 {
    private static final Logger ivD = Logger.getLogger(bli_1.class);
    public static final String ivE = "name";
    public static final String ivF = "smallIconUrl";
    public static final String ivG = "circleIconUrl";
    public static final String ivH = "characterSheetSmallIllustrationUrl";
    public static final String ivI = "breedId";
    public static final String ivJ = "dragEnabled";
    public static final String ivK = "isPlayer";
    public static final String ivL = "id";
    protected String p;
    protected final int ivM;
    protected boolean ivN = true;

    protected bli_1(fjm fjm2) {
        this.p = fjm2.getName();
        this.ivM = fjm2.aWP();
    }

    protected bli_1(String string, int n) {
        this.p = string;
        this.ivM = n;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ivE)) {
            return this.getName();
        }
        if (string.equals(ivI)) {
            return this.ivM;
        }
        if (string.equals(ivJ)) {
            return this.ivN;
        }
        if (string.equals(ivF) || string.equals(ivH)) {
            try {
                return String.format(auc_0.cVq().bS("companionIconsPath"), this.ivM);
            }
            catch (fu_0 fu_02) {
                ivD.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)fu_02);
            }
        }
        if (string.equals(ivG)) {
            try {
                return String.format(auc_0.cVq().bS("companionCircleIllustrationPath"), this.ivM);
            }
            catch (fu_0 fu_03) {
                ivD.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)fu_03);
            }
        }
        if (string.equals(ivK)) {
            return this.dtZ();
        }
        if (string.equals(ivL)) {
            return this.Sn();
        }
        return null;
    }

    public abstract long Sn();

    public String getName() {
        if (this.p != null && !this.p.isEmpty()) {
            return this.p;
        }
        bjz_1 bjz_12 = bja_1.drJ().bC((short)this.ivM);
        return bjz_12.getName();
    }

    public int xT() {
        return this.ivM;
    }

    public boolean dtZ() {
        return false;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void setDragEnabled(boolean bl) {
        this.ivN = bl;
        fse_1.gFu().a((aef_2)this, ivJ);
    }

    public abstract bli_1 dtG();
}

