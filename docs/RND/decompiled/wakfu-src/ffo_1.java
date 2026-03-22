/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import java.util.ArrayList;

/*
 * Renamed from fFO
 */
public class ffo_1 {
    private final ArrayList<ffn_1> uqZ = new ArrayList(2);
    private axb_2[] ura;
    private int[] uqY;

    public void a(ffn_1 ffn_12) {
        this.uqZ.add(ffn_12);
    }

    public ArrayList<ffn_1> gwM() {
        return this.uqZ;
    }

    public void clear() {
        this.uqZ.clear();
    }

    public void a(axb_2[] axb_2Array, int[] nArray) {
        this.ura = axb_2Array;
        this.uqY = nArray;
    }

    public axb_2[] gwJ() {
        return this.ura;
    }

    public int[] gwL() {
        return this.uqY;
    }

    public float[] aaZ(int n) {
        if (this.uqZ.size() == 0) {
            return new float[0];
        }
        float[] fArray = this.uqZ.get(0).gwK();
        float[] fArray2 = this.uqZ.get(1).gwK();
        int n2 = fArray.length;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int i = 0; i < n2; ++i) {
            tFloatArrayList.add((float)ffh_1.gQ(n, i));
            tFloatArrayList.add(fArray[i]);
            tFloatArrayList.add((float)ffh_1.gQ(n, i));
            tFloatArrayList.add(fArray2[i]);
        }
        return tFloatArrayList.toArray();
    }
}

