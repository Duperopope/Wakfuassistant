/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJX
 */
public class fjx_2
extends fjw_1 {
    public static final String TAG = "widgetAppearanceStateContains";
    public static final String uFi = "stateContains";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.aGT == null) {
            return false;
        }
        String string = this.getStateRelated();
        return string != null && this.getValues().stream().anyMatch(string2 -> string.toLowerCase().contains(string2.toLowerCase()));
    }
}

