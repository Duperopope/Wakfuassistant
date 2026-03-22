/*
 * Decompiled with CFR 0.152.
 */
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UR
extends ParseException {
    private static final String bwY = "Erreur au parse d'une date";
    private static final String bwZ = US.bxd.bkg() + "[" + US.bxm + "]";
    private static final String bxa = US.bxd.bkg() + "[^" + US.bxm + "]";
    private final String bxb;
    private final String bxc;

    public UR(String string, String string2) {
        super(bwY, -1);
        this.bxb = string;
        this.bxc = string2;
    }

    public String bkf() {
        return this.bxb;
    }

    public String aLS() {
        return this.bxc;
    }

    @Override
    public String getMessage() {
        Matcher matcher = Pattern.compile(bxa).matcher(this.bxb);
        if (matcher.find()) {
            return "Variable " + matcher.group() + " inconnue dans le FORMAT [ " + this.bxb + " ]";
        }
        matcher = Pattern.compile(bwZ + bwZ).matcher(this.bxb);
        if (matcher.find()) {
            return "Variables " + matcher.group() + " sans s\u00e9parateur dans le FORMAT [ " + this.bxb + " ]";
        }
        if (!Pattern.compile(uo_0.dl(this.bxb)).matcher(this.bxc).matches()) {
            return "DATE [" + this.bxc + "] incompatible avec le FORMAT [ " + this.bxb + " ]";
        }
        return "Parse impossible pour le FORMAT [ " + this.bxb + " ] et la DATE [ " + this.bxc + " ]";
    }
}

