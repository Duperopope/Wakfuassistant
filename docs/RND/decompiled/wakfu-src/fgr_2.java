/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGr
 */
public interface fgr_2
extends fgt_2 {
    default public boolean gxz() {
        return this.isSelectable();
    }

    public boolean isSelectable();

    public void setSelectable(boolean var1);

    public boolean isSelectOnFocus();

    public void setSelectOnFocus(boolean var1);

    public boolean isEnableOnlySelectablePartInteraction();

    public void setEnableOnlySelectablePartInteraction(boolean var1);
}

