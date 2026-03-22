/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 *  org.apache.log4j.Priority
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Random;
import java.util.Set;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fes {
    private static final Gson rZU = new GsonBuilder().disableHtmlEscaping().create();
    private static final Random rZV = new Random();
    private static final String rZW = ewo.oBF.i(ewr.oDt) + "-" + Ms.aSi.aTK();
    public static final String rZX = "AddToCollector";
    public static final String rZY = "RemoveFromCollector";
    public static final String rZZ = "AddToStorageBox";
    public static final String saa = "RemoveFromStorageBox";
    public static final String sab = "AddToGuildStorageBox";
    public static final String sac = "RemoveFromGuildStorageBox";
    public static final String sad = "AddToAccountChest";
    public static final String sae = "RemoveFromAccountChest";
    public static final String saf = "Exchange";
    public static final String sag = "KamaShield";
    public static final String sah = "BuyInMerchantInventory";
    public static final String sai = "KamaFightLoot";
    public static final String saj = "KamaAchievementReward";
    public static final String sak = "KamaAccountAchievementReward";
    public static final String sal = "KamaToDialogueAnswer";
    public static final String sam = "KamaFromDialogueAnswer";
    public static final String san = "KamaToScenarioReward";
    public static final String sao = "KamaFromScenarioReward";
    public static final String sap = "ExchangeMachineKama";
    public static final String saq = "GenericActivableIEKama";
    public static final String sar = "TeleporterKama";
    public static final String sas = "GiveKamaAction";
    public static final String sat = "KamaFromFreeCollector";
    public static final String sau = "KamaToFreeCollector";
    public static final String sav = "KamaFromGuildStorage";
    public static final String saw = "KamaToGuildStorage";
    public static final String sax = "KamaFromItemAction";
    public static final String say = "KamaToCandidateFee";
    public static final String saz = "KamaFromScenario";
    public static final String saA = "KamaToScenario";
    public static final String saB = "KamaInLootChest";
    public static final String saC = "KamaCraftFee";
    public static final String saD = "Treasure";
    public static final String saE = "KamaInCollector";
    public static final String saF = "Resurrection";
    public static final String saG = "MergeItemToSet";
    public static final String saH = "FromGameActionToInventory";
    public static final String saI = "FromQuestInventoryToTeleporter";
    public static final String saJ = "FromAccountInventoryToTeleporter";
    public static final String saK = "FromInventoryToTeleporter";
    public static final String saL = "FromInventoryToSteleCost";
    public static final String saM = "FromCraftToInventory";
    public static final String saN = "FromCraftToQuestInventory";
    public static final String saO = "FromCraftToAccountInventory";
    public static final String saP = "FromCraftToTemporaryInventory";
    public static final String saQ = "FromInventoryToCraft";
    public static final String saR = "FromQuestInventoryToCraft";
    public static final String saS = "FromInventoryToWebshop";
    public static final String saT = "FromInventoryToStorageBoxUnlock";
    public static final String saU = "FromInventoryToCannonTravel";
    public static final String saV = "FromExchangeMachineToInventory";
    public static final String saW = "FromExchangeMachineToQuestInventory";
    public static final String saX = "FromQuestInventoryToExchangeMachine";
    public static final String saY = "FromAccountInventoryToExchangeMachine";
    public static final String saZ = "FromInventoryToExchangeMachine";
    public static final String sba = "FromExchangeMachineToTemporaryInventory";
    public static final String sbb = "FromExchangeMachineToAccountInventory";
    public static final String sbc = "GiveItemActionToInventory";
    public static final String sbd = "GiveItemActionToAccountInventory";
    public static final String sbe = "GiveItemActionToTemporaryInventory";
    public static final String sbf = "FromInventoryToRegeneration";
    public static final String sbg = "AddToInventoryFromDungeonReward";
    public static final String sbh = "AddToTemporaryInventoryFromDungeonReward";
    public static final String sbi = "AddToQuestFromDungeonReward";
    public static final String sbj = "AddToAccountFromDungeonReward";
    public static final String sbk = "AddToInventoryFromRandomList";
    public static final String sbl = "AddToQuestInventoryFromRandomList";
    public static final String sbm = "AddToAccountInventoryFromRandomList";
    public static final String sbn = "AddToTemporaryInventoryFromRandomList";
    public static final String sbo = "AddToInventoryFromDeploiedIE";
    public static final String sbp = "RemoveFromInventoryToDeployIE";
    public static final String sbq = "AddToTemporaryInventory";
    public static final String sbr = "FromLootChestToInventory";
    public static final String sbs = "FromLootChestToQuestInventory";
    public static final String sbt = "FromLootChestToAccountInventory";
    public static final String sbu = "FromLootChestToTemporaryInventory";
    public static final String sbv = "FromQuestInventoryToLootChest";
    public static final String sbw = "FromInventoryToLootChest";
    public static final String sbx = "FromInventoryToStreetLight";
    public static final String sby = "FromInventoryToResourcesCollector";
    public static final String sbz = "FromSplitSetToInventory";
    public static final String sbA = "FromQuestInventoryToScriptAction";
    public static final String sbB = "FromAccountInventoryToScriptAction";
    public static final String sbC = "FromInventoryToScriptAction";
    public static final String sbD = "FromScenarioActionToInventory";
    public static final String sbE = "FromScenarioActionToQuestInventory";
    public static final String sbF = "FromScenarioActionToAccountInventory";
    public static final String sbG = "FromScenarioActionToTemporaryInventory";
    public static final String sbH = "FromInventoryToGuildCreation";
    public static final String sbI = "FromInventoryToPet";
    public static final String sbJ = "FromAchievementRewardToInventory";
    public static final String sbK = "FromAccountAchievementRewardToInventory";
    public static final String sbL = "FromInventoryToCompanionEquipment";
    public static final String sbM = "FromCompanionToInventory";
    public static final String sbN = "FromCompanionEquipmentToInventory";
    public static final String sbO = "FromInventoryToBookcase";
    public static final String sbP = "FromBookcaseToInventory";
    public static final String sbQ = "FromInventoryToDimensionalRoomManagement";
    public static final String sbR = "FromDimensionalRoomManagementToInventory";
    public static final String sbS = "FromFleaToInventory";
    public static final String sbT = "KamaToMarket";
    public static final String sbU = "KamaFromMarket";
    public static final String sbV = "FromMarketToInventory";
    public static final String sbW = "FromMarketToTemporaryInventory";
    public static final String sbX = "FromExpiredMarketToInventory";
    public static final String sbY = "FromExpiredMarketToTemporaryInventory";
    public static final String sbZ = "FromCancelMarketToInventory";
    public static final String sca = "FromCancelMarketToTemporaryInventory";
    public static final String scb = "FromInventoryToMarket";
    public static final String scc = "KamaToMarketTax";
    public static final String scd = "KamaToMarketOffer";
    public static final String sce = "KamaFromMarketOffer";
    public static final String scf = "KamaFromExpiredMarketOffer";
    public static final String scg = "KamaFromCancelMarketOffer";
    public static final String sch = "FromMarketOfferToInventory";
    public static final String sci = "FromMarketOfferToTemporaryInventory";
    public static final String scj = "FromInventoryToMarketOffer";
    public static final String sck = "KamaToMarketTaxForOffer";
    public static final String scl = "FromTreasureToInventory";
    public static final String scm = "FromTreasureToTemporaryInventory";
    public static final String scn = "FromLootToInventory";
    public static final String sco = "FromLootToQuestInventory";
    public static final String scp = "FromLootToAccountInventory";
    public static final String scq = "FromLootToTemporaryInventory";
    public static final String scr = "FromCollectToTemporaryInventory";
    public static final String scs = "FromCollectToQuestInventory";
    public static final String sct = "FromQuestInventoryToCollect";
    public static final String scu = "FromInventoryToCollect";
    public static final String scv = "FromCollectToAccountInventory";
    public static final String scw = "FromCollectToInventory";
    public static final String scx = "FromInventoryToEquipment";
    public static final String scy = "FromEquipmentToInventory";
    public static final String scz = "AddToEquipmentSheet";
    public static final String scA = "RemoveFromEquipmentSheet";
    public static final String scB = "FromInventoryToCollector";
    public static final String scC = "FromInventoryToHavenWorldBuilding";
    public static final String scD = "FromHavenWorldBuildingToInventory";
    public static final String scE = "FromTemporaryInventoryToInventory";
    public static final String scF = "RemoveFromTemporaryInventory";
    public static final String scG = "FromInventoryToBagEquipment";
    public static final String scH = "FromInventoryToTemporaryInventory";
    public static final String scI = "FromBagEquipmentToInventory";
    public static final String scJ = "FromBagEquipmentToTemporaryInventory";
    public static final String scK = "DeleteItemFromInventory";
    public static final String scL = "PlayerUseItem";
    public static final String scM = "FromSeedSpreaderToInventory";
    public static final String scN = "FromRepackToInventory";
    public static final String scO = "FromDisassembleToInventory";
    public static final String scP = "FromDisassembleTemporaryToInventory";
    public static final String scQ = "FromInventoryToDisassemble";
    public static final String scR = "FromProtectorToInventory";
    public static final String scS = "RemoveFromInventory";
    public static final String scT = "RemoveFromInventoryToItemAction";
    public static final String scU = "RemoveFromInventoryToMimiSymbic";
    public static final String scV = "RemoveFromInventoryByModerator";
    public static final String scW = "FromMergeItemsToInventory";
    public static final String scX = "FromIceGiftToInventory";
    public static final String scY = "RemoveFromInventoryToAccountMimiSymbicAction";
    public static final String scZ = "RemoveFromInventoryToAddKamasAction";
    public static final String sda = "RemoveFromInventoryToAddTitleAction";
    public static final String sdb = "RemoveFromInventoryToCompanionAction";
    public static final String sdc = "RemoveFromInventoryToConvertItemAction";
    public static final String sdd = "RemoveFromInventoryToGiveItemsAction";
    public static final String sde = "RemoveFromInventoryToGiveRandomItemAction";
    public static final String sdf = "RemoveFromInventoryToLearnCosmeticAction";
    public static final String sdg = "RemoveFromInventoryToLearnEmoteAction";
    public static final String sdh = "RemoveFromInventoryToLearnFurnitureAction";
    public static final String sdi = "RemoveFromInventoryToLearnRecipeAction";
    public static final String sdj = "RemoveFromInventoryToMergeItemsAction";
    public static final String sdk = "RemoveFromInventoryToPlayEmoteAction";
    public static final String sdl = "RemoveFromInventoryToRecustomAction";
    public static final String sdm = "RemoveFromInventoryToRollElementsAction";
    public static final String sdn = "RemoveFromInventoryToSeedAction";
    public static final String sdo = "RemoveFromInventoryToSpawnMonsterAction";
    public static final String sdp = "RemoveFromInventoryToStartScenarioAction";
    public static final String sdq = "RemoveFromInventoryToTeleportAction";
    public static final String sdr = "FromInventoryToDummy";
    public static final String sds = "FromDummyToInventory";
    public static final String sdt = "FromDummyToTemporaryInventory";
    public static final String sdu = "FromEquipmentToScenario";
    public static final String sdv = "FromQuestInventoryToScenario";
    public static final String sdw = "FromAccountInventoryToScenario";
    public static final String sdx = "FromInventoryToScenario";
    public static final String sdy = "FromScenarioToInventory";
    public static final String sdz = "FromScenarioToTemporaryInventory";
    public static final String sdA = "FromScenarioToQuestInventory";
    public static final String sdB = "FromScenarioToAccountInventory";
    public static final String sdC = "FromRewardsToInventory";
    public static final String sdD = "FromInventoryToRewards";
    public static final String sdE = "FromMerchantInventoryToInventory";
    public static final String sdF = "FromInventoryToShards";
    public static final String sdG = "FromShardsToInventory";
    public static final String sdH = "FromShardsToTemporaryInventory";
    public static final String sdI = "FromInventoryToSublimation";
    public static final String sdJ = "DeleteSublimation";
    public static final String sdK = "FromInventoryToSacrifice";
    public static final String sdL = "FromChargeToSlotAction";
    public static final String sdM = "FromSacrificedShardsToInventory";
    public static final String sdN = "FromSacrificedShardsToTemporaryInventory";
    public static final String sdO = "FromCraftedItemShardsToInventory";
    public static final String sdP = "FromCraftedItemShardsToTemporaryInventory";
    public static final String sdQ = "FromMimiSymbicedShardsToInventory";
    public static final String sdR = "FromPvpInventoryToTemporaryInventory";
    public static final String sdS = "FromPvpInventoryToInventory";
    public static final String sdT = "FromStealToPvpInventory";
    public static final String sdU = "RemoveFromPvpInventory";
    public static final String sdV = "FromLootToPvpInventory";
    public static final String sdW = "FromCollectToPvpInventory";
    public static final String sdX = "FromAdminToInventory";
    public static final String sdY = "FromAdminToTemporaryInventory";
    public static final String sdZ = "FromAdminToQuestInventory";
    public static final String sea = "FromAdminToAccountInventory";
    public static final Set<String> seb = Set.of("FromMarketToInventory", "FromMarketToTemporaryInventory");
    private static final Logger sec = Logger.getLogger((String)"itemTrackerOpenSearch");

    public static long Lx() {
        return Math.abs(rZV.nextLong());
    }

    public static void a(long l, String string, @Nullable Gv gv, @Nullable Gv gv2, @NotNull Gr gr, @Nullable Gt gt) {
        Gp gp = Gp.aMG().cs(l).cq(string).cr(rZW).a(gv).b(gv2).a(gr).a(gt).aMM();
        sec.log((Priority)Level.INFO, (Object)rZU.toJson((Object)gp));
    }

    public static void a(String string, @Nullable Gv gv, @Nullable Gv gv2, @NotNull Gr gr, @Nullable Gt gt) {
        fes.a(rZV.nextLong(), string, gv, gv2, gr, gt);
    }

    public static void a(String string, @Nullable exP exP2, @Nullable exP exP3, @NotNull Gr gr) {
        Long l = null;
        if (exP2 != null) {
            l = exP2.aqZ();
        } else if (exP3 != null) {
            l = exP3.aqZ();
        }
        Gt gt = null;
        if (l != null) {
            gt = Gt.aMU().g(l).aNq();
        }
        fes.a(rZV.nextLong(), string, fet.bS(exP2), fet.bS(exP3), gr, gt);
    }

    public static void a(String string, @Nullable exP exP2, @Nullable exP exP3, @NotNull ffV ffV2) {
        fes.a(string, exP2, exP3, fet.ce(ffV2));
    }

    public static void Uy(int n) {
        Level level = Level.toLevel((int)n);
        if (level == null) {
            return;
        }
        sec.setLevel(level);
    }
}
