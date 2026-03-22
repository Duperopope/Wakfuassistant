/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class aUW
extends agb_1
implements adm_0 {
    private static final Logger hsi = Logger.getLogger(aUW.class);

    protected aUW(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        abb_2.bUA().hk(this.dxy);
        this.caT();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        hsi.warn((Object)"le personnage n'est pas encore arriv\u00e9 a destination, le timer termine l'action.");
        return super.b(aam_22);
    }
}

