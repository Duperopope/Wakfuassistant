/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from bZT
 */
public class bzt_2 {
    public static final bzt_2 lEV = new bzt_2();
    private final HashMap<Integer, ArrayList<Integer>> lEW = new HashMap();
    private final HashMap<Integer, ArrayList<Integer>> lEX = new HashMap();

    private bzt_2() {
    }

    public void ej(int n, int n2) {
        ArrayList<Integer> arrayList;
        if (!this.lEW.containsKey(n)) {
            this.lEW.put(n, new ArrayList());
        }
        if ((arrayList = this.lEW.get(n)).contains(n2)) {
            return;
        }
        arrayList.add(n2);
    }

    public void ek(int n, int n2) {
        ArrayList<Integer> arrayList;
        if (!this.lEX.containsKey(n)) {
            this.lEX.put(n, new ArrayList());
        }
        if ((arrayList = this.lEX.get(n)).contains(n2)) {
            return;
        }
        arrayList.add(n2);
    }

    public ArrayList<Integer> JQ(int n) {
        return this.lEW.containsKey(n) ? this.lEW.get(n) : new ArrayList<Integer>();
    }

    public ArrayList<Integer> JR(int n) {
        return this.lEX.containsKey(n) ? this.lEX.get(n) : new ArrayList<Integer>();
    }
}

