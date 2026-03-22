/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bgG
 */
public class bgg_0
implements qv_0,
ano_2 {
    protected static final Logger icO = Logger.getLogger(bgg_0.class);
    private static final bgg_0 icP = new bgg_0();
    private final TLongObjectHashMap<bgy> icQ = new TLongObjectHashMap();
    private final List<bgy> icR = new ArrayList<bgy>();
    private final List<bhx_0> icS = new ArrayList<bhx_0>();
    private final List<bgh_0> icT = new ArrayList<bgh_0>();
    private final List<bgh_0> icU = new ArrayList<bgh_0>();

    public static bgg_0 dlO() {
        return icP;
    }

    public boolean aq(bgy bgy2) {
        if (this.at(bgy2)) {
            return false;
        }
        this.ar(bgy2);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ar(bgy bgy2) {
        List<bgy> list;
        bdj_2 bdj_22 = bgy2.ddI();
        if (bgy2.a(eyp_0.pmO)) {
            bdj_22.bP(ewo_0.oBF.p(ewr_0.oCq));
        } else if (bgy2.a(eyp_0.pmP)) {
            bdj_22.bP(ewo_0.oBF.p(ewr_0.oCp));
        }
        aue_0.a(bdj_22);
        adn_0.bvh().g(bdj_22);
        bbq_2.dao().a(bgy2.Sn(), bdj_22);
        if (bgy2 instanceof bhx_0 && ((bhx_0)bgy2).doO()) {
            list = this.icS;
            synchronized (list) {
                this.icS.add((bhx_0)bgy2);
            }
        }
        if (bgy2 instanceof bhJ) {
            list = this.icR;
            synchronized (list) {
                this.icR.add(bgy2);
            }
        }
        bdj_22.a(bif_2.dYO());
        bdj_22.a(bir_1.dZt());
        bir_1.dZt().a(bdj_22);
        this.as(bgy2);
        this.au(bgy2);
    }

    public void as(bgy bgy2) {
        if (bgy2.bvY() && !bgy2.dmc()) {
            big_2.a(bgy2.Sn(), 0, bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), bgy2.aqZ(), bgy2, bif_2.dYO().dXT(), auc_0.cVq().zt(800237), bgy2.getName(), aid_0.dUO, bif_2.dYO());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean at(bgy bgy2) {
        if (bgy2 == null) {
            return true;
        }
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            if (this.icQ.containsKey(bgy2.Sn())) {
                icO.error((Object)("Ajout de ce CharacterInfo impossible : il existe d\u00e9j\u00e0 : " + bgy2.Sn() + " - " + String.valueOf(bgy2) + " - " + String.valueOf(this.icQ.get(bgy2.Sn()))));
                return true;
            }
            this.icQ.put(bgy2.Sn(), (Object)bgy2);
        }
        return false;
    }

    private void au(bgy bgy2) {
        for (bgh_0 bgh_02 : this.icT) {
            try {
                bgh_02.ap(bgy2);
            }
            catch (Exception exception) {
                icO.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        this.icT.removeAll(this.icU);
        this.icU.clear();
    }

    public void av(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        this.aw(bgy2);
        bgy2.aZp();
    }

    public void aw(@NotNull bgy bgy2) {
        if (bgy2.dkW() != null) {
            bgy2.dkW().aT(bgy2);
        }
        this.jt(bgy2.Sn());
        if (bgy2 instanceof bhx_0) {
            bhx_0 bhx_02 = (bhx_0)bgy2;
            bjl_1.dri().a(bhx_02, false);
            bjn_2.drQ().pv(bgy2.Sn());
            aWc aWc2 = bhx_02.doI();
            if (aWc2 != null) {
                aWc2.cXd();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(TLongObjectProcedure<bgy> tLongObjectProcedure) {
        boolean bl;
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            bl = this.icQ.forEachEntry(tLongObjectProcedure);
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean m(TObjectProcedure<bgy> tObjectProcedure) {
        boolean bl = true;
        List<bgy> list = this.icR;
        synchronized (list) {
            int n = this.icR.size();
            for (int i = 0; i < n && (bl = tObjectProcedure.execute((Object)this.icR.get(i))); ++i) {
            }
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void n(TObjectProcedure<bgy> tObjectProcedure) {
        List<bgy> list = this.icR;
        synchronized (list) {
            for (bgy bgy3 : this.icR) {
                if (tObjectProcedure.execute((Object)bgy3)) continue;
                return;
            }
        }
        list = this.icQ;
        synchronized (list) {
            this.icQ.forEachValue(bgy2 -> {
                if (bgy2.aFW() == 5) {
                    return tObjectProcedure.execute(bgy2);
                }
                return true;
            });
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int dlP() {
        List<bgy> list = this.icR;
        synchronized (list) {
            return this.icR.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bgy lH(String string) {
        if (string == null) {
            return null;
        }
        List<bgy> list = this.icR;
        synchronized (list) {
            for (int i = this.icR.size() - 1; i >= 0; --i) {
                bgy bgy2 = this.icR.get(i);
                if (bgy2 == null || !string.equalsIgnoreCase(bgy2.getName())) continue;
                return bgy2;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void jt(long l) {
        bgy bgy2;
        Object object = this.icQ;
        synchronized (object) {
            bgy2 = (bgy)this.icQ.remove(l);
        }
        if (bgy2 == null) {
            icO.warn((Object)("Tentative de suppression d'un CharacterInfo " + l + " inexistant."));
            return;
        }
        if (bgy2 instanceof bhx_0) {
            object = this.icS;
            synchronized (object) {
                this.icS.remove(bgy2);
            }
        }
        object = this.icR;
        synchronized (object) {
            this.icR.remove(bgy2);
        }
        if (bgy2.dkO()) {
            this.b(l, bgy2);
        }
        bir_1.dZt().b(bgy2.ddI());
        bgy2.bmX();
    }

    private void b(long l, bgy bgy2) {
        if (bgy2.bvY()) {
            adn_0.bvh().k(bgy2.ddI());
        } else {
            adn_0.bvh().fL(l);
        }
        bbq_2.dao().jc(bgy2.Sn());
        aPG.ik(bgy2.Sn());
        czr_2.oQ(bgy2.Sn());
        big_2.a(0, l, (bip_2)bif_2.dYO());
        bgy2.ddI().c(bif_2.dYO());
        bgy2.ddI().c(bir_1.dZt());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bgy ju(long l) {
        bgy bgy2;
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            bgy2 = (bgy)this.icQ.get(l);
        }
        return bgy2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bgy lI(String string) {
        if (string == null) {
            return null;
        }
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                bgy bgy2 = (bgy)tLongObjectIterator.value();
                if (bgy2 == null || !string.equals(bgy2.getName())) continue;
                return bgy2;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bgy jv(long l) {
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                bgy bgy2 = (bgy)tLongObjectIterator.value();
                if (bgy2 == null || l != bgy2.Xi() || bgy2.aFW() != 0) continue;
                return bgy2;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dlQ() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                bgy bgy2 = (bgy)tLongObjectIterator.value();
                if (bgy2.djz() && bgy2.djB()) {
                    ++n4;
                    continue;
                }
                if (!bgy2.djz() && bgy2.djB()) {
                    ++n3;
                    continue;
                }
                if (bgy2.djz() && !bgy2.djB()) {
                    ++n2;
                    continue;
                }
                ++n;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dlR() {
        int n;
        Object object = this.icQ;
        synchronized (object) {
            n = this.icQ.size();
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ((bgy)tLongObjectIterator.value()).aZp();
            }
            this.icQ.clear();
        }
        object = this.icS;
        synchronized (object) {
            this.icS.clear();
        }
        object = this.icR;
        synchronized (object) {
            this.icR.clear();
        }
        bjl_1.dri().removeAll();
        bjn_2.drQ().removeAll();
        icO.info((Object)("Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (" + this.icQ.size() + " restants sur " + n + ")"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public qu_0 dg(long l) {
        bgy bgy2;
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            bgy2 = bvz_0.ju(l);
        }
        return bgy2;
    }

    @Override
    public long bam() {
        return 0L;
    }

    public Iterator<bgy> ban() {
        return new azs_1<bgy>(this.icQ);
    }

    public List<qu_0> a(acd_1 acd_12) {
        return this.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<qu_0> b(int n, int n2, int n3) {
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                if (amf_1.a((amg_1)tLongObjectIterator.value(), n, n2) != 0) continue;
                arrayList.add((qu_0)tLongObjectIterator.value());
            }
        }
        return arrayList;
    }

    public void a(bgh_0 bgh_02) {
        if (!this.icT.contains(bgh_02)) {
            this.icT.add(bgh_02);
        }
    }

    public void b(bgh_0 bgh_02) {
        if (bgh_02 != null) {
            this.icU.add(bgh_02);
        }
    }

    public void c(bgh_0 bgh_02) {
        this.icT.remove(bgh_02);
    }
}

