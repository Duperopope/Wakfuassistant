/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.collect.Multimap;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;

class aXP
implements aqg_1<akp_0> {
    final /* synthetic */ TIntObjectHashMap hxk;
    final /* synthetic */ aXO hxl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aXP(aXO aXO2, TIntObjectHashMap tIntObjectHashMap) {
        this.hxl = aXO2;
        this.hxk = tIntObjectHashMap;
    }

    public void a(akp_0 akp_02) {
        ang_2 ang_22;
        ang_2 ang_23;
        int n = akp_02.d();
        boolean bl = akp_02.isVisible();
        String string = akp_02.aGr();
        try {
            ang_23 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            ang_23 = null;
            aXO.hxi.error((Object)"", (Throwable)exception);
        }
        String string2 = this.hxl.a(akp_02, (TIntObjectHashMap<Multimap<Byte, Integer>>)this.hxk);
        try {
            ang_22 = ehu_0.rY(string2);
        }
        catch (Exception exception) {
            ang_22 = null;
            aXO.hxi.error((Object)"", (Throwable)exception);
        }
        uw_0 uw_02 = null;
        uz_0 uz_02 = null;
        if (akp_02.cjp() != 0L) {
            uw_02 = uw_0.fn(akp_02.cjp());
            uz_02 = uz_0.fo(akp_02.cjq());
        }
        int n2 = akp_02.cjk() ? -1 : akp_02.cjo();
        boolean bl2 = bcb_1.hDb.a(n, akp_02.cjd(), bl, akp_02.cje(), null, null, ang_23, akp_02.getDuration() * 1000, (long)akp_02.cji() * 1000L, akp_02.cjj(), akp_02.aYo(), akp_02.cjk(), akp_02.cjl(), akp_02.cjm(), akp_02.cjn(), n2, uw_02, uz_02, akp_02.apo(), akp_02.cjr(), akp_02.aVt(), akp_02.cju(), ang_22, akp_02.aYs(), akp_02.cjv(), bbz_2.AJ(akp_02.aeV()), akp_02.getDuration() != 0 || akp_02.cjq() != 0L);
        if (!bl2) {
            aXO.hxi.error((Object)"[STOP] Error during registering achievement");
        }
        this.a(akp_02, n);
        this.b(akp_02, n);
    }

    private void a(akp_0 akp_02, int n) {
        for (akq_0 akq_02 : akp_02.cjg()) {
            boolean bl = akq_02.cjw();
            akt_0[] akt_0Array = akq_02.cjA();
            TIntArrayList tIntArrayList = new TIntArrayList(akt_0Array.length);
            for (akt_0 akt_02 : akt_0Array) {
                tIntArrayList.add(akt_02.cjI());
            }
            Object[] objectArray = akq_02.cjy();
            ang_2 ang_22 = null;
            try {
                ang_22 = ehu_0.rY(akq_02.cjx());
            }
            catch (Exception exception) {
                aXO.hxi.error((Object)"Exception during loadGoals", (Throwable)exception);
            }
            if (ang_22 == null) {
                ang_22 = amz_2.cIw;
            }
            ang_2 ang_23 = null;
            try {
                ang_23 = ehu_0.rY(akq_02.cjz());
            }
            catch (Exception exception) {
                aXO.hxi.error((Object)"Exception during loadGoals", (Throwable)exception);
            }
            if (ang_23 == null) {
                ang_23 = amz_2.cIw;
            }
            if (bcb_1.hDb.a(akq_02.d(), n, tIntArrayList.isEmpty() ? null : tIntArrayList.toArray(), null, null, bl, ang_22, ang_23, (akr_0[])objectArray)) continue;
            aXO.hxi.error((Object)"[STOP] Error during registering objective");
        }
    }

    private void b(akp_0 akp_02, int n) {
        for (aks_0 aks_02 : akp_02.cjh()) {
            bby_2 bby_22 = bby_2.AI(aks_02.aeV());
            if (bcb_1.hDb.a(aks_02.d(), n, bby_22, aks_02.cjG(), aks_02.cjF())) continue;
            aXO.hxi.error((Object)"[STOP] Error during registering achievement reward");
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((akp_0)aqz_22);
    }
}

