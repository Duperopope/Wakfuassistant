/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFs
 */
public final class bfs_0
extends bfc_1 {
    private static final Logger jTr = Logger.getLogger(bfs_0.class);
    private static final fis_2 jTs = new fis_2();
    private String aCL = "";
    private byte[] jTt;

    bfs_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTr.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fik_2 fik_22 = new fik_2().l("question.whatIsYourMessage", new Object[0]).pe(true).a(fil_2.gCq()).a(fil_2.gCp().c(string -> {
            if (string == null) {
                return;
            }
            this.aCL = string;
            this.aCL = aPd.iH(this.aCL);
            if (this.aCL == null) {
                return;
            }
            this.aCL = bYV.nU(this.aCL);
            if (this.aCL.isEmpty()) {
                aPd.e("error.chat.operationNotPermited", new Object[0]);
                return;
            }
            this.jTt = BH.aP(this.aCL);
            this.jU(ffV2.LV());
        }));
        fiq_2.gCw().d(fik_22);
        return true;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.put(this.jTt);
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + this.jTt.length;
    }

    @Override
    public void clear() {
        this.aCL = "";
    }

    public String toString() {
        return "InstanceSpeakerItemAction{m_message='" + this.aCL + "'}";
    }

    @Override
    public fgM dTl() {
        return fgM.skP;
    }

    static {
        jTs.setMaxCharacters(100);
        jTs.setPrefSize(new fsm_1(370, 35));
        jTs.setMaxWidth(200);
        jTs.setMultiline(true);
    }
}

