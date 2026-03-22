/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TLongIntProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TLongIntProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from eWI
 */
final class ewi_1 {
    ewi_1() {
    }

    public static byte[] a(ewn_2 ewn_22, int n) {
        azg_1 azg_12 = new azg_1();
        ewi_1.a((ewm_1)ewn_22, azg_12);
        ewi_1.a(ewn_22, azg_12);
        ewi_1.b((ewm_1)ewn_22, azg_12);
        ewi_1.b(ewn_22, azg_12);
        return azg_12.bTe();
    }

    public static ewn_2 a(byte[] byArray, ewn_2 ewn_22) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        ewi_1.a(byteBuffer, ewn_22);
        ewi_1.b(byteBuffer, ewn_22);
        ewi_1.c(byteBuffer, ewn_22);
        ewi_1.d(byteBuffer, ewn_22);
        return ewn_22;
    }

    private static void a(ewm_1 ewm_12, azg_1 azg_12) {
        azg_12.vC(ewm_12.dIB());
    }

    private static void a(ByteBuffer byteBuffer, ewn_2 ewn_22) {
        ewn_22.Aa(byteBuffer.getInt());
    }

    private static void a(ewn_2 ewn_22, azg_1 azg_12) {
        azg_12.aF((byte)ewn_22.aVo());
        ewn_22.fOm().forEachEntry((TLongIntProcedure)new ewj_0(azg_12, ewn_22));
    }

    private static void b(ByteBuffer byteBuffer, ewn_2 ewn_22) {
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            int n2 = byteBuffer.getInt();
            boolean bl = byteBuffer.get() == 0;
            ewn_22.fOm().put(l, n2);
            if (!bl) continue;
            ewn_22.rp(l);
        }
    }

    private static void b(ewm_1 ewm_12, azg_1 azg_12) {
        TIntObjectHashMap<ewz_1<enk_0>> tIntObjectHashMap = ewm_12.fOl();
        azg_12.aF((byte)tIntObjectHashMap.size());
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new ewk_2(azg_12));
    }

    private static void c(ByteBuffer byteBuffer, ewn_2 ewn_22) {
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.get();
            ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
            for (int j = 0; j < n3; ++j) {
                enk_0 enk_02 = ewc_1.rBP.SK(byteBuffer.getInt());
                if (enk_02 == null) continue;
                arrayList.add(enk_02);
            }
            ewn_22.d((byte)n2, arrayList);
        }
    }

    private static void b(ewn_2 ewn_22, azg_1 azg_12) {
        azg_1 azg_13 = new azg_1();
        LU lU = new LU();
        ewn_22.fOn().forEachEntry((TIntObjectProcedure)new ewl_1(lU, azg_13));
        azg_12.aF(lU.byteValue());
        azg_12.a(azg_13);
    }

    private static void d(ByteBuffer byteBuffer, ewn_2 ewn_22) {
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.get();
            ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
            for (int j = 0; j < n3; ++j) {
                int n4 = byteBuffer.getInt();
                enk_0 enk_02 = ewc_1.rBP.SK(n4);
                if (enk_02 == null) continue;
                arrayList.add(enk_02);
            }
            ewn_22.fOn().put(n2, arrayList);
        }
    }
}

