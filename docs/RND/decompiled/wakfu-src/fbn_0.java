/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fbN
 */
public class fbn_0
extends fbk_0 {
    private final ArrayList<fbv_0> rSt = new ArrayList();
    private final ArrayList<enk_0> rSu = new ArrayList();
    private final ArrayList<enk_0> rSv = new ArrayList();
    private final TIntArrayList rSw = new TIntArrayList();
    private aae_1 rSx;

    public fbn_0(short s, short s2, int n, byte by, int n2, int n3, int n4, boolean bl) {
        super(s, s2, n, by, n2, n3, n4, bl);
    }

    public void b(fbv_0 fbv_02) {
        this.rSt.add(fbv_02);
    }

    public void v(enk_0 enk_02) {
        if (enk_02.a(eNi.qWz)) {
            this.rSv.add(enk_02);
        } else {
            this.rSu.add(enk_02);
        }
    }

    @Override
    public boolean coy() {
        return false;
    }

    @Override
    public boolean erO() {
        return !this.rSu.isEmpty();
    }

    @Override
    public boolean z(TObjectProcedure<fbv_0> tObjectProcedure) {
        for (int i = 0; i < this.rSt.size(); ++i) {
            if (tObjectProcedure.execute((Object)this.rSt.get(i))) continue;
            return false;
        }
        return true;
    }

    public boolean Q(TObjectProcedure<enk_0> tObjectProcedure) {
        for (int i = 0; i < this.rSu.size(); ++i) {
            if (tObjectProcedure.execute((Object)this.rSu.get(i))) continue;
            return false;
        }
        return true;
    }

    public boolean R(TObjectProcedure<enk_0> tObjectProcedure) {
        for (int i = 0; i < this.rSv.size(); ++i) {
            if (tObjectProcedure.execute((Object)this.rSv.get(i))) continue;
            return false;
        }
        return true;
    }

    public boolean e(TIntProcedure tIntProcedure) {
        for (int i = 0; i < this.rSw.size(); ++i) {
            if (tIntProcedure.execute(this.rSw.getQuick(i))) continue;
            return false;
        }
        return true;
    }

    public void TY(int n) {
        this.rSw.add(n);
    }

    public void a(aae_1 aae_12) {
        this.rSx = aae_12.bTR() == 0 ? null : aae_12;
    }

    @Override
    public boolean Kq(int n) {
        return this.rSx != null && this.rSx.pF(n) != 0;
    }

    @Override
    public int[] erP() {
        return this.rSx == null ? Bv.auu : this.rSx.bTS();
    }

    @Override
    public int Kp(int n) {
        int n2;
        int n3 = n2 = this.rSx == null ? 0 : this.rSx.pF(n);
        if (n2 == 0) {
            return this.conn();
        }
        return n2;
    }

    public boolean fSf() {
        return !this.rSv.isEmpty();
    }
}

