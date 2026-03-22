/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from fdt
 */
public class fdt_0 {
    private final int rWc;
    private final int rWd;
    private final aai_1 rWe = new aai_1(1);
    private final int rWf;
    private final int rWg;
    private final aah_1<fdu> rWh = new aah_1(1);
    private final int rWi;
    private final ang_2 rWj;

    public fdt_0(int n, int n2, int n3, ang_2 ang_22, int n4, int n5) {
        this.rWc = n;
        this.rWf = n2;
        this.rWi = n3;
        this.rWj = ang_22;
        this.rWg = n4;
        this.rWd = n5;
    }

    public void F(int n, short s) {
        if (this.rWe.vZ(n)) {
            throw new IllegalArgumentException("Une d\u00e9finition de l'item " + n + " existe d\u00e9j\u00e0");
        }
        this.rWe.c(n, s);
    }

    public void a(int n, short s, fgW fgW2, boolean bl) {
        if (this.rWh.vZ(n)) {
            throw new IllegalArgumentException("Une d\u00e9finition de l'item " + n + " existe d\u00e9j\u00e0");
        }
        this.rWh.b(n, new fdu(n, s, fgW2, bl));
    }

    public boolean a(TIntShortProcedure tIntShortProcedure) {
        for (int i = 0; i < this.rWe.bTR(); ++i) {
            if (tIntShortProcedure.execute(this.rWe.wa(i), this.rWe.ws(i))) continue;
            return false;
        }
        return true;
    }

    public Map<Integer, Short> fTx() {
        HashMap<Integer, Short> hashMap = new HashMap<Integer, Short>();
        for (int i = 0; i < this.rWe.bTR(); ++i) {
            hashMap.put(this.rWe.wa(i), this.rWe.ws(i));
        }
        return hashMap;
    }

    public int fTy() {
        return this.rWf;
    }

    public int cnp() {
        return this.rWg;
    }

    public boolean X(TObjectProcedure<fdu> tObjectProcedure) {
        for (int i = 0; i < this.rWh.bTR(); ++i) {
            if (tObjectProcedure.execute((Object)this.rWh.vU(i))) continue;
            return false;
        }
        return true;
    }

    public boolean Uk(int n) {
        for (int i = 0; i < this.rWh.bTR(); ++i) {
            if (this.rWh.wa(i) != n) continue;
            return true;
        }
        return false;
    }

    public fdu fTz() {
        return this.rWh.iterator().next();
    }

    public int fTA() {
        return this.rWi;
    }

    public ang_2 bdo() {
        return this.rWj;
    }

    public int d() {
        return this.rWc;
    }

    public int aYs() {
        return this.rWd;
    }

    public String toString() {
        return "Exchange{m_id=" + this.rWc + "}";
    }
}

