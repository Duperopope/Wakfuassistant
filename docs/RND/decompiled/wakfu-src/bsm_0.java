/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bsm
 */
public class bsm_0 {
    private static bso_0 iqO;
    private static final Logger jgb;
    protected final TLongObjectHashMap<Object> jgc = new TLongObjectHashMap();
    protected final TLongShortHashMap jgd = new TLongShortHashMap();

    public bsm_0(bso_0 bso_02) {
        iqO = bso_02;
    }

    public void a(RT rT, Object object, short s) {
        if (object instanceof bde_0) {
            if (aue_0.cVJ().cVK().Sn() != ((bsp_0)iqO.bfm()).Sn() && aue_0.cVJ().cVK().Sn() != ((bsp_0)iqO.bfn()).Sn()) {
                jgb.error((Object)"On essaie de m\u00e9moriser la position d'un item lors d'un \u00e9change qui ne concerne pas le joueur !");
                return;
            }
            bde_0 bde_02 = (bde_0)object;
            this.jgc.put(rT.LV(), (Object)bde_02);
            this.jgd.put(rT.LV(), s);
        }
    }

    public Object r(RT rT) {
        return this.jgc.get(rT.LV());
    }

    public short s(RT rT) {
        return this.jgd.get(rT.LV());
    }

    public Object a(ffV ffV2, short s) {
        bsp_0 bsp_02 = (bsp_0)iqO.dP(aue_0.cVJ().cVK().Sn());
        boolean bl = !bsp_02.dF(ffV2.LV());
        Object object = this.jgc.get(ffV2.LV());
        short s2 = this.jgd.get(ffV2.LV());
        bdl_0 bdl_02 = aue_0.cVJ().cVK().dno();
        if (bdl_02 == null) {
            jgb.info((Object)"Erreur lors de la r\u00e9cup\u00e9ration des sacs du local player");
            return null;
        }
        if (object == null || s2 < 0) {
            jgb.error((Object)"On cherche a retirer un objet qui n'a pas \u00e9t\u00e9 m\u00e9moris\u00e9 pendant l'\u00e9change");
            return null;
        }
        if (object instanceof bde_0) {
            boolean bl2;
            bde_0 bde_02 = (bde_0)object;
            boolean bl3 = false;
            ffV ffV3 = ffV2.fVU();
            ffV3.ak(s);
            bde_0 bde_03 = (bde_0)bdl_02.sY(bde_02.Lx());
            boolean bl4 = bl2 = bde_03.sV(ffV3.LV()) != null;
            if (bl2) {
                bl3 = bde_03.b(ffV3.LV(), ffV3.bfd());
                if (bl3) {
                    ffV3.aZp();
                }
            } else if (bde_03.h(ffV3, s2)) {
                try {
                    bl3 = bde_03.i(ffV3, s2);
                }
                catch (Exception exception) {
                    jgb.warn((Object)exception.getMessage());
                }
                if (bl3 && !bde_03.bt(ffV3)) {
                    ffV3.aZp();
                }
            }
            if (bl3) {
                if (bl) {
                    this.t(ffV3);
                }
                return bde_02;
            }
            ffs_0 ffs_02 = bdl_02.j(ffV3, true);
            if (ffs_02 == null) {
                jgb.error((Object)"L'item n'a pu etre ajout\u00e9 nulle part. Il n'a pas \u00e9t\u00e9 ajout\u00e9 a l'inventaire");
                return null;
            }
            jgb.warn((Object)("L'item a \u00e9t\u00e9 plac\u00e9 dans le premier bag disponible, soit :" + ffs_02.Lx()));
            if (bl) {
                this.t(ffV2);
            }
            return ffs_02;
        }
        return null;
    }

    public void dFu() {
        if (aue_0.cVJ().cVK().Sn() != ((bsp_0)iqO.bfm()).Sn() && aue_0.cVJ().cVK().Sn() != ((bsp_0)iqO.bfn()).Sn()) {
            jgb.error((Object)"On veut remettre a z\u00e9ro les positions d'un \u00e9change qui ne nous concerne pas !");
            return;
        }
        this.jgc.clear();
        this.jgd.clear();
    }

    public void t(RT rT) {
        if (!this.jgc.containsKey(rT.LV()) || !this.jgd.containsKey(rT.LV())) {
            jgb.error((Object)"L'objet que l'on veut retirer n'est pas m\u00e9moris\u00e9 ! ");
            return;
        }
        this.jgc.remove(rT.LV());
        this.jgd.remove(rT.LV());
    }

    public void b(bso_0 bso_02) {
        if (bso_02 != iqO) {
            jgb.error((Object)"We want to remove items from an exchange that doesn't concern player ! ");
            return;
        }
        bsp_0 bsp_02 = (bsp_0)iqO.dP(aue_0.cVJ().cVK().Sn());
        LP lP = new LP(false);
        this.jgc.forEachEntry((l, object) -> {
            ffV ffV2 = (ffV)bsp_02.dE(l);
            Object object2 = this.a(ffV2, ffV2.bfd());
            if (object2 instanceof fgd_0) {
                lP.aH(true);
            }
            return true;
        });
        if (lP.aTe()) {
            cvo_2.eUK().eUQ();
        }
        this.dFu();
    }

    static {
        jgb = Logger.getLogger(bsm_0.class);
    }
}

