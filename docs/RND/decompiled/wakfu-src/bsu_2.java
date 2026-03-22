/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bSu
 */
public class bsu_2
implements fkC,
fkz {
    public static final bsu_2 lgP = new bsu_2();
    private TIntObjectHashMap<azm_1> lgQ;
    private TIntLongHashMap lgR;
    protected static final Logger lgS = Logger.getLogger(bsu_2.class);

    private bsu_2() {
    }

    @Override
    public void c(fjm fjm2) {
    }

    @Override
    public void a(fjo_0 fjo_02, fjm fjm2) {
    }

    @Override
    public void a(int n, fjo_0 fjo_02) {
        abo_2.dyC.a(new bsv_2(this, n), bna_0.kDO);
    }

    void b(fjm fjm2, int n) {
        azm_1 azm_12;
        if (n == -1) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (bgt_02 != fjm2) {
            return;
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        if (fjn_02 == null) {
            return;
        }
        fjo_0 fjo_02 = fjn_02.ems();
        bJr bJr2 = bjx_0.klY.HC(n);
        if (bJr2 == null) {
            return;
        }
        if (!bgt_02.djT()) {
            bgt_02.li(true);
        }
        String string = bJr2.getName();
        azm_1 azm_13 = fjo_02.WE(n);
        if (azm_13 == null) {
            return;
        }
        if (azm_13.aVo() > 1) {
            lgS.error((Object)"[DESIGN] pas pr\u00e9vu : on a plusieurs buffs diff\u00e9rents sur un m\u00eame mdc, impossible de cr\u00e9er le popup de notification pour le joueur");
            return;
        }
        if (this.lgQ == null) {
            this.lgQ = new TIntObjectHashMap();
            this.lgR = new TIntLongHashMap();
        }
        if ((azm_12 = (azm_1)this.lgQ.get(n)) == null) {
            this.lgQ.put(n, (Object)azm_13);
            this.lgR.put(n, -1L);
            return;
        }
        if (this.lgR.get(n) != -1L && (double)(System.currentTimeMillis() - this.lgR.get(n)) < 150000.0) {
            lgS.info((Object)("[DESIGN] Message de changement de bonus spam\u00e9 sur le mdc d'id=" + n));
            return;
        }
        this.lgQ.put(n, (Object)azm_13);
        this.lgR.put(n, System.currentTimeMillis());
    }

    public void clean() {
        if (this.lgQ != null) {
            this.lgQ.clear();
            this.lgR.clear();
        }
    }
}

