/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from anm
 */
public class anm_2
implements ano_1 {
    public amd_2 fm(String string) {
        String[] stringArray;
        HashMap<amb_2, amb_2> hashMap = new HashMap<amb_2, amb_2>();
        String string2 = string.substring(1, string.length() - 1);
        for (String string3 : stringArray = BH.a(string2, ',')) {
            String[] stringArray2 = BH.a(string3, ':');
            hashMap.put(new amb_2(Integer.parseInt(stringArray2[0])), new amb_2(Integer.parseInt(stringArray2[1])));
        }
        return new amd_2(hashMap);
    }

    @Override
    public /* synthetic */ amx_1 fl(String string) {
        return this.fm(string);
    }
}

