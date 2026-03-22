/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bSK
 */
public class bsk_1 {
    protected static final Logger lih = Logger.getLogger(bsk_1.class);
    private int lii = 1;
    private dcR lij;
    private boolean lik = true;
    private boolean lil = false;

    public void b(arx_2 arx_22) {
        dcN dcN2 = new dcN(aie_0.cfn().bmB());
        ArrayList<dcR> arrayList = dcN2.a(dcN2.fco());
        this.lil = this.d(arx_22);
        this.lij = this.a(arrayList, arx_22);
        this.lii = this.e(arx_22);
        this.lik = this.c(arx_22);
    }

    private boolean c(arx_2 arx_22) {
        return true;
    }

    private boolean d(arx_2 arx_22) {
        boolean bl = avh_2.dhF.bMS();
        return bl;
    }

    private dcR a(ArrayList<dcR> arrayList, arx_2 arx_22) {
        return arrayList.get(0);
    }

    private int e(arx_2 arx_22) {
        return 1;
    }

    public void bIP() {
        lih.info((Object)"Graphical preferences :");
        lih.info((Object)("\t* resolution : " + String.valueOf(this.lij)));
        lih.info((Object)("\t* fullscreen : " + this.lik));
        lih.info((Object)("\t* level of details : " + this.lii));
        lih.info((Object)("\t* shaders activated : " + this.lil));
    }
}

