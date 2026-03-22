/*
 * Decompiled with CFR 0.152.
 */
public class ZR
implements ark_2<em_1> {
    @Override
    public final boolean a(arj_2 arj_22, em_1 em_12) {
        String string = arj_22.bpF();
        String[] stringArray = em_12.aJk();
        String[] stringArray2 = em_12.aJl();
        for (int i = 0; i < stringArray.length; ++i) {
            if (!string.endsWith(stringArray[i])) continue;
            return arj_22.dT(stringArray2[i]);
        }
        return arj_22.dT(em_12.aJm());
    }
}

