/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.commonIn.CosmeticPresetsCommand;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cFe
 */
@fyf_0
public class cfe_1
extends cff_1 {
    public static final String PACKAGE = "wakfu.inventory";
    public static final String mVv = "_AnimStatique";
    private static final ccf_2 mVw = new ccf_2();
    private static long duS;
    protected static final Logger mVx;
    private static fey_2 mVy;
    private static final ArrayList<cfi_2> mVz;
    private static fka_1 jjX;

    public static void addListener(cfi_2 cfi_22) {
        mVz.add(cfi_22);
    }

    public static void removeListener(cfi_2 cfi_22) {
        mVz.remove(cfi_22);
    }

    public static void inventoryDragSearchedItem(flu_1 flu_12, bgl_0 bgl_02) {
        if (!(flu_12.getValue() instanceof ffV)) {
            return;
        }
        ffs_0 ffs_02 = bgl_02.dcP().dod().ta(((ffV)flu_12.getValue()).LV());
        if (ffs_02 != null) {
            cfe_1.inventoryDragItem(flu_12, ((bde_0)ffs_02).dRg(), bgl_02);
        }
    }

    public static void inventoryDragItem(flu_1 flu_12, bgj_1 bgj_12, bgl_0 bgl_02) {
        Object object = flu_12.getValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        object = bgj_12.a(ffV2);
        if (!(object instanceof bdh_0)) {
            return;
        }
        bdh_0 bdh_02 = (bdh_0)object;
        cfe_1.inventoryDragItem(flu_12, bdh_02, bgl_02);
    }

    public static void inventoryDragItem(flu_1 flu_12, bdh_0 bdh_02, bgl_0 bgl_02) {
        bde_0 bde_02 = bdh_02.dNO();
        Object object = flu_12.getValue();
        if (object != null && object instanceof ffV) {
            if (fyw_0.gqw().to("splitStackDialog")) {
                fyw_0.gqw().tl("splitStackDialog");
            }
            ffV ffV2 = (ffV)object;
            short s = bde_02.dK(ffV2.LV());
            duS = ffV2.LV();
            che_1.setSourceUniqueId(bde_02.Lx());
            che_1.setSourcePosition((byte)s);
            short s2 = aue_0.cVJ().cVK().aWP();
            bgl_0 bgl_03 = bgl_02 == null || bgl_02.aXd() ? cts_1.MC(s2) : bgl_02;
            che_1.setSourceCharacter(bgl_03);
            fse_1.gFu().f("exchange.sourceBag", bde_02);
            fse_1.gFu().f("exchange.sourcePosition", s);
            cfe_1.onDragItem(ffV2);
        }
    }

    public static void dropItem(fiq_1 fiq_12) {
        fse_1.gFu().vX("exchange.sourceBag");
        fse_1.gFu().vX("exchange.sourcePosition");
        if (fiq_12 instanceof fla_2 || fiq_12 instanceof flc_2) {
            cfe_1.onDropItem();
        }
    }

    public static void onDropItem() {
        for (cfi_2 cfi_22 : mVz) {
            try {
                cfi_22.dvW();
            }
            catch (Exception exception) {
                mVx.error((Object)exception);
            }
        }
        if (cvu_2.eQx()) {
            cvu_2.eTO().dLN();
        }
    }

    public static void onDragItem(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bsl_0.jfZ.dFt() != null) {
            return;
        }
        if (cvu_2.eQx()) {
            cvu_2.eTO().onDragItem(ffV2);
        }
        for (cfi_2 cfi_22 : mVz) {
            try {
                cfi_22.p(ffV2);
            }
            catch (Exception exception) {
                mVx.error((Object)exception);
            }
        }
    }

    public static void transferItemsToCharacter(flp_2 flp_22, bgt_0 bgt_02) {
        fcI.a(bgt_02.Xi(), (T bgt_03) -> {
            if (bgt_03.Sn() == bgt_02.Sn()) {
                return;
            }
            dbr_0 dbr_02 = new dbr_0((bgt_0)bgt_03, bgt_02);
            aaw_1.bUq().h(dbr_02);
        });
    }

    public static void openHeroView(flp_2 flp_22, fey_2 fey_22, bhJ bhJ2) {
        if (!fcI.fSM()) {
            return;
        }
        int n = flp_22.getScreenX();
        int n2 = flp_22.getScreenY();
        bgl_0 bgl_02 = bwa_0.jwi.aj(bhJ2);
        if (bgl_02 == null) {
            return;
        }
        cvo_2.eUK().b(bgl_02, "inventoryOnlyDialog", "equipInventWindow", n, n2, fey_22);
    }

    public static void openCompanionView(flp_2 flp_22, fey_2 fey_22, bli_1 bli_12) {
        cvo_2.eUK().a(cts_1.MC(bli_12.xT()), "equipInventWindow", flp_22.getScreenX(), flp_22.getScreenY());
    }

    public static void itemDropOut(flc_2 flc_22) {
        cfe_1.dropItem(flc_22);
        if (flc_22.getValue() instanceof bEb) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bsl_0.jfZ.dFt() != null) {
            return;
        }
        if (cfe_1.a(flc_22)) {
            return;
        }
        if (!aue_0.cVJ().cVK().a(evv_1.oxi)) {
            aPd.e("error.playerNotSubscribed", new Object[0]);
            return;
        }
        Object object = flc_22.getValue();
        if (object instanceof ffV) {
            ffV ffV2 = (ffV)object;
            if (flc_22.gDM() == fbj_1.getInstance() && ffV2.LV() == duS) {
                cfe_1.deleteItem(ffV2);
            }
        }
    }

    private static boolean a(@NotNull flc_2 flc_22) {
        fes_2 fes_22 = flc_22.gDM();
        if (fes_22 == null) {
            return false;
        }
        fhs_2 fhs_22 = fes_22.getElementMap();
        if (fhs_22 == null) {
            return false;
        }
        String string = fhs_22.gAt();
        if (string == null) {
            return false;
        }
        if (!"inventoryDialog".equals(string) && !string.startsWith("inventoryOnlyDialog")) {
            return false;
        }
        Object object = fse_1.gFu().i("characterSheet", fhs_22);
        if (!(object instanceof bgl_0)) {
            return false;
        }
        bgl_0 bgl_02 = (bgl_0)object;
        aef_2 aef_22 = bgl_02.dcP();
        if (!(aef_22 instanceof bgt_0)) {
            return false;
        }
        bgt_0 bgt_02 = (bgt_0)aef_22;
        Object object2 = flc_22.getValue();
        if (!(object2 instanceof ffV)) {
            return false;
        }
        aef_22 = (ffV)object2;
        return cfe_1.a(flc_22, bgt_02, (ffV)aef_22);
    }

    private static boolean a(@NotNull flc_2 flc_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        boolean bl;
        Object object;
        Optional<bgx_1> optional;
        fcv_1 fcv_12 = flc_22.gDM().getParentOfType(fcv_1.class);
        long l = -1L;
        if (fcv_12 != null && (optional = fcv_12.getItemValue()) instanceof bDy) {
            object = (bDy)((Object)optional);
            l = ((bDy)object).dQS().orElse(-1L);
        }
        object = bgt_02.dno().sY(l);
        optional = cfe_1.a(flc_22.getDragNDropable(), ffV2);
        if (optional.isPresent()) {
            aaw_1.bUq().h(new dbn_0(optional.get(), bgt_02, (bde_0)object));
            return true;
        }
        if (object == null && (object = bgt_02.dno().cu(ffV2)) == null) {
            return false;
        }
        che_1.setDestinationUniqueId(((ffs_0)object).Lx());
        short s = ((ffs_0)object).cq(ffV2);
        if (s < 0) {
            return false;
        }
        che_1.setDestinationPosition(s);
        boolean bl2 = flc_22.gDT();
        boolean bl3 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        boolean bl4 = bl = ffV2.bfd() > 1 && bl2 ^ bl3;
        if (bl) {
            che_1.setDestinationUniqueId(((ffs_0)object).Lx());
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setItem(ffV2);
            che_1.setMessageType((short)16135);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.cY((short)flc_22.getScreenX());
            dbl_02.cZ((short)flc_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.setSourcePosition(che_1.getSourcePosition());
            dbl_03.setSourceUniqueId(che_1.getSourceUniqueId());
            dbl_03.setDestinationUniqueId(((ffs_0)object).Lx());
            dbl_03.setDestinationPosition(che_1.getDestinationPosition());
            dbl_03.setSourceCharacter(che_1.getSourceCharacter());
            dbl_03.setItem(ffV2);
            dbl_03.ak((short)-1);
            dbl_03.lK(16135);
            aaw_1.bUq().h(dbl_03);
        }
        return true;
    }

    public static void dropItemOnCharacterIcon(fla_2 fla_22) {
        boolean bl;
        cfe_1.dropItem(fla_22);
        Object object = fla_22.getValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        object = ((fhv_1)fla_22.gBE()).getParent().getParentOfType(fcv_1.class).getItemValue();
        if (!(object instanceof bgt_0)) {
            return;
        }
        bgt_0 bgt_02 = (bgt_0)object;
        Optional<bgx_1> optional = cfe_1.getSelectionContainingItem(fla_22, ffV2);
        if (optional.isPresent()) {
            aaw_1.bUq().h(new dbn_0(optional.get(), bgt_02, null));
            return;
        }
        ffs_0 ffs_02 = bgt_02.dno().cu(ffV2);
        if (ffs_02 == null) {
            return;
        }
        che_1.setDestinationUniqueId(ffs_02.Lx());
        short s = ffs_02.cq(ffV2);
        if (s < 0) {
            return;
        }
        che_1.setDestinationPosition(s);
        boolean bl2 = fla_22.gDT();
        boolean bl3 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        boolean bl4 = bl = ffV2.bfd() > 1 && bl2 ^ bl3;
        if (bl) {
            che_1.setDestinationUniqueId(ffs_02.Lx());
            che_1.setMaxQuantity(ffV2.bfd());
            che_1.setItem(ffV2);
            che_1.setMessageType((short)16135);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.setSourcePosition(che_1.getSourcePosition());
            dbl_03.setSourceUniqueId(che_1.getSourceUniqueId());
            dbl_03.setDestinationUniqueId(ffs_02.Lx());
            dbl_03.setDestinationPosition(che_1.getDestinationPosition());
            dbl_03.setSourceCharacter(che_1.getSourceCharacter());
            dbl_03.setItem(ffV2);
            dbl_03.ak((short)-1);
            dbl_03.lK(16135);
            aaw_1.bUq().h(dbl_03);
        }
    }

    public static void dropBag(fiq_1 fiq_12) {
        if (!(fiq_12 instanceof fla_2)) {
            return;
        }
        fla_2 fla_22 = (fla_2)fiq_12;
        cfe_1.onDropItem();
        Object object2 = fla_22.getValue();
        if (object2 instanceof ffV) {
            ffV ffV2 = (ffV)object2;
            object2 = Optional.ofNullable(fla_22.gDI()).map(fbd_12 -> fbd_12.getParentOfType(fcv_1.class)).map(fcv_1::getItemValue).filter(object -> object instanceof bdh_0).map(object -> (bdh_0)object).map(bdh_0::dNO);
            Optional<bgx_1> optional = cfe_1.getSelectionContainingItem(fla_22, ffV2);
            if (optional.isPresent()) {
                if (((Optional)object2).isEmpty()) {
                    return;
                }
                bgt_0 bgt_02 = (bgt_0)fcI.ab(bbs_2.xl(), ((Optional)object2).get().Lx());
                if (bgt_02 == null) {
                    return;
                }
                aaw_1.bUq().h(new dbn_0(optional.get(), bgt_02, (bde_0)((Optional)object2).get()));
                return;
            }
            if (ffV2.fWi().aIi() == 218 || ffV2.fWi().aIi() == 399) {
                bso_0 bso_02 = bsl_0.jfZ.dFt();
                if (bso_02 != null && ffV2.LV() == bso_02.dFv()) {
                    dbf_0 dbf_02 = new dbf_0();
                    dbf_02.lK(19598);
                    dbf_02.setExchangeId(bso_02.Sn());
                    dbf_02.setItem(ffV2);
                    dbf_02.NN(ffV2.bfd());
                    aaw_1.bUq().h(dbf_02);
                    bso_02.kl(-1L);
                    return;
                }
                fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
                byte by = (byte)(fcv_12.getCollection().getTableIndex(fcv_12) + 1);
                short s = che_1.getSourcePosition();
                dbl_0 dbl_02 = new dbl_0();
                dbl_02.setItem(ffV2);
                dbl_02.setSourcePosition(s);
                dbl_02.setDestinationPosition(by);
                dbl_02.setDestinationCharacter(bwa_0.jwi.aj(cvo_2.daL()));
                dbl_02.setSourceUniqueId(che_1.getSourceUniqueId());
                if (cvo_2.daL().dno().gh(by) == null) {
                    dbl_02.lK(19261);
                } else {
                    dbl_02.lK(19173);
                }
                aaw_1.bUq().h(dbl_02);
            } else {
                short s = che_1.getSourcePosition();
                if (((Optional)object2).isPresent()) {
                    boolean bl;
                    bde_0 bde_02 = ((Optional)object2).get();
                    che_1.setDestinationUniqueId(bde_02.Lx());
                    short s2 = bde_02.cp(ffV2);
                    if (s2 == -1) {
                        s2 = bde_02.beO();
                    }
                    if (s2 == -1) {
                        fiq_2.gCw().d(fik_2.gBZ().l("error.bagFull", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
                        return;
                    }
                    che_1.setDestinationPosition(s2);
                    boolean bl2 = fla_22.gDT();
                    boolean bl3 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
                    boolean bl4 = bl = ffV2.bfd() > 1 && bl2 ^ bl3;
                    if (bl) {
                        che_1.setDestinationUniqueId(bde_02.Lx());
                        che_1.setMaxQuantity(ffV2.bfd());
                        che_1.setItem(ffV2);
                        che_1.setMessageType((short)16135);
                        dbl_0 dbl_03 = new dbl_0();
                        dbl_03.setItem(ffV2);
                        dbl_03.cY((short)fla_22.getScreenX());
                        dbl_03.cZ((short)fla_22.getScreenY());
                        dbl_03.lK(16021);
                        aaw_1.bUq().h(dbl_03);
                    } else {
                        dbl_0 dbl_04 = new dbl_0();
                        dbl_04.setSourcePosition(s);
                        dbl_04.setSourceUniqueId(che_1.getSourceUniqueId());
                        dbl_04.setDestinationUniqueId(bde_02.Lx());
                        dbl_04.setDestinationPosition(che_1.getDestinationPosition());
                        dbl_04.setSourceCharacter(che_1.getSourceCharacter());
                        dbl_04.setItem(ffV2);
                        dbl_04.ak((short)-1);
                        dbl_04.lK(16135);
                        aaw_1.bUq().h(dbl_04);
                    }
                }
            }
        } else {
            object2 = fla_22.getValue();
            if (object2 instanceof bdh_0) {
                bdh_0 bdh_02 = (bdh_0)object2;
                object2 = bdh_02.dNO();
                dae_0 dae_02 = new dae_0();
                fcv_1 fcv_13 = fla_22.gDI().getRenderableParent();
                dae_02.ay((byte)(fcv_13.getCollection().getTableIndex(fcv_13) + 1));
                dae_02.gj(((ffs_0)object2).Lx());
                dae_02.lK(18684);
                aaw_1.bUq().h(dae_02);
            }
        }
    }

    public static boolean validateInventoryDrop(fbd_1 fbd_12, Object object, fbd_1 fbd_13, Object object2, Object object3) {
        if (object instanceof ffV) {
            return true;
        }
        if (object instanceof bea_0) {
            return true;
        }
        if (object instanceof bdh_0) {
            return true;
        }
        return object instanceof bnq_1;
    }

    public static boolean inventoryDropItem(fla_2 fla_22, bgt_0 bgt_02, bgj_1 bgj_12) {
        short s;
        Object object = fla_22.gDJ();
        if (!(object instanceof ffV)) {
            return true;
        }
        ffV ffV2 = (ffV)object;
        object = bgj_12.a(ffV2);
        if (!(object instanceof bdh_0)) {
            return true;
        }
        bdh_0 bdh_02 = (bdh_0)object;
        Object object2 = fla_22.gDJ();
        if (object2 instanceof ffV) {
            ffV ffV3 = (ffV)object2;
            if (!((object2 = bgj_12.a(ffV3)) instanceof bdh_0)) {
                return true;
            }
            bdh_0 bdh_03 = (bdh_0)object2;
            s = bdh_03.dNO().dK(ffV3.LV());
        } else {
            s = -1;
        }
        return cfe_1.inventoryDropItem(fla_22, bgt_02, bdh_02, s);
    }

    public static boolean inventoryDropItem(fiq_1 fiq_12, bgt_0 bgt_02, bdh_0 bdh_02) {
        return cfe_1.inventoryDropItem(fiq_12, bgt_02, bdh_02, (short)-1);
    }

    public static boolean inventoryDropItem(fiq_1 fiq_12, bgt_0 bgt_02, bdh_0 bdh_02, short s) {
        if (!(fiq_12 instanceof fla_2)) {
            return true;
        }
        fla_2 fla_22 = (fla_2)fiq_12;
        Object object = fla_22.getValue();
        if (object == null) {
            return true;
        }
        if (object instanceof bgs_2) {
            bgs_2 bgs_22 = (bgs_2)object;
            if (bgs_22.bfb()) {
                mVx.warn((Object)"Dropped a locked item in inventory, this shouldn't be possible");
                return false;
            }
            cfe_1.a(fla_22, bgs_22, bdh_02);
            return true;
        }
        if (object instanceof ffV) {
            cfe_1.inventoryDropRealItem(fla_22, bgt_02, bdh_02, (ffV)object, s);
        } else if (object instanceof bea_0) {
            cfe_1.inventoryDropMerchantItem(fla_22, bdh_02, (bea_0)object, s);
        } else if (object instanceof bdh_0) {
            cfe_1.inventoryDropBagView(fla_22, bdh_02, (bdh_0)object, s);
        } else if (object instanceof bnq_1) {
            cfe_1.inventoryDropGemItem(fla_22, bdh_02, (bnq_1)object, s);
        } else {
            return false;
        }
        return true;
    }

    private static void a(fla_2 fla_22, bgs_2 bgs_22, bdh_0 bdh_02) {
        bde_0 bde_02 = bdh_02.dNO();
        fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
        byte by = (byte)fcv_12.getCollection().getTableIndex(fcv_12);
        if (bgs_22.bfd() == 1) {
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(bgs_22);
            dbl_02.ak((short)1);
            dbl_02.setDestinationUniqueId(bde_02.Lx());
            dbl_02.setDestinationPosition(by);
            dbl_02.lK(16914);
            aaw_1.bUq().h(dbl_02);
            return;
        }
        che_1.setMaxQuantity(bgs_22.bfd());
        che_1.setItem(bgs_22);
        che_1.setDestinationPosition(by);
        che_1.setDestinationUniqueId(bde_02.Lx());
        che_1.setMessageType((short)16914);
        dbl_0 dbl_03 = new dbl_0();
        dbl_03.setItem(bgs_22);
        dbl_03.cY((short)fla_22.getScreenX());
        dbl_03.cZ((short)fla_22.getScreenY());
        dbl_03.lK(16021);
        aaw_1.bUq().h(dbl_03);
    }

    public static void prepareSplitStack(short s, bde_0 bde_02, fla_2 fla_22) {
        che_1.setDestinationUniqueId(bde_02.Lx());
        if (s == -1) {
            fcv_1 fcv_12 = fla_22.gDI().getRenderableParent();
            s = (short)fcv_12.getCollection().getTableIndex(fcv_12);
        }
        che_1.setDestinationPosition(s);
    }

    public static void inventoryDropRealItem(fla_2 fla_22, bgt_0 bgt_02, bdh_0 bdh_02, ffV ffV2, short s) {
        if (ffV2.equals(cgv_1.getDraggedItem())) {
            return;
        }
        if (cft_2.checkDragItemDropped(ffV2)) {
            return;
        }
        bde_0 bde_02 = bdh_02.dNO();
        cfe_1.prepareSplitStack(s, bde_02, fla_22);
        boolean bl = fla_22.gDT();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        bgl_0 bgl_02 = bwa_0.jwi.aj((bhJ)fcI.ab(aue_0.cVJ().cVK().Xi(), bde_02.Lx()));
        cfe_1.dropItem(fla_22);
        boolean bl3 = ffV2.bfd() > 1 && bl ^ bl2;
        fsf_1 fsf_12 = fse_1.gFu().getProperty("temporaryInventory.currentDragItemId");
        if (aue_0.cVJ().cVK().dnv() && fsf_12 != null && ffV2.LV() == fsf_12.bGK()) {
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.lK(18339);
            dbl_02.setItem(ffV2);
            dbl_02.ak(ffV2.bfd());
            dbl_02.setDestinationUniqueId(che_1.getDestinationUniqueId());
            dbl_02.setDestinationPosition(che_1.getDestinationPosition());
            aaw_1.bUq().h(dbl_02);
            return;
        }
        short s2 = -1;
        if (ffV2.LV() == cdt_1.getDraggedItemId()) {
            s2 = 19660;
            cdt_1.setDraggedItemId(-1L);
        } else if (ffV2.LV() == chi_2.getDraggedItemId()) {
            s2 = 17100;
            chi_2.setDraggedItemId(-1L);
        } else if (ffV2.LV() == cdb_2.getDraggedItemId()) {
            cdb_2.setDraggedItemId(-1L);
            s2 = 16514;
        } else {
            if (ffV2.LV() == cdv_1.getDraggedItemId()) {
                cdv_1.setDraggedItemId(-1L);
                fcv_1 fcv_12 = fla_22.gDH().getRenderableParent();
                short s3 = (short)fcv_12.getCollection().getTableIndex(fcv_12);
                cdv_1.removeBook(s3);
                return;
            }
            if (ffV2.LV() == cez_1.getDraggedItemId()) {
                cez_1.setDraggedItemId(-1L);
                cez_1.removeItem((ffT)ffV2);
                return;
            }
            if (ffV2.LV() == cea_1.getDraggedItemId()) {
                cea_1.setDraggedItemId(-1L);
                cea_1.unequipItem(ffV2.avr());
                return;
            }
            if ("heroBuildDialog".equals(fla_22.gDH().getElementMap().gAt())) {
                return;
            }
        }
        Optional<bgx_1> optional = cfe_1.getSelectionContainingItem(fla_22, ffV2);
        if (optional.isPresent()) {
            aaw_1.bUq().h(new dbn_0(optional.get(), bgt_02, bdh_02.dNO()));
            return;
        }
        if (s2 != -1) {
            if (bl3) {
                che_1.setMaxQuantity(ffV2.bfd());
                che_1.setItem(ffV2);
                che_1.setMessageType(s2);
                che_1.setDestinationCharacter(bgl_02);
                dbl_0 dbl_03 = new dbl_0();
                dbl_03.setItem(ffV2);
                dbl_03.cY((short)fla_22.getScreenX());
                dbl_03.cZ((short)fla_22.getScreenY());
                dbl_03.lK(16021);
                aaw_1.bUq().h(dbl_03);
            } else {
                dbl_0 dbl_04 = new dbl_0();
                dbl_04.lK(s2);
                dbl_04.setItem(ffV2);
                dbl_04.ak(ffV2.bfd());
                dbl_04.setDestinationUniqueId(che_1.getDestinationUniqueId());
                dbl_04.setDestinationPosition(che_1.getDestinationPosition());
                dbl_04.setDestinationCharacter(bgl_02);
                aaw_1.bUq().h(dbl_04);
            }
            return;
        }
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 != null) {
            if (ffV2.LV() == bso_02.dFv()) {
                if (bl3) {
                    che_1.setMaxQuantity(ffV2.bfd());
                    che_1.setItem(ffV2);
                    che_1.setExchangeId(bso_02.Sn());
                    che_1.setMessageType((short)19598);
                    dbl_0 dbl_05 = new dbl_0();
                    dbl_05.setItem(ffV2);
                    dbl_05.cY((short)fla_22.getScreenX());
                    dbl_05.cZ((short)fla_22.getScreenY());
                    dbl_05.lK(16021);
                    aaw_1.bUq().h(dbl_05);
                } else {
                    dbf_0 dbf_02 = new dbf_0();
                    dbf_02.lK(19598);
                    dbf_02.setExchangeId(bso_02.Sn());
                    dbf_02.setItem(ffV2);
                    dbf_02.NN(ffV2.bfd());
                    aaw_1.bUq().h(dbf_02);
                }
                bso_02.kl(-1L);
            }
        } else if (ffV2.LV() == duS) {
            boolean bl4;
            if (che_1.getSourcePosition() == che_1.getDestinationPosition() && bde_02.Lx() == che_1.getSourceUniqueId()) {
                return;
            }
            ffV ffV3 = bde_02.eQ(che_1.getDestinationPosition());
            boolean bl5 = bl4 = ffV3 != null && !ffV3.n(ffV2);
            if (ffV3 != null && bl4 && bdq_0.dRC().ab(ffV3)) {
                String string = aum_0.cWf().c("inventory.swap.locked.items", new Object[0]);
                byj_1.epo().a(byc_1.c(byh_1.lAA, string));
                return;
            }
            if (bl3 && !bl4) {
                che_1.setDestinationUniqueId(bde_02.Lx());
                che_1.setMaxQuantity(ffV2.bfd());
                che_1.setItem(ffV2);
                che_1.setMessageType((short)16135);
                dbl_0 dbl_06 = new dbl_0();
                dbl_06.setItem(ffV2);
                dbl_06.cY((short)fla_22.getScreenX());
                dbl_06.cZ((short)fla_22.getScreenY());
                dbl_06.setSourceCharacter(che_1.getSourceCharacter());
                dbl_06.setDestinationCharacter(bgl_02);
                dbl_06.lK(16021);
                aaw_1.bUq().h(dbl_06);
            } else {
                dbl_0 dbl_07 = new dbl_0();
                dbl_07.setDestinationPosition(che_1.getDestinationPosition());
                dbl_07.setSourcePosition(che_1.getSourcePosition());
                dbl_07.setSourceUniqueId(che_1.getSourceUniqueId());
                dbl_07.setDestinationUniqueId(bde_02.Lx());
                dbl_07.setSourceCharacter(che_1.getSourceCharacter());
                dbl_07.setDestinationCharacter(bgl_02);
                dbl_07.setItem(ffV2);
                dbl_07.ak((short)-1);
                dbl_07.lK(16135);
                aaw_1.bUq().h(dbl_07);
            }
        }
    }

    public static Optional<bgx_1> getSelectionContainingItem(fla_2 fla_22, ffV ffV2) {
        return cfe_1.a(fla_22.gDH(), ffV2);
    }

    private static Optional<bgx_1> a(fes_2 fes_22, ffV ffV2) {
        if (fes_22 == null) {
            return Optional.empty();
        }
        fhs_2 fhs_22 = fes_22.getElementMap();
        if (fhs_22 == null) {
            return Optional.empty();
        }
        Object object = fse_1.gFu().i("inventorySelectionView", fhs_22);
        if (!(object instanceof bgx_1)) {
            return Optional.empty();
        }
        bgx_1 bgx_12 = (bgx_1)object;
        return bgx_12.lo(ffV2.LV()) && bgx_12.dUE() > 1 ? Optional.of(bgx_12) : Optional.empty();
    }

    public static void inventoryDropBagView(fla_2 fla_22, bdh_0 bdh_02, bdh_0 bdh_03, short s) {
        cfe_1.prepareSplitStack(s, bdh_02.dNO(), fla_22);
        bde_0 bde_02 = bdh_03.dNO();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setDestinationPosition(che_1.getDestinationPosition());
        dbl_02.setDestinationUniqueId(bdh_02.dNO().Lx());
        dbl_02.setSourceUniqueId(bde_02.Lx());
        dbl_02.lK(19851);
        aaw_1.bUq().h(dbl_02);
    }

    public static void inventoryDropGemItem(fla_2 fla_22, bdh_0 bdh_02, bnq_1 bnq_12, short s) {
        cfe_1.prepareSplitStack(s, bdh_02.dNO(), fla_22);
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setDestinationUniqueId(che_1.getDestinationUniqueId());
        dbl_02.setDestinationPosition(che_1.getDestinationPosition());
        dbl_02.setDestinationUniqueId(bdh_02.dNO().Lx());
        dbl_02.setItem(bnq_12.dzy());
        dbl_02.ay(bnq_12.dzz());
        dbl_02.ak((short)1);
        dbl_02.lK(17428);
        aaw_1.bUq().h(dbl_02);
    }

    public static void inventoryDropMerchantItem(fla_2 fla_22, bdh_0 bdh_02, bea_0 bea_02, short s) {
        cfe_1.prepareSplitStack(s, bdh_02.dNO(), fla_22);
        boolean bl = fla_22.gDT();
        boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljt);
        if (bea_02.bfd() > 1 && bl ^ bl2) {
            che_1.setMaxQuantity(bea_02.bfd());
            che_1.setMerchantItem(bea_02);
            che_1.setMessageType((short)16690);
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(bea_02.getItem());
            dbl_02.cY((short)fla_22.getScreenX());
            dbl_02.cZ((short)fla_22.getScreenY());
            dbl_02.lK(16021);
            aaw_1.bUq().h(dbl_02);
        } else {
            dad_0 dad_02 = new dad_0();
            dad_02.setMerchantItem(bea_02);
            dad_02.setDestinationPosition(che_1.getDestinationPosition());
            dad_02.oR(che_1.getDestinationUniqueId());
            dad_02.lK(16690);
            aaw_1.bUq().h(dad_02);
        }
    }

    public static void onPvpInventoryDoubleClick(flg_2 flg_22) {
        ffV ffV2 = (ffV)flg_22.getItemValue();
        bgt_0 bgt_02 = cvo_2.daL();
        if (!(ffV2 instanceof bgs_2)) {
            return;
        }
        bgs_2 bgs_22 = (bgs_2)ffV2;
        if (!flg_22.gEk()) {
            return;
        }
        if (bgs_22.bfb()) {
            return;
        }
        if (bgt_02.dkZ() != null) {
            aPd.e("error.impossibleDuringFight", new Object[0]);
            return;
        }
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(bgs_22);
        dbl_02.ak(bgs_22.bfd());
        dbl_02.setDestinationCharacter(bgl_02);
        dbl_02.setDestinationUniqueId(-1L);
        dbl_02.setDestinationPosition((short)-1);
        dbl_02.lK(16914);
        aaw_1.bUq().h(dbl_02);
    }

    public static void onItemDoubleClick(flg_2 flg_22, bgj_1 bgj_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        object = bgj_12.a(ffV2);
        if (!(object instanceof bdh_0)) {
            return;
        }
        bdh_0 bdh_02 = (bdh_0)object;
        cfe_1.onItemDoubleClick(flg_22, bdh_02);
    }

    public static void onItemDoubleClick(flg_2 flg_22, bdh_0 bdh_02) {
        if (flg_22.getItemValue() instanceof bEb) {
            return;
        }
        if (fyw_0.gqw().to("splitStackDialog")) {
            fyw_0.gqw().tl("splitStackDialog");
        }
        if (cvo_2.eUK().eUL() != null) {
            return;
        }
        ffV ffV2 = (ffV)flg_22.getItemValue();
        boolean bl = bdq_0.dRC().ab(ffV2);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        che_1.setDestinationPosition((short)-1);
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 != null) {
            if (bl) {
                return;
            }
            ffs_0 ffs_02 = fcI.aq(bgt_02.Xi(), ffV2.LV());
            if (ffs_02 == null) {
                return;
            }
            short s = ffs_02.dK(ffV2.LV());
            fse_1.gFu().f("exchange.sourceBag", bdh_02.dNO());
            fse_1.gFu().f("exchange.sourcePosition", s);
            dbf_0 dbf_02 = new dbf_0();
            dbf_02.lK(17012);
            dbf_02.setExchangeId(bso_02.Sn());
            dbf_02.setItem(ffV2);
            dbf_02.NN(ffV2.bfd());
            aaw_1.bUq().h(dbf_02);
            return;
        }
        if (fyw_0.gqw().to("havenWorldResourcesCollectorDialog")) {
            if (bl || bEf.ap(ffV2)) {
                return;
            }
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.gj(ffV2.LV());
            dbl_02.ak(ffV2.bfd());
            dbl_02.lK(16215);
            aaw_1.bUq().h(dbl_02);
            return;
        }
        if (fyw_0.gqw().to("storageBoxDialog")) {
            if (bl) {
                return;
            }
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.gj(ffV2.LV());
            dbl_03.az(ffV2.bfd());
            dbl_03.setDestinationPosition(che_1.getDestinationPosition());
            dbl_03.lK(17635);
            aaw_1.bUq().h(dbl_03);
        } else if (fyw_0.gqw().to("freeCollectMachineDialog")) {
            if (bl) {
                return;
            }
            dbl_0 dbl_04 = new dbl_0();
            dbl_04.gj(ffV2.LV());
            dbl_04.az(ffV2.bfd());
            dbl_04.lK(16784);
            aaw_1.bUq().h(dbl_04);
        } else if (fyw_0.gqw().to("accountChestDialog")) {
            if (bl) {
                return;
            }
            if (!csb_1.nEA.eNG().dtg()) {
                dbl_0 dbl_05 = new dbl_0();
                dbl_05.gj(ffV2.LV());
                dbl_05.setItem(ffV2);
                dbl_05.ak(ffV2.bfd());
                dbl_05.fa(csb_1.nEA.eNG().getId());
                dbl_05.setDestinationPosition((short)-1);
                dbl_05.lK(19259);
                aaw_1.bUq().h(dbl_05);
            }
        } else if (aue_0.cVJ().c(cwl_1.eVl()) && cwl_1.eVy()) {
            cfp_1.a((flp_2)flg_22, (Object)ffV2);
        } else if (ffV2.fWs() || ffV2.fWt()) {
            if (!(flg_22.gDT() || flg_22.gDQ() || flg_22.gDR())) {
                ctj_2.a(ffV2, (fcv_1)flg_22.gBD());
            }
        } else if (ffV2.dOg().fbT() && ffV2.dOg().fUZ() == null) {
            if (flg_22.gEk() && !flg_22.gDT() && !flg_22.gDQ() && !flg_22.gDR()) {
                cfe_1.a(ffV2, bdh_02.dNO());
            }
        } else if (ffV2.dOg().dGh().fZq().length == 0 || ffV2.dOg().fUZ() != null) {
            cgw_2.useUsableItem(ffV2, true);
        }
    }

    public static void sendRollRequest(ffV ffV2, @Nullable fiq_1 fiq_12) {
        fcv_1 fcv_12;
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19350);
        dae_02.gj(ffV2.LV());
        aaw_1.bUq().h(dae_02);
        fcv_1 fcv_13 = fcv_12 = fiq_12 == null ? null : (fcv_1)fiq_12.gBD();
        if (fcv_12 != null) {
            cfe_1.addRollElementsParticleToContainer(fcv_12);
        }
    }

    public static void addRollElementsParticleToContainer(fcv_1 fcv_12) {
        if (fcv_12 == null) {
            return;
        }
        if (jjX == null) {
            jjX = new fka_1();
        }
        jjX.aVI();
        jjX.setFile("6001057.xps");
        jjX.setAlignment(faa_2.tLK);
        jjX.setFollowBorders(true);
        jjX.setSpeed(500.0f);
        jjX.setTurnNumber(1);
        faw_2 faw_22 = (faw_2)fcv_12.getInnerElementMap().L("equipmentContainer", false);
        if (faw_22 == null) {
            faw_22 = (faw_2)fcv_12.getInnerElementMap().L("itemContainer", false);
        }
        if (faw_22 == null) {
            return;
        }
        fys_0 fys_02 = faw_22.getAppearance();
        fys_02.d(jjX);
    }

    private static void a(ffV ffV2, bde_0 bde_02) {
        if (ffV2.fWi().aIi() == 218 || ffV2.fWi().aIi() == 399) {
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(ffV2);
            dbl_02.setSourcePosition(che_1.getSourcePosition());
            dbl_02.setDestinationPosition((short)-1);
            dbl_02.setSourceUniqueId(bde_02.Lx());
            dbl_02.setDestinationCharacter(bwa_0.jwi.aj(cvo_2.daL()));
            dbl_02.lK(19261);
            aaw_1.bUq().h(dbl_02);
        } else {
            czt_2.NG(0);
            daj daj2 = new daj(ffV2, null);
            aaw_1.bUq().h(daj2);
        }
    }

    public static void closeWindow(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            dbj_0 dbj_02 = new dbj_0();
            dbj_02.lK(18087);
            dbj_02.fa(((fhv_1)fiq_12.gBD()).getElementMap().getId());
            aaw_1.bUq().h(dbj_02);
        }
    }

    public static void unequipInventory(flg_2 flg_22) {
        bde_0 bde_02 = ((bdh_0)flg_22.getItemValue()).dNO();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setDestinationPosition((short)-1);
        dbl_02.setDestinationUniqueId(-1L);
        dbl_02.setSourceUniqueId(bde_02.Lx());
        dbl_02.lK(19851);
        aaw_1.bUq().h(dbl_02);
    }

    public static void showItemDetailPopup(flg_2 flg_22, fey_2 fey_22) {
        Object object = flg_22.getItemValue();
        cgn_1.showPopup((aef_2)object, 500);
    }

    public static void showSetDetailPopup(fiq_1 fiq_12, Short s, String string, frx_1 frx_12) {
        bEq bEq2 = bEr.dSi().bW(s);
        if (Boolean.parseBoolean(string)) {
            cgn_1.showPopup(fiq_12, (aef_2)bEq2, frx_12);
        } else {
            fyd_0.closePopup(fiq_12, frx_12);
        }
    }

    public static void deleteItem(fiq_1 fiq_12) {
        String string = ((fhv_1)fiq_12.gBD()).getElementMap().getId();
        ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", string);
        cfe_1.deleteItem(ffV2);
        fad_1 fad_12 = (fad_1)fiq_12.gBE();
        fym_0 fym_02 = fad_12.getAppearance();
        fym_02.gqS();
    }

    public static void deleteItem(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            return;
        }
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.setDestinationCharacter(bgl_02);
        dbl_02.lK(16935);
        aaw_1.bUq().h(dbl_02);
    }

    public static void regenWith(fiq_1 fiq_12) {
        bgt_0 bgt_02 = cvo_2.daL();
        String string = ((fhv_1)fiq_12.gBD()).getElementMap().getId();
        ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", string);
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.lK(19521);
        dbl_02.setDestinationCharacter(bwa_0.jwi.aj(bgt_02));
        aaw_1.bUq().h(dbl_02);
    }

    public static void togglePresetDialog(fiq_1 fiq_12) {
        CosmeticPresetsCommand.cTH();
    }

    public static void useItem(fiq_1 fiq_12) {
        String string = ((fhv_1)fiq_12.gBD()).getElementMap().getId();
        ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", string);
        if (cgw_2.useUsableItem(ffV2, true)) {
            fse_1.gFu().b("itemDetail", (Object)null, string);
            fad_1 fad_12 = (fad_1)fiq_12.gBE();
            fad_12.getAppearance().gqS();
        }
    }

    public static void mimiSymbicUnmake(fiq_1 fiq_12) {
        String string2 = ((fhv_1)fiq_12.gBD()).getElementMap().getId();
        ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", string2);
        if (ffV2.fUX() != 0) {
            fik_2 fik_22 = fik_2.a((String string) -> {
                mVx.info((Object)("[MIMISYMBIC] Demande de retrait de skin sur l'item " + String.valueOf(ffV2)));
                cmi_0 cmi_02 = new cmi_0(ffV2.LV());
                aue_0.cVJ().etu().d(cmi_02);
            }).l("mimiSymbic.unmakeValidation", new Object[0]).abQ(1);
            fiq_2.gCw().d(fik_22);
        }
    }

    public static void dropView(flc_2 flc_22) {
        bli_1 bli_12 = (bli_1)flc_22.gDy();
        if (bli_12.dtZ()) {
            return;
        }
        int n = flc_22.getScreenX();
        int n2 = flc_22.getScreenY();
        cvo_2.eUK().a(cts_1.MC(bli_12.xT()), "equipInventWindow", n, n2);
    }

    public static void dropHeroView(flc_2 flc_22, fey_2 fey_22) {
        if (!fcI.fSM()) {
            return;
        }
        bgt_0 bgt_02 = (bgt_0)flc_22.gDy();
        int n = flc_22.getScreenX();
        int n2 = flc_22.getScreenY();
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        cvo_2.eUK().a(bgl_02, "inventoryOnlyDialog", "equipInventWindow", n, n2, fey_22);
    }

    public static void togglePvpInventory(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(19522));
    }

    public static void clearPvpInventory(fiq_1 fiq_12) {
        if (aue_0.cVJ().cVK().dkZ() != null) {
            aPd.e("error.impossibleDuringFight", new Object[0]);
            return;
        }
        fik_2 fik_22 = new fik_2().l("inventory.pvp.clear.confirmation", new Object[0]).vG(ccp_2.mRE.byf()).a(fil_2.gCo()).a(fil_2.gCn().c(string -> aaw_1.bUq().h(new dae_0(18415))));
        fiq_2.gCw().d(fik_22);
    }

    public static void clickOnItem(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)object;
        if (flg_22.gEk()) {
            if (aue_0.cVJ().c(cwl_1.eVl())) {
                cfp_1.a((flp_2)flg_22, (Object)ffV2);
            } else if (cui_1.eQx()) {
                cex_1.selectItem(ffV2);
            }
        }
    }

    public static void showRefItemPopup(flg_2 flg_22, frx_1 frx_12, frx_1 frx_13) {
        if (flg_22.getItemValue() instanceof bee_0) {
            cdd_2.showItemPopup(flg_22, frx_12);
        } else if (flg_22.getItemValue() instanceof blP) {
            cdd_2.showItemPopup(flg_22, frx_13);
        }
    }

    public static void clickOnSortingDrawer(flp_2 flp_22, fbg_2 fbg_22, bgt_0 bgt_02) {
        if (flp_22.gDT()) {
            cfe_1.sortBagsWithLastSort(flp_22, bgt_02);
        } else {
            fyd_0.switchDrawer(flp_22, fbg_22);
        }
    }

    public static void sortBags(fiq_1 fiq_12, String string, bgt_0 bgt_02) {
        fhw_0.dh(string).ifPresent(fhw_02 -> cfe_1.a(fhw_02, bgt_02.Sn(), (byte)-1));
    }

    public static void sortBagsWithLastSort(fiq_1 fiq_12, bgt_0 bgt_02) {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkV);
        fhw_0.mL(n).ifPresent(fhw_02 -> cfe_1.a(fhw_02, bgt_02.Sn(), (byte)-1));
    }

    public static void clickOnOneBagSortingDrawer(flp_2 flp_22, fbg_2 fbg_22, bgt_0 bgt_02, bdh_0 bdh_02) {
        if (flp_22.gDT()) {
            cfe_1.sortOneBagWithLastSort(flp_22, bgt_02, bdh_02);
        } else {
            fyd_0.switchDrawer(flp_22, fbg_22);
        }
    }

    public static void sortBag(fiq_1 fiq_12, String string, bgt_0 bgt_02, bdh_0 bdh_02) {
        fhw_0.dh(string).ifPresent(fhw_02 -> cfe_1.a(fhw_02, bgt_02.Sn(), bdh_02.dNO().eDo()));
    }

    public static void sortOneBagWithLastSort(fiq_1 fiq_12, bgt_0 bgt_02, bdh_0 bdh_02) {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkV);
        fhw_0.mL(n).ifPresent(fhw_02 -> cfe_1.a(fhw_02, bgt_02.Sn(), bdh_02.dNO().eDo()));
    }

    private static void a(fhw_0 fhw_02, long l, byte by) {
        dae_0 dae_02 = new dae_0(17177);
        dae_02.D((Object)fhw_02);
        dae_02.gj(l);
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectInventoryCategory(fiq_1 fiq_12, String string, bgi_1 bgi_12) {
        bgk_1.dh(string).ifPresent(bgk_12 -> cfe_1.a(bgi_12, new bgl_1((bgk_1)((Object)bgk_12))));
    }

    public static void filterItemsByName(fli_2 fli_22, fdv_1 fdv_12, bgi_1 bgi_12) {
        if (fli_22.bCC() == 10) {
            mVw.clear();
            cfe_1.a(fdv_12.getText(), bgi_12);
            return;
        }
        if (fli_22.bCC() == 39 || fli_22.bCC() == 37) {
            return;
        }
        String string = fdv_12.getText();
        mVw.a(buh_0.jot.ordinal(), () -> cfe_1.a(string, bgi_12));
    }

    public static void clearNameFilter(flq_2 flq_22, bgi_1 bgi_12) {
        mVw.clear();
        cfe_1.a("", bgi_12);
    }

    private static void a(String string, bgi_1 bgi_12) {
        if (!aue_0.cVJ().c(cvo_2.eUK())) {
            return;
        }
        String string2 = Strings.isNullOrEmpty((String)string) ? "" : BH.bd(string);
        cfe_1.a(bgi_12, new bEn(string2));
    }

    public static void toggleItemsRarityFilter(fiq_1 fiq_12, bgi_1 bgi_12, bil_1 bil_12) {
        Optional<bEp> optional = bgi_12.b(buh_0.jov);
        bil_12.setSelected(!bil_12.bqr());
        Set set = optional.map(bEp::dCk).map(HashSet::new).orElseGet(HashSet::new);
        if (bil_12.bqr()) {
            set.add(bil_12.dxF());
        } else {
            set.remove(bil_12.dxF());
        }
        cfe_1.a(bgi_12, new bEp(set));
    }

    @Nullable
    public static Long getNumericalValue(fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string.isBlank()) {
            return null;
        }
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static void filterItemsByLevel(fli_2 fli_22, fdu_1 fdu_12, fdu_1 fdu_13, bgi_1 bgi_12) {
        Long l = cfe_1.getNumericalValue(fdu_12);
        Long l2 = cfe_1.getNumericalValue(fdu_13);
        bEl bEl2 = new bEl(l, l2);
        if (fli_22.bCC() == 10) {
            mVw.clear();
            cfe_1.a(bgi_12, (bug_0<ffV>)bEl2);
            return;
        }
        if (fli_22.bCC() == 39 || fli_22.bCC() == 37) {
            return;
        }
        mVw.a(buh_0.jou.ordinal(), () -> cfe_1.a(bgi_12, (bug_0<ffV>)bEl2));
    }

    public static void filterItemsBySlotCount(fiq_1 fiq_12, bgi_1 bgi_12, String string, fdd_2 fdd_22) {
        int n;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        Optional<bet_1> optional = bgi_12.b(buh_0.joF);
        Set set = optional.map(bet_1::dSj).map(HashSet::new).orElseGet(HashSet::new);
        if (fdd_22.getSelected()) {
            set.add(n);
        } else {
            set.remove(n);
        }
        cfe_1.a(bgi_12, new bet_1(set));
    }

    public static void addItemLearnedFilter(fiq_1 fiq_12, bgi_1 bgi_12, String string) {
        cfe_1.a(bgi_12, new bEk(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void removeItemLearnedFilter(fiq_1 fiq_12, bgi_1 bgi_12) {
        cfe_1.a(bgi_12, new bEk(null));
    }

    private static void a(bgi_1 bgi_12, bug_0<ffV> bug_02) {
        dbF dbF2 = new dbF();
        dbF2.a(bgi_12);
        dbF2.m(bug_02);
        aaw_1.bUq().h(dbF2);
    }

    public static void clearFilters(fiq_1 fiq_12, bgi_1 bgi_12) {
        dae_0 dae_02 = new dae_0(18566);
        dae_02.D(bgi_12);
        aaw_1.bUq().h(dae_02);
    }

    public static boolean selectItem(flg_2 flg_22, bgi_1 bgi_12, bgx_1 bgx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof ffV)) {
            return false;
        }
        ffV ffV2 = (ffV)object;
        if (!bgi_12.dTJ()) {
            return false;
        }
        if (cvo_2.eUK().eUL() != null) {
            return false;
        }
        if (flg_22.gDR()) {
            if (!flg_22.gEk()) {
                return false;
            }
            object = bgx_12.dUF();
            if (object == null) {
                return false;
            }
            if (bgx_12.dUD() && bgx_12.lo(ffV2.LV())) {
                dae_0.b((short)17140, bgx_12);
            } else {
                bgg_2.e((bgt_0)object, ffV2);
            }
            return true;
        }
        object = bgi_12.lm(ffV2.LV());
        LP lP = new LP(false);
        ((OptionalInt)object).ifPresent(n -> {
            if (flg_22.gDT()) {
                bgx_12.GI(n);
                lP.aH(true);
            } else if (flg_22.gDQ()) {
                bgx_12.GH(n);
                lP.aH(true);
            } else {
                bgx_12.GG(n);
            }
        });
        if (lP.aTe()) {
            fhz_2.gAS().gAU();
        }
        return lP.aTe();
    }

    public static void clickOnEmptyItemSlot(flg_2 flg_22, bgi_1 bgi_12, bgx_1 bgx_12, bgt_0 bgt_02) {
        Object object;
        Object object2 = flg_22.gBE();
        if (!(object2 instanceof fcv_1)) {
            return;
        }
        fcv_1 fcv_12 = (fcv_1)object2;
        if (!bgi_12.dTJ()) {
            return;
        }
        if (cvo_2.eUK().eUL() != null) {
            return;
        }
        object2 = fcv_12.getParentOfType(fcv_1.class);
        if (object2 == null || !((object = ((fcv_1)object2).getItemValue()) instanceof bdh_0)) {
            return;
        }
        bdh_0 bdh_02 = (bdh_0)object;
        bgt_02.dno().a(bdh_02).ifPresent(n -> {
            int n2 = n + fcv_12.getCollection().getTableIndex(fcv_12);
            if (n2 < 0) {
                return;
            }
            if (flg_22.gDT()) {
                bgx_12.GI(n2);
            } else if (!flg_22.gDQ()) {
                bgx_12.GG(n2);
            }
        });
    }

    public static void recycle(fiq_1 fiq_12, bgx_1 bgx_12) {
        if (bgx_12.dUD()) {
            dae_0.b((short)17752, bgx_12);
        } else {
            aaw_1.bUq().h(new dae_0(19859));
        }
    }

    public static void switchTransferDrawer(fiq_1 fiq_12, fbg_2 fbg_22) {
        bga_2 bga_22 = cvo_2.eUK().eUL();
        if (bga_22 != null && bga_22.dUf() == bgf_2.jWi) {
            aaw_1.bUq().h(new dae_0(16503));
        } else {
            fyd_0.switchDrawer(fiq_12, fbg_22);
        }
    }

    public static void transferItems(flg_2 flg_22, bgx_1 bgx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bgt_0)) {
            return;
        }
        bgt_0 bgt_02 = (bgt_0)object;
        if (bgx_12.dUD()) {
            object = new dbq_0(bgt_02.Sn());
            ((dbq_0)object).a(bgx_12);
            aaw_1.bUq().h((aam_2)object);
        } else {
            object = new dae_0(16503);
            ((ama_1)object).gj(bgt_02.Sn());
            aaw_1.bUq().h((aam_2)object);
        }
    }

    public static void lock(fiq_1 fiq_12, bgx_1 bgx_12) {
        if (bgx_12.dUD()) {
            dae_0.b((short)17140, bgx_12);
        } else {
            dae_0.cV((short)16449);
        }
    }

    static {
        mVx = Logger.getLogger(cfe_1.class);
        mVz = new ArrayList();
    }
}

