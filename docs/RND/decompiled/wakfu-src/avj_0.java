/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from aVJ
 */
public class avj_0
extends agb_1
implements ayz_2 {
    private static final Logger hts = Logger.getLogger(avj_0.class);
    private bsS efA;
    private int htt;
    private long htu;
    private static final ayv_2 htv = new ayv_2(new avk_0());

    public static avj_0 a(int n, int n2, int n3, bsS bsS2, int n4, long l) {
        try {
            avj_0 avj_02 = (avj_0)htv.borrowObject();
            avj_02.xO(n);
            avj_02.xP(n2);
            avj_02.xQ(n3);
            avj_02.efA = bsS2;
            avj_02.htt = n4;
            avj_02.htu = l;
            return avj_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            htv.returnObject(this);
        }
        catch (Exception exception) {
            hts.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.efA = null;
        this.htt = 0;
        this.htu = 0L;
    }

    avj_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        if (this.efA instanceof bsj_0) {
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            try {
                boolean bl = bsg_12.a(bsn_1.liL);
                if (bl) {
                    AlphaMaskCommand.eV(true);
                }
                aJL.es(bsg_12.a(bsn_1.liM));
                aJL.et(bsg_12.a(bsn_1.liN));
            }
            catch (Exception exception) {
                hts.error((Object)"Exception levee", (Throwable)exception);
            }
            if (cvu_2.eQx()) {
                cvu_2.eTO().eTR();
            }
            if (ctb_2.eQx()) {
                bmh.dvr().dvw();
            }
            long l = System.currentTimeMillis();
            long l2 = (long)this.htt - (l - this.htu);
            try {
                ((bsj_0)this.efA).Sv((int)l2);
            }
            catch (Exception exception) {
                hts.error((Object)"Erreur lors du d\u00e9but du placement : ", (Throwable)exception);
            }
        } else if (this.efA instanceof bsi_0) {
            ((bsi_0)this.efA).a(etw_0.rqT);
        }
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

