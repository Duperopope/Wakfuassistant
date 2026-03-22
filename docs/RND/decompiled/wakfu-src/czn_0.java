/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from czN
 */
public final class czn_0
implements aaq_2<ctb_0> {
    private static final Logger mno = Logger.getLogger(czn_0.class);

    @Override
    public boolean a(ctb_0 ctb_02) {
        long l = ctb_02.cXe();
        long l2 = ctb_02.aXb();
        long l3 = ctb_02.eCp();
        bhx_0 bhx_02 = (bhx_0)bgg_0.dlO().ju(l);
        if (bhx_02 == null) {
            mno.warn((Object)("Reception d'un messsage d'action pour le monstre " + l + " alors qu'on ne le connait pas"));
            return false;
        }
        bhJ bhJ2 = (bhJ)bgg_0.dlO().ju(l2);
        if (bhJ2 == null) {
            mno.warn((Object)("Reception d'un messsage d'action pour le monstre " + l + "\tiniti\u00e9 par le joueur " + l2 + " alors qu'on ne le connait pas"));
            return false;
        }
        bjo_2 bjo_22 = bhx_02.doQ().jT(l3);
        if (bjo_22 == null) {
            mno.error((Object)("Reception d'un messsage d'action " + l3 + " inconnu pour le monstre " + l));
            return false;
        }
        fqy_0 fqy_02 = bjo_22.drR();
        blq_0.a(bhJ2.ddI(), fqy_02);
        aWa aWa2 = new aWa(agb_1.cbm(), 0, 0, bjo_22.cbt(), bhx_02, bhJ2);
        awb_0.htX.h(aWa2);
        awb_0.htX.cbb();
        return false;
    }

    @Override
    public int bkq() {
        return 12939;
    }
}

