/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bRz
 */
public class brz_1
extends flc_0 {
    private static final Logger laT = Logger.getLogger(brz_1.class);

    public brz_1(fjo_0 fjo_02) {
        super(fjo_02);
        this.c(bsu_2.lgP);
    }

    @Override
    protected fjm mi(long l) {
        return bvz_0.ju(l);
    }

    @Override
    public void a(@NotNull fjm fjm2) {
        this.k(fjm2);
    }

    @Override
    public void mj(long l) {
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            laT.error((Object)("[NATION] On demande l'ajout du character d'id " + l + " \u00e0 la nation " + String.valueOf(this.ems()) + " mais il n'y a aucun personnage avec cet id"));
            return;
        }
        this.k(bgy2);
    }
}

