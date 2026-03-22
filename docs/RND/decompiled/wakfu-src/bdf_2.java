/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bdF
 */
public final class bdf_2
extends beg_2<bdg_2> {
    private static final Logger hMf = Logger.getLogger(bdf_2.class);

    @Override
    protected void a(bdj_2 bdj_22, bdg_2 bdg_22) {
    }

    @Override
    public void e(bdj_2 bdj_22) {
        for (bdg_2 bdg_22 : this.hMX) {
            this.a(bdg_22, bdg_22, bdj_22);
        }
    }

    @Override
    public void a(bdg_2 bdg_22, bdg_2 bdg_23, bdj_2 bdj_22) {
        if (bdg_23.hMi == null) {
            hMf.warn((Object)"On essaye de d\u00e9sappliquer un mobile qui n'a pas \u00e9t\u00e9 appliqu\u00e9 correctement");
            return;
        }
        adj_0 adj_02 = bdg_23.hMi.bvb();
        if (adj_02 != null) {
            adj_02.e(bdg_23.hMi);
        }
        adn_0.bvh().fL(bdg_23.hMi.Sn());
        bdg_23.hMi.bpI();
        bdg_23.hMi = null;
        bdj_22.b(bdg_23.hMj);
        bdj_22.c(bdg_23.hMj);
        bdg_23.hMj = null;
    }
}

