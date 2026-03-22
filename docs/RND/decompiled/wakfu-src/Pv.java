/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Pv
extends Pf {
    private static final Pattern bec = Pattern.compile("([a-zA-Z]+)=([^;]+);?");
    static final String[] bed = new String[0];
    private static final Logger bee = Logger.getLogger(Pv.class);
    private int beb;
    private int ayV;
    private final ArrayList<Pw> bef = new ArrayList();
    private boolean beg;

    @Override
    protected boolean da(@NotNull String string) {
        try {
            Matcher matcher = bec.matcher(string);
            while (matcher.find()) {
                String[] stringArray;
                String string2 = matcher.group(1);
                String string3 = matcher.group(2);
                if ("weight".equalsIgnoreCase(string2)) {
                    this.beb = Bw.m(string3);
                    continue;
                }
                if ("particleid".equalsIgnoreCase(string2)) {
                    this.ayV = Bw.m(string3);
                    continue;
                }
                if (!"appearance".equalsIgnoreCase(string2) || (stringArray = string3.split(",")).length == 0) continue;
                if (stringArray.length == 1) {
                    this.bef.add(new Pw(stringArray[0], null));
                    continue;
                }
                String[] stringArray2 = new String[stringArray.length - 1];
                System.arraycopy(stringArray, 1, stringArray2, 0, stringArray2.length);
                this.bef.add(new Pw(stringArray[0], stringArray2));
            }
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            bee.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ph_0 aXu() {
        return ph_0.bdi;
    }

    public ArrayList<Pw> aXZ() {
        return this.bef;
    }

    public int aXY() {
        return this.beb;
    }

    public int aJe() {
        return this.ayV;
    }
}

