/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Pg {
    protected static final Logger bcO = Logger.getLogger(Pg.class);
    private static final Pg bcP = new Pg();
    private final azl_2<Pf> bcQ = new azl_2();

    public static Pg aXx() {
        return bcP;
    }

    private Pg() {
    }

    public static Pf a(@NotNull ph_0 ph_02, @NotNull String string, boolean bl) {
        try {
            Pf pf = ph_02.aXz().newInstance();
            pf.aQ(bl);
            if (pf.da(string)) {
                return pf;
            }
            bcO.error((Object)("Impossible d'initialiser l'HMIAction de type " + String.valueOf(ph_02) + " parametres=" + string));
            return null;
        }
        catch (InstantiationException instantiationException) {
            bcO.error((Object)("Erreur d'instanciation d'un actionType : " + ph_02.getLabel()));
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            bcO.error((Object)("Acc\u00e8s non authoris\u00e9 pour l'instanciation d'un actionType : " + ph_02.getLabel()));
            return null;
        }
    }

    public Pf a(byte by, @NotNull String string, boolean bl) {
        return this.b(ph_0.G(by), string, bl);
    }

    private Pf b(@NotNull ph_0 ph_02, @NotNull String string, boolean bl) {
        Pf pf = Pg.a(ph_02, string, bl);
        if (pf != null) {
            this.bcQ.c(pf.d(), pf);
        }
        return pf;
    }

    public static ArrayList<Pf> dc(String string) {
        ArrayList<Pf> arrayList = new ArrayList<Pf>();
        if (string.length() == 0) {
            return arrayList;
        }
        for (String string2 : BH.a(string, '~')) {
            Pf pf = Pf.db(string2);
            if (pf == null) continue;
            arrayList.add(pf);
        }
        return arrayList;
    }

    public Pf oa(int n) {
        return this.bcQ.vK(n);
    }

    public int aXy() {
        return this.bcQ.aVo();
    }
}

