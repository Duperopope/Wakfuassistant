/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdy
 */
public class bdy_2 {
    private static final Logger hLV = Logger.getLogger(bdy_2.class);
    public final String hLW;
    public final boolean hLX;

    public bdy_2(String string, boolean bl) {
        this.hLW = string;
        this.hLX = bl;
    }

    public boolean b(bdy_2 bdy_22) {
        return this.hLX == bdy_22.hLX && BH.a(this.hLW, bdy_22.hLW, false);
    }

    public void Z(bgy bgy2) {
        bjz_1 bjz_12 = bja_1.drJ().bC(Bw.r(this.hLW));
        if (bjz_12 == null) {
            hLV.error((Object)("breed inconnu " + this.hLW));
            return;
        }
        bjk_2.a(bjz_12.drA(), bgy2);
        bjk_2.c(bjz_12.drA(), bgy2);
        bjk_2.b(bjz_12.drA(), bgy2);
    }
}

