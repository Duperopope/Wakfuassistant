/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from aKO
 */
public class ako_0
implements aKr {
    private static final ako_0 efO = new ako_0();

    public static ako_0 cjc() {
        return efO;
    }

    private ako_0() {
    }

    @Override
    public void a(bgy bgy2, aad_0 aad_02, aad_0 aad_03, aad_0 aad_04) {
        if (bgy2 == null) {
            return;
        }
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return;
        }
        Collection<QQ> collection = bsj_02.bai().bdh();
        if (collection == null) {
            return;
        }
        for (QQ qQ : collection) {
            if (qQ.bci() != bgy2 || qQ.aeV() != etm_0.rnr.aHp()) continue;
            aad_02.E(qQ.bcC(), qQ.bcD(), qQ.bcE());
        }
    }
}

