/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from eTh
 */
public class eth_0
extends QR {
    private static final ObjectPool rmS = new ayv_2(new eti_0());

    public static eth_0 a(QT qT, qm_0 qm_02) {
        eth_0 eth_02;
        try {
            eth_02 = (eth_0)rmS.borrowObject();
            eth_02.a(rmS);
        }
        catch (Exception exception) {
            biG.error((Object)("Erreur lors d'un checkOut sur un message de type EffectAreaManager : " + exception.getMessage()));
            eth_02 = new eth_0();
            eth_02.a((ObjectPool)null);
            eth_02.aVI();
        }
        eth_02.a(qT);
        eth_02.a(qm_02);
        return eth_02;
    }

    @Override
    public QQ dr(long l) {
        eSS eSS2 = eTo.fIZ().iY(l);
        if (eSS2 == null) {
            biG.error((Object)("pas de modele de zone d'effet d'id " + l));
            return null;
        }
        return eSS2.a(null);
    }
}

