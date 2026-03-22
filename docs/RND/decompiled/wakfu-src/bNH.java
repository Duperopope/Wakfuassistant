/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public final class bNH
extends Enum<bNH> {
    public static final /* enum */ bNH kEd = new bNH(0, "collect.success");
    public static final /* enum */ bNH kEe = new bNH(1, "error.unknown");
    public static final /* enum */ bNH kEf = new bNH(2, "collect.error.badDistance");
    public static final /* enum */ bNH kEg = new bNH(3, "error.notEnoughKamas");
    public static final /* enum */ bNH kEh = new bNH(4, "occupation.error.levelRequired");
    public static final /* enum */ bNH kEi = new bNH(5, "collect.error.badAltitude");
    public static final /* enum */ bNH kEj = new bNH(6, "action.error.cantWhileDead");
    public static final /* enum */ bNH kEk = new bNH(10, "plant.error.tooManyInPartition");
    public static final /* enum */ bNH kEl = new bNH(35, "plant.error.tooManyInZone");
    public static final /* enum */ bNH kEm = new bNH(36, "plant.error.notAllowed");
    public static final /* enum */ bNH kEn = new bNH(11, "plant.error.cantPlantInZone");
    public static final /* enum */ bNH kEo = new bNH(12, "plant.error.groundTypeExclusive");
    public static final /* enum */ bNH kEp = new bNH(13, "plant.error.failed");
    public static final /* enum */ bNH kEq = new bNH(14, "collect.error.cantBeCollect");
    public static final /* enum */ bNH kEr = new bNH(15, "collect.error.resourceUnavailable");
    public static final /* enum */ bNH kEs = new bNH(16, "plant.error.present");
    public static final /* enum */ bNH kEt = new bNH(39, "error.resource.plant.restricted");
    public static final /* enum */ bNH kEu = new bNH(17, "error.resource.collect.impossible");
    public static final /* enum */ bNH kEv = new bNH(18, "plant.error.groundTypeError");
    public static final /* enum */ bNH kEw = new bNH(19, "plant.error.itemError");
    public static final /* enum */ bNH kEx = new bNH(20, "bdd.error");
    public static final /* enum */ bNH kEy = new bNH(21, "craft.unknown");
    public static final /* enum */ bNH kEz = new bNH(22, "occupation.error.skillRequired");
    public static final /* enum */ bNH kEA = new bNH(23, "craft.error.unknowRecipe");
    public static final /* enum */ bNH kEB = new bNH(24, "inventory.error.ingredientsNotFound");
    public static final /* enum */ bNH kEC = new bNH(25, "collect.error.cantJoin");
    public static final /* enum */ bNH kED = new bNH(26, "collect.fightInProgress");
    public static final /* enum */ bNH kEE = new bNH(27, "collect.error.blockingResources");
    public static final /* enum */ bNH kEF = new bNH(28, "error.noResourceMap");
    public static final /* enum */ bNH kEG = new bNH(29, "too.far.to.interact");
    public static final /* enum */ bNH kEH = new bNH(30, "collect.error.tooEarly");
    public static final /* enum */ bNH kEI = new bNH(31, "craft.error.recipeAlreadyKnown");
    public static final /* enum */ bNH kEJ = new bNH(33, "craft.error.badLevelForSecret");
    public static final /* enum */ bNH kEK = new bNH(34, "craft.error.recipeNotAllowed");
    public static final /* enum */ bNH kEL = new bNH(37, "craft.error.recipeNotAllowed");
    public static final /* enum */ bNH kEM = new bNH(38, "error.searchTreasureFailed");
    public static final /* enum */ bNH kEN = new bNH(50, "inventory.error.lackItem");
    public static final /* enum */ bNH kEO = new bNH(51, "error.bagFull");
    public static final /* enum */ bNH kEP = new bNH(52, "action.error.wrongItemEquiped");
    public static final /* enum */ bNH kEQ = new bNH(53, "collect.error.ItemNotUsable");
    public static final /* enum */ bNH kER = new bNH(55, "inventory.error.lackItem");
    public static final /* enum */ bNH kES = new bNH(57, "item.error.alreadyInBags");
    public static final /* enum */ bNH kET = new bNH(58, "item.error.impossibilityToEquip");
    public static final /* enum */ bNH kEU = new bNH(61, "item.error.impossibilityToUse");
    public static final /* enum */ bNH kEV = new bNH(64, "cantEquipPetItem");
    public static final /* enum */ bNH kEW = new bNH(65, "incompatibleRentTypes");
    public static final /* enum */ bNH kEX = new bNH(66, "incompatibleItemTypes");
    public static final /* enum */ bNH kEY = new bNH(60, "item.error.cantBeEquiped");
    public static final /* enum */ bNH kEZ = new bNH(59, "error.item.actionFailed");
    public static final /* enum */ bNH kFa = new bNH(63, "market.alreadyBoughtEntry");
    public static final /* enum */ bNH kFb = new bNH(67, "item.error.cantEquipAnUnidentifiedItem");
    public static final /* enum */ bNH kFc = new bNH(100, "ie.lootChestIsEmpty");
    public static final /* enum */ bNH kFd = new bNH(101, "ie.wellHasTooManyUsers");
    public static final /* enum */ bNH kFe = new bNH(102, "ie.onlyOneActionByUser");
    public static final /* enum */ bNH kFf = new bNH(103, "bag.forbiddenOutsideMarket");
    public static final /* enum */ bNH kFg = new bNH(104, "ie.wrongRights");
    public static final /* enum */ bNH kFh = new bNH(105, "ie.notEnoughSpaceToRepack");
    public static final /* enum */ bNH kFi = new bNH(106, "ie.invalidCell");
    public static final /* enum */ bNH kFj = new bNH(107, "chat.travel.invalidCriterion");
    public static final /* enum */ bNH kFk = new bNH(108, "bag.forbidden.moving");
    public static final /* enum */ bNH kFl = new bNH(109, "error.dungeon.admin.locked");
    public static final /* enum */ bNH kFm = new bNH(110, "error.dungeon.member.locked");
    public static final /* enum */ bNH kFn = new bNH(111, "bag.forbiddenInEnnemyTerritory");
    public static final /* enum */ bNH kFo = new bNH(201, "challenge.refused");
    public static final /* enum */ bNH kFp = new bNH(202, "challenge.delayoutdated");
    public static final /* enum */ bNH kFq = new bNH(203, "challenge.maxUsersLimit");
    public static final /* enum */ bNH kFr = new bNH(300, "group.error.alreadyInParty");
    public static final /* enum */ bNH kFs = new bNH(318, "group.error.alreadyInGuild");
    public static final /* enum */ bNH kFt = new bNH(301, "group.error.self_invitation");
    public static final /* enum */ bNH kFu = new bNH(302, "group.error.no_rights");
    public static final /* enum */ bNH kFv = new bNH(303, "group.error.unknown_user");
    public static final /* enum */ bNH kFw = new bNH(315, "group.error.nation.is.enemy");
    public static final /* enum */ bNH kFx = new bNH(304, "group.error.invitation_refused");
    public static final /* enum */ bNH kFy = new bNH(305, "group.error.remote_not_in_group");
    public static final /* enum */ bNH kFz = new bNH(306, "group.error.not_in_group");
    public static final /* enum */ bNH kFA = new bNH(307, "group.error.full");
    public static final /* enum */ bNH kFB = new bNH(325, "group.error.cant.merge.too.many.members");
    public static final /* enum */ bNH kFC = new bNH(323, "group.error.companion.full");
    public static final /* enum */ bNH kFD = new bNH(335, "group.error.breed.unavailable");
    public static final /* enum */ bNH kFE = new bNH(336, "group.error.isHero");
    public static final /* enum */ bNH kFF = new bNH(324, "group.error.mustSubscribeToGroupWithCompanion");
    public static final /* enum */ bNH kFG = new bNH(308, "group.error.invitationPending");
    public static final /* enum */ bNH kFH = new bNH(309, "guild.error.name");
    public static final /* enum */ bNH kFI = new bNH(314, "guild.error.name.already.exist");
    public static final /* enum */ bNH kFJ = new bNH(310, "guild.error.blazon");
    public static final /* enum */ bNH kFK = new bNH(311, "guild.error.creationFailed");
    public static final /* enum */ bNH kFL = new bNH(312, "guild.error.user.already.in.guild");
    public static final /* enum */ bNH kFM = new bNH(313, "error.guild.creation.creator.already.in.guild");
    public static final /* enum */ bNH kFN = new bNH(317, "group.error.remoteInFight");
    public static final /* enum */ bNH kFO = new bNH(319, "group.error.groupDisabled");
    public static final /* enum */ bNH kFP = new bNH(320, "group.error.groupWithOtherBreedDisabled");
    public static final /* enum */ bNH kFQ = new bNH(321, "group.error.remoteGroupDisabled");
    public static final /* enum */ bNH kFR = new bNH(322, "group.error.remoteGroupWithOtherBreedDisabled");
    public static final /* enum */ bNH kFS = new bNH(500, "monster.error.monsterAction.failed");
    public static final /* enum */ bNH kFT = new bNH(501, "error.summon.rename.forbidden");
    public static final /* enum */ bNH kFU = new bNH(1020, "fight.error.join.cannotAttack");
    public static final /* enum */ bNH kFV = new bNH(1021, "fight.error.join.cannotBeJoined");
    public static final /* enum */ bNH kFW = new bNH(1022, "fight.error.join.targetNotInFight");
    public static final /* enum */ bNH kFX = new bNH(1023, "fight.error.join.selfInFight");
    public static final /* enum */ bNH kFY = new bNH(1024, "fight.error.join.onlyDuringPlacement");
    public static final /* enum */ bNH kFZ = new bNH(1025, "fight.error.join.fightLocked");
    public static final /* enum */ bNH kGa = new bNH(1026, "fight.error.join.cannotWalk");
    public static final /* enum */ bNH kGb = new bNH(1027, "fight.error.join.fightFull");
    public static final /* enum */ bNH kGc = new bNH(1028, "fight.error.join.cantStake");
    public static final /* enum */ bNH kGd = new bNH(1029, "fight.error.join.selfDead");
    public static final /* enum */ bNH kGe = new bNH(1030, "fight.error.join.enteringDimensionalBag");
    public static final /* enum */ bNH kGf = new bNH(1031, "fight.error.join.exchanging");
    public static final /* enum */ bNH kGg = new bNH(1032, "fight.error.join.rollingLoot");
    public static final /* enum */ bNH kGh = new bNH(1033, "fight.error.join.targetDead");
    public static final /* enum */ bNH kGi = new bNH(1034, "fight.error.join.targetNotInParty");
    public static final /* enum */ bNH kGj = new bNH(1035, "fight.error.join.groupMemberInOpposingTeam");
    public static final /* enum */ bNH kGk = new bNH(1036, "fight.error.join.cannotDefendEnemyProtector");
    public static final /* enum */ bNH kGl = new bNH(1037, "fight.error.join.cannotAttackAlliedProtector");
    public static final /* enum */ bNH kGm = new bNH(1038, "fight.error.join.cannotJoinDuel");
    public static final /* enum */ bNH kGn = new bNH(1039, "fight.error.join.cannotJoinTuto");
    public static final /* enum */ bNH kGo = new bNH(1040, "fight.error.join.cannotJoinMonsters");
    public static final /* enum */ bNH kGp = new bNH(1045, "fight.error.join.noNation");
    public static final /* enum */ bNH kGq = new bNH(1041, "fight.error.join.cannotSelectTeam");
    public static final /* enum */ bNH kGr = new bNH(1042, "fight.error.join.targetTooFar");
    public static final /* enum */ bNH kGs = new bNH(1043, "fight.error.join.no.start.placement.found");
    public static final /* enum */ bNH kGt = new bNH(1044, "fight.error.join.isDead");
    public static final /* enum */ bNH kGu = new bNH(1047, "fight.error.join.spectating");
    public static final /* enum */ bNH kGv = new bNH(1048, "spectator.fight.error.join.moving");
    public static final /* enum */ bNH kGw = new bNH(1049, "spectator.fight.error.join.badInstance");
    public static final /* enum */ bNH kGx = new bNH(10200, "nation.error.governmentNominationRefuseChatMessage");
    public static final /* enum */ bNH kGy = new bNH(10201, "nation.error.governmentNominationRankOccupiedChatMessage");
    public static final /* enum */ bNH kGz = new bNH(10202, "group.error.unknown_user");
    public static final /* enum */ bNH kGA = new bNH(10203, "nation.error.governmentNominationOtherNationChatMessage");
    public static final /* enum */ bNH kGB = new bNH(10204, "nation.error.governmentNominationAlreadyInGovChatMessage");
    public static final /* enum */ bNH kGC = new bNH(10205, "nation.error.governmentNominationCriterionFailChatMessage");
    public static final /* enum */ bNH kGD = new bNH(10207, "nation.error.governmentNominationNotEnoughCitizenScoreChatMessage");
    public static final /* enum */ bNH kGE = new bNH(10206, "nation.error.diplomacy.requestTooEarly");
    public static final /* enum */ bNH kGF = new bNH(10211, "nation.error.diplomacy.alreadyHasAlly");
    public static final /* enum */ bNH kGG = new bNH(10212, "nation.error.diplomacy.alreadyHasAllyRequest");
    public static final /* enum */ bNH kGH = new bNH(10208, "nation.error.governmentNominationForbiddenByRevokeChatMessage");
    public static final /* enum */ bNH kGI = new bNH(10209, "nation.error.governmentCandidateForbiddenByRevokeChatMessage");
    public static final /* enum */ bNH kGJ = new bNH(10210, "nation.error.voteForbiddenChatMessage");
    public static final /* enum */ bNH kGK = new bNH(10213, "nation.error.alreadyVoted");
    public static final /* enum */ bNH kGL = new bNH(7, "error.playerNotSubscribed");
    public static final /* enum */ bNH kGM = new bNH(8, "error.targetNotSubscribed");
    public static final /* enum */ bNH kGN = new bNH(10300, "companion.error.generic");
    public static final /* enum */ bNH kGO = new bNH(10301, "companion.itemEquipErrorGeneric");
    public static final /* enum */ bNH kGP = new bNH(10302, "companion.error.unknownCompanion");
    public static final /* enum */ bNH kGQ = new bNH(10303, "companion.error.companionUnalaivable");
    public static final /* enum */ bNH kGR = new bNH(10304, "companion.error.badInstance");
    public static final /* enum */ bNH kGS = new bNH(10305, "companion.could.not.retrieve.everything");
    public static final /* enum */ bNH kGT = new bNH(11000 + fiY.suz.aJr(), "market.kamas.sent.to.rewards");
    public static final /* enum */ bNH kGU = new bNH(11000 + fiY.suA.aJr(), "market.not.all.items.in.offer");
    public static final /* enum */ bNH kGV = new bNH(11000 + fiY.suB.aJr(), "market.generic.error");
    public static final /* enum */ bNH kGW = new bNH(11000 + fiY.suC.aJr(), "market.generic.error");
    public static final /* enum */ bNH kGX = new bNH(11000 + fiY.suD.aJr(), "market.unavailable");
    public static final /* enum */ bNH kGY = new bNH(11000 + fiY.suE.aJr(), "market.invalid.parameters");
    public static final /* enum */ bNH kGZ = new bNH(11000 + fiY.suF.aJr(), "market.generic.error");
    public static final /* enum */ bNH kHa = new bNH(11000 + fiY.suG.aJr(), "market.player.has.occupation");
    public static final /* enum */ bNH kHb = new bNH(11000 + fiY.suH.aJr(), "market.player.flooding");
    public static final /* enum */ bNH kHc = new bNH(11000 + fiY.suI.aJr(), "market.not.enough.cash");
    public static final /* enum */ bNH kHd = new bNH(11000 + fiY.suJ.aJr(), "market.player.too.many.entries");
    public static final /* enum */ bNH kHe = new bNH(11000 + fiY.suK.aJr(), "market.inventory.error");
    public static final /* enum */ bNH kHf = new bNH(11000 + fiY.suL.aJr(), "market.player.is.blacklisted");
    public static final /* enum */ bNH kHg = new bNH(11000 + fiY.suM.aJr(), "market.unknown.item");
    public static final /* enum */ bNH kHh = new bNH(11000 + fiY.suN.aJr(), "market.invalid.item");
    public static final /* enum */ bNH kHi = new bNH(11000 + fiY.suO.aJr(), "market.item.not.enough.quantity");
    public static final /* enum */ bNH kHj = new bNH(11000 + fiY.suQ.aJr(), "market.inventory.is.full");
    public static final /* enum */ bNH kHk = new bNH(11000 + fiY.suR.aJr(), "market.not.enough.items");
    public static final /* enum */ bNH kHl = new bNH(11000 + fiY.suP.aJr(), "market.unstackable.items");
    public static final /* enum */ bNH kHm = new bNH(11000 + fiY.suS.aJr(), "market.item.does.not.match.offer");
    public static final /* enum */ bNH kHn = new bNH(11000 + fiY.suT.aJr(), "market.unknown.entry");
    public static final /* enum */ bNH kHo = new bNH(11000 + fiY.suU.aJr(), "market.generic.error");
    public static final /* enum */ bNH kHp = new bNH(11000 + fiY.suV.aJr(), "market.unknown.offer");
    public static final /* enum */ bNH kHq = new bNH(11000 + fiY.suW.aJr(), "market.generic.error");
    public static final /* enum */ bNH kHr = new bNH(112, "furniture.invalid.direction");
    public static final /* enum */ bNH kHs = new bNH(11100 + fhe_0.spw.aJr(), "error.impossibleDuringFight");
    public static final /* enum */ bNH kHt = new bNH(11100 + fhe_0.spx.aJr(), "error.impossibleDuringExchange");
    public static final /* enum */ bNH kHu = new bNH(11100 + fhe_0.spy.aJr(), "enchantment.error.not.at.machine");
    public static final /* enum */ bNH kHv = new bNH(11100 + fhe_0.spz.aJr(), "market.generic.error");
    public static final /* enum */ bNH kHw = new bNH(11100 + fhe_0.spA.aJr(), "market.generic.error");
    public static final /* enum */ bNH kHx = new bNH(11100 + fhe_0.spB.aJr(), "enchantment.error.invalid.item");
    public static final /* enum */ bNH kHy = new bNH(11100 + fhe_0.spC.aJr(), "enchantment.error.invalid.item");
    public static final /* enum */ bNH kHz = new bNH(11100 + fhe_0.spD.aJr(), "enchantment.error.invalid.item");
    private static final TIntObjectHashMap<bNH> kHA;
    public final int kHB;
    public final String kHC;
    private static final /* synthetic */ bNH[] kHD;

    public static bNH[] values() {
        return (bNH[])kHD.clone();
    }

    public static bNH valueOf(String string) {
        return Enum.valueOf(bNH.class, string);
    }

    private bNH(int n2, String string2) {
        this.kHB = n2;
        this.kHC = string2;
    }

    static bNH Iq(int n) {
        return (bNH)((Object)kHA.get(n));
    }

    private static /* synthetic */ bNH[] egm() {
        return new bNH[]{kEd, kEe, kEf, kEg, kEh, kEi, kEj, kEk, kEl, kEm, kEn, kEo, kEp, kEq, kEr, kEs, kEt, kEu, kEv, kEw, kEx, kEy, kEz, kEA, kEB, kEC, kED, kEE, kEF, kEG, kEH, kEI, kEJ, kEK, kEL, kEM, kEN, kEO, kEP, kEQ, kER, kES, kET, kEU, kEV, kEW, kEX, kEY, kEZ, kFa, kFb, kFc, kFd, kFe, kFf, kFg, kFh, kFi, kFj, kFk, kFl, kFm, kFn, kFo, kFp, kFq, kFr, kFs, kFt, kFu, kFv, kFw, kFx, kFy, kFz, kFA, kFB, kFC, kFD, kFE, kFF, kFG, kFH, kFI, kFJ, kFK, kFL, kFM, kFN, kFO, kFP, kFQ, kFR, kFS, kFT, kFU, kFV, kFW, kFX, kFY, kFZ, kGa, kGb, kGc, kGd, kGe, kGf, kGg, kGh, kGi, kGj, kGk, kGl, kGm, kGn, kGo, kGp, kGq, kGr, kGs, kGt, kGu, kGv, kGw, kGx, kGy, kGz, kGA, kGB, kGC, kGD, kGE, kGF, kGG, kGH, kGI, kGJ, kGK, kGL, kGM, kGN, kGO, kGP, kGQ, kGR, kGS, kGT, kGU, kGV, kGW, kGX, kGY, kGZ, kHa, kHb, kHc, kHd, kHe, kHf, kHg, kHh, kHi, kHj, kHk, kHl, kHm, kHn, kHo, kHp, kHq, kHr, kHs, kHt, kHu, kHv, kHw, kHx, kHy, kHz};
    }

    static {
        kHD = bNH.egm();
        kHA = new TIntObjectHashMap();
        for (bNH bNH2 : bNH.values()) {
            kHA.put(bNH2.kHB, (Object)bNH2);
        }
    }
}

