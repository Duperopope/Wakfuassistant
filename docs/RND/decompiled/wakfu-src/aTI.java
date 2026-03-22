/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.BaseRecognizer
 *  org.antlr.runtime.DFA
 *  org.antlr.runtime.IntStream
 *  org.antlr.runtime.NoViableAltException
 */
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.NoViableAltException;

public class aTI
extends DFA {
    public aTI(aTG aTG2, BaseRecognizer baseRecognizer) {
        this.recognizer = baseRecognizer;
        this.decisionNumber = 95;
        this.eot = aTG.fdH;
        this.eof = aTG.fdI;
        this.min = aTG.fdJ;
        this.max = aTG.fdK;
        this.accept = aTG.fdL;
        this.special = aTG.fdM;
        this.transition = aTG.fdN;
    }

    public String getDescription() {
        return "1:1: Tokens : ( ADD | BAN | BEGIN | COMPLETE | COORDS_SEPARATOR | DISABLE | DUMP | ENABLE | END | ENDLINE | ESCAPE | GET | INFO | KICK | LOCK | OFF | ON | PANEL | PAUSE | PING | REMOVE | RESET | RESUME | RIGHTS | SET | SHUTDOWN | START | START_DATE | STATS | STATUS | STOP | SYMBIOT | TURN_DURATION | UNBAN | UNLOCK | VAR | WHERE | WHO | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | T__280 | T__281 | T__282 | T__283 | T__284 | T__285 | T__286 | T__287 | T__288 | T__289 | T__290 | T__291 | T__292 | T__293 | T__294 | T__295 | T__296 | T__297 | T__298 | T__299 | T__300 | T__301 | T__302 | T__303 | T__304 | T__305 | T__306 | T__307 | T__308 | T__309 | T__310 | T__311 | T__312 | T__313 | T__314 | T__315 | T__316 | T__317 | T__318 | T__319 | T__320 | T__321 | T__322 | T__323 | T__324 | T__325 | T__326 | T__327 | T__328 | T__329 | T__330 | T__331 | T__332 | T__333 | T__334 | T__335 | T__336 | T__337 | T__338 | T__339 | T__340 | T__341 | T__342 | T__343 | T__344 | T__345 | T__346 | T__347 | T__348 | T__349 | T__350 | T__351 | T__352 | T__353 | T__354 | T__355 | T__356 | T__357 | T__358 | T__359 | T__360 | T__361 | T__362 | T__363 | T__364 | T__365 | T__366 | T__367 | T__368 | T__369 | T__370 | T__371 | T__372 | T__373 | T__374 | T__375 | T__376 | T__377 | T__378 | T__379 | T__380 | T__381 | T__382 | T__383 | T__384 | T__385 | T__386 | T__387 | T__388 | T__389 | T__390 | T__391 | T__392 | T__393 | T__394 | T__395 | T__396 | T__397 | T__398 | T__399 | T__400 | T__401 | T__402 | T__403 | T__404 | T__405 | T__406 | T__407 | T__408 | T__409 | T__410 | T__411 | T__412 | T__413 | T__414 | T__415 | T__416 | T__417 | T__418 | T__419 | T__420 | T__421 | T__422 | T__423 | T__424 | T__425 | T__426 | T__427 | T__428 | T__429 | T__430 | T__431 | T__432 | T__433 | T__434 | T__435 | T__436 | T__437 | T__438 | T__439 | T__440 | T__441 | T__442 | T__443 | T__444 | T__445 | T__446 | T__447 | T__448 | T__449 | T__450 | T__451 | T__452 | T__453 | T__454 | T__455 | T__456 | T__457 | T__458 | T__459 | T__460 | T__461 | T__462 | T__463 | T__464 | T__465 | T__466 | T__467 | T__468 | T__469 | T__470 | T__471 | T__472 | T__473 | T__474 | T__475 | T__476 | T__477 | T__478 | T__479 | T__480 | T__481 | T__482 | T__483 | T__484 | T__485 | T__486 | T__487 | T__488 | T__489 | T__490 | T__491 | T__492 | T__493 | T__494 | T__495 | T__496 | T__497 | T__498 | T__499 | T__500 | T__501 | T__502 | T__503 | T__504 | T__505 | T__506 | T__507 | T__508 | T__509 | T__510 | T__511 | T__512 | T__513 | T__514 | T__515 | T__516 | T__517 | T__518 | T__519 | T__520 | T__521 | T__522 | T__523 | T__524 | T__525 | T__526 | T__527 | T__528 | T__529 | T__530 | T__531 | T__532 | T__533 | T__534 | T__535 | T__536 | T__537 | T__538 | T__539 | T__540 | T__541 | T__542 | T__543 | T__544 | T__545 | T__546 | T__547 | T__548 | T__549 | T__550 | T__551 | T__552 | T__553 | T__554 | T__555 | T__556 | T__557 | T__558 | T__559 | T__560 | T__561 | T__562 | T__563 | T__564 | T__565 | T__566 | T__567 | T__568 | T__569 | T__570 | T__571 | T__572 | BOT | TIME | SERVERLOCK | VERSION | TELEPORT | TELEPORT_USER | TELEPORT_TO_MONSTER | GHOSTCHECK | CREATE_GROUP | DESTROY_MONSTERS | PLANT_RESOURCES | DESTROY_RESOURCES | ADD_TO_GROUP | PLAY_APS | PLAY_ANIMATION | CHAOS | RESTART_CHAOS | CREATE_ITEM | RECREATE_ITEM | CREATE_RECIPE_ITEMS | SHOW_RECIPE_ITEMS | CREATE_SET | DELETE_ITEM | REGENERATE | REGENERATE_WITH_ITEM | HELP | RUNACTION | STAFF | SUBSCRIBER | FREE_ACCESS | ENDSCENARIO | RELOADSCENARIOS | SCENARIO_COMMAND | ADD_SPELLXP | ADD_XP | SET_BONUS_FACTOR | SET_SPELLLEVEL | ADD_SKILLXP | SET_SKILL_LEVEL | ALMANACH | ADD_ITEM_XP | ADD_MONEY | GOD_MODE | SYSMSG | MSGALL | INSTANCE_USAGE | DESTROY_INSTANCE | SHOW_AGGRO_LIST | SET_LEVEL | IDENT_PHASE | SESSIONS | MUTE_PARTITIONS | UNMUTE_PARTITIONS | MUTE | UNMUTE | SETNEXTCHALLENGE | FINISHCHALLENGE | SPAWN_INTERACTIVE_ELEMENT | DISTRIBUTE_ITEMS | NATION | NATION_CHANGE | SEARCH | QUOTA | RAGNAROK | BUFF | VOTE | CITIZEN_POINTS | SET_RANK | ALIGNMENT | SHOW_POPULATION | SHOW_MONSTER_QUOTA | CANCEL_COLLECT_COOLDOWN | MONSTER_GROUP | GET_INSTANCE_UID | TEMP | CALENDAR_CMD | DUMP_BAG | SET_WAKFU_GAUGE | ZONE_BUFF | PROTECTOR_CMD | STATE_CMD | FIGHT_CMD | SET_RESPAWN_CMD | CHECK_CMD | CRAFT_CMD | BAN_REQUEST | UNBAN_REQUEST | ACHIEVEMENT | ACCOUNT_ACHIEVEMENT_REWARD | SPELL_CMD | SPELL_XP | SHARD_CMD | PET | MOUNT | GUILD | COMPANION | HERO | FIGHT_CHALLENGE | HAVEN_WORLD | LEARN_EMOTE | REMOVE_EMOTE | SET_PLAYER_TITLE | REMOVE_PLAYER_TITLE | CREATE_FULL_GROUP | INVENTORY | EMPTY_CHAR | CLIENT_GAME_EVENT_CMD | CHARACTER_CMD | RESTORE_CHARACTER_CMD | CLEAN_CHARACTER_DELETED_TABLES_CMD | SET_ITEM_TRACKER_LOG_LEVEL_CMD | AI | POPUP_MESSAGE | RED_MESSAGE | RED_MESSAGE_TO_PLAYER | EMOTE_TARGETABLE | HAVEN_BAG_KICK | TP_TO_JAIL | FREEDOM | WEB_BROWSER | GIVE_ITEM | REVIVE | LIST_LOOT | SYSTEM_CONFIGURATION | PVP | REWARD | RECOMPUTE_POINTS | RESET_REGRESSION | RESET_ACCOUNT_MARKET_ENTRIES | GLOBAL_SPEED | SCHEDULE_PROCESS_AUTO_MESSAGE | DUNGEON | DUNGEON_LADDER | HAVEN_BAG | BP_NOTICE | BATTLEGROUND | MARKET | OGREST_CHAOS | PVP_INVENTORY | INFINITE_WAVES | LOCK_IE | LIST_IE | BAK | GUIDE | PLAYERS_QUOTA | LAG | KICK_ALL | GAME_ACCOUNT_DATA | WATCH | BANNED_WORDS | FURNITURE | COSMETIC_PRESET | ADMIN | CONNECTION_QUEUE_WHITELIST | HELP_PARAM | BOOLEAN | NUMBER | CHARNAME_PATTERN | ACCOUNT_PATTERN | PROXIMITY_PATTERN | ESCAPED_STRING | FLOAT | WHITESPACE | DATE );";
    }

    public int specialStateTransition(int n, IntStream intStream) {
        IntStream intStream2 = intStream;
        int n2 = n;
        switch (n) {
            case 0: {
                int n3 = intStream2.LA(1);
                n = -1;
                n = n3 >= 0 && n3 <= 65535 ? 92 : 91;
                if (n < 0) break;
                return n;
            }
        }
        NoViableAltException noViableAltException = new NoViableAltException(this.getDescription(), 95, n2, intStream2);
        this.error(noViableAltException);
        throw noViableAltException;
    }
}

