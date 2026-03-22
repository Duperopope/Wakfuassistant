/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from awJ
 */
final class awj_1
implements TObjectProcedure<awk_1> {
    private final ArrayList<awk_1> dmw = new ArrayList(64);
    private float dmx;

    awj_1() {
    }

    public boolean e(awk_1 awk_12) {
        if (awk_12 == null) {
            return true;
        }
        awk_12.bPk();
        if (awk_12.bPj() <= 0) {
            assert (awk_12.bSW() == 0);
            this.dmw.add(awk_12);
            this.dmx += awk_12.bPi();
        }
        return true;
    }

    void reset() {
        this.dmw.clear();
        this.dmx = 0.0f;
    }

    float a(ArrayList<awk_1> arrayList, float f2) {
        float f3 = 0.0f;
        if (this.dmx > f2) {
            int n = this.bPa();
            for (int i = 0; i < n; ++i) {
                awk_1 awk_12 = this.dmw.get(i);
                arrayList.add(awk_12);
                f3 += awk_12.bPi();
                if (!((f2 -= awk_12.bPi()) < 0.0f)) {
                    continue;
                }
                break;
            }
        } else {
            int n = this.dmw.size();
            for (int i = 0; i < n; ++i) {
                awk_1 awk_13 = this.dmw.get(i);
                arrayList.add(awk_13);
                f3 += awk_13.bPi();
            }
        }
        return f3;
    }

    private int bPa() {
        int n = this.dmw.size();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                awk_1 awk_12 = this.dmw.get(i);
                awk_1 awk_13 = this.dmw.get(j);
                if (awk_13.auH() <= awk_12.auH()) continue;
                this.dmw.set(i, awk_13);
                this.dmw.set(j, awk_12);
            }
        }
        return n;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((awk_1)object);
    }
}

