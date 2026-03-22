/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from alg
 */
public class alg_1
extends alb_2 {
    private static final String cEP = "anm/";

    private static String gg(long l) {
        assert (afs_1.can().bYf() != null);
        return String.format("%s%d%s", cEP, l, afs_1.can().bLX());
    }

    @Override
    protected void b(arj_2 arj_22, long l) {
        Map<String, Object> map = Map.of("fightId", arj_22.bqo(), "defaultSoundMaxInstance", this.cEE);
        afr_1[] afr_1Array = new alb_1[]{new alb_1((ZC)arj_22)};
        afs_1.can().a(alg_1.gg(l), afr_1Array, map, null, false);
    }
}

