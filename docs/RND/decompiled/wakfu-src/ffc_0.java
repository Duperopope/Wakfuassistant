/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ffC
 */
public abstract class ffc_0
extends RP<ffh_0, vy_2>
implements sg_0,
gq_0<wa_2> {
    private static final Logger sfN = Logger.getLogger(ffc_0.class);
    protected final long sfO;
    protected final fgz_0 sfP;
    protected final byte sfQ;
    protected String mbE;
    private final ArrayList<fgy> sfR;

    public ffc_0(long l, RW<ffh_0, vy_2> rW, fgz_0 fgz_02, short s, byte by) {
        super(rW, fgw_0.fXd(), s, true);
        this.a(Sj.bnQ);
        this.sfO = l;
        this.sfP = fgz_02;
        this.sfQ = by;
        this.sfR = new ArrayList();
    }

    public long Lx() {
        return this.sfO;
    }

    public final byte fVt() {
        return this.sfQ;
    }

    public final fgz_0 fVu() {
        return this.sfP;
    }

    @Override
    public boolean a(ffh_0 ffh_02) {
        return ffh_02 != null;
    }

    public void b(fgv fgv2, ffh_0 ffh_02) {
        this.c(fgv2, ffh_02);
    }

    public ffp_0<ffV> a(fgv<ffV> fgv2, long l, short s, fgj_0 fgj_02, long l2, long l3) {
        exP exP2;
        ffp_0<ffV> ffp_02 = new ffp_0<ffV>();
        ffp_02.gi((byte)1);
        ffh_0 ffh_02 = (ffh_0)this.dN(l);
        Long l4 = fes.Lx();
        if (ffh_02 == null) {
            sfN.error((Object)("Impossible de r\u00e9cup\u00e9rer l'item " + l));
            return ffp_02;
        }
        if (this.bfb()) {
            sfN.error((Object)"Requ\u00eate d'achat sur un inventaire marchand verouill\u00e9");
            ffp_02.gi((byte)3);
            return ffp_02;
        }
        if (!this.a(ffh_02) || s <= 0) {
            return ffp_02;
        }
        fgj_0 fgj_03 = fgv2.cWp();
        short s2 = ffh_02.bfd();
        long l5 = ffh_02.eAU() * (long)s;
        if (l5 > Integer.MAX_VALUE || l5 < 0L) {
            sfN.error((Object)("[BROCANTE] Tentative d'achat d'un objet en brocante invalide : prix total incoh\u00e9rent (d\u00e9passement de capacit\u00e9 ou n\u00e9gatif) [price=" + l5 + "]"));
            return ffp_02;
        }
        long l6 = fgj_03.exS();
        short s3 = ffh_02.dSx().sID;
        if (s2 < s * s3 || l6 < l5 || s3 < 0) {
            sfN.error((Object)("[BROCANTE] Quantit\u00e9 insuffisante(" + s + "/" + s2 + ") ou le joueur n'a pas les moyens(" + l6 + "/" + l5 + ") ou les constantes sont invalides packSize=" + s3));
            return ffp_02;
        }
        ffV ffV2 = ffh_02.getItem().tp(ffV.fWh().fWE().baY());
        ffV2.ak((short)(s * s3));
        if (!fgv2.d(ffV2)) {
            sfN.warn((Object)("[BROCANTE] Impossible d'acheter : Les inventaires du joueur ne peuvent acceuillir l'objet de type " + ffV2.avr()));
            ffV2.aZp();
            ffp_02.gi((byte)2);
            return ffp_02;
        }
        this.b(fgv2, ffh_02);
        if (ffh_02.bfd() == s * s3) {
            this.dL(l);
            ffh_02.aZp();
        } else {
            this.b(ffh_02.LV(), (short)(-(s * s3)));
        }
        ffs_0 ffs_02 = fgv2.e(ffV2);
        if (fgv2 instanceof exP) {
            exP2 = (exP)((Object)fgv2);
            fes.a(l4, "FromMerchantInventoryToInventory", fet.ay(l3, l2), fet.bS(exP2), fet.ce(ffV2), fet.sK(exP2.aqZ()));
        }
        fgj_03.ts(l6 - l5);
        if (fgj_02 != null) {
            fgj_02.pK(l5);
        }
        if (fgv2 instanceof exP) {
            exP2 = (exP)((Object)fgv2);
            fes.a(l4, "BuyInMerchantInventory", fet.bS(exP2), fet.ay(l3, l2), fet.sJ(l5), fet.aB(exP2.aqZ(), this.Lx()));
        }
        ffp_02.gi((byte)0);
        ffp_02.h(ffs_02);
        ffp_02.cB(ffV2);
        ffp_02.lk(l5);
        ffp_02.Fq(s * s3);
        return ffp_02;
    }

    public String fVv() {
        return this.mbE;
    }

    public void oy(String string) {
        this.mbE = string;
    }

    public void a(ffh_0 ffh_02, long l) {
        ffh_0 ffh_03 = (ffh_0)this.dN(ffh_02.LV());
        if (ffh_03 == ffh_02) {
            ffh_03.lk(l);
            this.a(Sn.c(this.bmS, ffh_02, this.dK(ffh_02.LV())));
        } else {
            sfN.error((Object)("Impossible de d\u00e9finir le prix sur un objet qui ne fait pas partie de l'inventaire: " + ffh_02.LV()));
        }
    }

    public void a(ffh_0 ffh_02, fnm fnm2) {
        ffh_0 ffh_03 = (ffh_0)this.dN(ffh_02.LV());
        if (ffh_03 == ffh_02) {
            ffh_03.a(fnm2);
            this.a(Sn.d(this.bmS, ffh_02, this.dK(ffh_02.LV())));
        } else {
            sfN.error((Object)("Impossible de d\u00e9finir le prix sur un objet qui ne fait pas partie de l'inventaire: " + ffh_02.LV()));
        }
    }

    @Override
    public boolean c(wa_2 wa_22) {
        if (this.sfO != wa_22.adP) {
            sfN.warn((Object)("Mauvais uid \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.sfO + ", trouv\u00e9=" + wa_22.adP));
        }
        if (this.sfP.ordinal() != (wa_22.agE & 0xFF)) {
            sfN.warn((Object)("Mauvais type d'item requis \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + String.valueOf((Object)this.sfP) + ", trouv\u00e9=" + wa_22.agE));
        }
        if (this.bfa() != wa_22.agF) {
            sfN.warn((Object)("Mauvais nombre de slots la d\u00e9s\u00e9rialisation: attendu=" + this.bfa() + ", trouv\u00e9=" + wa_22.agF));
        }
        if (this.sfQ != wa_22.agG) {
            sfN.warn((Object)("Mauvaise packMax \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.sfQ + ", trouv\u00e9=" + wa_22.agG));
        }
        this.mbE = wa_22.agI;
        this.bl(wa_22.agJ);
        this.beQ();
        boolean bl = true;
        RU rU = this.beR();
        this.a(Sf.bnD);
        for (wb_1 wb_12 : wa_22.agH) {
            ffh_0 ffh_02 = (ffh_0)this.bmD.x(wb_12.agK);
            if (ffh_02 != null) {
                try {
                    if (!this.a(ffh_02, wb_12.adx)) {
                        bl = false;
                        sfN.error((Object)("Following item (" + String.valueOf(ffh_02) + ") can't be add to inventory for following slot : " + wb_12.adx + " itemSerial : " + ffh_02.getItem().fWz()));
                    }
                }
                catch (sa_0 sa_02) {
                    bl = false;
                    sfN.error((Object)sa_02);
                }
                catch (Sz sz) {
                    bl = false;
                    sfN.error((Object)sz);
                }
                catch (SD sD) {
                    bl = false;
                    sfN.error((Object)sD);
                }
                if (bl) continue;
                ffh_02.setItem(null);
                ffh_02.aZp();
                continue;
            }
            sfN.error((Object)("D\u00e9s\u00e9rialisation d'un MerchantItem null \u00e0 la position " + wb_12.adx));
            bl = false;
        }
        this.a(rU);
        return bl;
    }

    @Override
    public boolean b(wa_2 wa_22) {
        this.d(wa_22);
        TLongShortIterator tLongShortIterator = this.bmC.iterator();
        while (tLongShortIterator.hasNext()) {
            tLongShortIterator.advance();
            short s = tLongShortIterator.value();
            ffh_0 ffh_02 = (ffh_0)this.ai(s);
            if (ffh_02 == null) {
                sfN.error((Object)("Incoh\u00e9rence d'Inventory, l'item $" + tLongShortIterator.key() + " est r\u00e9f\u00e9renc\u00e9 mais n'est pas pr\u00e9sent dans le tableau"), (Throwable)new Exception());
                continue;
            }
            if (!ffh_02.bfh()) continue;
            wb_1 wb_12 = new wb_1();
            wb_12.adx = s;
            boolean bl = ffh_02.a(wb_12.agK);
            if (bl) {
                wa_22.agH.add(wb_12);
                continue;
            }
            sfN.error((Object)("Impossible de convertir l'item \u00e0 la position " + s + " sous forme d\u00e9s\u00e9rialis\u00e9e brute"));
            return false;
        }
        return true;
    }

    public void d(wa_2 wa_22) {
        wa_22.clear();
        wa_22.adP = this.sfO;
        wa_22.agE = (byte)this.sfP.ordinal();
        wa_22.agF = this.bfa();
        wa_22.agG = this.sfQ;
        wa_22.agI = this.mbE;
        wa_22.agJ = this.bfb();
    }

    @Override
    public void a(fgy<? extends fgv> fgy2) {
        if (this.sfR.contains(fgy2)) {
            sfN.error((Object)"Tentative d'ajout multiple du m\u00eame listener d'evenement sur un MerchantInventory");
            return;
        }
        this.sfR.add(fgy2);
    }

    public void b(fgy fgy2) {
        this.sfR.remove(fgy2);
    }

    protected final void c(fgv fgv2, ffh_0 ffh_02) {
        int n = this.sfR.size();
        for (int i = 0; i < n; ++i) {
            this.sfR.get(i).a(fgv2, ffh_02);
        }
    }

    @Override
    public String beT() {
        return "merchant";
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.c((wa_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((wa_2)object);
    }
}

