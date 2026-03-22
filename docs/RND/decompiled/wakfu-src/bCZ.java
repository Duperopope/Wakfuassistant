/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class bCZ
extends bCY<bxJ> {
    public bCZ(bxJ bxJ2) {
        super(bxJ2);
    }

    @Override
    public boolean dNb() {
        return ((bxJ)this.jJQ).dNQ() == 0;
    }

    @Override
    public fnJ dOh() {
        return fnJ.sKp;
    }

    @Override
    public void a(ox_1 ox_12) {
        if (ox_12.avV() == 3) {
            wv_2 wv_22 = (wv_2)ox_12;
            ArrayList<tf_2> arrayList = wv_22.ahw.ZW;
            int[] nArray = new int[arrayList.size()];
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                tf_2 tf_22 = arrayList.get(i);
                nArray[i] = tf_22.ZX;
            }
            ((bxJ)this.jJQ).B(nArray);
            ((bxJ)this.jJQ).dNN();
        }
    }
}

