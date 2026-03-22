/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Arrays;

/*
 * Renamed from bYg
 */
public class byg_2
implements eyu_1 {
    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        if (exz_12.dmc()) {
            byf_2.F("has_hero_in_party", true);
            if (exz_12.aZj() == bgt_02.aZj()) {
                byf_2.F("has_own_hero_in_party", true);
            }
        }
        if (exz_12.aXd()) {
            byf_2.F("has_sidekick_in_party", true);
            if (exz_12.aZj() == bgt_02.aZj()) {
                byf_2.F("has_own_sidekick_in_party", true);
            }
        }
    }

    @Override
    public void a(eyt_1 eyt_12, exz_1 exz_12, boolean bl) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        TLongObjectHashMap<exz_1> tLongObjectHashMap = eyt_12.Tj(2);
        if (tLongObjectHashMap.isEmpty()) {
            byf_2.F("has_sidekick_in_party", false);
            byf_2.F("has_own_sidekick_in_party", false);
        } else {
            boolean bl2 = Arrays.stream(tLongObjectHashMap.values()).anyMatch(object -> ((exz_1)object).aZj() == bgt_02.aZj());
            byf_2.F("has_own_sidekick_in_party", bl2);
        }
        TLongObjectHashMap<exz_1> tLongObjectHashMap2 = eyt_12.Tj(1);
        if (tLongObjectHashMap2.isEmpty()) {
            byf_2.F("has_hero_in_party", false);
            byf_2.F("has_own_hero_in_party", false);
        } else {
            byh_2 byh_22 = new byh_2(bgt_02.aZj());
            tLongObjectHashMap2.forEachValue((TObjectProcedure)byh_22);
            byf_2.F("has_hero_in_party", byh_22.eoP() > 0);
            byf_2.F("has_own_hero_in_party", byh_22.eoQ() > 0);
        }
    }

    @Override
    public void a(eyt_1 eyt_12, long l, long l2) {
    }
}

