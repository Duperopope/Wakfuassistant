Picked up JAVA_TOOL_OPTIONS: -javaagent:H:\Code\Wakfuassistant\agent\wakfu-spy-agent.jar --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qu
 *  Qv
 *  aCd
 *  aId
 *  aPG
 *  aUC
 *  aUE
 *  aWc
 *  adJ
 *  adN
 *  adS
 *  adY
 *  amf
 *  amg
 *  anO
 *  azS
 *  bIF
 *  bIG
 *  bIR
 *  bIp
 *  bbP
 *  bbQ
 *  bdf
 *  bdj
 *  bgH
 *  bgy
 *  bhJ
 *  bhx
 *  bjN
 *  bjl
 *  bvZ
 *  cZr
 *  ewo
 *  ewr
 *  eyP
 *  fSO
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

public class bgG
implements Qv,
anO {
    protected static final Logger icO = Logger.getLogger(bgG.class);
    private static final bgG icP = new bgG();
    private final TLongObjectHashMap<bgy> icQ = new TLongObjectHashMap();
    private final List<bgy> icR = new ArrayList<bgy>();
    private final List<bhx> icS = new ArrayList<bhx>();
    private final List<bgH> icT = new ArrayList<bgH>();
    private final List<bgH> icU = new ArrayList<bgH>();

    public static bgG dlO() {
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
        bdj bdj2 = bgy2.ddI();
        if (bgy2.a(eyP.pmO)) {
            bdj2.bP(ewo.oBF.p(ewr.oCq));
        } else if (bgy2.a(eyP.pmP)) {
            bdj2.bP(ewo.oBF.p(ewr.oCp));
        }
        aUE.a((bdf)bdj2);
        adN.bvh().g((adJ)bdj2);
        bbQ.dao().a(bgy2.Sn(), (bbP)bdj2);
        if (bgy2 instanceof bhx && ((bhx)bgy2).doO()) {
            list = this.icS;
            synchronized (list) {
                this.icS.add((bhx)bgy2);
            }
        }
        if (bgy2 instanceof bhJ) {
            list = this.icR;
            synchronized (list) {
                this.icR.add(bgy2);
            }
        }
        bdj2.a((adY)bIF.dYO());
        bdj2.a((adY)bIR.dZt());
        bIR.dZt().a((adS)bdj2);
        this.as(bgy2);
        this.au(bgy2);
    }

    public void as(bgy bgy2) {
        if (bgy2.bvY() && !bgy2.dmc()) {
            bIG.a((long)bgy2.Sn(), (int)0, (float)bgy2.bcC(), (float)bgy2.bcD(), (float)bgy2.bcE(), (long)bgy2.aqZ(), (Object)bgy2, (fSO)bIF.dYO().dXT(), (String)aUC.cVq().zt(800237), (String)bgy2.getName(), (float[])aId.dUO, (bIp)bIF.dYO());
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
        for (bgH bgH2 : this.icT) {
            try {
                bgH2.ap(bgy2);
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
        if (bgy2 instanceof bhx) {
            bhx bhx2 = (bhx)bgy2;
            bjl.dri().a(bhx2, false);
            bjN.drQ().pv(bgy2.Sn());
            aWc aWc2 = bhx2.doI();
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
        if (bgy2 instanceof bhx) {
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
        bIR.dZt().b((adS)bgy2.ddI());
        bgy2.bmX();
    }

    private void b(long l, bgy bgy2) {
        if (bgy2.bvY()) {
            adN.bvh().k((adJ)bgy2.ddI());
        } else {
            adN.bvh().fL(l);
        }
        bbQ.dao().jc(bgy2.Sn());
        aPG.ik((long)bgy2.Sn());
        cZr.oQ((long)bgy2.Sn());
        bIG.a((int)0, (long)l, (bIp)bIF.dYO());
        bgy2.ddI().c((adY)bIF.dYO());
        bgy2.ddI().c((adY)bIR.dZt());
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
        bjl.dri().removeAll();
        bjN.drQ().removeAll();
        icO.info((Object)("Nettoyage des CharacterInfo contenus dans le CharacterInfoManager (" + this.icQ.size() + " restants sur " + n + ")"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Qu dg(long l) {
        bgy bgy2;
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            bgy2 = bvZ.ju((long)l);
        }
        return bgy2;
    }

    public long bam() {
        return 0L;
    }

    public Iterator<bgy> ban() {
        return new azS(this.icQ);
    }

    public List<Qu> a(aCd aCd2) {
        return this.b(aCd2.getX(), aCd2.getY(), aCd2.bdi());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<Qu> b(int n, int n2, int n3) {
        ArrayList<Qu> arrayList = new ArrayList<Qu>();
        TLongObjectHashMap<bgy> tLongObjectHashMap = this.icQ;
        synchronized (tLongObjectHashMap) {
            TLongObjectIterator tLongObjectIterator = this.icQ.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                if (amf.a((amg)((amg)tLongObjectIterator.value()), (int)n, (int)n2) != 0) continue;
                arrayList.add((Qu)tLongObjectIterator.value());
            }
        }
        return arrayList;
    }

    public void a(bgH bgH2) {
        if (!this.icT.contains(bgH2)) {
            this.icT.add(bgH2);
        }
    }

    public void b(bgH bgH2) {
        if (bgH2 != null) {
            this.icU.add(bgH2);
        }
    }

    public void c(bgH bgH2) {
        this.icT.remove(bgH2);
    }
}

