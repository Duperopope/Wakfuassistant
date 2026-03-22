/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWe
 */
public class cwe_1
extends cwo_1 {
    private static final Logger nRG = Logger.getLogger(cwe_1.class);
    private static final cwe_1 nRH = new cwe_1();
    private fjb_1 nRI;
    private fbz_2 nGl;
    private bap_0 iqY = null;
    private alx_2 ikv;

    public static cwe_1 eVh() {
        return nRH;
    }

    private cwe_1() {
    }

    public void a(bap_0 bap_02) {
        this.iqY = bap_02;
    }

    @Override
    protected void d(ffV ffV2, short s) {
        super.d(ffV2, s);
        this.mZr.a(fnl.sIr);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aue_0.cVJ().cVO().zV(aam_22.d())) {
            return false;
        }
        switch (aam_22.d()) {
            case 16200: 
            case 16236: 
            case 16600: {
                this.k(aam_22);
                return false;
            }
            case 19129: {
                nRG.warn((Object)"Unexpected deposit request in FleaFrame. Should not be possible anymore.");
                return false;
            }
            case 16690: {
                if (this.iqY.dPw()) {
                    fiq_2.gCw().d(fik_2.a(string -> this.k(aam_22)).l("market.question.unregister", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                } else {
                    this.k(aam_22);
                }
                return false;
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void k(aam_2 var1_1) {
        var2_2 = aue_0.cVJ().cVK();
        if (var2_2 == null) {
            cwe_1.nRG.error((Object)"Pas de local player");
            return;
        }
        var3_3 = var2_2.dnx().dyX();
        switch (var1_1.d()) {
            case 16600: {
                var4_4 = (dad_0)var1_1;
                var5_6 = (bez_1)var3_3.tj(this.iqY.dPv());
                if (var5_6 == null) {
                    cwe_1.nRG.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.iqY.dPv()));
                    return;
                }
                var6_8 = var4_4.getMerchantItem();
                try {
                    var5_6.dL(var6_8.LV());
                    if (!var5_6.d(var6_8, var4_4.getDestinationPosition())) {
                        var5_6.dL(var6_8.LV());
                        cwe_1.nRG.error((Object)"L'objet n a pas pu etre inser\u00e9 dans le sac marchand");
                    }
                }
                catch (sa_0 var7_10) {
                    cwe_1.nRG.error((Object)"InventoryCapacityReachedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_10);
                }
                catch (Sz var7_11) {
                    cwe_1.nRG.error((Object)"ContentAlreadyPresentException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_11);
                }
                catch (sc_0 var7_12) {
                    cwe_1.nRG.error((Object)"LastPositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_12);
                }
                catch (SD var7_13) {
                    cwe_1.nRG.error((Object)"PositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_13);
                }
                return;
            }
            case 16690: {
                var4_5 = (dad_0)var1_1;
                var5_7 = (bez_1)var3_3.tj(this.iqY.dPv());
                if (var5_7 == null) {
                    cwe_1.nRG.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.iqY.dPv()));
                    return;
                }
                cro_2.eMW().dzd().hC(false);
                var6_9 = false;
                var7_14 = null;
                var8_15 = null;
                var9_16 = var4_5.getMerchantItem();
                var10_17 = var9_16.getItem().LV();
                if (!var5_7.dM(var10_17)) {
                    cwe_1.nRG.error((Object)"Merchant inventory doesn't contain item, don't try to remove it");
                    return;
                }
                if (var4_5.bfd() != -1 && var4_5.bfd() != var9_16.bfd()) ** GOTO lbl72
                if (var4_5.eEq() == -1L) ** GOTO lbl66
                var12_18 = fcI.ap(var2_2.Xi(), var4_5.eEq());
                if (var12_18 == null) ** GOTO lbl67
                try {
                    if (!var12_18.h(var9_16.getItem(), var4_5.getDestinationPosition())) ** GOTO lbl67
                    if (!var12_18.i(var9_16.getItem(), var4_5.getDestinationPosition())) ** GOTO lbl60
                    if (!var12_18.bt(var9_16.getItem())) {
                        var9_16.getItem().aZp();
                    }
                    var7_14 = var12_18;
                    ** GOTO lbl67
lbl60:
                    // 1 sources

                    var6_9 = true;
                }
                catch (Exception var13_19) {
                    cwe_1.nRG.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.getDestinationPosition()), (Throwable)var13_19);
                    var6_9 = true;
                }
                ** GOTO lbl67
lbl66:
                // 1 sources

                var7_14 = cvo_2.daL().dno().cw(var9_16.getItem());
lbl67:
                // 6 sources

                if (var7_14 != null && !var5_7.c(var9_16)) {
                    if (cvo_2.daL().dno().aa(var9_16.getItem()) == null) {
                        cwe_1.nRG.error((Object)"On vient d'ajouter un item aux inventaire, mais une erreur et survenu lors de la transaction et on arrive pas a le retirer");
                    }
                    var6_9 = true;
                }
                ** GOTO lbl94
lbl72:
                // 1 sources

                var8_15 = var9_16.getItem().fVT();
                var8_15.ak(var4_5.bfd());
                if (var4_5.eEq() == -1L) ** GOTO lbl90
                var12_18 = fcI.ap(var2_2.Xi(), var4_5.eEq());
                if (var12_18 == null) ** GOTO lbl91
                try {
                    if (!var12_18.h(var8_15, var4_5.getDestinationPosition())) ** GOTO lbl91
                    if (!var12_18.i(var8_15, var4_5.getDestinationPosition())) ** GOTO lbl84
                    if (!var12_18.bt(var8_15)) {
                        var8_15.aZp();
                    }
                    var7_14 = var12_18;
                    ** GOTO lbl91
lbl84:
                    // 1 sources

                    var6_9 = true;
                }
                catch (Exception var13_20) {
                    cwe_1.nRG.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.getDestinationPosition()), (Throwable)var13_20);
                    var6_9 = true;
                }
                ** GOTO lbl91
lbl90:
                // 1 sources

                var7_14 = cvo_2.daL().dno().cw(var8_15);
lbl91:
                // 6 sources

                if (var7_14 != null) {
                    var5_7.b(var9_16.LV(), -var4_5.bfd());
                }
lbl94:
                // 4 sources

                if (var7_14 != null) {
                    if (!var6_9) {
                        var12_18 = new cmH();
                        var12_18.nx(var5_7.Lx());
                        var12_18.mZ(var9_16.getItem().LV());
                        var12_18.nv(var7_14.Lx());
                        if (var8_15 != null) {
                            var12_18.ak(var4_5.bfd());
                            var12_18.nw(var8_15.LV());
                            var12_18.setDestinationPosition(var7_14.dK(var8_15.LV()));
                        } else {
                            var12_18.setDestinationPosition(var4_5.getDestinationPosition());
                        }
                        aue_0.cVJ().etu().d(var12_18);
                        agm_2.cbu().d(new bux_1(buy_2.lrE, var9_16.getItem().avr(), var4_5.bfd(), 0));
                    }
                } else {
                    aPd.e("bagsFull", new Object[0]);
                }
                return;
            }
        }
        super.b(var1_1);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bnv_2 bnv_22 = cro_2.eMW();
            bnv_22.dyX().fVz();
            fse_1.gFu().f("fleaDimensionalBag", bnv_22);
            this.ikv = new cwf_2(this);
            fyw_0.gqw().a(this.ikv);
            super.a(aye_22, bl);
            fey_2 fey_22 = (fey_2)ccj_2.g("fleaDialog", 32768L);
            this.nGl = (fbz_2)fey_22.getElementMap().uH("fleaList");
            fey_2 fey_23 = (fey_2)fey_22.getElementMap().uH("dimensionalBagWindow");
            this.nRI = new cwg_1(this, fey_23);
            this.nGl.a(this.nRI);
            this.bB(fey_22);
            fse_1.gFu().f("editableDimensionalBag", bnv_22);
            aue_0.cVJ().b(czi_2.eYU());
            aue_0.cVJ().etu().a(ccq_1.etX());
            fyw_0.gqw().d("wakfu.dimensionalBagFlea", cen_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().cVK().i(false, true);
            this.nGl.b(this.nRI);
            this.nGl = null;
            this.nRI = null;
            fse_1.gFu().vX("fleaDimensionalBag");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("fleaDialog");
            fyw_0.gqw().tc("wakfu.dimensionalBagFlea");
            aue_0.cVJ().a(czi_2.eYU());
            aue_0.cVJ().etu().b(ccq_1.etX());
            this.iqY = null;
            super.b(aye_22, bl);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

