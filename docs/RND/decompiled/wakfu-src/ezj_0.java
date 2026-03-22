/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezJ
 */
public final class ezj_0
extends Enum<ezj_0>
implements pv_0,
aoq_1 {
    public static final /* enum */ ezj_0 psp = new ezj_0(0, "Rien");
    public static final /* enum */ ezj_0 psq = new ezj_0(1, "RIGHT_HAND_LEVEL");
    public static final /* enum */ ezj_0 psr = new ezj_0(2, "Est un Boss invoqu\u00e9 par un Boss");
    public static final /* enum */ ezj_0 pss = new ezj_0(3, "Est 'invisible PvP' (pas de FX et n'appara\u00eet pas au V)");
    public static final /* enum */ ezj_0 pst = new ezj_0(4, "A un tour de jeu plus court que la normale (20 sec par default, cf mod\u00e8le associ\u00e9 ou configuration syst\u00e8me)");
    public static final /* enum */ ezj_0 psu = new ezj_0(5, "Force l'orientation en 4 direction uniquement");
    public static final /* enum */ ezj_0 psv = new ezj_0(6, "A un tour de jeu plus long que la normale (90 sec par default, cf mod\u00e8le associ\u00e9 ou configuration syst\u00e8me)");
    public static final /* enum */ ezj_0 psw = new ezj_0(7, "N'est pas affich\u00e9 dans l'encyclop\u00e9die");
    public static final /* enum */ ezj_0 psx = new ezj_0(8, "N'attaque pas");
    public static final /* enum */ ezj_0 psy = new ezj_0(12, "Ne meurt pas", exe_1.rDn);
    public static final /* enum */ ezj_0 psz = new ezj_0(13, "Ne peut pas \u00eatre attaqu\u00e9");
    public static final /* enum */ ezj_0 psA = new ezj_0(14, "Bloque les mouvements");
    public static final /* enum */ ezj_0 psB = new ezj_0(15, "Ne peut \u00eatre rejoint");
    public static final /* enum */ ezj_0 psC = new ezj_0(16, "Ne donne pas d'exp\u00e9rience", exe_1.rDq);
    public static final /* enum */ ezj_0 psD = new ezj_0(17, "Est enceinte");
    public static final /* enum */ ezj_0 psE = new ezj_0(18, "Est occup\u00e9");
    public static final /* enum */ ezj_0 psF = new ezj_0(19, "Est mort");
    public static final /* enum */ ezj_0 psG = new ezj_0(20, "Est un NPC de challenge");
    public static final /* enum */ ezj_0 psH = new ezj_0(21, "Est un NPC cr\u00e9\u00e9 par une commande admin");
    public static final /* enum */ ezj_0 psI = new ezj_0(28, "s\u00e9duite pour la fin de combat");
    public static final /* enum */ ezj_0 psJ = new ezj_0(29, "Est gardien de prison");
    public static final /* enum */ ezj_0 psK = new ezj_0(30, "Est un NPC d'entrainement");
    public static final /* enum */ ezj_0 psL = new ezj_0(31, "Est bien nourri");
    public static final /* enum */ ezj_0 psM = new ezj_0(32, "Ne peut pas \u00eatre attaqu\u00e9 pour une dur\u00e9e d\u00e9termin\u00e9e");
    public static final /* enum */ ezj_0 psN = new ezj_0(33, "Ne peut pas lancer une poursuite (mais aggro quand m\u00eame)");
    public static final /* enum */ ezj_0 psO = new ezj_0(34, "Pas besoin d'avoir un chemin jusqu'au mob pour l'affronter");
    public static final /* enum */ ezj_0 psP = new ezj_0(35, "T\u00e9l\u00e9porte le monstre au lieu de le d\u00e9placer lors de son entr\u00e9e en combat");
    public static final /* enum */ ezj_0 psQ = new ezj_0(36, "Est un NPC PNJ (overhead special)");
    public static final /* enum */ ezj_0 psR = new ezj_0(37, "Est un partisan d'Amakna");
    public static final /* enum */ ezj_0 psS = new ezj_0(38, "Est un partisan de Bonta");
    public static final /* enum */ ezj_0 psT = new ezj_0(39, "Est un partisan de Brakmar");
    public static final /* enum */ ezj_0 psU = new ezj_0(40, "Est un monstre de donjon type rushu rush");
    public static final /* enum */ ezj_0 psV = new ezj_0(42, "Est un encapuchonn\u00e9 (cache le niveau)");
    public static final /* enum */ ezj_0 psW = new ezj_0(43, "Est un boss");
    public static final /* enum */ ezj_0 psX = new ezj_0(44, "Est un partisan de Sufokia");
    public static final /* enum */ ezj_0 psY = new ezj_0(45, "Est un NPC Archimonstre");
    public static final /* enum */ ezj_0 psZ = new ezj_0(46, "Monstre avec lequel on ne peut pas effectuer d'actions");
    public static final /* enum */ ezj_0 pta = new ezj_0(47, "Est un monstre de donjon arcade");
    public static final /* enum */ ezj_0 ptb = new ezj_0(48, "Est un NPC d'une vague de donjon arcade");
    public static final /* enum */ ezj_0 ptc = new ezj_0(49, "Est un boss ultime");
    public static final /* enum */ ezj_0 ptd = new ezj_0(50, "Ne peut pas se faire engager (PvP)");
    public static final /* enum */ ezj_0 pte = new ezj_0(51, "Est un NPC d'Almanach");
    public static final /* enum */ ezj_0 ptf = new ezj_0(52, "Est un NPC de chaos d'ogrest");
    public static final /* enum */ ezj_0 ptg = new ezj_0(53, "Ne laisse pas de cadavre \u00e0 sa mort");
    public static final /* enum */ ezj_0 pth = new ezj_0(54, "Ne peut pas engager de combat Duel");
    public static final /* enum */ ezj_0 pti = new ezj_0(55, "Ne peut pas cr\u00e9er/engager de combat PvP (mais peut rejoindre)");
    public static final /* enum */ ezj_0 ptj = new ezj_0(56, "Ne peut pas faire d'\u00e9change");
    public static final /* enum */ ezj_0 ptk = new ezj_0(57, "Ne peut pas cr\u00e9er ou rejoindre un groupe (MRU + refus auto)");
    public static final /* enum */ ezj_0 ptl = new ezj_0(58, "Ne peut pas envoyer de message priv\u00e9 (MRU)");
    public static final /* enum */ ezj_0 ptm = new ezj_0(59, "Ne peut pas suivre un autre joueur (MRU)");
    public static final /* enum */ ezj_0 ptn = new ezj_0(60, "Ne peut pas interagir avec les monstres (MRU)");
    public static final /* enum */ ezj_0 pto = new ezj_0(61, "Ne peut pas engager un combat PvM (MRU)");
    public static final /* enum */ ezj_0 ptp = new ezj_0(62, "Ne peut pas r\u00e9colter sur les monstres (MRU)");
    public static final /* enum */ ezj_0 ptq = new ezj_0(63, "Ne peut pas modifier les barres de raccourcis");
    public static final /* enum */ ezj_0 ptr = new ezj_0(65, "Ne peut pas interagir avec l'interface chat");
    public static final /* enum */ ezj_0 pts = new ezj_0(66, "Ne peut pas interagir avec l'interface suivi de qu\u00eate");
    public static final /* enum */ ezj_0 ptt = new ezj_0(67, "Force l'activation de la boussole quand une qu\u00eate est activ\u00e9.");
    public static final /* enum */ ezj_0 ptu = new ezj_0(68, "Affiche des informations de MDC all\u00e9g\u00e9es");
    public static final /* enum */ ezj_0 ptv = new ezj_0(69, "Le protecteur ne donne pas son bonus de region");
    public static final /* enum */ ezj_0 ptw = new ezj_0(70, "Ne peut pas appeler \u00e0 l'aide en combat");
    public static final /* enum */ ezj_0 ptx = new ezj_0(71, "Ne peut pas verrouiller le combat");
    public static final /* enum */ ezj_0 pty = new ezj_0(72, "Ne peut pas montrer une cellule");
    public static final /* enum */ ezj_0 ptz = new ezj_0(73, "Combattants transparents d\u00e9sactiv\u00e9s");
    public static final /* enum */ ezj_0 ptA = new ezj_0(74, "Abandon d\u00e9sactiv\u00e9");
    public static final /* enum */ ezj_0 ptB = new ezj_0(75, "Ne peut pas rejoindre un combat (MRU)");
    public static final /* enum */ ezj_0 ptC = new ezj_0(76, "Ne peut pas fermer l'interface tutoriel");
    public static final /* enum */ ezj_0 ptD = new ezj_0(77, "Ne gagne pas d'exp\u00e9rience");
    public static final /* enum */ ezj_0 ptE = new ezj_0(78, "D\u00e9sactive le MRU qui permet de lancer des collectes de resources");
    public static final /* enum */ ezj_0 ptF = new ezj_0(79, "D\u00e9sactive les modifications de la jauge de Wakfu");
    public static final /* enum */ ezj_0 ptG = new ezj_0(80, "Ne peut pas grouper avec un personnage d'une autre classe");
    public static final /* enum */ ezj_0 ptH = new ezj_0(81, "Est un compagnon");
    public static final /* enum */ ezj_0 ptI = new ezj_0(82, "Compagnon dispo aux non-abo");
    public static final /* enum */ ezj_0 ptJ = new ezj_0(83, "Ne peut pas utiliser les compagnons en combat");
    public static final /* enum */ ezj_0 ptK = new ezj_0(84, "Pas de bonus Xp pour les reroll", exe_1.rFk);
    public static final /* enum */ ezj_0 ptL = new ezj_0(85, "Peut sauter les obstacles");
    public static final /* enum */ ezj_0 ptM = new ezj_0(87, "N'utilise pas de scripts sur ses sorts.");
    public static final /* enum */ ezj_0 ptN = new ezj_0(88, "Permet de bypasser le blocage d'\u00e9change (mod\u00e9rateurs)");
    public static final /* enum */ ezj_0 ptO = new ezj_0(89, "Ne peut pas supprimer un objet");
    public static final /* enum */ ezj_0 ptP = new ezj_0(90, "Ne peut pas l\u00e2cher un objet");
    public static final /* enum */ ezj_0 ptQ = new ezj_0(91, "Ne peut pas utiliser un objet");
    public static final /* enum */ ezj_0 ptR = new ezj_0(92, "Le familier ne perd pas de vie");
    public static final /* enum */ ezj_0 ptS = new ezj_0(93, "Ne peut pas modifier l'\u00e9quipement des compagnons");
    public static final /* enum */ ezj_0 ptT = new ezj_0(94, "Ne peut pas retirer un compagnon");
    public static final /* enum */ ezj_0 ptU = new ezj_0(95, "Ne peut pas interagir avec l'interface cadeaux");
    public static final /* enum */ ezj_0 ptV = new ezj_0(96, "Est un partisan de la nation Bandit");
    public static final /* enum */ ezj_0 ptW = new ezj_0(97, "Ne peut pas ouvrir l'interface coffre de compte");
    public static final /* enum */ ezj_0 ptX = new ezj_0(98, "Ne peut pas utiliser les h\u00e9ros en combat");
    public static final /* enum */ ezj_0 ptY = new ezj_0(99, "Est un boss de raid");
    public static final /* enum */ ezj_0 ptZ = new ezj_0(100, "Est dans une instance d'ar\u00e8ne Pvp");
    public static final /* enum */ ezj_0 pua = new ezj_0(101, "Est un Phorreur Enutrof");
    public static final /* enum */ ezj_0 pub = new ezj_0(102, "Est d\u00e9truit \u00e0 la fin d'un combat");
    public static final /* enum */ ezj_0 puc = new ezj_0(103, "Est un huppermage encapuchonn\u00e9 (cache le niveau)");
    public static final /* enum */ ezj_0 pud = new ezj_0(104, "Affiche le personnage dans les bulles de combats");
    public static final /* enum */ ezj_0 pue = new ezj_0(105, "Permet d'escalader certaines falaises");
    public static final /* enum */ ezj_0 puf = new ezj_0(106, "La pr\u00e9sence de ce personnage dans un combat d\u00e9sactive la vue externe du combat");
    public static final /* enum */ ezj_0 pug = new ezj_0(107, "Ne peut pas interagir avec l'interface aptitude");
    public static final /* enum */ ezj_0 puh = new ezj_0(108, "Ne peut pas interagir avec l'interface fiche de combattant");
    public static final /* enum */ ezj_0 pui = new ezj_0(109, "Force le facteur d'exp\u00e9rience d'abonnement \u00e0 1", exe_1.rFj);
    public static final /* enum */ ezj_0 puj = new ezj_0(110, "Ne peut pas interagir avec l'interface inventaire");
    public static final /* enum */ ezj_0 puk = new ezj_0(111, "Ne peut pas interagir avec l'interface qu\u00eate");
    public static final /* enum */ ezj_0 pul = new ezj_0(112, "Ne peut pas interagir avec l'interface sort");
    public static final /* enum */ ezj_0 pum = new ezj_0(113, "Ne peut pas interagir avec l'interface fiche de personnage");
    public static final /* enum */ ezj_0 pun = new ezj_0(114, "Ne peut pas utiliser les Zaaps");
    public static final /* enum */ ezj_0 puo = new ezj_0(115, "Est un NPC dominant");
    public static final /* enum */ ezj_0 pup = new ezj_0(116, "Est une invocation qui drop du loot");
    public static final /* enum */ ezj_0 puq = new ezj_0(117, "Permet de marcher sur les nuages");
    public static final /* enum */ ezj_0 pur = new ezj_0(118, "Permet de nager en eau peu profonde");
    public static final /* enum */ ezj_0 pus = new ezj_0(119, "Est un NPC de champs de bataille (PvP)", exe_1.rFl);
    public static final /* enum */ ezj_0 put = new ezj_0(120, "Ne peut pas \u00eatre attaqu\u00e9 durant un d\u00e9placement");
    public static final /* enum */ ezj_0 puu = new ezj_0(121, "D\u00e9sactive les plantations pour le joueur");
    public static final /* enum */ ezj_0 puv = new ezj_0(122, "Est un G\u00e9n\u00e9ral de champs de bataille (PvP)", exe_1.rFm);
    public static final /* enum */ ezj_0 puw = new ezj_0(123, "Ne peut pas engager un combat contre un G\u00e9n\u00e9ral de champ de bataille");
    public static final /* enum */ ezj_0 pux = new ezj_0(124, "Ne peut pas rejoindre un combat contre un G\u00e9n\u00e9ral de champ de bataille");
    public static final /* enum */ ezj_0 puy = new ezj_0(125, "Ne peut pas utiliser de monture");
    public static final /* enum */ ezj_0 puz = new ezj_0(126, "Fait partie de l'\u00e9quipe des attaquants (team 0) dans un champ de bataille", exe_1.rFn);
    public static final /* enum */ ezj_0 puA = new ezj_0(127, "Fait partie de l'\u00e9quipe des d\u00e9fenseurs (team 1) dans un champ de bataille", exe_1.rFo);
    public static final ezj_0[] puB;
    private final byte puC;
    private final String puD;
    private exe_1 puE = null;
    private static final ImmutableSet<ezj_0> puF;
    private static final /* synthetic */ ezj_0[] puG;

    public static ezj_0[] values() {
        return (ezj_0[])puG.clone();
    }

    public static ezj_0 valueOf(String string) {
        return Enum.valueOf(ezj_0.class, string);
    }

    private ezj_0(int n2, String string2) {
        this.puC = (byte)n2;
        this.puD = string2;
    }

    private ezj_0(int n2, String string2, exe_1 exe_12) {
        this.puC = (byte)n2;
        this.puD = string2;
        this.puE = exe_12;
    }

    @Override
    public byte aZd() {
        return 0;
    }

    @Override
    public byte aJr() {
        return this.puC;
    }

    public exe_1 fmM() {
        return this.puE;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.puC);
    }

    @Override
    public String aXB() {
        return this.puD;
    }

    @Override
    public String aXC() {
        return null;
    }

    @Nullable
    public static ezj_0 Pl(int n) {
        for (ezj_0 ezj_02 : puB) {
            if (ezj_02.puC != n) continue;
            return ezj_02;
        }
        return null;
    }

    public static boolean d(ezj_0 ezj_02) {
        return puF.contains((Object)ezj_02);
    }

    private static /* synthetic */ ezj_0[] fmN() {
        return new ezj_0[]{psp, psq, psr, pss, pst, psu, psv, psw, psx, psy, psz, psA, psB, psC, psD, psE, psF, psG, psH, psI, psJ, psK, psL, psM, psN, psO, psP, psQ, psR, psS, psT, psU, psV, psW, psX, psY, psZ, pta, ptb, ptc, ptd, pte, ptf, ptg, pth, pti, ptj, ptk, ptl, ptm, ptn, pto, ptp, ptq, ptr, pts, ptt, ptu, ptv, ptw, ptx, pty, ptz, ptA, ptB, ptC, ptD, ptE, ptF, ptG, ptH, ptI, ptJ, ptK, ptL, ptM, ptN, ptO, ptP, ptQ, ptR, ptS, ptT, ptU, ptV, ptW, ptX, ptY, ptZ, pua, pub, puc, pud, pue, puf, pug, puh, pui, puj, puk, pul, pum, pun, puo, pup, puq, pur, pus, put, puu, puv, puw, pux, puy, puz, puA};
    }

    static {
        puG = ezj_0.fmN();
        puB = ezj_0.values();
        puF = ImmutableSet.copyOf((Object[])new ezj_0[]{pti, ptd, ptL, pue, puq, pur, pth, ptj, ptm, ptk, ptZ, ptl, pss, psu});
    }
}

