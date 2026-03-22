/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;

/*
 * Renamed from fFN
 */
public class ffn_1 {
    private float[] cZB;
    private axb_2[] uqX;
    private int[] uqY;

    public axb_2[] gwJ() {
        return this.uqX;
    }

    public void a(axb_2[] axb_2Array, int[] nArray) {
        this.uqX = axb_2Array;
        this.uqY = nArray;
    }

    public float[] gwK() {
        return this.cZB;
    }

    public int[] gwL() {
        return this.uqY;
    }

    public void ae(float[] fArray) {
        this.cZB = fArray;
    }

    public float[] aaZ(int n) {
        int n2 = this.cZB.length;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int i = 0; i < n2; ++i) {
            tFloatArrayList.add((float)ffh_1.gQ(n, i));
            tFloatArrayList.add(this.cZB[i]);
        }
        return tFloatArrayList.toArray();
    }
}

