/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fGs
 */
public interface fgs_2
extends fgr_2 {
    default public boolean gxA() {
        return this.isAutoHorizontalScrolled();
    }

    public boolean isAutoHorizontalScrolled();

    default public void m(@NotNull Boolean bl) {
        this.setAutoHorizontalScrolled(bl);
    }

    public void setAutoHorizontalScrolled(boolean var1);

    public int getMaxCharacters();

    public void setMaxCharacters(int var1);

    @Deprecated
    default public int gxB() {
        return this.getMaxCharacters();
    }

    @Deprecated
    default public void abk(int n) {
        this.setMaxCharacters(n);
    }

    default public boolean gxC() {
        return this.isPassword();
    }

    public boolean isPassword();

    public void setPassword(boolean var1);

    public String getRestrict();

    public void setRestrict(String var1);

    default public boolean gxD() {
        return this.isEditable();
    }

    public boolean isEditable();

    public void setEditable(boolean var1);

    public String getGhostText();

    default public boolean gxE() {
        return BH.bi(this.getGhostText());
    }

    default public void tX(@Nullable String string) {
        this.setGhostText(string);
    }

    public void setGhostText(@Nullable Object var1);

    default public boolean gxF() {
        return this.isUnicodeRestrict();
    }

    public boolean isUnicodeRestrict();

    public void setUnicodeRestrict(boolean var1);

    public boolean isDisplayGhostTextOnFocusLost();

    public void setDisplayGhostTextOnFocusLost(boolean var1);

    public boolean isReplaceNullByGhostText();

    public void setReplaceNullByGhostText(boolean var1);

    public ffb_2<String, ?> getListFilter();

    public void setListFilter(ffb_2<String, ?> var1);

    public void tO(String var1);
}

