/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from anl
 */
public class anl_2
implements ano_1 {
    @Override
    public amx_1 fl(String string) {
        String[] stringArray;
        ArrayList<amb_2> arrayList = new ArrayList<amb_2>();
        String string2 = string.substring(1, string.length() - 1);
        for (String string3 : stringArray = BH.a(string2, ',')) {
            arrayList.add(new amb_2(Integer.parseInt(string3)));
        }
        return new amc_2(arrayList);
    }
}

