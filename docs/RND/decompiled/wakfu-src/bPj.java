/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bPj {
    @Nullable
    public static bPh a(@NotNull @NotNull ArrayList<@NotNull bPh> arrayList, int n, int n2, @Nullable Object object) {
        for (bPh bPh2 : arrayList) {
            if (bPh2.getWidth() != n || bPh2.getHeight() != n2) continue;
            return bPh2;
        }
        if (object != null) {
            for (bPh bPh2 : arrayList) {
                if (!Objects.equals(bPh2.ehV(), object)) continue;
                return bPh2;
            }
        }
        return arrayList.isEmpty() ? null : arrayList.get(0);
    }

    public static aem_2 a(bPh bPh2, aen_2 aen_22, String string) {
        File file = bpn_2.nr(bPh2.bZo());
        String string2 = bpn_2.i(file);
        aem_2 aem_22 = new aem_2(null, string2, string, aen_22);
        bpm_2.kSN.a(bPh2.bZo(), aem_22);
        return aem_22;
    }
}

