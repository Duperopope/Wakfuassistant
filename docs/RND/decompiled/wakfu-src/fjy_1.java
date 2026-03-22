/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJY
 */
public class fjy_1
extends fjw_1 {
    public static final String TAG = "widgetAppearanceStateEquals";
    public static final String uFj = "hasState";

    @Override
    public String getTag() {
        return TAG;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isValid(Object object) {
        if (this.aGT == null) {
            return false;
        }
        String string = this.getStateRelated();
        if (string == null) return false;
        if (!this.getValues().stream().anyMatch(string::equalsIgnoreCase)) return false;
        return true;
    }
}

