/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cci
 */
public abstract class cci_0
extends ayf_2 {
    private static final Logger lOs = Logger.getLogger(cci_0.class);
    private byte[] lOt;
    private ayf_2 lOu;
    private byte lOv;

    public cci_0() {
        this.a(new ccx_0(this));
    }

    public ayf_2 etu() {
        return this.lOu;
    }

    public void aR(ayf_2 ayf_22) {
        this.lOu = ayf_22;
    }

    public byte[] etv() {
        return this.lOt;
    }

    public void ee(byte[] byArray) {
        this.lOt = byArray;
    }

    public byte etw() {
        return this.lOv;
    }

    public void cV(byte by) {
        lOs.info((Object)("Raison de la d\u00e9connection de l'entit\u00e9 " + this.Sn() + " : " + by));
        this.lOv = by;
    }

    public void bmW() {
        this.bSk();
        this.a(new ccx_0(this));
    }

    public void bmX() {
        lOs.info((Object)"cleanUp() de la ProxyClientEntity, on fait un setTicket \u00e0 null");
        this.cV((byte)80);
        this.bmW();
    }

    public abstract void cVT();

    public abstract void zT(int var1);

    public abstract void dN(byte[] var1);
}

