/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from PB
 */
public class pb_0
extends Pf {
    private static final Logger beo = Logger.getLogger(pb_0.class);
    private int bep;
    private boolean beq;
    private pg_0 ber = pg_0.beE;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            if (string.contains(";")) {
                return this.dd(string);
            }
            this.bep = Integer.parseInt(string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            beo.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " : " + string + " invalid  " + illegalArgumentException.getMessage()));
            return false;
        }
    }

    private boolean dd(String string) {
        String[] stringArray = BH.a(string, ';');
        if (stringArray.length != 2 && stringArray.length != 3) {
            beo.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + " nombre de param\u00e8tre invalide: " + string + "(attendu: idParticule(int)[;alwaysActivated(boolean)][;localisation(string)])"));
            return false;
        }
        this.bep = Integer.parseInt(stringArray[0]);
        String string2 = stringArray[1];
        String string3 = null;
        if (stringArray.length == 3) {
            string3 = stringArray[2];
        }
        if (string2.equalsIgnoreCase("true") || string2.equalsIgnoreCase("false")) {
            this.beq = Boolean.parseBoolean(string2);
        } else if (stringArray.length == 2) {
            string3 = string2;
        }
        if (string3 == null) {
            return true;
        }
        if (string3.equalsIgnoreCase("tete")) {
            this.ber = pg_0.beH;
        } else if (string3.equalsIgnoreCase("corps")) {
            this.ber = pg_0.beG;
        } else if (string3.equalsIgnoreCase("pied")) {
            this.ber = pg_0.beF;
        } else {
            beo.error((Object)("Erreur de parametre, localisation inconnue " + string3 + ", " + this.toString()));
            return false;
        }
        return true;
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bcS;
    }

    public int aYb() {
        return this.bep;
    }

    public boolean aYc() {
        return this.beq;
    }

    public pg_0 aYd() {
        return this.ber;
    }

    @Override
    public String toString() {
        return "HMIParticleSystemAction{m_particleSystemId=" + this.bep + ", m_alwaysActivated=" + this.beq + ", m_localisation=" + String.valueOf((Object)this.ber) + "} " + super.toString();
    }
}

