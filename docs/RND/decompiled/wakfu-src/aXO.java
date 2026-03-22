/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.Multimap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class aXO
implements afl {
    protected static final Logger hxi = Logger.getLogger(aXO.class);
    public static final aXO hxj = new aXO();

    private aXO() {
    }

    public void a(WL wL) {
        boolean bl = auc_0.cVq().b("loadAchievements", true);
        if (!bl) {
            wL.b(this);
            return;
        }
        this.cYf();
        this.cYg();
        this.cYh();
        this.cYi();
        wL.b(this);
    }

    private void cYf() {
        aqb_1.bGD().a(new akx_0(), (T akx_02) -> bcb_1.hDb.a(akx_02.d(), akx_02.getName(), akx_02.cjL()));
    }

    private void cYg() {
        aqb_1.bGD().a(new aku_0(), (T aku_02) -> bcb_1.hDb.a(aku_02.d(), aku_02.cjJ(), null, aku_02.aXE()));
    }

    private void cYh() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        aqb_1.bGD().a(new akp_0(), (T akp_02) -> {
            if (akp_02.cjs()) {
                Multimap multimap = (Multimap)tIntObjectHashMap.get(akp_02.cjd());
                if (multimap == null) {
                    multimap = ArrayListMultimap.create();
                    tIntObjectHashMap.put(akp_02.cjd(), (Object)multimap);
                }
                multimap.put((Object)akp_02.cju(), (Object)akp_02.d());
            }
        });
        aqb_1.bGD().a(new akp_0(), new aXP(this, tIntObjectHashMap));
    }

    private void cYi() {
        aqb_1.bGD().a(new akv_0(), (T akv_02) -> {
            int n = akv_02.d();
            akw_0[] akw_0Array = akv_02.cjK();
            akw_0[] akw_0Array2 = new akw_0[akw_0Array.length];
            System.arraycopy(akw_0Array, 0, akw_0Array2, 0, akw_0Array.length);
            Arrays.sort(akw_0Array2, aXQ.hxm);
            int[] nArray = new int[akw_0Array2.length];
            int n2 = akw_0Array2.length;
            for (int i = 0; i < n2; ++i) {
                nArray[i] = akw_0Array2[i].apw();
            }
            mp_1 mp_12 = new mp_1(n);
            mp_12.h(nArray);
            mq_1.aXr.a(mp_12);
        });
    }

    String a(akp_0 akp_02, TIntObjectHashMap<Multimap<Byte, Integer>> tIntObjectHashMap) {
        String string = akp_02.cjf();
        boolean bl = akp_02.cjs();
        if (bl) {
            byte by = akp_02.cju();
            int n = akp_02.cjt();
            Multimap multimap = (Multimap)tIntObjectHashMap.get(akp_02.cjd());
            if (multimap == null) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(GetLevel() >= ").append(akp_02.cjl());
            if (n > 0) {
                stringBuilder.append(" && GetItemQuantity(").append(n).append(") > 0");
            }
            for (Byte by2 : multimap.keySet()) {
                if (by2 >= by) continue;
                for (Integer n2 : multimap.get((Object)by2)) {
                    stringBuilder.append(" && IsAchievementComplete(").append(n2).append(')');
                }
            }
            stringBuilder.append(')');
            if (!BH.aU(string)) {
                stringBuilder.append(" && (");
                stringBuilder.append(string);
                stringBuilder.append(')');
            }
            return stringBuilder.toString();
        }
        return string;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.achievements", new Object[0]);
    }
}

