/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fzE
 */
final class fze_0
extends fzd_0 {
    @Override
    public <T> float a(float f2, ArrayList<T> arrayList, boolean bl, float f3, float f4, int n) {
        float f5 = (bl ? f3 : f4) - (float)n;
        int n2 = Math.max(1, (int)Math.floor(bl ? (double)f4 : (double)f3));
        if (arrayList != null && (float)(arrayList.size() / n2) < f5) {
            return f2 < 1.0f && f2 >= 0.0f ? f2 : 0.0f;
        }
        if (arrayList != null && (float)((int)Math.ceil((float)arrayList.size() / (float)n2)) - f2 < f5) {
            return (float)Math.ceil((float)arrayList.size() / (float)n2) - f5;
        }
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    @Override
    @Nullable
    public <T> T c(ArrayList<T> arrayList, int n) {
        if (arrayList != null && n >= 0 && n < arrayList.size()) {
            return arrayList.get(n);
        }
        return null;
    }
}

