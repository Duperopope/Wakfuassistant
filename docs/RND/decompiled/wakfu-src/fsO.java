/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fsO
extends fsQ<fst> {
    private static final Logger tev = Logger.getLogger(fsO.class);

    public fsO(fst fst2) {
        super(fst2);
    }

    public boolean gB(int n, int n2) {
        short s = fsq_0.ZZ(n);
        short s2 = fsq_0.aab(n);
        short s3 = fsq_0.ZW(n2);
        short s4 = fsq_0.aaa(n2);
        aci_1 aci_12 = ((fst)this.teA).gld();
        if (!(aci_12.cL(s, s3) && aci_12.cL(s2, s3) && aci_12.cL(s, s4) && aci_12.cL(s2, s4))) {
            return false;
        }
        return !fsu.fL(((fst)this.teA).gt(s, s3)) && !fsu.fL(((fst)this.teA).gt(s2, s3)) && !fsu.fL(((fst)this.teA).gt(s, s4)) && !fsu.fL(((fst)this.teA).gt(s2, s4));
    }
}

