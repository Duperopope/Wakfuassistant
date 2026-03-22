/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bFd
 */
public class bfd_1
extends bfc_1
implements bgf_1 {
    private static final Logger jST = Logger.getLogger(bfd_1.class);
    private long jSU;

    public bfd_1(int n) {
        super(n);
    }

    @Override
    public void v(String ... stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jST.error((Object)("[ItemAction] Trying to start an account mimi symbic action with an item we don't have " + String.valueOf(ffV2)));
            return false;
        }
        cvo_2 cvo_22 = cvo_2.eUK();
        if (!fyw_0.gqw().to("inventoryDialog")) {
            cvo_22.eUN();
        }
        cvo_2.eUK().a(new bgh_2(this, ffV2));
        return true;
    }

    @Override
    public void clear() {
    }

    public void y(long l, long l2) {
        this.jSU = l2;
        this.jU(l);
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (fhc_02 == null) {
            return true;
        }
        List<fm_1> list = bjf_1.a(fhc_02.dGh().fZq());
        return bjf_1.b(fhc_02.d(), list.toArray(new fm_1[0]));
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putLong(this.jSU);
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + 8;
    }

    @Override
    public fgM dTl() {
        return fgM.skZ;
    }
}

