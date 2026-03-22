/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from beq
 */
public class beq_1
extends beg_2<ber_1> {
    private static final Logger hNk = Logger.getLogger(beq_1.class);

    @Override
    protected void a(bdj_2 bdj_22, ber_1 ber_12) {
    }

    @Override
    public void e(bdj_2 bdj_22) {
        ber_1 ber_12 = (ber_1)this.den();
        this.hMX.clear();
        this.a(ber_12, ber_12, bdj_22);
    }

    @Override
    public void a(ber_1 ber_12, ber_1 ber_13, bdj_2 bdj_22) {
        if (ber_13.hNn == null) {
            hNk.warn((Object)"On essaye de d\u00e9sappliquer un mobile qui n'a pas \u00e9t\u00e9 appliqu\u00e9 correctement");
            return;
        }
        bdj_22.e(ber_13.hNn);
        adn_0.bvh().fL(ber_13.hNn.Sn());
        ber_13.hNn = null;
    }
}

