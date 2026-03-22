/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class kY
extends GeneratedMessageV3.Builder<kY>
implements lh {
    private int an;
    private long wX;
    private int Gx;
    private int Fe;
    private ly_1 Hc;
    private SingleFieldBuilderV3<ly_1, la_0, lB> Ht;
    private lq_1 He;
    private SingleFieldBuilderV3<lq_1, ls_0, lt_0> Hu;
    private lc_0 Hg;
    private SingleFieldBuilderV3<lc_0, le_0, ln_1> Hv;
    private kS Hi;
    private SingleFieldBuilderV3<kS, kU, kV> Hw;
    private kZ Hk;
    private SingleFieldBuilderV3<kZ, lb_0, lc> Hx;
    private ld_0 Hm;
    private SingleFieldBuilderV3<ld_0, lf_0, lg_0> Hy;
    private lu_1 Ho;
    private SingleFieldBuilderV3<lu_1, lw_1, lx_1> Hz;
    private int Hq;

    public static final Descriptors.Descriptor aep() {
        return kF.FO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FP.ensureFieldAccessorsInitialized(kW.class, kY.class);
    }

    kY() {
        this.D();
    }

    kY(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kW.aJ()) {
            this.aez();
            this.aeC();
            this.aeF();
            this.aeI();
            this.aeL();
            this.aeO();
            this.aeR();
        }
    }

    public kY aeq() {
        super.clear();
        this.wX = 0L;
        this.an &= 0xFFFFFFFE;
        this.Gx = 0;
        this.an &= 0xFFFFFFFD;
        this.Fe = 0;
        this.an &= 0xFFFFFFFB;
        if (this.Ht == null) {
            this.Hc = null;
        } else {
            this.Ht.clear();
        }
        this.an &= 0xFFFFFFF7;
        if (this.Hu == null) {
            this.He = null;
        } else {
            this.Hu.clear();
        }
        this.an &= 0xFFFFFFEF;
        if (this.Hv == null) {
            this.Hg = null;
        } else {
            this.Hv.clear();
        }
        this.an &= 0xFFFFFFDF;
        if (this.Hw == null) {
            this.Hi = null;
        } else {
            this.Hw.clear();
        }
        this.an &= 0xFFFFFFBF;
        if (this.Hx == null) {
            this.Hk = null;
        } else {
            this.Hx.clear();
        }
        this.an &= 0xFFFFFF7F;
        if (this.Hy == null) {
            this.Hm = null;
        } else {
            this.Hy.clear();
        }
        this.an &= 0xFFFFFEFF;
        if (this.Hz == null) {
            this.Ho = null;
        } else {
            this.Hz.clear();
        }
        this.an &= 0xFFFFFDFF;
        this.Hq = 0;
        this.an &= 0xFFFFFBFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.FO;
    }

    public kW aeo() {
        return kW.aen();
    }

    public kW aer() {
        kW kW2 = this.aes();
        if (!kW2.isInitialized()) {
            throw kY.newUninitializedMessageException((Message)kW2);
        }
        return kW2;
    }

    public kW aes() {
        kW kW2 = new kW(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kW2.wX = this.wX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kW2.Gx = this.Gx;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            kW2.Fe = this.Fe;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            kW2.Hc = this.Ht == null ? this.Hc : (ly_1)this.Ht.build();
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            kW2.He = this.Hu == null ? this.He : (lq_1)this.Hu.build();
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            kW2.Hg = this.Hv == null ? this.Hg : (lc_0)this.Hv.build();
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            kW2.Hi = this.Hw == null ? this.Hi : (kS)this.Hw.build();
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            kW2.Hk = this.Hx == null ? this.Hk : (kZ)this.Hx.build();
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            kW2.Hm = this.Hy == null ? this.Hm : (ld_0)this.Hy.build();
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            kW2.Ho = this.Hz == null ? this.Ho : (lu_1)this.Hz.build();
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            kW2.Hq = this.Hq;
            n2 |= 0x400;
        }
        kW2.an = n2;
        this.onBuilt();
        return kW2;
    }

    public kY aet() {
        return (kY)super.clone();
    }

    public kY ek(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kY)super.setField(fieldDescriptor, object);
    }

    public kY bF(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kY)super.clearField(fieldDescriptor);
    }

    public kY bF(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kY)super.clearOneof(oneofDescriptor);
    }

    public kY bF(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kY)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kY el(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kY)super.addRepeatedField(fieldDescriptor, object);
    }

    public kY bF(Message message) {
        if (message instanceof kW) {
            return this.h((kW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kY h(kW kW2) {
        if (kW2 == kW.aen()) {
            return this;
        }
        if (kW2.LU()) {
            this.aX(kW2.LV());
        }
        if (kW2.acr()) {
            this.gX(kW2.acs());
        }
        if (kW2.aaC()) {
            this.gY(kW2.aaD());
        }
        if (kW2.adO()) {
            this.b(kW2.adP());
        }
        if (kW2.pe()) {
            this.b(kW2.adR());
        }
        if (kW2.adT()) {
            this.b(kW2.adU());
        }
        if (kW2.adW()) {
            this.e(kW2.adX());
        }
        if (kW2.adZ()) {
            this.b(kW2.aea());
        }
        if (kW2.aec()) {
            this.b(kW2.aed());
        }
        if (kW2.aef()) {
            this.b(kW2.aeg());
        }
        if (kW2.aei()) {
            this.gZ(kW2.aej());
        }
        this.el(kW.g(kW2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.LU()) {
            return false;
        }
        if (!this.acr()) {
            return false;
        }
        if (!this.aaC()) {
            return false;
        }
        if (this.adO() && !this.adP().isInitialized()) {
            return false;
        }
        if (this.pe() && !this.adR().isInitialized()) {
            return false;
        }
        if (this.adT() && !this.adU().isInitialized()) {
            return false;
        }
        if (this.adW() && !this.adX().isInitialized()) {
            return false;
        }
        if (this.adZ() && !this.aea().isInitialized()) {
            return false;
        }
        if (this.aec() && !this.aed().isInitialized()) {
            return false;
        }
        return !this.aef() || this.aeg().isInitialized();
    }

    public kY gR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kW kW2 = null;
        try {
            kW2 = (kW)kW.Hs.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kW2 = (kW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kW2 != null) {
                this.h(kW2);
            }
        }
        return this;
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    public kY aX(long l) {
        this.an |= 1;
        this.wX = l;
        this.onChanged();
        return this;
    }

    public kY aeu() {
        this.an &= 0xFFFFFFFE;
        this.wX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public kY gX(int n) {
        this.an |= 2;
        this.Gx = n;
        this.onChanged();
        return this;
    }

    public kY aev() {
        this.an &= 0xFFFFFFFD;
        this.Gx = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaC() {
        return (this.an & 4) != 0;
    }

    @Override
    public int aaD() {
        return this.Fe;
    }

    public kY gY(int n) {
        this.an |= 4;
        this.Fe = n;
        this.onChanged();
        return this;
    }

    public kY aew() {
        this.an &= 0xFFFFFFFB;
        this.Fe = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean adO() {
        return (this.an & 8) != 0;
    }

    @Override
    public ly_1 adP() {
        if (this.Ht == null) {
            return this.Hc == null ? ly_1.agZ() : this.Hc;
        }
        return (ly_1)this.Ht.getMessage();
    }

    public kY a(ly_1 ly_12) {
        if (this.Ht == null) {
            if (ly_12 == null) {
                throw new NullPointerException();
            }
            this.Hc = ly_12;
            this.onChanged();
        } else {
            this.Ht.setMessage((AbstractMessage)ly_12);
        }
        this.an |= 8;
        return this;
    }

    public kY a(la_0 la_02) {
        if (this.Ht == null) {
            this.Hc = la_02.ahd();
            this.onChanged();
        } else {
            this.Ht.setMessage((AbstractMessage)la_02.ahd());
        }
        this.an |= 8;
        return this;
    }

    public kY b(ly_1 ly_12) {
        if (this.Ht == null) {
            this.Hc = (this.an & 8) != 0 && this.Hc != null && this.Hc != ly_1.agZ() ? ly_1.c(this.Hc).e(ly_12).ahe() : ly_12;
            this.onChanged();
        } else {
            this.Ht.mergeFrom((AbstractMessage)ly_12);
        }
        this.an |= 8;
        return this;
    }

    public kY aex() {
        if (this.Ht == null) {
            this.Hc = null;
            this.onChanged();
        } else {
            this.Ht.clear();
        }
        this.an &= 0xFFFFFFF7;
        return this;
    }

    public la_0 aey() {
        this.an |= 8;
        this.onChanged();
        return (la_0)this.aez().getBuilder();
    }

    @Override
    public lB adQ() {
        if (this.Ht != null) {
            return (lB)this.Ht.getMessageOrBuilder();
        }
        return this.Hc == null ? ly_1.agZ() : this.Hc;
    }

    private SingleFieldBuilderV3<ly_1, la_0, lB> aez() {
        if (this.Ht == null) {
            this.Ht = new SingleFieldBuilderV3((AbstractMessage)this.adP(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Hc = null;
        }
        return this.Ht;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public lq_1 adR() {
        if (this.Hu == null) {
            return this.He == null ? lq_1.agl() : this.He;
        }
        return (lq_1)this.Hu.getMessage();
    }

    public kY a(lq_1 lq_12) {
        if (this.Hu == null) {
            if (lq_12 == null) {
                throw new NullPointerException();
            }
            this.He = lq_12;
            this.onChanged();
        } else {
            this.Hu.setMessage((AbstractMessage)lq_12);
        }
        this.an |= 0x10;
        return this;
    }

    public kY a(ls_0 ls_02) {
        if (this.Hu == null) {
            this.He = ls_02.agp();
            this.onChanged();
        } else {
            this.Hu.setMessage((AbstractMessage)ls_02.agp());
        }
        this.an |= 0x10;
        return this;
    }

    public kY b(lq_1 lq_12) {
        if (this.Hu == null) {
            this.He = (this.an & 0x10) != 0 && this.He != null && this.He != lq_1.agl() ? lq_1.c(this.He).e(lq_12).agq() : lq_12;
            this.onChanged();
        } else {
            this.Hu.mergeFrom((AbstractMessage)lq_12);
        }
        this.an |= 0x10;
        return this;
    }

    public kY aeA() {
        if (this.Hu == null) {
            this.He = null;
            this.onChanged();
        } else {
            this.Hu.clear();
        }
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public ls_0 aeB() {
        this.an |= 0x10;
        this.onChanged();
        return (ls_0)this.aeC().getBuilder();
    }

    @Override
    public lt_0 adS() {
        if (this.Hu != null) {
            return (lt_0)this.Hu.getMessageOrBuilder();
        }
        return this.He == null ? lq_1.agl() : this.He;
    }

    private SingleFieldBuilderV3<lq_1, ls_0, lt_0> aeC() {
        if (this.Hu == null) {
            this.Hu = new SingleFieldBuilderV3((AbstractMessage)this.adR(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.He = null;
        }
        return this.Hu;
    }

    @Override
    public boolean adT() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public lc_0 adU() {
        if (this.Hv == null) {
            return this.Hg == null ? lc_0.ahG() : this.Hg;
        }
        return (lc_0)this.Hv.getMessage();
    }

    public kY a(lc_0 lc_02) {
        if (this.Hv == null) {
            if (lc_02 == null) {
                throw new NullPointerException();
            }
            this.Hg = lc_02;
            this.onChanged();
        } else {
            this.Hv.setMessage((AbstractMessage)lc_02);
        }
        this.an |= 0x20;
        return this;
    }

    public kY a(le_0 le_02) {
        if (this.Hv == null) {
            this.Hg = le_02.ahK();
            this.onChanged();
        } else {
            this.Hv.setMessage((AbstractMessage)le_02.ahK());
        }
        this.an |= 0x20;
        return this;
    }

    public kY b(lc_0 lc_02) {
        if (this.Hv == null) {
            this.Hg = (this.an & 0x20) != 0 && this.Hg != null && this.Hg != lc_0.ahG() ? lc_0.c(this.Hg).e(lc_02).ahL() : lc_02;
            this.onChanged();
        } else {
            this.Hv.mergeFrom((AbstractMessage)lc_02);
        }
        this.an |= 0x20;
        return this;
    }

    public kY aeD() {
        if (this.Hv == null) {
            this.Hg = null;
            this.onChanged();
        } else {
            this.Hv.clear();
        }
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public le_0 aeE() {
        this.an |= 0x20;
        this.onChanged();
        return (le_0)this.aeF().getBuilder();
    }

    @Override
    public ln_1 adV() {
        if (this.Hv != null) {
            return (ln_1)this.Hv.getMessageOrBuilder();
        }
        return this.Hg == null ? lc_0.ahG() : this.Hg;
    }

    private SingleFieldBuilderV3<lc_0, le_0, ln_1> aeF() {
        if (this.Hv == null) {
            this.Hv = new SingleFieldBuilderV3((AbstractMessage)this.adU(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Hg = null;
        }
        return this.Hv;
    }

    @Override
    public boolean adW() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public kS adX() {
        if (this.Hw == null) {
            return this.Hi == null ? kS.adF() : this.Hi;
        }
        return (kS)this.Hw.getMessage();
    }

    public kY d(kS kS2) {
        if (this.Hw == null) {
            if (kS2 == null) {
                throw new NullPointerException();
            }
            this.Hi = kS2;
            this.onChanged();
        } else {
            this.Hw.setMessage((AbstractMessage)kS2);
        }
        this.an |= 0x40;
        return this;
    }

    public kY a(kU kU2) {
        if (this.Hw == null) {
            this.Hi = kU2.adJ();
            this.onChanged();
        } else {
            this.Hw.setMessage((AbstractMessage)kU2.adJ());
        }
        this.an |= 0x40;
        return this;
    }

    public kY e(kS kS2) {
        if (this.Hw == null) {
            this.Hi = (this.an & 0x40) != 0 && this.Hi != null && this.Hi != kS.adF() ? kS.a(this.Hi).c(kS2).adK() : kS2;
            this.onChanged();
        } else {
            this.Hw.mergeFrom((AbstractMessage)kS2);
        }
        this.an |= 0x40;
        return this;
    }

    public kY aeG() {
        if (this.Hw == null) {
            this.Hi = null;
            this.onChanged();
        } else {
            this.Hw.clear();
        }
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public kU aeH() {
        this.an |= 0x40;
        this.onChanged();
        return (kU)this.aeI().getBuilder();
    }

    @Override
    public kV adY() {
        if (this.Hw != null) {
            return (kV)this.Hw.getMessageOrBuilder();
        }
        return this.Hi == null ? kS.adF() : this.Hi;
    }

    private SingleFieldBuilderV3<kS, kU, kV> aeI() {
        if (this.Hw == null) {
            this.Hw = new SingleFieldBuilderV3((AbstractMessage)this.adX(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Hi = null;
        }
        return this.Hw;
    }

    @Override
    public boolean adZ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public kZ aea() {
        if (this.Hx == null) {
            return this.Hk == null ? kZ.afb() : this.Hk;
        }
        return (kZ)this.Hx.getMessage();
    }

    public kY a(kZ kZ2) {
        if (this.Hx == null) {
            if (kZ2 == null) {
                throw new NullPointerException();
            }
            this.Hk = kZ2;
            this.onChanged();
        } else {
            this.Hx.setMessage((AbstractMessage)kZ2);
        }
        this.an |= 0x80;
        return this;
    }

    public kY a(lb_0 lb_02) {
        if (this.Hx == null) {
            this.Hk = lb_02.aff();
            this.onChanged();
        } else {
            this.Hx.setMessage((AbstractMessage)lb_02.aff());
        }
        this.an |= 0x80;
        return this;
    }

    public kY b(kZ kZ2) {
        if (this.Hx == null) {
            this.Hk = (this.an & 0x80) != 0 && this.Hk != null && this.Hk != kZ.afb() ? kZ.c(this.Hk).e(kZ2).afg() : kZ2;
            this.onChanged();
        } else {
            this.Hx.mergeFrom((AbstractMessage)kZ2);
        }
        this.an |= 0x80;
        return this;
    }

    public kY aeJ() {
        if (this.Hx == null) {
            this.Hk = null;
            this.onChanged();
        } else {
            this.Hx.clear();
        }
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public lb_0 aeK() {
        this.an |= 0x80;
        this.onChanged();
        return (lb_0)this.aeL().getBuilder();
    }

    @Override
    public lc aeb() {
        if (this.Hx != null) {
            return (lc)this.Hx.getMessageOrBuilder();
        }
        return this.Hk == null ? kZ.afb() : this.Hk;
    }

    private SingleFieldBuilderV3<kZ, lb_0, lc> aeL() {
        if (this.Hx == null) {
            this.Hx = new SingleFieldBuilderV3((AbstractMessage)this.aea(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Hk = null;
        }
        return this.Hx;
    }

    @Override
    public boolean aec() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public ld_0 aed() {
        if (this.Hy == null) {
            return this.Hm == null ? ld_0.afs() : this.Hm;
        }
        return (ld_0)this.Hy.getMessage();
    }

    public kY a(ld_0 ld_02) {
        if (this.Hy == null) {
            if (ld_02 == null) {
                throw new NullPointerException();
            }
            this.Hm = ld_02;
            this.onChanged();
        } else {
            this.Hy.setMessage((AbstractMessage)ld_02);
        }
        this.an |= 0x100;
        return this;
    }

    public kY a(lf_0 lf_02) {
        if (this.Hy == null) {
            this.Hm = lf_02.afx();
            this.onChanged();
        } else {
            this.Hy.setMessage((AbstractMessage)lf_02.afx());
        }
        this.an |= 0x100;
        return this;
    }

    public kY b(ld_0 ld_02) {
        if (this.Hy == null) {
            this.Hm = (this.an & 0x100) != 0 && this.Hm != null && this.Hm != ld_0.afs() ? ld_0.c(this.Hm).e(ld_02).afy() : ld_02;
            this.onChanged();
        } else {
            this.Hy.mergeFrom((AbstractMessage)ld_02);
        }
        this.an |= 0x100;
        return this;
    }

    public kY aeM() {
        if (this.Hy == null) {
            this.Hm = null;
            this.onChanged();
        } else {
            this.Hy.clear();
        }
        this.an &= 0xFFFFFEFF;
        return this;
    }

    public lf_0 aeN() {
        this.an |= 0x100;
        this.onChanged();
        return (lf_0)this.aeO().getBuilder();
    }

    @Override
    public lg_0 aee() {
        if (this.Hy != null) {
            return (lg_0)this.Hy.getMessageOrBuilder();
        }
        return this.Hm == null ? ld_0.afs() : this.Hm;
    }

    private SingleFieldBuilderV3<ld_0, lf_0, lg_0> aeO() {
        if (this.Hy == null) {
            this.Hy = new SingleFieldBuilderV3((AbstractMessage)this.aed(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Hm = null;
        }
        return this.Hy;
    }

    @Override
    public boolean aef() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public lu_1 aeg() {
        if (this.Hz == null) {
            return this.Ho == null ? lu_1.agy() : this.Ho;
        }
        return (lu_1)this.Hz.getMessage();
    }

    public kY a(lu_1 lu_12) {
        if (this.Hz == null) {
            if (lu_12 == null) {
                throw new NullPointerException();
            }
            this.Ho = lu_12;
            this.onChanged();
        } else {
            this.Hz.setMessage((AbstractMessage)lu_12);
        }
        this.an |= 0x200;
        return this;
    }

    public kY a(lw_1 lw_12) {
        if (this.Hz == null) {
            this.Ho = lw_12.agC();
            this.onChanged();
        } else {
            this.Hz.setMessage((AbstractMessage)lw_12.agC());
        }
        this.an |= 0x200;
        return this;
    }

    public kY b(lu_1 lu_12) {
        if (this.Hz == null) {
            this.Ho = (this.an & 0x200) != 0 && this.Ho != null && this.Ho != lu_1.agy() ? lu_1.c(this.Ho).e(lu_12).agD() : lu_12;
            this.onChanged();
        } else {
            this.Hz.mergeFrom((AbstractMessage)lu_12);
        }
        this.an |= 0x200;
        return this;
    }

    public kY aeP() {
        if (this.Hz == null) {
            this.Ho = null;
            this.onChanged();
        } else {
            this.Hz.clear();
        }
        this.an &= 0xFFFFFDFF;
        return this;
    }

    public lw_1 aeQ() {
        this.an |= 0x200;
        this.onChanged();
        return (lw_1)this.aeR().getBuilder();
    }

    @Override
    public lx_1 aeh() {
        if (this.Hz != null) {
            return (lx_1)this.Hz.getMessageOrBuilder();
        }
        return this.Ho == null ? lu_1.agy() : this.Ho;
    }

    private SingleFieldBuilderV3<lu_1, lw_1, lx_1> aeR() {
        if (this.Hz == null) {
            this.Hz = new SingleFieldBuilderV3((AbstractMessage)this.aeg(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ho = null;
        }
        return this.Hz;
    }

    @Override
    public boolean aei() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int aej() {
        return this.Hq;
    }

    public kY gZ(int n) {
        this.an |= 0x400;
        this.Hq = n;
        this.onChanged();
        return this;
    }

    public kY aeS() {
        this.an &= 0xFFFFFBFF;
        this.Hq = 0;
        this.onChanged();
        return this;
    }

    public final kY ek(UnknownFieldSet unknownFieldSet) {
        return (kY)super.setUnknownFields(unknownFieldSet);
    }

    public final kY el(UnknownFieldSet unknownFieldSet) {
        return (kY)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.el(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ek(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.el(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bF(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bF(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bF(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ek(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aeq();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aet();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.el(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bF(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aeq();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bF(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aet();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.el(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ek(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.el(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bF(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bF(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bF(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ek(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aet();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aes();
    }

    public /* synthetic */ Message build() {
        return this.aer();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bF(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aeq();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aet();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aes();
    }

    public /* synthetic */ MessageLite build() {
        return this.aer();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aeq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aeo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aeo();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aet();
    }

    public /* synthetic */ Object clone() {
        return this.aet();
    }
}

