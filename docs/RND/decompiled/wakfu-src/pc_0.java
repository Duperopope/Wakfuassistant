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
 * Renamed from PC
 */
public class pc_0
extends Pf {
    private static final Logger bes = Logger.getLogger(pb_0.class);
    private String bet;
    private boolean beu;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            String[] stringArray = BH.a(string, ';');
            if (stringArray == null || stringArray.length != 2) {
                bes.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 2 : monsterBreedId, displayEquipment) : " + string));
                return false;
            }
            this.bet = stringArray[0];
            this.beu = Bw.aK(stringArray[1]);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bes.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdg;
    }

    public boolean aYe() {
        return this.beu;
    }

    public String aYf() {
        return this.bet;
    }
}

