/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class agj
implements afW {
    private static final Logger ctq = Logger.getLogger(agj.class);
    private final afW ctr;
    private final rh_0 cts;
    private final ArrayList<afW> ctt = new ArrayList();
    private final TIntArrayList ctu = new TIntArrayList();

    public agj(afW afW2, rh_0 rh_02) {
        this.ctr = afW2;
        this.cts = rh_02;
    }

    public void byX() {
        this.ctt.clear();
        this.ctu.clear();
    }

    public void a(afW afW2, int n) {
        if (!this.ctt.contains(afW2)) {
            this.ctt.add(afW2);
            this.ctu.add(n);
        }
    }

    public int byY() {
        return this.ctt.size();
    }

    @Override
    public float bpZ() {
        return 0.0f;
    }

    @Override
    public short bcE() {
        return (short)GC.B(this.getAltitude());
    }

    @Override
    public float getAltitude() {
        int n = this.ctt.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            if (!this.d(this.ctt.get(i))) continue;
            int n3 = this.ctu.get(i);
            f2 += this.ctt.get(i).getAltitude() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            ctq.error((Object)"Aucune target d\u00e9finie");
            return this.ctr.getAltitude();
        }
        return f2 / (float)n2;
    }

    @Override
    public int bcC() {
        return GC.A(this.getWorldX());
    }

    @Override
    public int bcD() {
        return GC.A(this.getWorldY());
    }

    @Override
    public float getWorldX() {
        int n = this.ctt.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            if (!this.d(this.ctt.get(i))) continue;
            int n3 = this.ctu.get(i);
            f2 += this.ctt.get(i).getWorldX() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            ctq.error((Object)"Aucune target d\u00e9finie");
            return this.ctr.getWorldX();
        }
        return f2 / (float)n2;
    }

    @Override
    public float getWorldY() {
        int n = this.ctt.size();
        int n2 = 0;
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            if (!this.d(this.ctt.get(i))) continue;
            int n3 = this.ctu.get(i);
            f2 += this.ctt.get(i).getWorldY() * (float)n3;
            n2 += n3;
        }
        if (n2 == 0) {
            ctq.error((Object)"Aucune target d\u00e9finie");
            return this.ctr.getWorldY();
        }
        return f2 / (float)n2;
    }

    @Override
    public void aB(float f2, float f3) {
    }

    @Override
    public void e(float f2, float f3, float f4) {
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    private boolean d(afW afW2) {
        return this.cts == null || this.cts.aK(afW2.bcC(), afW2.bcD());
    }
}

