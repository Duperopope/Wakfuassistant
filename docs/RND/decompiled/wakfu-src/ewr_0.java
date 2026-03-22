/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ewr
 */
public final class ewr_0
extends Enum<ewr_0> {
    public static final /* enum */ ewr_0 oBO = new ewr_0(1, "monitoredproperties.enable", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oBP = new ewr_0(2, "calendar.delta", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oBQ = new ewr_0(3, "calendar.timezone", "UTC", true, ews_0.oGB);
    public static final /* enum */ ewr_0 oBR = new ewr_0(4, "censor.enable", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oBS = new ewr_0(5, "serverLanguage", "", true, ews_0.oGC);
    public static final /* enum */ ewr_0 oBT = new ewr_0(6, "ssl.enable", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oBU = new ewr_0(8, "authorizedCharacterClass", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oBV = new ewr_0(9, "worldInstances.forbidden", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oBW = new ewr_0(11, "shopInGameInteractions.enable", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oBX = new ewr_0(12, "contactModerator.enable", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oBY = new ewr_0(13, "display.subscription.end.popup.enable", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oBZ = new ewr_0(14, "partner", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oCa = new ewr_0(15, "shop.enable", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCb = new ewr_0(16, "account.free.character.slots", "5", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCc = new ewr_0(17, "shop.used", "shopi", true, ews_0.oGB);
    public static final /* enum */ ewr_0 oCd = new ewr_0(18, "shop.stone.level.min", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCe = new ewr_0(60, "shopi.categoriesUsingClientPagination", "485", true, ews_0.oGC);
    public static final /* enum */ ewr_0 oCf = new ewr_0(19, "metrics.reporter.enable", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oCg = new ewr_0(20, "beta.check.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oCh = new ewr_0(21, "client.path.scheduling.enabled", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCi = new ewr_0(22, "heroes.allow.tutorial", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCj = new ewr_0(30, "player.level.default", "6", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oCk = new ewr_0(31, "player.level.cap", "245", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCl = new ewr_0(32, "player.default.startPoint", "-8|-1|18|895", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oCm = new ewr_0(33, "player.incarnam.startPoint", "0|0|40|1465", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oCn = new ewr_0(50, "client.npc.forced.skin", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCo = new ewr_0(51, "client.pc.forced.skin", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCp = new ewr_0(52, "client.npc.forced.scale", "0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oCq = new ewr_0(53, "client.pc.forced.scale", "0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oCr = new ewr_0(101, "platform.name", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oCs = new ewr_0(201, "game.id", "3", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oCt = new ewr_0(202, "expomode.enable", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCu = new ewr_0(203, "adminrights.forceAll", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oCv = new ewr_0(204, "serverlock.enable", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oCw = new ewr_0(206, "subscription.required", "", ews_0.oGD);
    public static final /* enum */ ewr_0 oCx = new ewr_0(207, "subscription.force", "0", ews_0.oGA);
    public static final /* enum */ ewr_0 oCy = new ewr_0(208, "community.check.enabled", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oCz = new ewr_0(209, "community.required", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oCA = new ewr_0(210, "community.forbidden", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oCB = new ewr_0(211, "antiAddiction.enable", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCC = new ewr_0(212, "antiAddiction.force.accounts", "", ews_0.oGD);
    public static final /* enum */ ewr_0 oCD = new ewr_0(215, "subscription.forced.duration.in.second", "-1", ews_0.oGA);
    public static final /* enum */ ewr_0 oCE = new ewr_0(218, "subscription.check.game.id", "0", ews_0.oGA);
    public static final /* enum */ ewr_0 oCF = new ewr_0(219, "queue.activated", "true", ews_0.oGz);
    public static final /* enum */ ewr_0 oCG = new ewr_0(220, "queue.player.limit", "0", ews_0.oGA);
    public static final /* enum */ ewr_0 oCH = new ewr_0(222, "queue.notify.initial.delay", "1000", ews_0.oGA);
    public static final /* enum */ ewr_0 oCI = new ewr_0(223, "queue.notify.periodical.delay", "1000", ews_0.oGA);
    public static final /* enum */ ewr_0 oCJ = new ewr_0(224, "queue.additional.whitelist", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oCK = new ewr_0(221, "partners.authorized", "default|steam", ews_0.oGC);
    public static final /* enum */ ewr_0 oCL = new ewr_0(230, "server.restrictions.ip.count", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCM = new ewr_0(231, "server.restrictions.ip.admin.bypass", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCN = new ewr_0(232, "server.restrictions.account.secure", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCO = new ewr_0(233, "server.restrictions.account.2fa", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCP = new ewr_0(234, "server.restrictions.account.mail", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCQ = new ewr_0(235, "server.restrictions.account.gsm", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCR = new ewr_0(236, "server.restrictions.account.identity", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCS = new ewr_0(237, "server.restrictions.ip.tolerance", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oCT = new ewr_0(238, "server.restrictions.mac.count", "0", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oCU = new ewr_0(239, "server.restrictions.mac.admin.bypass", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oCV = new ewr_0(250, "server.restrictions.earlyAccess", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oCW = new ewr_0(251, "server.ips.bypassing.limit", "", false, ews_0.oGC);
    public static final /* enum */ ewr_0 oCX = new ewr_0(252, "server.group.isneo", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oCY = new ewr_0(301, "instances.staticDistribution", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oCZ = new ewr_0(302, "moderation.teleport.fromHavenBagAllowed", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDa = new ewr_0(303, "moderation.teleport.fromFightAllowed", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDb = new ewr_0(304, "server.data.safety.status", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDc = new ewr_0(401, "preboostCharacter.enable", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oDd = new ewr_0(402, "achievements.forbidden", "", ews_0.oGD);
    public static final /* enum */ ewr_0 oDe = new ewr_0(403, "interactiveElements.forbidden", "", ews_0.oGD);
    public static final /* enum */ ewr_0 oDf = new ewr_0(405, "dungeonDailyLockBypass", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDg = new ewr_0(406, "companions.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDh = new ewr_0(407, "beta.mode", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDi = new ewr_0(408, "subscription.defaultValue", "0", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oDj = new ewr_0(409, "subscription.dateTimezone", "Europe/Paris", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oDk = new ewr_0(411, "freeCompanion.enable", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDl = new ewr_0(412, "rerollXpBonus.enable", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDm = new ewr_0(413, "shop.key", "WAKFU_INGAME", true, ews_0.oGB);
    public static final /* enum */ ewr_0 oDn = new ewr_0(414, "instancesNeedingAccessRights", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDo = new ewr_0(415, "instancesNeedingInteractionRights", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDp = new ewr_0(416, "collectFightEnabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDq = new ewr_0(417, "shop.gifts.minimumPurchaseDate", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oDr = new ewr_0(418, "timerForFirstCollect", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDs = new ewr_0(419, "forceBindOnPickup.enable", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDt = new ewr_0(420, "server.id", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDu = new ewr_0(422, "shop.gifts.disabled.items", "", false, ews_0.oGD);
    public static final /* enum */ ewr_0 oDv = new ewr_0(423, "shop.gifts.excluded.distribution.tags", "", false, ews_0.oGC);
    public static final /* enum */ ewr_0 oDw = new ewr_0(424, "itemTracker.logLevel", "10000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oDx = new ewr_0(426, "steam.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oDy = new ewr_0(431, "heroes.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDz = new ewr_0(432, "server.restrictions.craft.kamaCraftingAllowed", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDA = new ewr_0(433, "transfer.duration.alert.millis", "5000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oDB = new ewr_0(434, "feature.spectatormode.allowed", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDC = new ewr_0(435, "disabled.items.list", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDD = new ewr_0(436, "disabled.spells.list", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDE = new ewr_0(437, "disabled.summon.list", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDF = new ewr_0(438, "disabled.dungeon.list", "", false, ews_0.oGD);
    public static final /* enum */ ewr_0 oDG = new ewr_0(439, "disabled.drops.list", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDH = new ewr_0(440, "feature.pactpvp.allowed", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDI = new ewr_0(441, "feature.oldEnchant.enabled", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDJ = new ewr_0(442, "feature.item.set.merge.enabled", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDK = new ewr_0(443, "feature.item.merge.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDL = new ewr_0(444, "disabled.monsters.harvest", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDM = new ewr_0(445, "disabled.monsters.fight", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oDN = new ewr_0(460, "mount.riding.allowed", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oDO = new ewr_0(461, "mount.riding.delay", "1000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oDP = new ewr_0(465, "ecosystem.resources.speed", "1.0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oDQ = new ewr_0(466, "ecosystem.resources.protection.seconds", "300", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDR = new ewr_0(470, "fight.duration.placement", "60000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDS = new ewr_0(471, "fight.duration.turn", "30000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDT = new ewr_0(472, "fight.duration.turn.incrementForFirst", "30000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDU = new ewr_0(473, "fight.duration.turn.reduced", "20000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDV = new ewr_0(474, "fight.duration.turn.increased", "90000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDW = new ewr_0(475, "fight.duration.turn.max", "120000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDX = new ewr_0(476, "fight.duration.turn.boss", "60000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDY = new ewr_0(477, "fight.duration.turn.bonus.ap", "500", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oDZ = new ewr_0(478, "fight.duration.turn.bonus.mp", "500", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEa = new ewr_0(479, "fight.duration.turn.bonus.wp", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEb = new ewr_0(480, "fight.duration.turn.bonus.max", "30000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEc = new ewr_0(500, "version.check", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEd = new ewr_0(600, "proxy.list", "proxies.json", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEe = new ewr_0(601, "admin.list", "admins.json", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEf = new ewr_0(602, "heroes.forceAddToParty", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEg = new ewr_0(603, "companies.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEh = new ewr_0(604, "newCraft.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEi = new ewr_0(605, "haapi.user", "wakfu", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEj = new ewr_0(606, "haapi.pass", "pass", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEk = new ewr_0(607, "haapi.ankama.url", "https://haapi.ankama.tst/json/Ankama/v5", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEl = new ewr_0(608, "haapi.timeout", "5000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEm = new ewr_0(609, "new.chat.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEn = new ewr_0(610, "default.bonus.sheet", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEo = new ewr_0(611, "trunk", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEp = new ewr_0(613, "ogrest.total.score", "25000000", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEq = new ewr_0(620, "automaticDnd", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEr = new ewr_0(621, "party.max.own.companions", "2", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEs = new ewr_0(622, "party.max.own.heroes", "2", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEt = new ewr_0(623, "party.max.own.heroes.companions", "2", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEu = new ewr_0(624, "demo", "false", ews_0.oGz);
    public static final /* enum */ ewr_0 oEv = new ewr_0(625, "battleground.start.hour", "14", ews_0.oGA);
    public static final /* enum */ ewr_0 oEw = new ewr_0(626, "battleground.end.hour", "23", ews_0.oGA);
    public static final /* enum */ ewr_0 oEx = new ewr_0(627, "battleground.interval.minute", "60", ews_0.oGA);
    public static final /* enum */ ewr_0 oEy = new ewr_0(628, "battleground.active", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEz = new ewr_0(629, "party.max.members", "6", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEA = new ewr_0(630, "item.service.url", "http://localhost:8080", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oEB = new ewr_0(631, "shop.payment.mode", "OK", true, ews_0.oGB);
    public static final /* enum */ ewr_0 oEC = new ewr_0(632, "battleground.days.of.the.week", "1|2|3|4|5|6|7", ews_0.oGD);
    public static final /* enum */ ewr_0 oED = new ewr_0(633, "battleground.resources.protection.seconds", "60", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEE = new ewr_0(700, "havenworld.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEF = new ewr_0(701, "guild.level.min.required.for.auction", "10", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEG = new ewr_0(702, "havenworld.max.instances", "150", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEH = new ewr_0(703, "havenworld.game.server.id", "1", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEI = new ewr_0(704, "havenworld.ttl", "10", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEJ = new ewr_0(705, "feature.guild.chest.kamas.withdrawal.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEK = new ewr_0(706, "feature.guild.chest.kamas.deposit.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEL = new ewr_0(707, "feature.guild.bonus.speed.factor", "1.0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oEM = new ewr_0(708, "feature.guild.points.maxPerWeek", "7500", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oEN = new ewr_0(1000, "unknown.value.1", "5000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEO = new ewr_0(2001, "forced.spawned.point", "", false, ews_0.oGD);
    public static final /* enum */ ewr_0 oEP = new ewr_0(2003, "name.check.disabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEQ = new ewr_0(2004, "character.deletion.disabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oER = new ewr_0(2005, "character.creation.disabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oES = new ewr_0(2006, "character.rename.disabled", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oET = new ewr_0(2007, "character.change.disabled", "false", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oEU = new ewr_0(2010, "load.achievements", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oEV = new ewr_0(2020, "character.resend.initial.delay", "200", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEW = new ewr_0(2021, "character.resend.timeout.delay", "60000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEX = new ewr_0(2022, "character.forced.release.retry.delay", "5000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEY = new ewr_0(2023, "character.forced.release.timeout.delay", "3600000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oEZ = new ewr_0(2024, "action.flood.check.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oFa = new ewr_0(2025, "character.rename.free.date", "0", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFb = new ewr_0(2026, "spell.cast.logging.threshold.ms", "500", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFc = new ewr_0(2027, "fight.end.logging.threshold.ms", "500", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFd = new ewr_0(2028, "character.inventory.sync.delay.seconds", "120", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFe = new ewr_0(2029, "character.deletion.daily.limit", "18", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFf = new ewr_0(2030, "server.group.characters.limit", "18", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFg = new ewr_0(2050, "global.chat.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oFh = new ewr_0(2052, "global.chat.trade.delay", "60000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFi = new ewr_0(2053, "global.chat.community.delay", "60000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFj = new ewr_0(2054, "global.chat.recruitment.delay", "60000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFk = new ewr_0(2055, "global.chat.restriction.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oFl = new ewr_0(2056, "global.chat.restriction.level", "50", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFm = new ewr_0(2057, "chat.send.items.data", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFn = new ewr_0(2058, "chat.flood.check.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oFo = new ewr_0(2059, "chat.sms.check.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oFp = new ewr_0(2200, "base.xp.ratio", "0.7692", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oFq = new ewr_0(2201, "booster.xp.bonus", "50", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFr = new ewr_0(2202, "base.craft.xp.ratio", "0.6667", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oFs = new ewr_0(2203, "booster.craft.xp.bonus", "50", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFt = new ewr_0(2204, "base.kamas.ratio", "1.0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oFu = new ewr_0(2205, "booster.kamas.bonus", "30", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFv = new ewr_0(2206, "base.drop.ratio", "1.0", true, ews_0.oGF);
    public static final /* enum */ ewr_0 oFw = new ewr_0(2207, "booster.drop.bonus", "25", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFx = new ewr_0(2300, "bodyguard.api.key", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFy = new ewr_0(2301, "bodyguard.nala.character.base.path", "https://nala2.ankama.com/fr/wakfu/characters?character=", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFz = new ewr_0(2302, "bodyguard.nala.account.base.path", "https://nala2.ankama.com/fr/account?id=", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFA = new ewr_0(2303, "bodyguard.excluded.channels", "guild|party", false, ews_0.oGC);
    public static final /* enum */ ewr_0 oFB = new ewr_0(2304, "bodyguard.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFC = new ewr_0(2305, "bodyguard.do.not.remove", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFD = new ewr_0(2306, "bodyguard.excluded.classifications", "", false, ews_0.oGC);
    public static final /* enum */ ewr_0 oFE = new ewr_0(2307, "bodyguard.nala.server.id.argument", "&server_id=", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFF = new ewr_0(2321, "bodyguard.vicinity.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFG = new ewr_0(2322, "bodyguard.battleground.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFH = new ewr_0(2323, "bodyguard.guild.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFI = new ewr_0(2324, "bodyguard.party.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFJ = new ewr_0(2325, "bodyguard.politic.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFK = new ewr_0(2326, "bodyguard.private.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFL = new ewr_0(2327, "bodyguard.trade.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFM = new ewr_0(2328, "bodyguard.community.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFN = new ewr_0(2329, "bodyguard.recruitment.channel.id", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFO = new ewr_0(2490, "market.service.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFP = new ewr_0(2491, "market.service.url", "http://localhost:8081", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oFQ = new ewr_0(2492, "market.debug", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFR = new ewr_0(2493, "market.offers.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFS = new ewr_0(2500, "cosmetics.type.hidden", "", true, ews_0.oGD);
    public static final /* enum */ ewr_0 oFT = new ewr_0(2510, "non.permanent.build.limit", "24", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFU = new ewr_0(2520, "cosmetic.preset.limit", "100", true, ews_0.oGA);
    public static final /* enum */ ewr_0 oFV = new ewr_0(2540, "metrics.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFW = new ewr_0(2541, "metrics.summary.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFX = new ewr_0(2542, "metrics.summary.quantile.type", "0", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oFY = new ewr_0(2543, "admin.in.account.cache.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oFZ = new ewr_0(2544, "account.cache.enabled", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGa = new ewr_0(2545, "enable.connection.time.measure", "true", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGb = new ewr_0(2546, "convention.ladder.save.path", "LadderBack.csv", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oGc = new ewr_0(2547, "convention.ladder.max.entry.count", "20", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oGd = new ewr_0(2548, "full.hp.on.connection", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGe = new ewr_0(2549, "multicraft.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oGf = new ewr_0(2550, "parallel.reload.buff", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGg = new ewr_0(2551, "parallel.reload.buff.timeout", "1000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oGh = new ewr_0(2552, "gifts.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oGi = new ewr_0(2600, "character.api.url", "", false, ews_0.oGB);
    public static final /* enum */ ewr_0 oGj = new ewr_0(2601, "character.api.enabled", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGk = new ewr_0(2602, "character.api.timeout.ms", "3000", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oGl = new ewr_0(2653, "encyclopedia.enabled", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oGm = new ewr_0(2654, "encyclopedia.display.loot.criteria", "true", true, ews_0.oGz);
    public static final /* enum */ ewr_0 oGn = new ewr_0(2655, "ia.thread.count", "8", false, ews_0.oGA);
    public static final /* enum */ ewr_0 oGo = new ewr_0(2656, "ia.thread.maps.synchronization", "false", false, ews_0.oGz);
    public static final /* enum */ ewr_0 oGp = new ewr_0(2700, "fight.log.start.end", "true", true, ews_0.oGz);
    private static final TShortObjectHashMap<ewr_0> oGq;
    private static final HashMap<String, ewr_0> oGr;
    static final int oGs;
    private final short oGt;
    private final String oGu;
    private final boolean oGv;
    private final Object oGw;
    private final ews_0 oGx;
    private static final /* synthetic */ ewr_0[] oGy;

    public static ewr_0[] values() {
        return (ewr_0[])oGy.clone();
    }

    public static ewr_0 valueOf(String string) {
        return Enum.valueOf(ewr_0.class, string);
    }

    private ewr_0(@NotNull int n2, String string2, String string3, ews_0 ews_02) {
        this.oGt = GC.cu(n2);
        this.oGu = string2;
        this.oGw = ewm_0.a(ews_02, string3);
        this.oGv = false;
        this.oGx = ews_02;
    }

    private ewr_0(@NotNull int n2, String string2, String string3, boolean bl, ews_0 ews_02) {
        this.oGt = GC.cu(n2);
        this.oGu = string2;
        this.oGv = bl;
        this.oGw = ewm_0.a(ews_02, string3);
        this.oGx = ews_02;
    }

    public static ewr_0 rJ(String string) {
        return oGr.get(string);
    }

    public static ewr_0 dc(short s) {
        return (ewr_0)((Object)oGq.get(s));
    }

    public short aIi() {
        return this.oGt;
    }

    public String getKey() {
        return this.oGu;
    }

    public boolean feS() {
        return this.oGv;
    }

    @NotNull
    public Object getDefaultValue() {
        return this.oGw;
    }

    public ews_0 feT() {
        return this.oGx;
    }

    private static /* synthetic */ ewr_0[] feU() {
        return new ewr_0[]{oBO, oBP, oBQ, oBR, oBS, oBT, oBU, oBV, oBW, oBX, oBY, oBZ, oCa, oCb, oCc, oCd, oCe, oCf, oCg, oCh, oCi, oCj, oCk, oCl, oCm, oCn, oCo, oCp, oCq, oCr, oCs, oCt, oCu, oCv, oCw, oCx, oCy, oCz, oCA, oCB, oCC, oCD, oCE, oCF, oCG, oCH, oCI, oCJ, oCK, oCL, oCM, oCN, oCO, oCP, oCQ, oCR, oCS, oCT, oCU, oCV, oCW, oCX, oCY, oCZ, oDa, oDb, oDc, oDd, oDe, oDf, oDg, oDh, oDi, oDj, oDk, oDl, oDm, oDn, oDo, oDp, oDq, oDr, oDs, oDt, oDu, oDv, oDw, oDx, oDy, oDz, oDA, oDB, oDC, oDD, oDE, oDF, oDG, oDH, oDI, oDJ, oDK, oDL, oDM, oDN, oDO, oDP, oDQ, oDR, oDS, oDT, oDU, oDV, oDW, oDX, oDY, oDZ, oEa, oEb, oEc, oEd, oEe, oEf, oEg, oEh, oEi, oEj, oEk, oEl, oEm, oEn, oEo, oEp, oEq, oEr, oEs, oEt, oEu, oEv, oEw, oEx, oEy, oEz, oEA, oEB, oEC, oED, oEE, oEF, oEG, oEH, oEI, oEJ, oEK, oEL, oEM, oEN, oEO, oEP, oEQ, oER, oES, oET, oEU, oEV, oEW, oEX, oEY, oEZ, oFa, oFb, oFc, oFd, oFe, oFf, oFg, oFh, oFi, oFj, oFk, oFl, oFm, oFn, oFo, oFp, oFq, oFr, oFs, oFt, oFu, oFv, oFw, oFx, oFy, oFz, oFA, oFB, oFC, oFD, oFE, oFF, oFG, oFH, oFI, oFJ, oFK, oFL, oFM, oFN, oFO, oFP, oFQ, oFR, oFS, oFT, oFU, oFV, oFW, oFX, oFY, oFZ, oGa, oGb, oGc, oGd, oGe, oGf, oGg, oGh, oGi, oGj, oGk, oGl, oGm, oGn, oGo, oGp};
    }

    static {
        oGy = ewr_0.feU();
        oGq = new TShortObjectHashMap();
        oGr = new HashMap();
        int n = 0;
        for (ewr_0 ewr_02 : ewr_0.values()) {
            oGq.put(ewr_02.oGt, (Object)ewr_02);
            oGr.put(ewr_02.oGu, ewr_02);
            if (!ewr_02.oGv) continue;
            ++n;
        }
        oGs = n;
    }
}

