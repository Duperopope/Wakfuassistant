/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from brY
 */
public class bry_0
implements Sp {
    private static final Logger jeG = Logger.getLogger(bry_0.class);
    public static final bry_0 jeH = new bry_0();

    private bry_0() {
    }

    @Override
    public void b(Sl sl) {
        switch (sl.bfB()) {
            case bod: {
                Sn sn = (Sn)sl;
                if (sn.bfd() <= 0) {
                    return;
                }
            }
            case bnZ: 
            case boa: {
                Sn sn = (Sn)sl;
                RT rT = sn.bfD();
                if (!(rT instanceof ffV)) {
                    jeG.error((Object)("Ce listener ne doit \u00eatre utilis\u00e9 que pour des \u00e9v\u00e9nements d'Item et non de " + String.valueOf(rT.getClass())), (Throwable)new UnsupportedOperationException());
                    return;
                }
                bqm_0.jbp.b(new brv(((ffV)rT).dOg()));
            }
        }
    }
}

