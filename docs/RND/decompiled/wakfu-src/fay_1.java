/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAY
 */
public abstract class fay_1<Content>
extends faw_2 {
    public static final int tRq = "content".hashCode();

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tRq) {
            return this.setContentProperty(object);
        }
        return super.setPropertyAttribute(n, object);
    }

    public boolean setContentProperty(@Nullable Object object) {
        return fhi_2.setIterableProperty(object, this::setContent, this::setContent);
    }

    public void setContent(@Nullable Content[] ContentArray) {
        this.setContent(ContentArray != null ? Arrays.asList(ContentArray) : Collections.emptyList());
    }

    public void setContent(@NotNull Iterable<Content> iterable) {
        this.setContent(iterable, false);
    }

    public abstract void setContent(@NotNull Iterable<Content> var1, boolean var2);

    public abstract Iterable<Content> getUnfilteredContent();
}

