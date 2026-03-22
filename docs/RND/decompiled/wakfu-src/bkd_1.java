/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkD
 */
public class bkd_1
extends bkb_0 {
    protected static final Logger iro = Logger.getLogger(bkd_1.class);
    private final bgy irp;

    public bkd_1(bgy bgy2) {
        this.irp = bgy2;
    }

    @Override
    public short dsm() {
        return 1;
    }

    @Override
    public boolean dsn() {
        if (this.irp.ddI().bvW()) {
            aPd.e("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        iro.trace((Object)("Lancement de l'occupation REST pour le joueur " + this.irp.Sn()));
        this.irp.i(false, true);
        bdj_2 bdj_22 = this.irp.ddI();
        if (!bdj_22.bcB().bVO()) {
            bdj_22.a(bdj_22.bcB().wI(1));
        }
        bdj_22.dT("AnimEmote-Repos");
        this.irp.a(this);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        if (bl2) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)3);
            cmo_02.cD(this.dsm());
            aue_0.cVJ().etu().d(cmo_02);
        }
        return this.dsd();
    }

    @Override
    public boolean dsd() {
        iro.trace((Object)("On arrete l'occupation REST pour le joueur " + this.irp.Sn()));
        bdj_2 bdj_22 = this.irp.ddI();
        if (!bdj_22.bcB().bVO()) {
            bdj_22.a(bdj_22.bcB().wI(1));
        }
        if (bdj_22.bkI().startsWith("AnimPosingAssis")) {
            String string = ZI.m(bdj_22.bkI(), true);
            bdj_22.dT(string);
        }
        return true;
    }
}

