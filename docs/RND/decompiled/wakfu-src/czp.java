/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class czp
implements aaq_2<coA> {
    @Override
    public boolean a(coA coA2) {
        eAa eAa2 = czp.eGk();
        for (eAb eAb2 : coA2.ewx()) {
            eAa2.a(eAb2);
        }
        bbs_2.a(eAa2);
        return false;
    }

    private static eAa eGk() {
        Optional<eAa> optional = bbs_2.a(eva_1.owF);
        return optional.orElseGet(eAa::new);
    }

    @Override
    public int bkq() {
        return 12576;
    }
}

