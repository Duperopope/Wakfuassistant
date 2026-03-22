/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bKp
 */
public class bkp_0
implements RW<ffh_0, vy_2> {
    protected static final Logger knl = Logger.getLogger(bkp_0.class);
    public static final bkp_0 knm = new bkp_0();

    public bkn_0 d(vy_2 vy_22) {
        bkn_0 bkn_02 = new bkn_0();
        if (bkn_02.a(vy_22)) {
            return bkn_02;
        }
        knl.error((Object)("Erreur \u00e0 la d\u00e9s\u00e9rialisation d'un rawItem d'inventaire de protecteur (itemRefId=" + vy_22.agz.aaQ + ")"));
        return null;
    }

    @Override
    public /* synthetic */ RT x(Object object) {
        return this.d((vy_2)object);
    }
}

