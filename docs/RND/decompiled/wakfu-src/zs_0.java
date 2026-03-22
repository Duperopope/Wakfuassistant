/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ZS
 */
public class zs_0
implements ark_2<en_1> {
    @Override
    public final boolean a(arj_2 arj_22, en_1 en_12) {
        String[] stringArray = en_12.aJn();
        byte[] byArray = en_12.aJo();
        if (stringArray == null) {
            return false;
        }
        int n = GC.mR(101);
        for (int i = 0; i < stringArray.length; ++i) {
            if ((n -= byArray[i]) > 0 || stringArray[i] == null) continue;
            if (stringArray[i].isEmpty()) break;
            return arj_22.dT(stringArray[i]);
        }
        return false;
    }
}

