/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public class chB
implements aaq_2<csZ> {
    private static final Logger lUd = Logger.getLogger(chB.class);

    @Override
    public boolean a(csZ csZ2) {
        cvo_2.eUK().kz(false);
        if (chF.a(csZ2.eBN())) {
            return false;
        }
        bgt_0 bgt_02 = Optional.ofNullable(bvz_0.dLl()).orElse(aue_0.cVJ().cVK());
        ArrayList<bgr_2> arrayList = new ArrayList<bgr_2>(csZ2.eBO().auZ());
        csZ2.eBO().auXX().forEach(oo2 -> {
            Optional<bgr_2> optional = bgq_2.e(oo2);
            if (optional.isPresent()) {
                arrayList.add(optional.get());
            } else {
                lUd.error((Object)("[PVP INVENTORY] There is an unknown item in the pvp inventory of player " + bgt_02.Xi() + " with reference=" + oo2.avr() + " and quantity " + oo2.oP()));
            }
        });
        bgt_2.jWG.y(arrayList);
        return false;
    }

    @Override
    public int bkq() {
        return 13092;
    }
}

