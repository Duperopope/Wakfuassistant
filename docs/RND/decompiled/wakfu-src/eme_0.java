/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eMe
 */
public class eme_0
extends eLU {
    public eme_0(List<enk_0> list) {
        super(list, 0, (short)0);
    }

    @Override
    public void aa(@NotNull ArrayList<String> arrayList) {
        ahv_2 ahv_22 = eLL.qJd.ceG();
        if (!arrayList.isEmpty()) {
            boolean bl = true;
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                if (!bl) {
                    ahv_22.ceH();
                } else {
                    bl = false;
                }
                ahv_22.c(arrayList.get(i));
            }
        }
        arrayList.clear();
        arrayList.add(ahv_22.ceL());
    }

    @Override
    public String k(@NotNull String string, @NotNull enk_0 enk_02) {
        if (enk_02.fAt()) {
            return "";
        }
        String string2 = super.k(string, enk_02);
        ahv_2 ahv_22 = eLL.qJd.ceG();
        ahv_22.c(string2).ceH();
        return ahv_22.ceL();
    }
}

