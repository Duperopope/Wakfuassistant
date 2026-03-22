/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bvK
 */
public class bvk_0
implements aeh_2 {
    protected static final Logger jvb = Logger.getLogger(bvk_0.class);
    public static final String jvc = "members";
    public static final String[] jvd = new String[]{"members"};
    private bvi_0 jve;
    final TLongObjectHashMap<bvl_0> jvf = new TLongObjectHashMap();
    private final List<bvl_0> jvg = new ArrayList<bvl_0>();
    bvl_0 jvh;
    static long jvi = -1L;
    static long jvj = -1L;
    static long jvk = -1L;

    public bvk_0(bvi_0 bvi_02) {
        this.a(bvi_02);
    }

    public void a(bvi_0 bvi_02) {
        this.clear();
        this.jve = bvi_02;
        if (bvi_02.dKL() == null || bvi_02.dKL().aJG()) {
            return;
        }
        long l = bvi_02.dKL().fmo();
        TLongObjectIterator tLongObjectIterator = bvi_02.dKL().fPG().iterator();
        exz_1 exz_12 = bvi_02.dKL().rw(l);
        if (exz_12 == null) {
            return;
        }
        this.jvh = this.b(exz_12);
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exz_1 exz_13 = (exz_1)tLongObjectIterator.value();
            if (exz_13 == null || exz_13.KU() == l) continue;
            this.b(exz_13);
        }
        Collections.sort(this.jvg);
        for (bvl_0 bvl_02 : this.jvg) {
            if (this.kQ(bvl_02.Sn()) || !this.a(bvl_02)) continue;
            if (jvi == -1L) {
                jvi = bvl_02.Sn();
                continue;
            }
            if (jvj == -1L) {
                jvj = bvl_02.Sn();
                continue;
            }
            if (jvk != -1L) continue;
            jvk = bvl_02.Sn();
        }
    }

    private bvl_0 b(exz_1 exz_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bvl_0 bvl_02 = new bvl_0(this, exz_12);
        bvl_02.dKZ();
        if (exz_12.aXd()) {
            eJS eJS2 = ((exy_1)exz_12).fPk();
            eJS2.b(new bvs_0(bvl_02));
        }
        long l = exz_12.KU();
        this.jvf.put(l, (Object)bvl_02);
        this.jvg.add(bvl_02);
        if (bvl_02.dcc() && exz_12.aqZ() != bgt_02.aqZ()) {
            this.j(l, false);
        }
        return bvl_02;
    }

    private boolean kQ(long l) {
        return jvi == l || jvj == l || jvk == l;
    }

    boolean a(bvl_0 bvl_02) {
        return bvl_02.aZj() == aue_0.cVJ().cVO().xl() && !bvl_02.dKX().aXd();
    }

    public static void dKN() {
        jvk = -1L;
        jvj = -1L;
        jvi = -1L;
    }

    public void clear() {
        TLongObjectIterator tLongObjectIterator = this.jvf.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((bvl_0)tLongObjectIterator.value()).dLa();
        }
        this.jvf.clear();
        this.jvg.clear();
        this.jvh = null;
    }

    public void kO(long l) {
        exz_1 exz_12;
        this.jve.kO(l);
        if (this.kQ(l)) {
            bvk_0.dKN();
        }
        if ((exz_12 = this.jve.dKL().rw(l)) == null) {
            jvb.error((Object)("impossible de retrouver le membre du groupe d'id : " + l));
            return;
        }
        String string = l == aue_0.cVJ().cVK().Sn() ? aum_0.cWf().c("group.party.memberDeletedSelf", new Object[0]) : aum_0.cWf().c("group.party.memberDeleted", exz_12.getName());
        aPh.czg().iZ(string);
    }

    public void kP(long l) {
        this.jve.kP(l);
    }

    public void j(long l, boolean bl) {
        if (l < 0L) {
            jvb.error((Object)("on essai d'appliquer la boussole sur un membre invalide d'id : " + l));
            return;
        }
        exz_1 exz_12 = this.jve.dKL().rw(l);
        if (exz_12 == null) {
            jvb.error((Object)("impossible de retrouver le membre du groupe d'id : " + l));
            return;
        }
        if (bl) {
            if (exz_12.aqZ() != aue_0.cVJ().cVK().aqZ()) {
                fiq_2.gCw().d(fik_2.gBZ().l("error.group.memberTooFar", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                return;
            }
            aPd.f("group.party.memberFollowed", exz_12.getName());
        } else {
            aPd.f("group.party.stopFollowing", exz_12.getName());
        }
        exz_12.mL(bl);
    }

    public void mA(String string) {
        this.jve.mz(string);
    }

    public bvl_0 kR(long l) {
        return (bvl_0)this.jvf.get(l);
    }

    @Override
    public String[] bxk() {
        return jvd;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jvc)) {
            return this.jvg.isEmpty() ? null : this.jvg;
        }
        return null;
    }

    public static long bR(byte by) {
        switch (by) {
            case 0: {
                return jvi;
            }
            case 1: {
                return jvj;
            }
            case 2: {
                return jvk;
            }
        }
        return -1L;
    }

    public void dKO() {
        for (bvl_0 bvl_02 : this.jvg) {
            fse_1.gFu().a((aef_2)bvl_02, "heroPosition");
        }
    }
}

