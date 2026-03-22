/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.List;
import org.apache.log4j.Logger;

final class aXC
implements aaq_2<cpq> {
    private static final Logger hwY = Logger.getLogger(aXC.class);

    aXC() {
    }

    @Override
    public boolean a(cpq cpq2) {
        hwY.info((Object)"Mise \u00e0 jour de la liste des compagnons");
        List<eJS> list = cpq2.exl();
        aUQ aUQ2 = aue_0.cVJ().cVO();
        long l = aUQ2.xl();
        if (cpq2.exm()) {
            TLongObjectHashMap<eJS> tLongObjectHashMap = eJN.qAF.pQ(l);
            eJN.qAF.pS(l);
            for (eJS eJS2 : list) {
                hwY.info((Object)("Companion dans le message : " + String.valueOf(eJS2)));
                eJN.qAF.a(l, eJS2);
                tLongObjectHashMap.remove(eJS2.Sn());
            }
            if (!tLongObjectHashMap.isEmpty()) {
                for (eJS eJS2 : tLongObjectHashMap.valueCollection()) {
                    aXG.hxc.b(eJS2);
                }
            }
        } else {
            for (eJS eJS3 : list) {
                eJN.qAF.a(l, eJS3);
            }
        }
        if (aue_0.cVJ().c(ctu_2.nJd)) {
            ctu_2.nJd.ePP();
            ctu_2.nJd.ePR();
            ctu_2.nJd.ePN();
        }
        if (cvu_2.eQx()) {
            cvu_2.eTO().aA(list);
        }
        hwY.info((Object)("Liste des companions : " + String.valueOf(eJN.qAF.pP(l))));
        return false;
    }

    @Override
    public int bkq() {
        return 12373;
    }
}

