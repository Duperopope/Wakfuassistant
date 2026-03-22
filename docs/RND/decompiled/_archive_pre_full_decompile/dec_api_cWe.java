/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cWe
extends cWo {
    private static final Logger nRG = Logger.getLogger(cWe.class);
    private static final cWe nRH = new cWe();
    private fJb nRI;
    private fBz nGl;
    private bAP iqY = null;
    private alX ikv;

    public static cWe eVh() {
        return nRH;
    }

    private cWe() {
    }

    public void a(bAP bAP2) {
        this.iqY = bAP2;
    }

    @Override
    protected void d(ffV ffV2, short s) {
        super.d(ffV2, s);
        this.mZr.a(fnl.sIr);
    }

    @Override
    public boolean b(aAM aAM2) {
        if (aUE.cVJ().cVO().zV(aAM2.d())) {
            return false;
        }
        switch (aAM2.d()) {
            case 16200: 
            case 16236: 
            case 16600: {
                this.k(aAM2);
                return false;
            }
            case 19129: {
                nRG.warn((Object)"Unexpected deposit request in FleaFrame. Should not be possible anymore.");
                return false;
            }
            case 16690: {
                if (this.iqY.dPw()) {
                    fIQ.gCw().d(fIK.a(string -> this.k(aAM2)).l("market.question.unregister", new Object[0]).vG(cCP.mRE.byf()).abQ(1));
                } else {
                    this.k(aAM2);
                }
                return false;
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void k(aAM var1_1) {
        var2_2 = aUE.cVJ().cVK();
        if (var2_2 == null) {
            cWe.nRG.error((Object)"Pas de local player");
            return;
        }
        var3_3 = var2_2.dnx().dyX();
        switch (var1_1.d()) {
            case 16600: {
                var4_4 = (dad)var1_1;
                var5_6 = (bEz)var3_3.tj(this.iqY.dPv());
                if (var5_6 == null) {
                    cWe.nRG.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.iqY.dPv()));
                    return;
                }
                var6_8 = var4_4.getMerchantItem();
                try {
                    var5_6.dL(var6_8.LV());
                    if (!var5_6.d(var6_8, var4_4.getDestinationPosition())) {
                        var5_6.dL(var6_8.LV());
                        cWe.nRG.error((Object)"L'objet n a pas pu etre inser\u00e9 dans le sac marchand");
                    }
                }
                catch (SA var7_10) {
                    cWe.nRG.error((Object)"InventoryCapacityReachedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_10);
                }
                catch (Sz var7_11) {
                    cWe.nRG.error((Object)"ContentAlreadyPresentException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_11);
                }
                catch (SC var7_12) {
                    cWe.nRG.error((Object)"LastPositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_12);
                }
                catch (SD var7_13) {
                    cWe.nRG.error((Object)"PositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_13);
                }
                return;
            }
            case 16690: {
                var4_5 = (dad)var1_1;
                var5_7 = (bEz)var3_3.tj(this.iqY.dPv());
                if (var5_7 == null) {
                    cWe.nRG.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.iqY.dPv()));
                    return;
                }
                cRO.eMW().dzd().hC(false);
                var6_9 = false;
                var7_14 = null;
                var8_15 = null;
                var9_16 = var4_5.getMerchantItem();
                var10_17 = var9_16.getItem().LV();
                if (!var5_7.dM(var10_17)) {
                    cWe.nRG.error((Object)"Merchant inventory doesn't contain item, don't try to remove it");
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
                    cWe.nRG.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.getDestinationPosition()), (Throwable)var13_19);
                    var6_9 = true;
                }
                ** GOTO lbl67
lbl66:
                // 1 sources

                var7_14 = cVO.daL().dno().cw(var9_16.getItem());
lbl67:
                // 6 sources

                if (var7_14 != null && !var5_7.c(var9_16)) {
                    if (cVO.daL().dno().aa(var9_16.getItem()) == null) {
                        cWe.nRG.error((Object)"On vient d'ajouter un item aux inventaire, mais une erreur et survenu lors de la transaction et on arrive pas a le retirer");
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
                    cWe.nRG.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.getDestinationPosition()), (Throwable)var13_20);
                    var6_9 = true;
                }
                ** GOTO lbl91
lbl90:
                // 1 sources

                var7_14 = cVO.daL().dno().cw(var8_15);
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
                        aUE.cVJ().etu().d(var12_18);
                        aGm.cbu().d(new bUX(bUY.lrE, var9_16.getItem().avr(), var4_5.bfd(), 0));
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
    public void a(ayE ayE2, boolean bl) {
        if (!bl) {
            bnv bnv2 = cRO.eMW();
            bnv2.dyX().fVz();
            fSe.gFu().f("fleaDimensionalBag", bnv2);
            this.ikv = new cWf(this);
            fyw.gqw().a(this.ikv);
            super.a(ayE2, bl);
            fEy fEy2 = (fEy)cCJ.g("fleaDialog", 32768L);
            this.nGl = (fBz)fEy2.getElementMap().uH("fleaList");
            fEy fEy3 = (fEy)fEy2.getElementMap().uH("dimensionalBagWindow");
            this.nRI = new cWg(this, fEy3);
            this.nGl.a(this.nRI);
            this.bB(fEy2);
            fSe.gFu().f("editableDimensionalBag", bnv2);
            aUE.cVJ().b(cZi.eYU());
            aUE.cVJ().etu().a(ccQ.etX());
            fyw.gqw().d("wakfu.dimensionalBagFlea", cEn.class);
        }
    }

    @Override
    public void b(ayE ayE2, boolean bl) {
        if (!bl) {
            aUE.cVJ().cVK().i(false, true);
            this.nGl.b(this.nRI);
            this.nGl = null;
            this.nRI = null;
            fSe.gFu().vX("fleaDimensionalBag");
            fyw.gqw().b(this.ikv);
            fyw.gqw().tl("fleaDialog");
            fyw.gqw().tc("wakfu.dimensionalBagFlea");
            aUE.cVJ().a(cZi.eYU());
            aUE.cVJ().etu().b(ccQ.etX());
            this.iqY = null;
            super.b(ayE2, bl);
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
