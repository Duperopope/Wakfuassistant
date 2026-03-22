/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.function.BiConsumer;

/*
 * Renamed from foz
 */
public class foz_0 {
    private final aaa_1 sLO = new aaa_1();
    private final ua_0 sLP;
    private final ua_0 sLQ;
    private final byte sLR;

    public foz_0(long l, long l2, byte by) {
        this.sLP = uz_0.fo(l);
        this.sLQ = uz_0.fo(l2);
        this.sLR = by;
    }

    public ua_0 gfu() {
        return this.sLP;
    }

    public ua_0 gfv() {
        return this.sLQ;
    }

    public byte gfw() {
        return this.sLR;
    }

    public void ai(int n, boolean bl) {
        this.sLO.k(n, bl);
    }

    public boolean XG(int n) {
        return this.sLO.vZ(n);
    }

    public boolean g(TIntProcedure tIntProcedure) {
        int n = this.sLO.bTR();
        for (int i = 0; i < n; ++i) {
            if (!this.sLO.wc(i) || tIntProcedure.execute(this.sLO.wa(i))) continue;
            return false;
        }
        return true;
    }

    public void i(BiConsumer<Integer, Boolean> biConsumer) {
        int n = this.sLO.bTR();
        for (int i = 0; i < n; ++i) {
            biConsumer.accept(this.sLO.wa(i), this.sLO.wc(i));
        }
    }

    public String toString() {
        return "PetDefinitionMeal{m_mealItemRefIds=" + this.sLO.bTR() + ", m_mealMinInterval=" + String.valueOf(this.sLP) + ", m_mealMaxInterval=" + String.valueOf(this.sLQ) + ", m_xpPerMeal=" + this.sLR + "}";
    }
}

