/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from To
 */
public final class to_0<Rated extends tk_0> {
    private final ArrayList<tm_0<Rated>> bsu = new ArrayList();
    private final HashMap<Rated, Integer> bsv = new HashMap();

    public Iterable<tm_0<Rated>> bgS() {
        return this.bsu;
    }

    public int bgT() {
        return this.bsu.size();
    }

    public boolean a(tm_0<Rated> tm_02) {
        if (tm_02 == null || tm_02.app()) {
            return false;
        }
        tk_0[] tk_0Array = tm_02.bgO();
        int[] nArray = tm_02.bgP();
        for (int i = 0; i < 2; ++i) {
            if (!this.bsv.containsKey(tk_0Array[i])) {
                this.bsv.put(tk_0Array[i], nArray[i]);
                continue;
            }
            if (this.bsv.get(tk_0Array[i]) == nArray[i]) continue;
            return false;
        }
        this.bsu.add(tm_02);
        return true;
    }

    public int j(Rated Rated) {
        return this.bsv.get(Rated);
    }
}

