/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bUW
 */
public class buw_1
extends agj_2 {
    protected static final Logger lrx = Logger.getLogger(buw_1.class);
    private final Long lry;

    public buw_1(long l) {
        this.lry = l;
    }

    @Override
    public short aIi() {
        return 6;
    }

    @Override
    public afp_2 cbr() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.lry.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof buw_1 && ((buw_1)object).lry.equals(this.lry);
    }
}

