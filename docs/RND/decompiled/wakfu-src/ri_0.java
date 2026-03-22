/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Ri
 */
public class ri_0
implements sw_0 {
    private final ArrayList<acd_1> bkB = new ArrayList();

    public void a(acd_1[] acd_1Array) {
        for (int i = 0; i < acd_1Array.length; ++i) {
            acd_1 acd_12 = acd_1Array[i];
            if (this.bkB.contains(acd_12)) continue;
            this.bkB.add(acd_12);
        }
    }

    @Override
    public void e(int n, int n2, short s) {
        assert (false) : "This shape uses a custom filling method";
    }

    @Override
    public boolean Q(int n, int n2) {
        assert (false) : "This shape uses a custom filling method";
        return false;
    }

    @Override
    public void bdt() {
        assert (false) : "This shape uses a custom filling method";
    }

    @Override
    public int bdu() {
        return this.bkB.size();
    }

    @Override
    public boolean bdv() {
        return true;
    }

    @Override
    public ArrayList<acd_1> f(int n, int n2, short s) {
        return this.bkB;
    }
}

