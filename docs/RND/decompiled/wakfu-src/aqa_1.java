/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

/*
 * Renamed from aqA
 */
class aqa_1 {
    private static final Logger cQL = Logger.getLogger(aqa_1.class);
    private final aql_1[] cQM;
    private final azw_2<String, aqm_1> cQN;
    private final String cQO;
    private final aqh_1 cQP;

    aqa_1(String string, int n) {
        int n2;
        this.cQO = string;
        byte[] byArray = fo_0.by(this.cQO);
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int n3 = byteBuffer.getInt() + 756423;
        aqh_1 aqh_12 = new aqh_1(byteBuffer, n, n3);
        int n4 = aqh_12.bGI();
        this.cQM = new aql_1[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            long l = aqh_12.bGK();
            int n5 = aqh_12.bGI();
            int n6 = aqh_12.bGI();
            byte by = aqh_12.aTf();
            this.cQM[n2] = new aql_1(l, n5, n6, by);
        }
        n2 = aqh_12.aTf();
        this.cQN = new azw_2(n2);
        for (int i = 0; i < n2; ++i) {
            aqm_1 aqm_12 = aqm_1.b(aqh_12);
            this.cQN.f(aqm_12.cRh, aqm_12);
        }
        ByteBuffer byteBuffer2 = byteBuffer.slice();
        byteBuffer2.order(byteBuffer.order());
        this.cQP = new aqh_1(byteBuffer2, n, n3);
    }

    public final String bGB() {
        return this.cQO;
    }

    private aqm_1 fK(String string) {
        return this.cQN.O(string);
    }

    final boolean a(long l, aqz_2 aqz_22) {
        try {
            aqz_22.reset();
            aqm_1 aqm_12 = this.cQN.O("id");
            if (aqm_12.gw(l) == 0) {
                cQL.warn((Object)("Pas de " + aqz_22.getClass().getSimpleName() + " existant. id=" + l), (Throwable)new Exception());
                return false;
            }
            int n = aqm_12.p(l, 0);
            this.a(this.cQM[n], aqz_22);
            return true;
        }
        catch (Exception exception) {
            cQL.error((Object)("Probl\u00e8me  de lecture de " + aqz_22.getClass().getSimpleName() + "id=" + l), (Throwable)exception);
            return false;
        }
    }

    private void a(aql_1 aql_12, aqz_2 aqz_22) {
        int n = aql_12.cRe;
        this.cQP.a(n, aql_12.cRg);
        aqz_22.a(this.cQP);
        if ((long)(aql_12.cRf + n) != this.cQP.bGF()) {
            throw new Exception("Taille de donn\u00e9e incorrecte ");
        }
    }

    final <T extends aqz_2> void a(T t, aqg_1<T> aqg_12) {
        for (aql_1 aql_12 : this.cQM) {
            t.reset();
            this.a(aql_12, t);
            aqg_12.load(t);
        }
    }

    final <T extends aqz_2> void a(T t, String string, int n, aqg_1<T> aqg_12) {
        aqm_1 aqm_12 = this.fK(string);
        int n2 = aqm_12.gw(n);
        for (int i = 0; i < n2; ++i) {
            try {
                int n3 = aqm_12.p(n, i);
                aql_1 aql_12 = this.cQM[n3];
                t.reset();
                this.a(aql_12, t);
                aqg_12.load(t);
                continue;
            }
            catch (Exception exception) {
                cQL.error((Object)("Probl\u00e8me  de lecture de " + t.getClass().getSimpleName() + "id=" + n + "item num:" + i), (Throwable)exception);
            }
        }
    }

    public int bGC() {
        return this.cQM.length;
    }
}

