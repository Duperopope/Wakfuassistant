/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eUO
 */
public class euo_0
extends rh_0 {
    private static final Logger ryh = Logger.getLogger(euo_0.class);

    @Override
    protected int a(rj_0 rj_02) {
        if (rj_02 == null) {
            return -1;
        }
        byte by = rj_02.bcQ();
        if (!this.bkh.Z(by)) {
            ryh.warn((Object)("On ne retrouve pas l'index de la cellule ou est situ\u00e9 l'obstacle " + by));
            return -1;
        }
        return this.bkh.Y(by);
    }
}

