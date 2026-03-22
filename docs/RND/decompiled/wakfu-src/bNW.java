/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class bNW
extends frd_0 {
    private static final Logger kJx = Logger.getLogger(bNW.class);

    @Override
    protected void a(fry fry2) {
        switch (fry2) {
            case sYC: {
                bNG.egl();
                bNG.a(107, new Object[0]);
                break;
            }
            case sYI: {
                aPd.e("error.heroCantAccessToThisWorld", new Object[0]);
                break;
            }
            default: {
                kJx.error((Object)("Erreur " + String.valueOf((Object)fry2) + " non g\u00e9r\u00e9e sur un transporteur " + String.valueOf(this.egC())));
            }
        }
    }

    public abstract String a(bco_0 var1);

    @Nullable
    public abstract String b(bco_0 var1);

    public abstract boolean a(bgt_0 var1, bco_0 var2);
}

