/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cCb
 */
public class ccb_0
extends cbw_0 {
    public static final byte myY = 3;
    private static final Logger myZ = Logger.getLogger(ccb_0.class);
    private cBi mza;

    public cBi eJj() {
        return this.mza;
    }

    public void a(cBi cBi2) {
        this.mza = cBi2;
    }

    @Override
    public boolean eIS() {
        return cbr_0.eIZ().eJb() == this.mza.aJr();
    }

    @Override
    public byte eIT() {
        return 3;
    }

    @Override
    public void D(apl_1 apl_12) {
        this.mza = cBi.dT(apl_12.aIy());
        if (this.mza == null) {
            myZ.error((Object)("Unknown ambiance zone type: " + String.valueOf(this.mza)));
            throw new IllegalArgumentException("Unknown ambiance zone type: " + String.valueOf(this.mza));
        }
    }

    @Override
    public void q(fs_0 fs_02) {
        fs_02.g(this.mza.aJr());
    }

    @Override
    public String eIU() {
        return "Type de zone : " + this.mza.toString();
    }

    @Override
    public cbp_0 eIV() {
        ccb_0 ccb_02 = new ccb_0();
        ccb_02.a(this.mza);
        ccb_02.jH(this.bDL());
        return ccb_02;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

