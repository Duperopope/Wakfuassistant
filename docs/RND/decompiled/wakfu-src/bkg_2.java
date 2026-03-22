/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bkG
 */
public class bkg_2
extends bkb_0 {
    private static final Logger irx = Logger.getLogger(bkg_2.class);
    private static final boolean iry = false;
    private static final int[] irz = new int[]{"Stool".hashCode()};
    final bgy irA;
    private bbo_1 irB;
    ZJ irC;
    ZJ irD;
    ZJ irE;

    public bkg_2(bgy bgy2, bbo_1 bbo_12) {
        this.irA = bgy2;
        this.irB = bbo_12;
    }

    public bkg_2(bgy bgy2) {
        this.irA = bgy2;
        this.irB = null;
    }

    @Override
    public short dsm() {
        return 16;
    }

    @Override
    public boolean dsn() {
        return !this.irA.ddI().bvW();
    }

    public void a(bbo_1 bbo_12) {
        if (this.irB != null) {
            return;
        }
        this.irB = bbo_12;
        bdj_2 bdj_22 = this.irA.ddI();
        this.s(bdj_22);
        this.t(bdj_22);
    }

    @Override
    public void bIH() {
        if (this.irA == this.iqd) {
            cwd_2.eVe().eVg();
        }
        bdj_2 bdj_22 = this.irA.ddI();
        this.irA.a(this);
        bdj_22.bvA();
        this.s(bdj_22);
        this.irD = new bkh_2(this, bdj_22);
        bdj_22.a(this.irD);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        bdj_2 bdj_22 = this.irA.ddI();
        if (this.irD != null) {
            if (!bl) {
                return false;
            }
            this.irD.animationEnded(bdj_22);
            this.dsd();
        }
        if (this.irE != null) {
            if (!bl) {
                return false;
            }
            this.irE.animationEnded(bdj_22);
        }
        this.a(this.irA.ddI(), this.dsP());
        if (this.irA == this.iqd) {
            this.aT((byte)3);
        }
        return true;
    }

    public final void d(ZJ zJ) {
        if (this.irA == this.iqd) {
            this.irC = zJ;
            this.aT((byte)2);
        }
    }

    @Override
    public boolean dsd() {
        abi_1 abi_12;
        bdj_2 bdj_22 = this.irA.ddI();
        if (bdj_22.bvD() == aeB.bww()) {
            return true;
        }
        bcs_0 bcs_02 = this.dsP();
        if (bcs_02 != null) {
            bcs_02.setVisible(false);
        }
        if (this.irB != null) {
            bdj_22.dT(this.irB.aJi() + "-Fin");
            abi_12 = this.irB.dPV() ? this.irB.bcB() : this.irB.bcB().bVS();
        } else {
            abi_12 = abi_1.dzk;
        }
        acd_1 acd_12 = this.irB.aZw();
        bdj_22.e(acd_12.getX() + abi_12.dzz, acd_12.getY() + abi_12.dzA, acd_12.bdi());
        this.irE = new bki_2(this, bcs_02, bdj_22, abi_12);
        bdj_22.a(new bkj_2(this, bdj_22));
        bdj_22.a(this.irE);
        return false;
    }

    private void aT(byte by) {
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw(by);
        cmo_02.cD((short)16);
        aue_0.cVJ().etu().d(cmo_02);
    }

    private static void a(bdj_2 bdj_22, abi_1 abi_12, String string) {
        bdj_22.a(abi_12);
        bdj_22.dU("-Assis");
        bdj_22.dT(string + "-Debut");
        bdj_22.dV(string);
    }

    public void a(bdj_2 bdj_22, bcs_0 bcs_02) {
        Object object;
        this.irA.l(null);
        abi_1 abi_12 = abi_1.dzk;
        if (bcs_02 != null) {
            object = bcs_02.bqc();
            if (object != null) {
                bdj_22.b((Anm)object, irz);
            }
            bcs_02.setVisible(true);
            abi_12 = this.irB.dPV() ? bcs_02.bcB() : bcs_02.bcB().bVS();
        }
        bdj_22.dV(bdj_22.ddu());
        bdj_22.dU(null);
        bdj_22.dT(bdj_22.ddu());
        if (bdj_22.bwb()) {
            bdj_22.bwc();
        } else {
            bdj_22.a(aeB.bww());
        }
        this.irB.dPS();
        object = this.irB.aZw();
        int n = ((acd_1)object).getX() + abi_12.dzz;
        int n2 = ((acd_1)object).getY() + abi_12.dzA;
        short s = ((acd_1)object).bdi();
        short s2 = wa_0.w(n, n2, s);
        if (s2 == Short.MIN_VALUE) {
            s2 = s;
        }
        bdj_22.e(n, n2, s2);
    }

    private bcs_0 dsP() {
        if (this.irB == null) {
            irx.error((Object)("pas de banc pour le player: " + this.irA.toString()));
            return null;
        }
        Collection<ng_1> collection = this.irB.aVG();
        if (collection.isEmpty()) {
            return null;
        }
        return (bcs_0)collection.iterator().next();
    }

    public boolean aa(bhJ bhJ2) {
        String string;
        String string2 = bhJ2.ddI().bkI();
        return string2.equals((string = this.irB.aJi()) + "-Debut") || string2.equals(string + "-Fin");
    }

    private void s(bdj_2 bdj_22) {
        bcs_0 bcs_02 = this.dsP();
        this.irA.l(bcs_02);
        abi_1 abi_12 = bcs_02.bcB();
        String string = this.irB.aJi();
        abi_1 abi_13 = this.irB.dPV() ? abi_12.bVS() : abi_12;
        bkg_2.a(bdj_22, abi_13, string);
        bdj_22.a(aez.bwu());
        acd_1 acd_12 = this.irB.aZw();
        int n = abi_13.dzz;
        int n2 = abi_13.dzA;
        bdj_22.e(acd_12.getX() - n, acd_12.getY() - n2, acd_12.bdi());
        this.dsQ();
        bcs_02.setVisible(false);
    }

    public final void dsQ() {
        bcs_0 bcs_02 = this.dsP();
        if (bcs_02 == null) {
            irx.error((Object)("pas de vue pour le banc pour assoir " + this.irA.toString()));
            return;
        }
        bdj_2 bdj_22 = this.irA.ddI();
        bdj_22.a(bcs_02.bqc(), irz);
    }

    void t(bdj_2 bdj_22) {
        bdj_22.a(this.irB.bcB());
        bdj_22.e(this.irB.aZw().getX(), this.irB.aZw().getY(), this.irB.aZw().bdi());
        bdj_22.dT(bdj_22.bpT());
    }

    @Override
    public boolean dsi() {
        return this.irD == null && this.irE == null;
    }

    public void dX(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        long l = byteBuffer.getLong();
        if (this.irB != null && this.irB.Sn() != l) {
            irx.error((Object)"stoolId diff\u00e9rent ");
            this.irB = null;
        }
        if (this.irB != null) {
            return;
        }
        try {
            bbo_1 bbo_12 = (bbo_1)bzj_2.eqi().my(l);
            if (bbo_12 != null) {
                this.a(bbo_12);
            }
        }
        catch (Exception exception) {
            irx.error((Object)"", (Throwable)exception);
        }
    }
}

