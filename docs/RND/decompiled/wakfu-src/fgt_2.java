/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fGt
 */
public interface fgt_2
extends fyi_0,
fyo_0,
fyv_0 {
    public boolean isJustify();

    public void setJustify(boolean var1);

    public void setHorizontalAlignment(fzY var1);

    public void setVerticalAlignment(fzY var1);

    default public boolean gxG() {
        return this.isBrightenColor();
    }

    public boolean isBrightenColor();

    public void setBrightenColor(boolean var1);

    default public boolean gxH() {
        return this.isDarkenColor();
    }

    public boolean isDarkenColor();

    public void setDarkenColor(boolean var1);

    public int getMinWidth();

    public void setMinWidth(int var1);

    public int getMaxWidth();

    public void setMaxWidth(int var1);

    public boolean isInheritParentWidth();

    public void setInheritParentWidth(boolean var1);

    public boolean isUseParentMaxWidth();

    public void setUseParentMaxWidth(boolean var1);

    public fzk_0 getMinSizeComputationBehaviour();

    public void setMinSizeComputationBehaviour(fzk_0 var1);

    default public boolean gxI() {
        return this.isMultiline();
    }

    public boolean isMultiline();

    public void setMultiline(boolean var1);

    public int getMaxLines();

    public void setMaxLines(int var1);

    public int getLineHeight();

    public void setLineHeight(int var1);

    public fzu_0 getOrientation();

    public void setOrientation(fzu_0 var1);

    public String getText();

    default public boolean gxJ() {
        return BH.bi(this.getText());
    }

    @Nullable
    default public String setText(@Nullable String string) {
        return this.setText((Object)string);
    }

    @Nullable
    public String setText(@Nullable Object var1);

    default public boolean getUseHighContrast() {
        return this.isUseHighContrast();
    }

    public boolean isUseHighContrast();

    public void setUseHighContrast(boolean var1);

    default public boolean gxK() {
        return this.isEnableShrinking();
    }

    public boolean isEnableShrinking();

    public void setEnableShrinking(boolean var1);

    public void setZoom(float var1);

    public void setDisplayCharDelay(long var1);

    default public boolean gxL() {
        return this.isEnableAutoZoomShrink();
    }

    public boolean isEnableAutoZoomShrink();

    public void setEnableAutoZoomShrink(boolean var1);
}

