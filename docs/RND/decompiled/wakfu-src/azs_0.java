/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aZs
 */
public final class azs_0
implements afl {
    private static final Logger hyj = Logger.getLogger(azs_0.class);
    private static final azs_0 hyk = new azs_0();
    private boolean hyl = false;

    public static azs_0 cYU() {
        return hyk;
    }

    private azs_0() {
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.interactiveElementTemplates", new Object[0]);
    }

    public void a(WL wL) {
        try {
            aqb_1.bGD().a(new aMS(), new aZt(this));
        }
        catch (Exception exception) {
            hyj.error((Object)"Erreur lors de la lecture du fichier de vues d'\u00e9l\u00e9ments interactifs", (Throwable)exception);
        }
        wL.b(this);
    }

    byte[] a(aMS aMS2) {
        ArrayList<acd_1> arrayList = new ArrayList<acd_1>();
        for (aMT aMT2 : aMS2.cpb()) {
            arrayList.add(new acd_1(aMT2.getX(), aMT2.getY(), aMT2.bdi()));
        }
        op_1 op_12 = new op_1(aMS2.bdL(), aMS2.getX(), aMS2.getY(), aMS2.bdi(), aMS2.coW(), aMS2.coX(), aMS2.coY(), aMS2.bcS(), aMS2.coZ(), aMS2.coI(), aMS2.bei(), arrayList, aMS2.cpa(), aMS2.cpc(), aMS2.ckm(), aMS2.cor());
        return op_12.apI();
    }
}

