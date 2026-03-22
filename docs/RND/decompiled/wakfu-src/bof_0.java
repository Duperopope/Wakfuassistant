/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

/*
 * Renamed from boF
 */
public class bof_0 {
    private bof_0() {
    }

    public static String a(fhg_0 fhg_02) {
        Set<ffS> set = fhg_02.fYF();
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        for (ffS ffS2 : set) {
            if (!bl) {
                stringBuilder.append(", ");
            }
            bl = false;
            stringBuilder.append(aum_0.cWf().c(ffS2.shc, new Object[0]));
        }
        return aum_0.cWf().c("enchantment.double.bonus", stringBuilder.toString());
    }
}

