/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aZq
 */
public final class azq_0
implements afl {
    bcx_0 hyg;
    static final Logger hyh = Logger.getLogger(azq_0.class);

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.interactiveElement", new Object[0]);
    }

    public void a(WL wL) {
        this.hyg = new bcx_0();
        this.hyg.a(bcy_0.values());
        this.hyg.a(bcz_0.values());
        try {
            aqb_1.bGD().a(new amr_0(), new aZr(this));
        }
        catch (Exception exception) {
            hyh.error((Object)"Erreur lors de la lecture du fichier de vues d'\u00e9l\u00e9ments interactifs", (Throwable)exception);
        }
        bcw_0.dQn().a(this.hyg);
        this.hyg = null;
        wL.b(this);
    }
}

