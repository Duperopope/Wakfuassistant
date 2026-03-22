/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class bwq
implements aeh_2 {
    public static final String jxT = "tabIconStyle";
    public static final String jxU = "tabIconModulationColor";
    public static final String jxV = "tabIconPopupText";
    public static final String jxW = "shortcutText";
    public static final String[] jxX = new String[]{"tabIconStyle", "tabIconModulationColor", "tabIconPopupText", "shortcutText"};
    private boolean jxY;
    private boolean jxZ;

    protected abstract int deP();

    protected abstract String dbi();

    private boolean dLP() {
        return cvu_2.eTO().FW(this.deP());
    }

    private boolean dLQ() {
        return cvu_2.eTO().FV(this.deP());
    }

    public void dLR() {
        this.jxY = this.dLP();
        this.jxZ = this.dLQ();
        fse_1.gFu().a((aef_2)this, jxX);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "tabIconStyle": {
                if (!this.jxY) {
                    return "warningIcon";
                }
                if (this.jxZ) {
                    return "editIcon";
                }
                return null;
            }
            case "tabIconModulationColor": {
                if (!this.jxY) {
                    return ett_1.opG.getName();
                }
                return awx_2.dnF;
            }
            case "tabIconPopupText": {
                if (!this.jxY) {
                    return aum_0.cWf().c("build.invalid.sheet.popup", new Object[0]);
                }
                if (this.jxZ) {
                    return aum_0.cWf().c("build.unsaved.changes.popup", new Object[0]);
                }
                return null;
            }
            case "shortcutText": {
                return aUl.kf(this.dbi());
            }
        }
        return null;
    }
}

