/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
import com.google.common.base.Predicate;
import javax.annotation.Nullable;

/*
 * Renamed from bcp
 */
public class bcp_2
implements Predicate<Integer> {
    public boolean s(@Nullable Integer n) {
        return n != null && aue_0.cVJ().cVK().dpy().oe(n);
    }

    public /* synthetic */ boolean apply(@Nullable Object object) {
        return this.s((Integer)object);
    }
}

