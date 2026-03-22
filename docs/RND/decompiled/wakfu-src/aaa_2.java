/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from aAA
 */
public final class aaa_2 {
    protected static final Logger dwG = Logger.getLogger(aaa_2.class);
    private static final aaa_2 dwH = new aaa_2();

    public static aaa_2 bUd() {
        return dwH;
    }

    private aaa_2() {
    }

    public boolean a(Object object, aaz_2 aaz_22, aax_1[] aax_1Array, aay_1 aay_12, Object ... objectArray) {
        if (aaz_22 == null) {
            dwG.error((Object)"Liste des cible pour la diffusion manquante");
            return false;
        }
        Iterator iterator = aaz_22.bUc();
        if (objectArray.length > 0 && iterator != null && aay_12 != null) {
            while (iterator.hasNext()) {
                Object e2 = iterator.next();
                boolean bl = true;
                if (aax_1Array != null) {
                    for (aax_1 aax_12 : aax_1Array) {
                        if (aax_12.a(object, e2, objectArray)) continue;
                        bl = false;
                        break;
                    }
                }
                if (!bl) continue;
                aay_12.b(object, e2, objectArray);
            }
        } else {
            if (objectArray.length <= 0) {
                dwG.error((Object)"Nombre d'content incorrects");
            }
            if (iterator == null) {
                dwG.error((Object)"Iterateur sur la liste des recepteurs incorrect");
            }
            if (aay_12 == null) {
                dwG.error((Object)"Processeur d'arguments manquant");
            }
            return false;
        }
        return true;
    }
}

