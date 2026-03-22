/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from fGo
 */
public class fgo_2 {
    private final HashMap<String, fgq_2> uta = new HashMap();
    private String utb = null;
    private boolean jtc = true;
    public fgp_2 utc = null;

    public void a(fgp_2 fgp_22) {
        this.utc = fgp_22;
    }

    public void a(String string, fgq_2 fgq_22) {
        this.uta.put(string, fgq_22);
        if (this.utb == null) {
            this.utb = string;
        }
    }

    public void clear() {
        this.uta.clear();
        this.utb = null;
        this.jtc = true;
    }

    public void gxw() {
        this.utb = null;
        this.jtc = true;
    }

    public int[] af(ArrayList arrayList) {
        if (this.utb == null) {
            return null;
        }
        fgq_2 fgq_22 = this.uta.get(this.utb);
        if (fgq_22 != null) {
            return fgq_22.c(arrayList, this.jtc);
        }
        return null;
    }

    public int[] b(ArrayList arrayList, String string) {
        fgq_2 fgq_22;
        assert (string != null) : "columnId == null !";
        this.jtc = string.equals(this.utb) ? !this.jtc : true;
        this.utb = string;
        if (this.utc != null) {
            this.utc.onColumnSortChanged(this.utb, this.jtc);
        }
        if ((fgq_22 = this.uta.get(this.utb)) == null) {
            return null;
        }
        return fgq_22.c(arrayList, this.jtc);
    }

    public boolean gxx() {
        return this.jtc;
    }

    public static int[] abj(int n) {
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = i;
        }
        return nArray;
    }

    public void gxy() {
        this.jtc = false;
    }
}

