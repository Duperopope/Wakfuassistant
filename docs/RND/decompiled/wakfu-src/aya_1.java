/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

/*
 * Renamed from ayA
 */
public class aya_1
extends ayu_1 {
    public aya_1(float f2, boolean bl) {
        super(f2, bl);
    }

    public aya_1(float f2, boolean bl, boolean bl2) {
        super(f2, bl, bl2);
    }

    @Override
    public void bSg() {
        super.bSg();
        ayc_1 ayc_12 = new ayc_1(0.0f, 0.0f);
        TIntArrayList tIntArrayList = new TIntArrayList();
        this.e(this.bSe());
        tIntArrayList.add(this.bXE.size() - 1);
        while (tIntArrayList.size() != 0) {
            int n = tIntArrayList.size();
            int n2 = this.dsT.nextInt() % n;
            int n3 = tIntArrayList.get(n2);
            aco_1 aco_12 = (aco_1)this.bXE.get(n3);
            tIntArrayList.set(n2, tIntArrayList.get(n - 1));
            tIntArrayList.removeAt(n - 1);
            ayc_12.bg(0.0f, 1.5707964f);
            this.a(n3, ayc_12);
            ArrayList<ayd_1> arrayList = ayc_12.bSh();
            while (arrayList.size() != 0) {
                ayd_1 ayd_12 = arrayList.get(this.dsT.nextInt() % arrayList.size());
                float f2 = ayd_12.dtq + (ayd_12.dtr - ayd_12.dtq) * this.dsT.nextFloat();
                aco_1 aco_13 = this.b(new aco_1(aco_12.aPY + GC.F(f2) * 2.0f * this.dta, aco_12.aPZ + GC.E(f2) * 2.0f * this.dta));
                this.e(aco_13);
                tIntArrayList.add(this.bXE.size() - 1);
                ayc_12.bh(f2 - 1.0471976f, f2 + 1.0471976f);
            }
        }
    }
}

