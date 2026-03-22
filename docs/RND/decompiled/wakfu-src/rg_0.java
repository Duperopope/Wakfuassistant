/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from Rg
 */
public class rg_0
implements sw_0 {
    private final ArrayList<acd_1> bjS = new ArrayList();

    public void a(acd_1[] acd_1Array) {
        Collections.addAll(this.bjS, acd_1Array);
    }

    @Override
    public void e(int n, int n2, short s) {
    }

    @Override
    public boolean Q(int n, int n2) {
        for (int i = 0; i < this.bjS.size(); ++i) {
            acd_1 acd_12 = this.bjS.get(i);
            if (acd_12.getX() != n || acd_12.getY() != n2) continue;
            return true;
        }
        return false;
    }

    @Override
    public void bdt() {
    }

    @Override
    public int bdu() {
        return this.bjS.size();
    }

    @Override
    public boolean bdv() {
        return false;
    }

    @Override
    public ArrayList<acd_1> f(int n, int n2, short s) {
        return this.bjS;
    }
}

