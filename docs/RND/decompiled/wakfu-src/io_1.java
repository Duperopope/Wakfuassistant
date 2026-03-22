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

/*
 * Renamed from iO
 */
public final class io_1
extends GeneratedMessageV3.Builder<io_1>
implements ip_2 {
    private int an;
    private long wX;
    private long zs;
    private int zu;
    private int wR;
    private im_2 zx;
    private SingleFieldBuilderV3<im_2, io_2, ip_1> xR;
    private long zz;
    private long zB;
    private ii_1 zD;
    private SingleFieldBuilderV3<ii_1, ik_1, il_1> zQ;
    private int zF;
    private long zH;
    private ia_2 zJ;
    private SingleFieldBuilderV3<ia_2, ic_2, id_2> zR;
    private iq_1 zL;
    private SingleFieldBuilderV3<iq_1, is_2, it_2> zS;
    private iq_2 zN;
    private SingleFieldBuilderV3<iq_2, is_1, iv_1> zT;

    public static final Descriptors.Descriptor QU() {
        return ih_2.wv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.ww.ensureFieldAccessorsInitialized(im_1.class, io_1.class);
    }

    io_1() {
        this.D();
    }

    io_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (im_1.aJ()) {
            this.Ni();
            this.Rj();
            this.Ro();
            this.Rr();
            this.Ru();
        }
    }

    public io_1 QV() {
        super.clear();
        this.wX = 0L;
        this.an &= 0xFFFFFFFE;
        this.zs = 0L;
        this.an &= 0xFFFFFFFD;
        this.zu = 0;
        this.an &= 0xFFFFFFFB;
        this.wR = 0;
        this.an &= 0xFFFFFFF7;
        if (this.xR == null) {
            this.zx = null;
        } else {
            this.xR.clear();
        }
        this.an &= 0xFFFFFFEF;
        this.zz = 0L;
        this.an &= 0xFFFFFFDF;
        this.zB = 0L;
        this.an &= 0xFFFFFFBF;
        if (this.zQ == null) {
            this.zD = null;
        } else {
            this.zQ.clear();
        }
        this.an &= 0xFFFFFF7F;
        this.zF = 0;
        this.an &= 0xFFFFFEFF;
        this.zH = 0L;
        this.an &= 0xFFFFFDFF;
        if (this.zR == null) {
            this.zJ = null;
        } else {
            this.zR.clear();
        }
        this.an &= 0xFFFFFBFF;
        if (this.zS == null) {
            this.zL = null;
        } else {
            this.zS.clear();
        }
        this.an &= 0xFFFFF7FF;
        if (this.zT == null) {
            this.zN = null;
        } else {
            this.zT.clear();
        }
        this.an &= 0xFFFFEFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wv;
    }

    public im_1 QT() {
        return im_1.QS();
    }

    public im_1 QW() {
        im_1 im_12 = this.QX();
        if (!im_12.isInitialized()) {
            throw io_1.newUninitializedMessageException((Message)im_12);
        }
        return im_12;
    }

    public im_1 QX() {
        im_1 im_12 = new im_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            im_12.wX = this.wX;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            im_12.zs = this.zs;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            im_12.zu = this.zu;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            im_12.wR = this.wR;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            im_12.zx = this.xR == null ? this.zx : (im_2)this.xR.build();
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            im_12.zz = this.zz;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            im_12.zB = this.zB;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            im_12.zD = this.zQ == null ? this.zD : (ii_1)this.zQ.build();
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            im_12.zF = this.zF;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            im_12.zH = this.zH;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            im_12.zJ = this.zR == null ? this.zJ : (ia_2)this.zR.build();
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            im_12.zL = this.zS == null ? this.zL : (iq_1)this.zS.build();
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            im_12.zN = this.zT == null ? this.zN : (iq_2)this.zT.build();
            n2 |= 0x1000;
        }
        im_12.an = n2;
        this.onBuilt();
        return im_12;
    }

    public io_1 QY() {
        return (io_1)super.clone();
    }

    public io_1 di(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (io_1)super.setField(fieldDescriptor, object);
    }

    public io_1 be(Descriptors.FieldDescriptor fieldDescriptor) {
        return (io_1)super.clearField(fieldDescriptor);
    }

    public io_1 be(Descriptors.OneofDescriptor oneofDescriptor) {
        return (io_1)super.clearOneof(oneofDescriptor);
    }

    public io_1 be(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (io_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public io_1 dj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (io_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public io_1 be(Message message) {
        if (message instanceof im_1) {
            return this.c((im_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public io_1 c(im_1 im_12) {
        if (im_12 == im_1.QS()) {
            return this;
        }
        if (im_12.LU()) {
            this.ak(im_12.LV());
        }
        if (im_12.Qp()) {
            this.al(im_12.Qq());
        }
        if (im_12.Qr()) {
            this.eK(im_12.Qs());
        }
        if (im_12.LP()) {
            this.eL(im_12.getValue());
        }
        if (im_12.LW()) {
            this.e(im_12.Qt());
        }
        if (im_12.Qv()) {
            this.am(im_12.Qw());
        }
        if (im_12.Qx()) {
            this.an(im_12.Qy());
        }
        if (im_12.Qz()) {
            this.e(im_12.QA());
        }
        if (im_12.QC()) {
            this.eM(im_12.QD());
        }
        if (im_12.QE()) {
            this.ao(im_12.QF());
        }
        if (im_12.QG()) {
            this.e(im_12.QH());
        }
        if (im_12.QJ()) {
            this.b(im_12.QK());
        }
        if (im_12.QM()) {
            this.e(im_12.QN());
        }
        this.dj(im_1.b(im_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.LU()) {
            return false;
        }
        if (!this.Qp()) {
            return false;
        }
        if (!this.Qr()) {
            return false;
        }
        if (!this.LP()) {
            return false;
        }
        if (this.LW() && !this.Qt().isInitialized()) {
            return false;
        }
        if (this.Qz() && !this.QA().isInitialized()) {
            return false;
        }
        if (this.QG() && !this.QH().isInitialized()) {
            return false;
        }
        return !this.QM() || this.QN().isInitialized();
    }

    public io_1 fo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        im_1 im_12 = null;
        try {
            im_12 = (im_1)im_1.zP.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            im_12 = (im_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (im_12 != null) {
                this.c(im_12);
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

    public io_1 ak(long l) {
        this.an |= 1;
        this.wX = l;
        this.onChanged();
        return this;
    }

    public io_1 QZ() {
        this.an &= 0xFFFFFFFE;
        this.wX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Qp() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Qq() {
        return this.zs;
    }

    public io_1 al(long l) {
        this.an |= 2;
        this.zs = l;
        this.onChanged();
        return this;
    }

    public io_1 Ra() {
        this.an &= 0xFFFFFFFD;
        this.zs = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Qr() {
        return (this.an & 4) != 0;
    }

    @Override
    public int Qs() {
        return this.zu;
    }

    public io_1 eK(int n) {
        this.an |= 4;
        this.zu = n;
        this.onChanged();
        return this;
    }

    public io_1 Rb() {
        this.an &= 0xFFFFFFFB;
        this.zu = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LP() {
        return (this.an & 8) != 0;
    }

    @Override
    public int getValue() {
        return this.wR;
    }

    public io_1 eL(int n) {
        this.an |= 8;
        this.wR = n;
        this.onChanged();
        return this;
    }

    public io_1 Rc() {
        this.an &= 0xFFFFFFF7;
        this.wR = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LW() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public im_2 Qt() {
        if (this.xR == null) {
            return this.zx == null ? im_2.NR() : this.zx;
        }
        return (im_2)this.xR.getMessage();
    }

    public io_1 d(im_2 im_22) {
        if (this.xR == null) {
            if (im_22 == null) {
                throw new NullPointerException();
            }
            this.zx = im_22;
            this.onChanged();
        } else {
            this.xR.setMessage((AbstractMessage)im_22);
        }
        this.an |= 0x10;
        return this;
    }

    public io_1 a(io_2 io_22) {
        if (this.xR == null) {
            this.zx = io_22.NV();
            this.onChanged();
        } else {
            this.xR.setMessage((AbstractMessage)io_22.NV());
        }
        this.an |= 0x10;
        return this;
    }

    public io_1 e(im_2 im_22) {
        if (this.xR == null) {
            this.zx = (this.an & 0x10) != 0 && this.zx != null && this.zx != im_2.NR() ? im_2.a(this.zx).c(im_22).NW() : im_22;
            this.onChanged();
        } else {
            this.xR.mergeFrom((AbstractMessage)im_22);
        }
        this.an |= 0x10;
        return this;
    }

    public io_1 Rd() {
        if (this.xR == null) {
            this.zx = null;
            this.onChanged();
        } else {
            this.xR.clear();
        }
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public io_2 Re() {
        this.an |= 0x10;
        this.onChanged();
        return (io_2)this.Ni().getBuilder();
    }

    @Override
    public ip_1 Qu() {
        if (this.xR != null) {
            return (ip_1)this.xR.getMessageOrBuilder();
        }
        return this.zx == null ? im_2.NR() : this.zx;
    }

    private SingleFieldBuilderV3<im_2, io_2, ip_1> Ni() {
        if (this.xR == null) {
            this.xR = new SingleFieldBuilderV3((AbstractMessage)this.Qt(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zx = null;
        }
        return this.xR;
    }

    @Override
    public boolean Qv() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Qw() {
        return this.zz;
    }

    public io_1 am(long l) {
        this.an |= 0x20;
        this.zz = l;
        this.onChanged();
        return this;
    }

    public io_1 Rf() {
        this.an &= 0xFFFFFFDF;
        this.zz = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Qx() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long Qy() {
        return this.zB;
    }

    public io_1 an(long l) {
        this.an |= 0x40;
        this.zB = l;
        this.onChanged();
        return this;
    }

    public io_1 Rg() {
        this.an &= 0xFFFFFFBF;
        this.zB = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Qz() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public ii_1 QA() {
        if (this.zQ == null) {
            return this.zD == null ? ii_1.MT() : this.zD;
        }
        return (ii_1)this.zQ.getMessage();
    }

    public io_1 d(ii_1 ii_12) {
        if (this.zQ == null) {
            if (ii_12 == null) {
                throw new NullPointerException();
            }
            this.zD = ii_12;
            this.onChanged();
        } else {
            this.zQ.setMessage((AbstractMessage)ii_12);
        }
        this.an |= 0x80;
        return this;
    }

    public io_1 a(ik_1 ik_12) {
        if (this.zQ == null) {
            this.zD = ik_12.MX();
            this.onChanged();
        } else {
            this.zQ.setMessage((AbstractMessage)ik_12.MX());
        }
        this.an |= 0x80;
        return this;
    }

    public io_1 e(ii_1 ii_12) {
        if (this.zQ == null) {
            this.zD = (this.an & 0x80) != 0 && this.zD != null && this.zD != ii_1.MT() ? ii_1.a(this.zD).c(ii_12).MY() : ii_12;
            this.onChanged();
        } else {
            this.zQ.mergeFrom((AbstractMessage)ii_12);
        }
        this.an |= 0x80;
        return this;
    }

    public io_1 Rh() {
        if (this.zQ == null) {
            this.zD = null;
            this.onChanged();
        } else {
            this.zQ.clear();
        }
        this.an &= 0xFFFFFF7F;
        return this;
    }

    public ik_1 Ri() {
        this.an |= 0x80;
        this.onChanged();
        return (ik_1)this.Rj().getBuilder();
    }

    @Override
    public il_1 QB() {
        if (this.zQ != null) {
            return (il_1)this.zQ.getMessageOrBuilder();
        }
        return this.zD == null ? ii_1.MT() : this.zD;
    }

    private SingleFieldBuilderV3<ii_1, ik_1, il_1> Rj() {
        if (this.zQ == null) {
            this.zQ = new SingleFieldBuilderV3((AbstractMessage)this.QA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zD = null;
        }
        return this.zQ;
    }

    @Override
    public boolean QC() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int QD() {
        return this.zF;
    }

    public io_1 eM(int n) {
        this.an |= 0x100;
        this.zF = n;
        this.onChanged();
        return this;
    }

    public io_1 Rk() {
        this.an &= 0xFFFFFEFF;
        this.zF = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean QE() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long QF() {
        return this.zH;
    }

    public io_1 ao(long l) {
        this.an |= 0x200;
        this.zH = l;
        this.onChanged();
        return this;
    }

    public io_1 Rl() {
        this.an &= 0xFFFFFDFF;
        this.zH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean QG() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public ia_2 QH() {
        if (this.zR == null) {
            return this.zJ == null ? ia_2.Pt() : this.zJ;
        }
        return (ia_2)this.zR.getMessage();
    }

    public io_1 d(ia_2 ia_22) {
        if (this.zR == null) {
            if (ia_22 == null) {
                throw new NullPointerException();
            }
            this.zJ = ia_22;
            this.onChanged();
        } else {
            this.zR.setMessage((AbstractMessage)ia_22);
        }
        this.an |= 0x400;
        return this;
    }

    public io_1 a(ic_2 ic_22) {
        if (this.zR == null) {
            this.zJ = ic_22.Px();
            this.onChanged();
        } else {
            this.zR.setMessage((AbstractMessage)ic_22.Px());
        }
        this.an |= 0x400;
        return this;
    }

    public io_1 e(ia_2 ia_22) {
        if (this.zR == null) {
            this.zJ = (this.an & 0x400) != 0 && this.zJ != null && this.zJ != ia_2.Pt() ? ia_2.a(this.zJ).c(ia_22).Py() : ia_22;
            this.onChanged();
        } else {
            this.zR.mergeFrom((AbstractMessage)ia_22);
        }
        this.an |= 0x400;
        return this;
    }

    public io_1 Rm() {
        if (this.zR == null) {
            this.zJ = null;
            this.onChanged();
        } else {
            this.zR.clear();
        }
        this.an &= 0xFFFFFBFF;
        return this;
    }

    public ic_2 Rn() {
        this.an |= 0x400;
        this.onChanged();
        return (ic_2)this.Ro().getBuilder();
    }

    @Override
    public id_2 QI() {
        if (this.zR != null) {
            return (id_2)this.zR.getMessageOrBuilder();
        }
        return this.zJ == null ? ia_2.Pt() : this.zJ;
    }

    private SingleFieldBuilderV3<ia_2, ic_2, id_2> Ro() {
        if (this.zR == null) {
            this.zR = new SingleFieldBuilderV3((AbstractMessage)this.QH(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zJ = null;
        }
        return this.zR;
    }

    @Override
    public boolean QJ() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public iq_1 QK() {
        if (this.zS == null) {
            return this.zL == null ? iq_1.RH() : this.zL;
        }
        return (iq_1)this.zS.getMessage();
    }

    public io_1 a(iq_1 iq_12) {
        if (this.zS == null) {
            if (iq_12 == null) {
                throw new NullPointerException();
            }
            this.zL = iq_12;
            this.onChanged();
        } else {
            this.zS.setMessage((AbstractMessage)iq_12);
        }
        this.an |= 0x800;
        return this;
    }

    public io_1 a(is_2 is_22) {
        if (this.zS == null) {
            this.zL = is_22.RL();
            this.onChanged();
        } else {
            this.zS.setMessage((AbstractMessage)is_22.RL());
        }
        this.an |= 0x800;
        return this;
    }

    public io_1 b(iq_1 iq_12) {
        if (this.zS == null) {
            this.zL = (this.an & 0x800) != 0 && this.zL != null && this.zL != iq_1.RH() ? iq_1.c(this.zL).e(iq_12).RM() : iq_12;
            this.onChanged();
        } else {
            this.zS.mergeFrom((AbstractMessage)iq_12);
        }
        this.an |= 0x800;
        return this;
    }

    public io_1 Rp() {
        if (this.zS == null) {
            this.zL = null;
            this.onChanged();
        } else {
            this.zS.clear();
        }
        this.an &= 0xFFFFF7FF;
        return this;
    }

    public is_2 Rq() {
        this.an |= 0x800;
        this.onChanged();
        return (is_2)this.Rr().getBuilder();
    }

    @Override
    public it_2 QL() {
        if (this.zS != null) {
            return (it_2)this.zS.getMessageOrBuilder();
        }
        return this.zL == null ? iq_1.RH() : this.zL;
    }

    private SingleFieldBuilderV3<iq_1, is_2, it_2> Rr() {
        if (this.zS == null) {
            this.zS = new SingleFieldBuilderV3((AbstractMessage)this.QK(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zL = null;
        }
        return this.zS;
    }

    @Override
    public boolean QM() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public iq_2 QN() {
        if (this.zT == null) {
            return this.zN == null ? iq_2.Ov() : this.zN;
        }
        return (iq_2)this.zT.getMessage();
    }

    public io_1 d(iq_2 iq_22) {
        if (this.zT == null) {
            if (iq_22 == null) {
                throw new NullPointerException();
            }
            this.zN = iq_22;
            this.onChanged();
        } else {
            this.zT.setMessage((AbstractMessage)iq_22);
        }
        this.an |= 0x1000;
        return this;
    }

    public io_1 a(is_1 is_12) {
        if (this.zT == null) {
            this.zN = is_12.Oz();
            this.onChanged();
        } else {
            this.zT.setMessage((AbstractMessage)is_12.Oz());
        }
        this.an |= 0x1000;
        return this;
    }

    public io_1 e(iq_2 iq_22) {
        if (this.zT == null) {
            this.zN = (this.an & 0x1000) != 0 && this.zN != null && this.zN != iq_2.Ov() ? iq_2.a(this.zN).c(iq_22).OA() : iq_22;
            this.onChanged();
        } else {
            this.zT.mergeFrom((AbstractMessage)iq_22);
        }
        this.an |= 0x1000;
        return this;
    }

    public io_1 Rs() {
        if (this.zT == null) {
            this.zN = null;
            this.onChanged();
        } else {
            this.zT.clear();
        }
        this.an &= 0xFFFFEFFF;
        return this;
    }

    public is_1 Rt() {
        this.an |= 0x1000;
        this.onChanged();
        return (is_1)this.Ru().getBuilder();
    }

    @Override
    public iv_1 QO() {
        if (this.zT != null) {
            return (iv_1)this.zT.getMessageOrBuilder();
        }
        return this.zN == null ? iq_2.Ov() : this.zN;
    }

    private SingleFieldBuilderV3<iq_2, is_1, iv_1> Ru() {
        if (this.zT == null) {
            this.zT = new SingleFieldBuilderV3((AbstractMessage)this.QN(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.zN = null;
        }
        return this.zT;
    }

    public final io_1 di(UnknownFieldSet unknownFieldSet) {
        return (io_1)super.setUnknownFields(unknownFieldSet);
    }

    public final io_1 dj(UnknownFieldSet unknownFieldSet) {
        return (io_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.di(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.be(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.be(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.be(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.di(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.QV();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.QY();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fo(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.be(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.QV();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.be(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.QY();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.di(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.be(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.be(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.be(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.di(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fo(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.QY();
    }

    public /* synthetic */ Message buildPartial() {
        return this.QX();
    }

    public /* synthetic */ Message build() {
        return this.QW();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.be(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.QV();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fo(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.QY();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.QX();
    }

    public /* synthetic */ MessageLite build() {
        return this.QW();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.QV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.QT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.QT();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fo(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.QY();
    }

    public /* synthetic */ Object clone() {
        return this.QY();
    }
}

