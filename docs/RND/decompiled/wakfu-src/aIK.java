/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class aIK
extends Yd {
    private static final Logger dZb = Logger.getLogger(aIK.class);

    @Override
    protected final void bop() {
        aIL[] aILArray;
        for (aIL aIL2 : aILArray = aIL.values()) {
            YY yY = aIL.a(aIL2);
            if (yY == null) {
                yY = this.a(aIL2);
            }
            if (yY == null) continue;
            if (yY.bol() != aIL2.bol()) {
                dZb.error((Object)("type incorrect pour le model " + yY.getClass().getSimpleName() + " " + aIL2.name()));
                continue;
            }
            this.a(yY);
        }
    }

    protected abstract YY a(aIL var1);
}

