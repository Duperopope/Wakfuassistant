/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
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
 * Renamed from ik
 */
public final class ik_1
extends GeneratedMessageV3.Builder<ik_1>
implements il_1 {
    private int an;
    private ByteString wP = ByteString.EMPTY;
    private int wR;
    private int wT;
    private int wV;
    private long wX;
    private int mj;
    private ii_2 xa;
    private SingleFieldBuilderV3<ii_2, ik_2, il_2> xR;
    private int xc;
    private boolean xe;
    private boolean xg;
    private int xi;
    private int xk;
    private long xm;
    private long xo;
    private ii_2 xq;
    private SingleFieldBuilderV3<ii_2, ik_2, il_2> xS;
    private float xs;
    private int xu;
    private boolean xw;
    private boolean xy;
    private boolean xA;
    private boolean xC;
    private boolean xE;
    private boolean xG;
    private boolean xI;
    private long xK;
    private ie_2 xM;
    private SingleFieldBuilderV3<ie_2, ig_2, ih_1> xT;
    private zk_2 xO;
    private SingleFieldBuilderV3<zk_2, zm_2, zn_1> xU;

    public static final Descriptors.Descriptor MV() {
        return ih_2.wF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ih_2.wG.ensureFieldAccessorsInitialized(ii_1.class, ik_1.class);
    }

    ik_1() {
        this.D();
    }

    ik_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ii_1.gG()) {
            this.Ni();
            this.Ns();
            this.NF();
            this.NI();
        }
    }

    public ik_1 MW() {
        super.clear();
        this.wP = ByteString.EMPTY;
        this.an &= 0xFFFFFFFE;
        this.wR = 0;
        this.an &= 0xFFFFFFFD;
        this.wT = 0;
        this.an &= 0xFFFFFFFB;
        this.wV = 0;
        this.an &= 0xFFFFFFF7;
        this.wX = 0L;
        this.an &= 0xFFFFFFEF;
        this.mj = 0;
        this.an &= 0xFFFFFFDF;
        if (this.xR == null) {
            this.xa = null;
        } else {
            this.xR.clear();
        }
        this.an &= 0xFFFFFFBF;
        this.xc = 0;
        this.an &= 0xFFFFFF7F;
        this.xe = false;
        this.an &= 0xFFFFFEFF;
        this.xg = false;
        this.an &= 0xFFFFFDFF;
        this.xi = 0;
        this.an &= 0xFFFFFBFF;
        this.xk = 0;
        this.an &= 0xFFFFF7FF;
        this.xm = 0L;
        this.an &= 0xFFFFEFFF;
        this.xo = 0L;
        this.an &= 0xFFFFDFFF;
        if (this.xS == null) {
            this.xq = null;
        } else {
            this.xS.clear();
        }
        this.an &= 0xFFFFBFFF;
        this.xs = 0.0f;
        this.an &= 0xFFFF7FFF;
        this.xu = 0;
        this.an &= 0xFFFEFFFF;
        this.xw = false;
        this.an &= 0xFFFDFFFF;
        this.xy = false;
        this.an &= 0xFFFBFFFF;
        this.xA = false;
        this.an &= 0xFFF7FFFF;
        this.xC = false;
        this.an &= 0xFFEFFFFF;
        this.xE = false;
        this.an &= 0xFFDFFFFF;
        this.xG = false;
        this.an &= 0xFFBFFFFF;
        this.xI = false;
        this.an &= 0xFF7FFFFF;
        this.xK = 0L;
        this.an &= 0xFEFFFFFF;
        if (this.xT == null) {
            this.xM = null;
        } else {
            this.xT.clear();
        }
        this.an &= 0xFDFFFFFF;
        if (this.xU == null) {
            this.xO = null;
        } else {
            this.xU.clear();
        }
        this.an &= 0xFBFFFFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ih_2.wF;
    }

    public ii_1 MU() {
        return ii_1.MT();
    }

    public ii_1 MX() {
        ii_1 ii_12 = this.MY();
        if (!ii_12.isInitialized()) {
            throw ik_1.newUninitializedMessageException((Message)ii_12);
        }
        return ii_12;
    }

    public ii_1 MY() {
        ii_1 ii_12 = new ii_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        ii_12.wP = this.wP;
        if ((n & 2) != 0) {
            ii_12.wR = this.wR;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ii_12.wT = this.wT;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            ii_12.wV = this.wV;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            ii_12.wX = this.wX;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            ii_12.mj = this.mj;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            ii_12.xa = this.xR == null ? this.xa : (ii_2)this.xR.build();
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            ii_12.xc = this.xc;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            ii_12.xe = this.xe;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            ii_12.xg = this.xg;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            ii_12.xi = this.xi;
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            ii_12.xk = this.xk;
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            ii_12.xm = this.xm;
            n2 |= 0x1000;
        }
        if ((n & 0x2000) != 0) {
            ii_12.xo = this.xo;
            n2 |= 0x2000;
        }
        if ((n & 0x4000) != 0) {
            ii_12.xq = this.xS == null ? this.xq : (ii_2)this.xS.build();
            n2 |= 0x4000;
        }
        if ((n & 0x8000) != 0) {
            ii_12.xs = this.xs;
            n2 |= 0x8000;
        }
        if ((n & 0x10000) != 0) {
            ii_12.xu = this.xu;
            n2 |= 0x10000;
        }
        if ((n & 0x20000) != 0) {
            ii_12.xw = this.xw;
            n2 |= 0x20000;
        }
        if ((n & 0x40000) != 0) {
            ii_12.xy = this.xy;
            n2 |= 0x40000;
        }
        if ((n & 0x80000) != 0) {
            ii_12.xA = this.xA;
            n2 |= 0x80000;
        }
        if ((n & 0x100000) != 0) {
            ii_12.xC = this.xC;
            n2 |= 0x100000;
        }
        if ((n & 0x200000) != 0) {
            ii_12.xE = this.xE;
            n2 |= 0x200000;
        }
        if ((n & 0x400000) != 0) {
            ii_12.xG = this.xG;
            n2 |= 0x400000;
        }
        if ((n & 0x800000) != 0) {
            ii_12.xI = this.xI;
            n2 |= 0x800000;
        }
        if ((n & 0x1000000) != 0) {
            ii_12.xK = this.xK;
            n2 |= 0x1000000;
        }
        if ((n & 0x2000000) != 0) {
            ii_12.xM = this.xT == null ? this.xM : (ie_2)this.xT.build();
            n2 |= 0x2000000;
        }
        if ((n & 0x4000000) != 0) {
            ii_12.xO = this.xU == null ? this.xO : (zk_2)this.xU.build();
            n2 |= 0x4000000;
        }
        ii_12.an = n2;
        this.onBuilt();
        return ii_12;
    }

    public ik_1 MZ() {
        return (ik_1)super.clone();
    }

    public ik_1 cU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ik_1)super.setField(fieldDescriptor, object);
    }

    public ik_1 aX(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ik_1)super.clearField(fieldDescriptor);
    }

    public ik_1 aX(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ik_1)super.clearOneof(oneofDescriptor);
    }

    public ik_1 aX(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ik_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ik_1 cV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ik_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ik_1 aX(Message message) {
        if (message instanceof ii_1) {
            return this.c((ii_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ik_1 c(ii_1 ii_12) {
        if (ii_12 == ii_1.MT()) {
            return this;
        }
        if (ii_12.LN()) {
            this.bT(ii_12.LO());
        }
        if (ii_12.LP()) {
            this.ek(ii_12.getValue());
        }
        if (ii_12.LQ()) {
            this.el(ii_12.LR());
        }
        if (ii_12.LS()) {
            this.em(ii_12.LT());
        }
        if (ii_12.LU()) {
            this.ae(ii_12.LV());
        }
        if (ii_12.tK()) {
            this.en(ii_12.tL());
        }
        if (ii_12.LW()) {
            this.b(ii_12.LX());
        }
        if (ii_12.LZ()) {
            this.eo(ii_12.Ma());
        }
        if (ii_12.Mb()) {
            this.r(ii_12.Mc());
        }
        if (ii_12.Md()) {
            this.s(ii_12.Me());
        }
        if (ii_12.Mf()) {
            this.ep(ii_12.Mg());
        }
        if (ii_12.Mh()) {
            this.eq(ii_12.Mi());
        }
        if (ii_12.Mj()) {
            this.af(ii_12.Mk());
        }
        if (ii_12.Ml()) {
            this.ag(ii_12.Mm());
        }
        if (ii_12.Mn()) {
            this.d(ii_12.Mo());
        }
        if (ii_12.Mq()) {
            this.a(ii_12.Mr());
        }
        if (ii_12.Ms()) {
            this.er(ii_12.Mt());
        }
        if (ii_12.Mu()) {
            this.t(ii_12.Mv());
        }
        if (ii_12.Mw()) {
            this.u(ii_12.Mx());
        }
        if (ii_12.My()) {
            this.v(ii_12.Mz());
        }
        if (ii_12.MA()) {
            this.w(ii_12.MB());
        }
        if (ii_12.MC()) {
            this.x(ii_12.MD());
        }
        if (ii_12.ME()) {
            this.y(ii_12.MF());
        }
        if (ii_12.MG()) {
            this.z(ii_12.MH());
        }
        if (ii_12.MI()) {
            this.ah(ii_12.MJ());
        }
        if (ii_12.MK()) {
            this.b(ii_12.ML());
        }
        if (ii_12.MN()) {
            this.b(ii_12.MO());
        }
        this.cV(ii_1.b(ii_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (this.LW() && !this.LX().isInitialized()) {
            return false;
        }
        if (this.Mn() && !this.Mo().isInitialized()) {
            return false;
        }
        if (this.MK() && !this.ML().isInitialized()) {
            return false;
        }
        return !this.MN() || this.MO().isInitialized();
    }

    public ik_1 eT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ii_1 ii_12 = null;
        try {
            ii_12 = (ii_1)ii_1.xQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ii_12 = (ii_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ii_12 != null) {
                this.c(ii_12);
            }
        }
        return this;
    }

    @Override
    public boolean LN() {
        return (this.an & 1) != 0;
    }

    @Override
    public ByteString LO() {
        return this.wP;
    }

    public ik_1 bT(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.wP = byteString;
        this.onChanged();
        return this;
    }

    public ik_1 Na() {
        this.an &= 0xFFFFFFFE;
        this.wP = ii_1.MT().LO();
        this.onChanged();
        return this;
    }

    @Override
    public boolean LP() {
        return (this.an & 2) != 0;
    }

    @Override
    public int getValue() {
        return this.wR;
    }

    public ik_1 ek(int n) {
        this.an |= 2;
        this.wR = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nb() {
        this.an &= 0xFFFFFFFD;
        this.wR = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LQ() {
        return (this.an & 4) != 0;
    }

    @Override
    public int LR() {
        return this.wT;
    }

    public ik_1 el(int n) {
        this.an |= 4;
        this.wT = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nc() {
        this.an &= 0xFFFFFFFB;
        this.wT = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LS() {
        return (this.an & 8) != 0;
    }

    @Override
    public int LT() {
        return this.wV;
    }

    public ik_1 em(int n) {
        this.an |= 8;
        this.wV = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nd() {
        this.an &= 0xFFFFFFF7;
        this.wV = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LU() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    public ik_1 ae(long l) {
        this.an |= 0x10;
        this.wX = l;
        this.onChanged();
        return this;
    }

    public ik_1 Ne() {
        this.an &= 0xFFFFFFEF;
        this.wX = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public ik_1 en(int n) {
        this.an |= 0x20;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nf() {
        this.an &= 0xFFFFFFDF;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean LW() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public ii_2 LX() {
        if (this.xR == null) {
            return this.xa == null ? ii_2.Qe() : this.xa;
        }
        return (ii_2)this.xR.getMessage();
    }

    public ik_1 a(ii_2 ii_22) {
        if (this.xR == null) {
            if (ii_22 == null) {
                throw new NullPointerException();
            }
            this.xa = ii_22;
            this.onChanged();
        } else {
            this.xR.setMessage((AbstractMessage)ii_22);
        }
        this.an |= 0x40;
        return this;
    }

    public ik_1 a(ik_2 ik_22) {
        if (this.xR == null) {
            this.xa = ik_22.Qi();
            this.onChanged();
        } else {
            this.xR.setMessage((AbstractMessage)ik_22.Qi());
        }
        this.an |= 0x40;
        return this;
    }

    public ik_1 b(ii_2 ii_22) {
        if (this.xR == null) {
            this.xa = (this.an & 0x40) != 0 && this.xa != null && this.xa != ii_2.Qe() ? ii_2.f(this.xa).h(ii_22).Qj() : ii_22;
            this.onChanged();
        } else {
            this.xR.mergeFrom((AbstractMessage)ii_22);
        }
        this.an |= 0x40;
        return this;
    }

    public ik_1 Ng() {
        if (this.xR == null) {
            this.xa = null;
            this.onChanged();
        } else {
            this.xR.clear();
        }
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public ik_2 Nh() {
        this.an |= 0x40;
        this.onChanged();
        return (ik_2)this.Ni().getBuilder();
    }

    @Override
    public il_2 LY() {
        if (this.xR != null) {
            return (il_2)this.xR.getMessageOrBuilder();
        }
        return this.xa == null ? ii_2.Qe() : this.xa;
    }

    private SingleFieldBuilderV3<ii_2, ik_2, il_2> Ni() {
        if (this.xR == null) {
            this.xR = new SingleFieldBuilderV3((AbstractMessage)this.LX(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.xa = null;
        }
        return this.xR;
    }

    @Override
    public boolean LZ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int Ma() {
        return this.xc;
    }

    public ik_1 eo(int n) {
        this.an |= 0x80;
        this.xc = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nj() {
        this.an &= 0xFFFFFF7F;
        this.xc = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mb() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public boolean Mc() {
        return this.xe;
    }

    public ik_1 r(boolean bl) {
        this.an |= 0x100;
        this.xe = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nk() {
        this.an &= 0xFFFFFEFF;
        this.xe = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Md() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public boolean Me() {
        return this.xg;
    }

    public ik_1 s(boolean bl) {
        this.an |= 0x200;
        this.xg = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nl() {
        this.an &= 0xFFFFFDFF;
        this.xg = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mf() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int Mg() {
        return this.xi;
    }

    public ik_1 ep(int n) {
        this.an |= 0x400;
        this.xi = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nm() {
        this.an &= 0xFFFFFBFF;
        this.xi = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mh() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int Mi() {
        return this.xk;
    }

    public ik_1 eq(int n) {
        this.an |= 0x800;
        this.xk = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nn() {
        this.an &= 0xFFFFF7FF;
        this.xk = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mj() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public long Mk() {
        return this.xm;
    }

    public ik_1 af(long l) {
        this.an |= 0x1000;
        this.xm = l;
        this.onChanged();
        return this;
    }

    public ik_1 No() {
        this.an &= 0xFFFFEFFF;
        this.xm = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ml() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public long Mm() {
        return this.xo;
    }

    public ik_1 ag(long l) {
        this.an |= 0x2000;
        this.xo = l;
        this.onChanged();
        return this;
    }

    public ik_1 Np() {
        this.an &= 0xFFFFDFFF;
        this.xo = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mn() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public ii_2 Mo() {
        if (this.xS == null) {
            return this.xq == null ? ii_2.Qe() : this.xq;
        }
        return (ii_2)this.xS.getMessage();
    }

    public ik_1 c(ii_2 ii_22) {
        if (this.xS == null) {
            if (ii_22 == null) {
                throw new NullPointerException();
            }
            this.xq = ii_22;
            this.onChanged();
        } else {
            this.xS.setMessage((AbstractMessage)ii_22);
        }
        this.an |= 0x4000;
        return this;
    }

    public ik_1 b(ik_2 ik_22) {
        if (this.xS == null) {
            this.xq = ik_22.Qi();
            this.onChanged();
        } else {
            this.xS.setMessage((AbstractMessage)ik_22.Qi());
        }
        this.an |= 0x4000;
        return this;
    }

    public ik_1 d(ii_2 ii_22) {
        if (this.xS == null) {
            this.xq = (this.an & 0x4000) != 0 && this.xq != null && this.xq != ii_2.Qe() ? ii_2.f(this.xq).h(ii_22).Qj() : ii_22;
            this.onChanged();
        } else {
            this.xS.mergeFrom((AbstractMessage)ii_22);
        }
        this.an |= 0x4000;
        return this;
    }

    public ik_1 Nq() {
        if (this.xS == null) {
            this.xq = null;
            this.onChanged();
        } else {
            this.xS.clear();
        }
        this.an &= 0xFFFFBFFF;
        return this;
    }

    public ik_2 Nr() {
        this.an |= 0x4000;
        this.onChanged();
        return (ik_2)this.Ns().getBuilder();
    }

    @Override
    public il_2 Mp() {
        if (this.xS != null) {
            return (il_2)this.xS.getMessageOrBuilder();
        }
        return this.xq == null ? ii_2.Qe() : this.xq;
    }

    private SingleFieldBuilderV3<ii_2, ik_2, il_2> Ns() {
        if (this.xS == null) {
            this.xS = new SingleFieldBuilderV3((AbstractMessage)this.Mo(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.xq = null;
        }
        return this.xS;
    }

    @Override
    public boolean Mq() {
        return (this.an & 0x8000) != 0;
    }

    @Override
    public float Mr() {
        return this.xs;
    }

    public ik_1 a(float f2) {
        this.an |= 0x8000;
        this.xs = f2;
        this.onChanged();
        return this;
    }

    public ik_1 Nt() {
        this.an &= 0xFFFF7FFF;
        this.xs = 0.0f;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ms() {
        return (this.an & 0x10000) != 0;
    }

    @Override
    public int Mt() {
        return this.xu;
    }

    public ik_1 er(int n) {
        this.an |= 0x10000;
        this.xu = n;
        this.onChanged();
        return this;
    }

    public ik_1 Nu() {
        this.an &= 0xFFFEFFFF;
        this.xu = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mu() {
        return (this.an & 0x20000) != 0;
    }

    @Override
    public boolean Mv() {
        return this.xw;
    }

    public ik_1 t(boolean bl) {
        this.an |= 0x20000;
        this.xw = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nv() {
        this.an &= 0xFFFDFFFF;
        this.xw = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Mw() {
        return (this.an & 0x40000) != 0;
    }

    @Override
    public boolean Mx() {
        return this.xy;
    }

    public ik_1 u(boolean bl) {
        this.an |= 0x40000;
        this.xy = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nw() {
        this.an &= 0xFFFBFFFF;
        this.xy = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean My() {
        return (this.an & 0x80000) != 0;
    }

    @Override
    public boolean Mz() {
        return this.xA;
    }

    public ik_1 v(boolean bl) {
        this.an |= 0x80000;
        this.xA = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nx() {
        this.an &= 0xFFF7FFFF;
        this.xA = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MA() {
        return (this.an & 0x100000) != 0;
    }

    @Override
    public boolean MB() {
        return this.xC;
    }

    public ik_1 w(boolean bl) {
        this.an |= 0x100000;
        this.xC = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Ny() {
        this.an &= 0xFFEFFFFF;
        this.xC = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MC() {
        return (this.an & 0x200000) != 0;
    }

    @Override
    public boolean MD() {
        return this.xE;
    }

    public ik_1 x(boolean bl) {
        this.an |= 0x200000;
        this.xE = bl;
        this.onChanged();
        return this;
    }

    public ik_1 Nz() {
        this.an &= 0xFFDFFFFF;
        this.xE = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ME() {
        return (this.an & 0x400000) != 0;
    }

    @Override
    public boolean MF() {
        return this.xG;
    }

    public ik_1 y(boolean bl) {
        this.an |= 0x400000;
        this.xG = bl;
        this.onChanged();
        return this;
    }

    public ik_1 NA() {
        this.an &= 0xFFBFFFFF;
        this.xG = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MG() {
        return (this.an & 0x800000) != 0;
    }

    @Override
    public boolean MH() {
        return this.xI;
    }

    public ik_1 z(boolean bl) {
        this.an |= 0x800000;
        this.xI = bl;
        this.onChanged();
        return this;
    }

    public ik_1 NB() {
        this.an &= 0xFF7FFFFF;
        this.xI = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MI() {
        return (this.an & 0x1000000) != 0;
    }

    @Override
    public long MJ() {
        return this.xK;
    }

    public ik_1 ah(long l) {
        this.an |= 0x1000000;
        this.xK = l;
        this.onChanged();
        return this;
    }

    public ik_1 NC() {
        this.an &= 0xFEFFFFFF;
        this.xK = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean MK() {
        return (this.an & 0x2000000) != 0;
    }

    @Override
    public ie_2 ML() {
        if (this.xT == null) {
            return this.xM == null ? ie_2.PO() : this.xM;
        }
        return (ie_2)this.xT.getMessage();
    }

    public ik_1 a(ie_2 ie_22) {
        if (this.xT == null) {
            if (ie_22 == null) {
                throw new NullPointerException();
            }
            this.xM = ie_22;
            this.onChanged();
        } else {
            this.xT.setMessage((AbstractMessage)ie_22);
        }
        this.an |= 0x2000000;
        return this;
    }

    public ik_1 a(ig_2 ig_22) {
        if (this.xT == null) {
            this.xM = ig_22.PS();
            this.onChanged();
        } else {
            this.xT.setMessage((AbstractMessage)ig_22.PS());
        }
        this.an |= 0x2000000;
        return this;
    }

    public ik_1 b(ie_2 ie_22) {
        if (this.xT == null) {
            this.xM = (this.an & 0x2000000) != 0 && this.xM != null && this.xM != ie_2.PO() ? ie_2.c(this.xM).e(ie_22).PT() : ie_22;
            this.onChanged();
        } else {
            this.xT.mergeFrom((AbstractMessage)ie_22);
        }
        this.an |= 0x2000000;
        return this;
    }

    public ik_1 ND() {
        if (this.xT == null) {
            this.xM = null;
            this.onChanged();
        } else {
            this.xT.clear();
        }
        this.an &= 0xFDFFFFFF;
        return this;
    }

    public ig_2 NE() {
        this.an |= 0x2000000;
        this.onChanged();
        return (ig_2)this.NF().getBuilder();
    }

    @Override
    public ih_1 MM() {
        if (this.xT != null) {
            return (ih_1)this.xT.getMessageOrBuilder();
        }
        return this.xM == null ? ie_2.PO() : this.xM;
    }

    private SingleFieldBuilderV3<ie_2, ig_2, ih_1> NF() {
        if (this.xT == null) {
            this.xT = new SingleFieldBuilderV3((AbstractMessage)this.ML(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.xM = null;
        }
        return this.xT;
    }

    @Override
    public boolean MN() {
        return (this.an & 0x4000000) != 0;
    }

    @Override
    public zk_2 MO() {
        if (this.xU == null) {
            return this.xO == null ? zk_2.axV() : this.xO;
        }
        return (zk_2)this.xU.getMessage();
    }

    public ik_1 a(zk_2 zk_22) {
        if (this.xU == null) {
            if (zk_22 == null) {
                throw new NullPointerException();
            }
            this.xO = zk_22;
            this.onChanged();
        } else {
            this.xU.setMessage((AbstractMessage)zk_22);
        }
        this.an |= 0x4000000;
        return this;
    }

    public ik_1 a(zm_2 zm_22) {
        if (this.xU == null) {
            this.xO = zm_22.axZ();
            this.onChanged();
        } else {
            this.xU.setMessage((AbstractMessage)zm_22.axZ());
        }
        this.an |= 0x4000000;
        return this;
    }

    public ik_1 b(zk_2 zk_22) {
        if (this.xU == null) {
            this.xO = (this.an & 0x4000000) != 0 && this.xO != null && this.xO != zk_2.axV() ? zk_2.c(this.xO).e(zk_22).aya() : zk_22;
            this.onChanged();
        } else {
            this.xU.mergeFrom((AbstractMessage)zk_22);
        }
        this.an |= 0x4000000;
        return this;
    }

    public ik_1 NG() {
        if (this.xU == null) {
            this.xO = null;
            this.onChanged();
        } else {
            this.xU.clear();
        }
        this.an &= 0xFBFFFFFF;
        return this;
    }

    public zm_2 NH() {
        this.an |= 0x4000000;
        this.onChanged();
        return (zm_2)this.NI().getBuilder();
    }

    @Override
    public zn_1 MP() {
        if (this.xU != null) {
            return (zn_1)this.xU.getMessageOrBuilder();
        }
        return this.xO == null ? zk_2.axV() : this.xO;
    }

    private SingleFieldBuilderV3<zk_2, zm_2, zn_1> NI() {
        if (this.xU == null) {
            this.xU = new SingleFieldBuilderV3((AbstractMessage)this.MO(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.xO = null;
        }
        return this.xU;
    }

    public final ik_1 cU(UnknownFieldSet unknownFieldSet) {
        return (ik_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ik_1 cV(UnknownFieldSet unknownFieldSet) {
        return (ik_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aX(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aX(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aX(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.MW();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.MZ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aX(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.MW();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aX(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.MZ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aX(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aX(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aX(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.MZ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.MY();
    }

    public /* synthetic */ Message build() {
        return this.MX();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aX(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.MW();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.MZ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.MY();
    }

    public /* synthetic */ MessageLite build() {
        return this.MX();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.MW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.MU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.MU();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.MZ();
    }

    public /* synthetic */ Object clone() {
        return this.MZ();
    }
}

