/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ajs
 */
interface ajs_1 {
    default public Logger bBx() {
        return Logger.getLogger(this.getClass());
    }

    default public ZC bN(int n, int n2) {
        Object t = adn_0.bvh().aY(n, n2);
        if (t == null) {
            t = ZM.bqw().aY(n, n2);
        }
        if (t == null) {
            t = afh_0.bxU().aY(n, n2);
        }
        return t;
    }

    default public ZC gd(long l) {
        ZC zC = adn_0.bvh().fM(l);
        if (zC == null) {
            zC = ZM.bqw().fD(l);
        }
        if (zC == null) {
            zC = afh_0.bxU().fR(l);
        }
        return zC;
    }

    default public adj_0 fM(long l) {
        adj_0 adj_02 = adn_0.bvh().fM(l);
        return adj_02;
    }

    default public ZC fD(long l) {
        ZC zC = ZM.bqw().fD(l);
        if (zC == null) {
            zC = afh_0.bxU().fR(l);
        }
        return zC;
    }

    default public boolean a(ZG zG) {
        if (zG instanceof ads_0) {
            return ((ads_0)zG).bvx() == 8;
        }
        return false;
    }
}

