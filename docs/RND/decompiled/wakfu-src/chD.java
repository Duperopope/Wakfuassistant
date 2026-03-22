/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public class chD
implements aaq_2<ctb> {
    private static final Logger lUe = Logger.getLogger(chD.class);

    @Override
    public boolean a(ctb ctb2) {
        cvo_2.eUK().kz(false);
        if (chF.a(ctb2.eBN())) {
            return false;
        }
        ArrayList<bgr_2> arrayList = new ArrayList<bgr_2>();
        ctb2.eBP().avG().auXX().forEach(oo2 -> {
            Optional<bgr_2> optional = bgq_2.e(oo2);
            if (optional.isPresent()) {
                arrayList.add(optional.get());
            } else {
                lUe.error((Object)("[PVP INVENTORY] There is an unknown item in the pvp inventory of player " + aue_0.cVJ().cVK().Xi() + " with reference=" + oo2.avr() + " and quantity " + oo2.oP()));
            }
        });
        bgt_2.jWG.Y(arrayList);
        return false;
    }

    @Override
    public int bkq() {
        return 12981;
    }
}

