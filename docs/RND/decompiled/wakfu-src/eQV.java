/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 */
import com.google.protobuf.ByteString;

public class eQV
extends ero_0 {
    private static final aox_1 rgN = new enz_0(new eny_0("Infos \u00e0 passer", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rgN;
    }

    public eQV() {
        this.bby();
    }

    public eQV fFV() {
        eQV eQV2 = new eQV();
        eQV2.o = enf_0.qVE.d();
        eQV2.bgZ = this.bgZ;
        return eQV2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public boolean bbY() {
        return true;
    }

    @Override
    public void aVH() {
        this.bgZ = null;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().bT(ByteString.copyFrom((byte[])this.bgZ)));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.bgZ = ii_12.LO().toByteArray();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFV();
    }
}

