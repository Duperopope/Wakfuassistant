/*
 * Decompiled with CFR 0.152.
 */
public class eTv {
    public static final byte rov = 0;
    public static final byte row = 1;
    public static final byte rox = 2;
    public static final byte roy = 3;
    public static final byte roz = 4;
    public static final byte roA = 5;
    public static final byte roB = 6;
    public static final byte roC = 7;
    public static final byte roD = 8;
    public static final byte roE = 9;
    public static final byte roF = 10;
    public static final byte roG = 11;
    public static final byte roH = 12;
    public static final byte roI = 13;
    public static final byte roJ = 14;
    public static final byte roK = 15;
    public static final byte roL = 16;
    public static final byte roM = 17;
    public static final byte roN = 18;
    public static final byte roO = 19;
    public static final byte roP = 20;
    public static final byte roQ = 21;
    public static final byte roR = 22;
    public static final byte roS = 23;
    public static final byte roT = 24;
    public static final byte roU = 25;
    public static final byte roV = 26;
    public static final byte roW = 27;
    public static final byte roX = 28;
    public static final byte roY = 29;
    public static final byte roZ = 30;
    public static final byte rpa = 31;
    public static final byte rpb = 32;
    public static final byte rpc = 33;

    public static String d(String string, byte by) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[EVENTS_CALENDAR] ");
        stringBuilder.append(string).append(" : ");
        switch (by) {
            case 0: {
                stringBuilder.append("Aucune erreur");
                break;
            }
            case 1: {
                stringBuilder.append("Impossible a ajouter");
                break;
            }
            case 2: {
                stringBuilder.append("Impossible de s'inscrire");
                break;
            }
            case 9: {
                stringBuilder.append("Impossible de retirer l'evenement");
                break;
            }
            case 10: {
                stringBuilder.append("Impossible de modifier la date de fin");
                break;
            }
            case 12: {
                stringBuilder.append("Impossible de donner une date de fun precedant la date de debut");
                break;
            }
            case 15: {
                stringBuilder.append("Date de debut obligatoire");
                break;
            }
            case 4: {
                stringBuilder.append("Impossible d'annuler l'inscription");
                break;
            }
            case 3: {
                stringBuilder.append("Impossible de valider l'inscription");
                break;
            }
            case 16: {
                stringBuilder.append("Invite deha present pour l'evenement");
                break;
            }
            case 5: {
                stringBuilder.append("Invit\u00e9 non connect\u00e9");
                break;
            }
            case 6: {
                stringBuilder.append("L'invit\u00e9 a deja une demande en cours");
                break;
            }
            case 11: {
                stringBuilder.append("L'evenement n'existe pas");
                break;
            }
            case 8: {
                stringBuilder.append("Invitation acceptee");
                break;
            }
            case 7: {
                stringBuilder.append("Incitation refusee");
                break;
            }
            case 13: {
                stringBuilder.append("Pas le propri\u00e9taire de l'evenement");
                break;
            }
            case 14: {
                stringBuilder.append("Les donnees du joueur n'existent pas sur le serveur");
                break;
            }
            case 17: {
                stringBuilder.append("Trop de participants par rapport au max");
                break;
            }
            case 18: {
                stringBuilder.append("Trop d'inscrits par rapport au max");
                break;
            }
            case 19: {
                stringBuilder.append("Un evenement similaire existe deja");
                break;
            }
            case 25: {
                stringBuilder.append("Exception levee");
                break;
            }
            case 24: {
                stringBuilder.append("Type d'evenement inconnnu");
                break;
            }
            case 22: {
                stringBuilder.append("Trop d'evenements pour le proprietaire");
                break;
            }
            case 23: {
                stringBuilder.append("Le createur ne dispose pas des droits d'admin");
                break;
            }
            case 20: {
                stringBuilder.append("Le createur n'a pas de guilde");
                break;
            }
            case 21: {
                stringBuilder.append("Le createur n'a pas de nation");
                break;
            }
            case 26: {
                stringBuilder.append("On n'a pas les droits pour modifier l'evenement");
                break;
            }
            case 27: {
                stringBuilder.append("On n'a pas le droit d'ajouter un evenement a une date pass\u00e9e");
                break;
            }
            case 28: {
                stringBuilder.append("Personnage deja inscrit a l'evenement");
                break;
            }
            case 29: {
                stringBuilder.append("Evenement termin\u00e9");
                break;
            }
            case 30: {
                stringBuilder.append("Personnage non inscrit");
                break;
            }
            case 31: {
                stringBuilder.append("Nom du personnage null");
                break;
            }
            case 32: {
                stringBuilder.append("Le personnage ne fait pas partie des participants");
                break;
            }
            case 33: {
                stringBuilder.append("Trop d'evenements dans le calendrier concern\u00e9");
                break;
            }
            default: {
                stringBuilder.append("Raison Inconnue ").append(by);
            }
        }
        return stringBuilder.toString();
    }
}

