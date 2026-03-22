/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.THashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

public class ddU
extends afr_1 {
    static final Logger ohA = Logger.getLogger(ddU.class);
    static final afe_1[] ohB = new afe_1[]{new afe_1("dialogId", "Id du dialogue", aff_2.dJy, false), new afe_1("sourceType", "1 pour protecteur, 2 pour NPC", aff_2.dJy, false), new afe_1("sourceId", "L'id de la source (pour le protecteur, il ne s'agit pas du groupe de monstre associ?)", aff_2.dJw, false)};
    static final afe_1[] ohC = new afe_1[]{new afe_1("landMarkId", "Id de la note", aff_2.dJy, false)};
    static final afe_1[] ohD = new afe_1[]{new afe_1("achievementId", "Id de l'achievement", aff_2.dJy, false), new afe_1("follow", "Active le suivi (true | false)", aff_2.dJA, false)};
    static final afe_1[] ohE = new afe_1[]{new afe_1("popupOnEscape", "Press echap call the callFunction", aff_2.dJA, false), new afe_1("escapeTranslationKey", "Translation key displayed on the popup (if popupOnEscape = true)", aff_2.dJx, true), new afe_1("buttonTranslationKey", "Translation key displayed on the button", aff_2.dJx, true), new afe_1("callFunction", "Called method when button or escape (if popupOnEscape = true) are pressed", aff_2.dJx, true), new afe_1("params", "callFunction parameters", aff_2.dJC, true)};
    static final afe_1[] ohF = new afe_1[]{new afe_1("translationKey", "Cl? de traduction", aff_2.dJx, false), new afe_1("gfxId", "Id de l'icone", aff_2.dJy, false), new afe_1("worldX", "Position x", aff_2.dJy, false), new afe_1("worldY", "Position y", aff_2.dJy, false), new afe_1("worldZ", "Position z", aff_2.dJy, true), new afe_1("toClean", "Remove landmark when client closing", aff_2.dJA, true)};
    static final afe_1[] ohG = new afe_1[]{new afe_1("titleTranslationKey", "Clef de traduction du titre", aff_2.dJx, false), new afe_1("textTranslationKey", "Clef de traduction du texte", aff_2.dJx, false)};
    static final afe_1[] ohH = new afe_1[]{new afe_1("positive", "true affiche un +1, false affiche un -1", aff_2.dJA, true)};
    static final afe_1[] ohI = new afe_1[]{new afe_1("landMarkId", "Id de la note", aff_2.dJy, false)};
    static final afe_1[] ohJ = new afe_1[]{new afe_1("frescoId", "Id de la fresque", aff_2.dJy, false)};
    static final afe_1[] ohK = new afe_1[]{new afe_1("duration", "Dur?e du compte ? rebours", aff_2.dJy, false), new afe_1("startDate", "Date de d?part du compte ? rebours (date courante si non renseign?)", aff_2.dJw, true)};
    static final afe_1[] ohL = new afe_1[]{new afe_1("fighterId", "Id du fighter", aff_2.dJy, false), new afe_1("activated", "s?lectionne si true, d?selectionne si false", aff_2.dJA, false)};
    static final afe_1[] ohM = new afe_1[]{new afe_1("duration", "Dur?e du d?compte (en secondes)", aff_2.dJz, false), new afe_1("decrement", "Interval entre deux 'tic' de countdown", aff_2.dJz, true)};
    static final afe_1[] ohN = new afe_1[]{new afe_1("message", "Message ? afficher", aff_2.dJx, true), new afe_1("duration", "Dur?e d'affichage du message", aff_2.dJz, false)};
    static final afe_1[] ohO = new afe_1[]{new afe_1("elementId", "Id de l'?l?ment interactif sur lequel on ouvre le MRU", aff_2.dJw, false), new afe_1("eventId", "Id de l'?v?nement LUA g?n?r? par l'activation du MRU", aff_2.dJy, false), new afe_1("gfxId", "gfxId de l'action de MRU", aff_2.dJy, false)};
    static final afe_1[] ohP = new afe_1[]{new afe_1("interactiveElementId", "Id de l'?l?ment interactif sur lequel on ouvre le MRU", aff_2.dJz, false)};
    static final afe_1[] ohQ = new afe_1[]{new afe_1("skillVisualId", "Id de l'action", aff_2.dJz, false), new afe_1("usable", "Utilisable ou non", aff_2.dJA, false)};
    static final afe_1[] ohR = new afe_1[]{new afe_1("actionId", "Id de l'action", aff_2.dJz, false), new afe_1("usable", "Utilisable ou non", aff_2.dJA, false)};
    static final afe_1[] ohS = new afe_1[]{new afe_1("charaCcterId", "Id du personnage concern?", aff_2.dJw, false), new afe_1("actionId", "Id de l'action MRU", aff_2.dJz, false), new afe_1("onlyOnce", "Sp?cifie qu'on ajoutera pas le MRU s'il existe d?j? un avec le m?me id d'action sur ce personnage", aff_2.dJA, true)};
    static final afe_1[] ohT = new afe_1[]{new afe_1("characterId", "Id du personnage concern?", aff_2.dJw, false), new afe_1("actionId", "Id de l'action MRU concern?e", aff_2.dJz, false)};
    static final afe_1[] ohU = new afe_1[]{new afe_1("trainingActionIndex", "Id de l'action MRU concern?e", aff_2.dJy, false), new afe_1("shouldTeleport", "Indique si les fighters doivent ?tre t?l?port?s dans le combat ou pas", aff_2.dJA, false), new afe_1("fightType", "Indique le type de combat (pvp=1,pve=2,tuto=3,etc..cf FightModel)", aff_2.dJy, false), new afe_1("hasBorders", "Indique si le combat doit avoir des bordures", aff_2.dJA, false), new afe_1("battlegroundType", "Indique le type de bordure du combat", aff_2.dJy, false), new afe_1("bgParams", "Pattern du battleground", aff_2.dJC, true)};
    static final afe_1[] ohV = new afe_1[]{new afe_1("trainingActionIndex", "Id de l'action MRU concern?e", aff_2.dJy, false), new afe_1("bgX", "x de la position centre du battleground", aff_2.dJy, false), new afe_1("bgY", "y de la position centre du battleground", aff_2.dJy, false), new afe_1("bgZ", "z de la position centre du battleground", aff_2.dJy, false)};
    static final afe_1[] ohW = new afe_1[]{new afe_1("trainingActionIndex", "Id de l'action MRU concern?e", aff_2.dJy, false), new afe_1("attackerX", "x de la position de d?part des attaquants", aff_2.dJy, false), new afe_1("attackerY", "y de la position de d?part des attaquants", aff_2.dJy, false), new afe_1("attackerZ", "z de la position de d?part des attaquants", aff_2.dJy, false), new afe_1("defenderX", "x de la position de d?part des d?fenseurs", aff_2.dJy, false), new afe_1("defenderY", "y de la position de d?part des d?fenseurs", aff_2.dJy, false), new afe_1("defenderZ", "z de la position de d?part des d?fenseurs", aff_2.dJy, false)};
    static final afe_1[] ohX = new afe_1[]{new afe_1("frame", "Frame ? activer", aff_2.dJx, false), new afe_1("push", "Active ou desactive la frame", aff_2.dJA, false)};
    static final afe_1[] ohY = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("id", "Nom du widget", aff_2.dJx, false), new afe_1("eventType", "Type d'?v?nement", aff_2.dJx, false), new afe_1("funcName", "Fonction ? appeler", aff_2.dJx, false), new afe_1("params", "Param?tres de la fonction ? appeler", aff_2.dJC, true)};
    static final afe_1[] ohZ = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("id", "Nom du widget", aff_2.dJx, false), new afe_1("eventType", "Type d'evenement", aff_2.dJx, false), new afe_1("funcName", "Fonction qui devait ?tre appel?e", aff_2.dJx, false)};
    static final afe_1[] oia = new afe_1[]{new afe_1("dialog", "Nom du dialoque", aff_2.dJx, false), new afe_1("id", "Nom du widget", aff_2.dJx, false), new afe_1("button", "Bouton de la souris enfonc?", aff_2.dJz, true), new afe_1("clickCount", "Nombre de click", aff_2.dJz, true)};
    static final afe_1[] oib = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("id", "Nom du widget", aff_2.dJx, false), new afe_1("enable", "Activation", aff_2.dJA, false)};
    static final afe_1[] oic = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("id", "Nom du wdget", aff_2.dJx, false), new afe_1("eventType", "Type d'?v?nement", aff_2.dJx, false), new afe_1("enable", "Activation", aff_2.dJA, false)};
    static final afe_1[] oid = new afe_1[]{new afe_1("fileName", "Nom du fichier ? ouvrir", aff_2.dJx, false), new afe_1("linkageName", "Nom de l'anim ? jouer dans l'interface", aff_2.dJx, false), new afe_1("align", "Alignement de la fenetre", aff_2.dJx, false), new afe_1("screenXoffset", "D?calage en pixel vers la droite", aff_2.dJy, false), new afe_1("screenYoffset", "D?calage en pixel vers le haut", aff_2.dJy, false)};
    static final afe_1[] oie = new afe_1[]{new afe_1("id", "Id de la fenetre d'interface", aff_2.dJy, false), new afe_1("animName", "Nom de l'animation ? jouer", aff_2.dJx, false)};
    static final afe_1[] oif = new afe_1[]{new afe_1("id", "Id de la fenetre d'interface", aff_2.dJy, false)};
    static final afe_1[] oig = new afe_1[]{new afe_1("dialog", "Nom de la fenetre ? ouvrir", aff_2.dJx, false)};
    static final afe_1[] oih = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false)};
    static final afe_1[] oii = new afe_1[]{new afe_1("dialogName", "Dialog name", aff_2.dJx, false)};
    static final afe_1[] oij = new afe_1[]{new afe_1("dialogName", "Dialog name", aff_2.dJx, false)};
    static final afe_1[] oik = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("movable", "V?rouill?", aff_2.dJA, false)};
    static final afe_1[] oil = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("enabled", "Activation", aff_2.dJA, false)};
    static final afe_1[] oim = new afe_1[]{new afe_1("propertyName", "Nom de la propri?t?", aff_2.dJx, false), new afe_1("value", "Valeur", aff_2.dJA, false)};
    static final afe_1[] oin = new afe_1[]{new afe_1("propertyName", "Nom de la propri?t?", aff_2.dJx, false), new afe_1("value", "Valeur", aff_2.dJx, false)};
    static final afe_1[] oio = new afe_1[]{new afe_1("propertyName", "Nom de la propri?t?", aff_2.dJx, false), new afe_1("dialogId", "Nom de la dialog", aff_2.dJx, false), new afe_1("value", "Valeur", aff_2.dJx, false)};
    static final afe_1[] oip = new afe_1[]{new afe_1("propertyName", "Nom de la propri?t?", aff_2.dJx, false)};
    static final afe_1[] oiq = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du wodget", aff_2.dJx, false), new afe_1("propertyName", "Nom de la propri?t? concern?e", aff_2.dJx, false), new afe_1("local", "True s'il s'agit d'une propri?t? locale (propre ? un dialog)", aff_2.dJA, true)};
    static final afe_1[] oir = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("propertyName", "Nom de la propri?t?", aff_2.dJx, false), new afe_1("field", "Champ de la propri?t?", aff_2.dJx, false), new afe_1("local", "True s'il s'agit d'une propri?t? locale (propre ? un dialog)", aff_2.dJA, true)};
    static final afe_1[] ois = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("visible", "Visibilit?", aff_2.dJA, false)};
    static final afe_1[] oit = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("blocking", "true bloque, false ne bloque pas", aff_2.dJA, false)};
    static final afe_1[] oiu = new afe_1[]{new afe_1("dialogName", "Nom du dialog", aff_2.dJx, false), new afe_1("listId", "Id de la liste", aff_2.dJx, false), new afe_1("subId", "Id de l'?l?ment concern? dans la liste", aff_2.dJx, false), new afe_1("duration", "Dur?e de tween", aff_2.dJz, false), new afe_1("repeat", "Nombre de r?p?titions du tween (-1 pour infinie)", aff_2.dJz, false), new afe_1("r1", "Valeur rouge de d?part (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("g1", "Valeur vert de d?part (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("b1", "Valeur bleu de d?part (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("a1", "Valeur alpha de d?part (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("r2", "Valeur rouge de fin (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("g2", "Valeur vert de fin (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("b2", "Valeur bleu de fin (blanc vers gris si non renseign?)", aff_2.dJz, true), new afe_1("a2", "Valeur alpha de fin (blanc vers gris si non renseign?)", aff_2.dJz, true)};
    static final afe_1[] oiv = new afe_1[]{new afe_1("dialogName", "Nom du dialog", aff_2.dJx, false), new afe_1("widgetId", "Id de la liste", aff_2.dJx, false), new afe_1("subId", "Id de l'?l?ment concern? dans la liste", aff_2.dJx, false)};
    static final afe_1[] oiw = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("duration", "Temps du cycle du tween (en ms)", aff_2.dJz, false), new afe_1("repeat", "Nombre de cycles du tween (-1 = infini)", aff_2.dJz, false), new afe_1("r1", "Teinte 1 rouge", aff_2.dJz, true), new afe_1("g1", "Teinte 1 vert", aff_2.dJz, true), new afe_1("b1", "Teinte 1 bleu", aff_2.dJz, true), new afe_1("a1", "Teinte 1 alpha", aff_2.dJz, true), new afe_1("r2", "Teinte 2 rouge", aff_2.dJz, true), new afe_1("g2", "Teinte 2 vert", aff_2.dJz, true), new afe_1("b2", "Teinte 2 bleu", aff_2.dJz, true), new afe_1("a2", "Teinte 2 alpha", aff_2.dJz, true)};
    static final afe_1[] oix = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false)};
    static final afe_1[] oiy = new afe_1[]{new afe_1("particleId", "Id de l'APS", aff_2.dJy, false), new afe_1("time", "Temps avant disparition (en ms)", aff_2.dJy, true)};
    static final afe_1[] oiz = new afe_1[]{new afe_1("dialogId", "Id de l'interface", aff_2.dJx, false), new afe_1("widgetId", "Id du widget", aff_2.dJx, false)};
    static final afe_1[] oiA = new afe_1[]{new afe_1("cursorState", "Etat du curseur", aff_2.dJx, false)};
    static final afe_1[] oiB = new afe_1[]{new afe_1("cursorState", "Ancien ?tat du curseur", aff_2.dJx, false)};
    static final afe_1[] oiC = new afe_1[]{new afe_1("show/hide", "Affiche ou masque les bandes", aff_2.dJA, false), new afe_1("percentOfScreen", "Pourcentage de l'?cran en noir", aff_2.dJy, true), new afe_1("duration", "Temps de transition (en ms)", aff_2.dJy, true)};
    static final afe_1[] oiD = new afe_1[]{new afe_1("referenceType", "Le type de param?tre qui d?finira l'objet (Pos,UID, refid)", aff_2.dJx, false), new afe_1("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", aff_2.dJw, false), new afe_1("position", "Position ? laquelle le raccourci doit ?tre ajout? dans la barre", aff_2.dJy, true)};
    static final afe_1[] oiE = new afe_1[]{new afe_1("emoteId", "Id de l'emote concern?e", aff_2.dJy, false), new afe_1("position", "Position dans la barre de raccourci d'item courante (premi?re place libre si non renseign?)", aff_2.dJy, true)};
    static final afe_1[] oiF = new afe_1[]{new afe_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite enlever", aff_2.dJy, false), new afe_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", aff_2.dJy, false)};
    static final afe_1[] oiG = new afe_1[]{new afe_1("positionId", "position of the shortcut", aff_2.dJy, false), new afe_1("barNumber", "bar number", aff_2.dJy, false)};
    static final afe_1[] oiH = new afe_1[]{new afe_1("referenceType", "Le type de param?tre qui d?finira l'objet (UID, refid)", aff_2.dJx, false), new afe_1("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", aff_2.dJw, false), new afe_1("position", "Position ? laquelle le raccourci doit ?tre ajout? dans la barre", aff_2.dJy, true)};
    static final afe_1[] oiI = new afe_1[]{new afe_1("referenceType", "Le type de r?f?rence d'item en param2 (uid=l'unique id de l'item,refId=le refId de l'item)", aff_2.dJx, false), new afe_1("itemReference", "Id ou refId de l'item", aff_2.dJw, false), new afe_1("position", "Position dans la barre courante (premi?re position livre si non renseign?)", aff_2.dJy, true)};
    static final afe_1[] oiJ = new afe_1[]{new afe_1("hasShortcut", "true si on trouve un raccourci, false sinon", aff_2.dJA, false)};
    static final afe_1[] oiK = new afe_1[]{new afe_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", aff_2.dJy, true), new afe_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", aff_2.dJy, true)};
    static final afe_1[] oiL = new afe_1[]{new afe_1("hasShortcut", "true si on trouve un raccourci, false sinon", aff_2.dJA, false)};
    static final afe_1[] oiM = new afe_1[]{new afe_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", aff_2.dJy, true), new afe_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", aff_2.dJy, true)};
    static final afe_1[] oiN = new afe_1[]{new afe_1("hasShortcut", "true si on trouve un raccourci, false sinon", aff_2.dJA, false)};
    static final afe_1[] oiO = new afe_1[]{new afe_1("referenceId", "Id r?f?rent de l'?l?ment qu'on souhaite v?rifier", aff_2.dJy, true), new afe_1("shortcutType", "Typde de la barre de raccourci concern?e (0: spell, 2: item, 3: slot)", aff_2.dJy, true)};
    static final afe_1[] oiP = new afe_1[]{new afe_1("usable", "Active si true, d?sactive si false", aff_2.dJA, false), new afe_1("shortCutBarType", "Type de barre de raccourci concern?e (HANDS, HANDS_AND_FIGHT, FIGHT ou WORLD, toutes les barres si non renseign?)", aff_2.dJx, true), new afe_1("barIndex", "Indice de la barre concern?e", aff_2.dJy, true), new afe_1("position", "Position dans la barre du raccourci concern?", aff_2.dJy, true)};
    static final afe_1[] oiQ = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("funcName", "Fonction ? appeler", aff_2.dJx, false), new afe_1("params", "Param?tres de la fonction ? appaler", aff_2.dJC, true)};
    static final afe_1[] oiR = new afe_1[]{new afe_1("dialog", "Nom de l'interface", aff_2.dJx, true), new afe_1("widget", "Nom du widget de l'interface", aff_2.dJx, true)};
    static final afe_1[] oiS = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false)};
    static final afe_1[] oiT = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false), new afe_1("funcName", "Fonction a appeler", aff_2.dJx, false), new afe_1("params", "Parametres de la fonction a appeler", aff_2.dJC, true)};
    static final afe_1[] oiU = new afe_1[]{new afe_1("dialog", "Nom du dialogue", aff_2.dJx, false)};
    static final afe_1[] oiV = new afe_1[]{new afe_1("enabled", "Activation", aff_2.dJA, false), new afe_1("groupName", "Nom du groupe", aff_2.dJx, true), new afe_1("name", null, aff_2.dJx, true)};
    static final afe_1[] oiW = new afe_1[]{new afe_1("visible", "true visible, false invisible", aff_2.dJA, false)};
    static final afe_1[] oiX = new afe_1[]{new afe_1("message", "La clef de traduction suivie d'?ventuels param?tres", aff_2.dJC, true)};
    static final afe_1[] oiY = new afe_1[]{new afe_1("message", "La clef de traduction", aff_2.dJx, false), new afe_1("params", "Les param?tres ?ventuels du message", aff_2.dJC, true)};
    static final afe_1[] oiZ = new afe_1[]{new afe_1("channel", "Chat pipe", aff_2.dJy, false), new afe_1("messageKey", "Clef de traduction", aff_2.dJx, false), new afe_1("keyParams", "Param\u00e8tre de la clef de trad", aff_2.dJC, true)};
    static final afe_1[] oja = new afe_1[]{new afe_1("x", "x de la position du marqueur dans le monde", aff_2.dJy, false), new afe_1("y", "y de la position du marqueur dans le monde", aff_2.dJy, false), new afe_1("z", "z de la position du marqueur dans le monde", aff_2.dJy, false), new afe_1("pointId", "Obsol?te", aff_2.dJy, false)};
    static final afe_1[] ojb = new afe_1[]{new afe_1("pointId", "Obsol?te", aff_2.dJy, false)};
    static final afe_1[] ojc = new afe_1[]{new afe_1("smileyId", "Id du smiley", aff_2.dJy, false), new afe_1("mobileId", "Id du mobile concern?", aff_2.dJw, false), new afe_1("familyId", "S'il s'agit d'un smiley de monstre, id de la famille de monstre", aff_2.dJy, true)};
    static final afe_1[] ojd = new afe_1[0];
    static final afe_1[] oje = new afe_1[]{new afe_1("protectorId", "L'id du protecteur statique", aff_2.dJy, false)};
    static final afe_1[] ojf = new afe_1[]{new afe_1("monster", null, aff_2.dJA, false), new afe_1("familyId", null, aff_2.dJy, false), new afe_1("minValue", null, aff_2.dJy, false), new afe_1("maxValue", null, aff_2.dJy, false)};
    static final afe_1[] ojg = new afe_1[]{new afe_1("iconUrl", "Url de l'image ? afficher", aff_2.dJx, false)};
    static final afe_1[] ojh = new afe_1[]{new afe_1("anmUrl", "Url du fichier anm (relatif \u00e0 la racine du dossier gui)", aff_2.dJx, false), new afe_1("anmDir", "Direction de l'animation", aff_2.dJy, false), new afe_1("anmName", "Nom de l'animation", aff_2.dJx, false), new afe_1("duration", "dur\u00e9e du splash", aff_2.dJy, false)};
    static final afe_1[] oji = new afe_1[]{new afe_1("result", "true si l'interface est verouill?e, false sinon", aff_2.dJA, false)};
    static final afe_1[] ojj = new afe_1[]{new afe_1("dialogName", "Nom du dialog", aff_2.dJx, false)};
    static final afe_1[] ojk = new afe_1[]{new afe_1("result", "True si le dialog ouvert, false sinon", aff_2.dJA, false)};
    static final afe_1[] ojl = new afe_1[]{new afe_1("messageParamCount", "Nombre de param?tres dans le message", aff_2.dJy, false), new afe_1("message", "Clef de traduction du message", aff_2.dJC, false), new afe_1("blocking", "Le message ne peut pas se fermer au clic", aff_2.dJA, false), new afe_1("displayTime", "Dur?e d'affichage du message (dynamique en fonction du message si non renseign?)", aff_2.dJy, true), new afe_1("funcName", "Fonctione ? appeler quand on ferme la bulle de dialogue", aff_2.dJx, true), new afe_1("params", "Les param?tres ?ventuels du message", aff_2.dJC, true)};
    static final afe_1[] ojm = new afe_1[]{new afe_1("displayId", "Id du background", aff_2.dJy, false)};
    private static final afe_1[] ojn = new afe_1[]{new afe_1("position", "Position du groupe de joueurs sur le podium", aff_2.dJy, false)};
    static final afe_1[] ojo = new afe_1[]{new afe_1("text", "Clef de traduction du message", aff_2.dJx, false), new afe_1("params", "Les param?tres ?ventuels du message", aff_2.dJC, true)};
    static final afe_1[] ojp = new afe_1[]{new afe_1("blocking", "True emp?che la s?lection effective du sort, false sinon", aff_2.dJA, false), new afe_1("funcName", "Nom de la fonction ? appeler quand un sort est s?lectionn?", aff_2.dJx, false), new afe_1("params", "Parma?tres ?ventuels de la fonction appel?e quand un sort est s?lectionn?", aff_2.dJC, true)};
    static final afe_1[] ojq = new afe_1[]{new afe_1("funcName", "Nom de la fonction qui ?coute la s?lection d'un sort", aff_2.dJx, false)};
    static final afe_1[] ojr = new afe_1[]{new afe_1("funcName", "La fonction ? appeler quand le niveau de d?tail du jeu change", aff_2.dJx, false)};
    static final afe_1[] ojs = new afe_1[]{new afe_1("lodLevel", "Le niveau de d?tails actuel du jeu (0,1 ou 2)", aff_2.dJy, false)};
    static final afe_1[] ojt = new afe_1[]{new afe_1("Nom", "Nom (inutilis?)", aff_2.dJx, false), new afe_1("x", "Position x", aff_2.dJz, false), new afe_1("y", "Position y", aff_2.dJz, false), new afe_1("z", "Position z", aff_2.dJz, true), new afe_1("type", "Le type de boussole (pour l'icone). Valeurs accept?es : 0 (personnage), 1 (havre-sac), 2 (autres), 3 (challenges), 6 (protecteurs)", aff_2.dJz, true)};
    static final afe_1[] oju = new afe_1[]{new afe_1("compassId", "Id de la boussole", aff_2.dJw, false)};
    static final afe_1[] ojv = new afe_1[]{new afe_1("id", "Id de la boussole", aff_2.dJw, false)};
    static final afe_1[] ojw = new afe_1[]{new afe_1("translationKey", "Clef de traduction du texte ? afficher", aff_2.dJx, true), new afe_1("params", "Les param?tres ?ventuels du message", aff_2.dJC, true)};
    static final afe_1[] ojx = new afe_1[]{new afe_1("titleTranslationKey", "Clef de trad du titre du popup", aff_2.dJx, false), new afe_1("translationKey", "Clef de trad du texte du popup", aff_2.dJx, false), new afe_1("params", "Params du texte du popup", aff_2.dJC, true)};
    static final afe_1[] ojy = new afe_1[]{new afe_1("item", "RefId de l'item offert", aff_2.dJz, false), new afe_1("translationKey", "clef de traduction du texte de la r?compense", aff_2.dJx, true), new afe_1("params", "Les param?tres ?ventuels du texte", aff_2.dJC, true)};
    static final afe_1[] ojz = new afe_1[]{new afe_1("iconName", "Nom de l'image ? afficher (cf dossier tutorial dans les assets)", aff_2.dJx, false), new afe_1("titleTranslationKey", "clef de traduction du titre du tuto", aff_2.dJx, false), new afe_1("descriptionTranslationKey", "clef de traduction du texte du tuto", aff_2.dJx, false), new afe_1("type", "Type de message d'info : (0=tuto, 1=tips, ...)", aff_2.dJy, true), new afe_1("params", "Les param?tres ?ventuels du texte", aff_2.dJC, true)};
    static final afe_1[] ojA = new afe_1[]{new afe_1("guideId", "Id du guide \u00e0 afficher", aff_2.dJy, true)};
    static final afe_1[] ojB = new afe_1[]{new afe_1("activate", "Active ou desactive le dialog", aff_2.dJA, false)};
    static final afe_1[] ojC = new afe_1[]{new afe_1("spellId", null, aff_2.dJy, false)};
    static final afe_1[] ojD = new afe_1[]{new afe_1("slotId", "Slot id", aff_2.dJy, false), new afe_1("barId", "Bar id", aff_2.dJy, false)};
    static final afe_1[] ojE = new afe_1[]{new afe_1("type", "Type de barre a afficher (1=objet, 2=sort, 0 pour inverser)", aff_2.dJz, false)};
    static final afe_1[] ojF = new afe_1[]{new afe_1("dialog", "Nom de l'interface", aff_2.dJx, false), new afe_1("widget", "Nom du widget de l'interface", aff_2.dJx, true)};
    static final afe_1[] ojG = new afe_1[]{new afe_1("dialogName", "Dialog name", aff_2.dJx, false), new afe_1("widgetId", "Widget name", aff_2.dJx, false), new afe_1("text", "text", aff_2.dJx, false)};
    static final afe_1[] ojH = new afe_1[]{new afe_1("enabled", "Affichage des toasts", aff_2.dJA, false)};
    static final THashSet<String> ojI = new THashSet();
    private static final ddU ojJ = new ddU();
    static int ojK;
    final TIntObjectHashMap<fka_1> ojL = new TIntObjectHashMap();

    private ddU() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new deb_0(luaState), new dee(luaState), new dfr_0(luaState), new deJ(luaState), new ddW(luaState), new dfn(luaState), new dei_0(luaState), new dfu_0(luaState), new ddP(luaState), new ddQ(luaState), new dfw_0(luaState), new des(luaState), new det_0(luaState), new dey_0(luaState), new dgb(luaState), new den(luaState), new dfC(luaState), new deo(luaState), new dfb(luaState), new dfg(luaState), new dfh(luaState), new dfd_0(luaState), new dfc_0(luaState), new dej_0(luaState), new dfQ(luaState), new dfp_0(luaState), new dfR(luaState), new deH(luaState), new ddR(luaState), new der_0(luaState), new deq(luaState), new dep_0(luaState), new ded(luaState), new dec_0(luaState), new dem(luaState), new dfk_0(luaState), new dfe(luaState), new deu_0(luaState), new deI(luaState), new dfW(luaState), new ddY(luaState), new dfp(luaState), new dea(luaState), new dfq_0(luaState), new deq_0(luaState), new dfU(luaState), new dfv_0(luaState), new dfy_0(luaState), new dfJ(luaState), new dev_0(luaState), new dfv(luaState), new dfz_0(luaState), new dfA(luaState), new dez_0(luaState), new dfT(luaState), new dga(luaState), new del_0(luaState), new deK(luaState), new dfs_0(luaState), new dfS(luaState), new dee_0(luaState), new ded_0(luaState), new deo_0(luaState), new deW(luaState), new dex_0(luaState), new def_0(luaState), new dfg_0(luaState), new dfh_0(luaState), new dfD(luaState), new dfx_0(luaState), new dfk(luaState), new dfe_0(luaState), new deR(luaState), new deT(luaState), new des_0(luaState), new dge(luaState), new dgg(luaState), new dgf(luaState), new deC(luaState), new ddS(luaState), new deV(luaState), new dew_0(luaState), new deF(luaState), new del(luaState), new dfb_0(luaState), new dfm_0(luaState), new dfj_0(luaState), new deg(luaState), new dem_0(luaState), new dey(luaState), new dfX(luaState), new dfZ(luaState), new deh_0(luaState), new dft_0(luaState), new dfY(luaState), new dfM(luaState), new ddX(luaState), new dfo(luaState), new deg_0(luaState), new dfi(luaState), new dek_0(luaState), new dff_0(luaState), new dfa_0(luaState), new dgd(luaState), new ddV(luaState), new dex(luaState), new deU(luaState), new deP(luaState), new dfi_0(luaState), new dfF(luaState), new den_0(luaState), new ddT(luaState), new dfn_0(luaState), new deZ(luaState), new dgc(luaState), new dfo_0(luaState)};
    }

    @Override
    @Nullable
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public void clear() {
        TIntObjectIterator tIntObjectIterator = this.ojL.iterator();
        for (int i = this.ojL.size(); i > 0; --i) {
            tIntObjectIterator.advance();
            ((fka_1)tIntObjectIterator.value()).setTimeToLive(0);
        }
        this.ojL.clear();
        ojK = 0;
        ddP.clear();
        ojI.forEach(string -> {
            fse_1.gFu().vX((String)string);
            return true;
        });
    }

    @Override
    public final String getName() {
        return "UI";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public static ddU fcI() {
        return ojJ;
    }

    static String Of(int n) {
        return "characterDialog" + n;
    }
}

