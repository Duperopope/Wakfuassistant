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
 * Renamed from jj
 */
public final class jj_1
extends GeneratedMessageV3.Builder<jj_1>
implements jk_1 {
    private int an;
    private long Bn;
    private long Bp;
    private int Br;
    private int Bt;
    private jl_1 Bv;
    private SingleFieldBuilderV3<jl_1, jn_1, jo_1> BP;
    private jl_1 Bx;
    private SingleFieldBuilderV3<jl_1, jn_1, jo_1> BQ;
    private long Bz;
    private int BB;
    private int va;
    private int BE;
    private int BG;
    private int BI;
    private int BK;
    private long BM;

    public static final Descriptors.Descriptor Ud() {
        return iu_2.Ag;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Ah.ensureFieldAccessorsInitialized(jh_1.class, jj_1.class);
    }

    jj_1() {
        this.D();
    }

    jj_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (jh_1.aJ()) {
            this.Uo();
            this.Ur();
        }
    }

    public jj_1 Ue() {
        super.clear();
        this.Bn = 0L;
        this.an &= 0xFFFFFFFE;
        this.Bp = 0L;
        this.an &= 0xFFFFFFFD;
        this.Br = 0;
        this.an &= 0xFFFFFFFB;
        this.Bt = 0;
        this.an &= 0xFFFFFFF7;
        if (this.BP == null) {
            this.Bv = null;
        } else {
            this.BP.clear();
        }
        this.an &= 0xFFFFFFEF;
        if (this.BQ == null) {
            this.Bx = null;
        } else {
            this.BQ.clear();
        }
        this.an &= 0xFFFFFFDF;
        this.Bz = 0L;
        this.an &= 0xFFFFFFBF;
        this.BB = 0;
        this.an &= 0xFFFFFF7F;
        this.va = 0;
        this.an &= 0xFFFFFEFF;
        this.BE = 0;
        this.an &= 0xFFFFFDFF;
        this.BG = 0;
        this.an &= 0xFFFFFBFF;
        this.BI = 0;
        this.an &= 0xFFFFF7FF;
        this.BK = 0;
        this.an &= 0xFFFFEFFF;
        this.BM = 0L;
        this.an &= 0xFFFFDFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return iu_2.Ag;
    }

    public jh_1 Uc() {
        return jh_1.Ub();
    }

    public jh_1 Uf() {
        jh_1 jh_12 = this.Ug();
        if (!jh_12.isInitialized()) {
            throw jj_1.newUninitializedMessageException((Message)jh_12);
        }
        return jh_12;
    }

    public jh_1 Ug() {
        jh_1 jh_12 = new jh_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            jh_12.Bn = this.Bn;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            jh_12.Bp = this.Bp;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            jh_12.Br = this.Br;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            jh_12.Bt = this.Bt;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            jh_12.Bv = this.BP == null ? this.Bv : (jl_1)this.BP.build();
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            jh_12.Bx = this.BQ == null ? this.Bx : (jl_1)this.BQ.build();
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            jh_12.Bz = this.Bz;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            jh_12.BB = this.BB;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            jh_12.va = this.va;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            jh_12.BE = this.BE;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            jh_12.BG = this.BG;
            n2 |= 0x400;
        }
        if ((n & 0x800) != 0) {
            jh_12.BI = this.BI;
            n2 |= 0x800;
        }
        if ((n & 0x1000) != 0) {
            jh_12.BK = this.BK;
            n2 |= 0x1000;
        }
        if ((n & 0x2000) != 0) {
            jh_12.BM = this.BM;
            n2 |= 0x2000;
        }
        jh_12.an = n2;
        this.onBuilt();
        return jh_12;
    }

    public jj_1 Uh() {
        return (jj_1)super.clone();
    }

    public jj_1 ds(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jj_1)super.setField(fieldDescriptor, object);
    }

    public jj_1 bj(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jj_1)super.clearField(fieldDescriptor);
    }

    public jj_1 bj(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jj_1)super.clearOneof(oneofDescriptor);
    }

    public jj_1 bj(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jj_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jj_1 dt(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jj_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public jj_1 bj(Message message) {
        if (message instanceof jh_1) {
            return this.c((jh_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jj_1 c(jh_1 jh_12) {
        if (jh_12 == jh_1.Ub()) {
            return this;
        }
        if (jh_12.Tw()) {
            this.av(jh_12.Tx());
        }
        if (jh_12.Ty()) {
            this.aw(jh_12.Tz());
        }
        if (jh_12.TA()) {
            this.fc(jh_12.TB());
        }
        if (jh_12.TC()) {
            this.fd(jh_12.TD());
        }
        if (jh_12.TE()) {
            this.b(jh_12.TF());
        }
        if (jh_12.TH()) {
            this.d(jh_12.TI());
        }
        if (jh_12.TK()) {
            this.ax(jh_12.TL());
        }
        if (jh_12.TM()) {
            this.fe(jh_12.TN());
        }
        if (jh_12.IT()) {
            this.ff(jh_12.IU());
        }
        if (jh_12.TO()) {
            this.fg(jh_12.TP());
        }
        if (jh_12.TQ()) {
            this.fh(jh_12.TR());
        }
        if (jh_12.TS()) {
            this.fi(jh_12.TT());
        }
        if (jh_12.TU()) {
            this.fj(jh_12.TV());
        }
        if (jh_12.TW()) {
            this.ay(jh_12.TX());
        }
        this.dt(jh_1.b(jh_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Tw()) {
            return false;
        }
        if (!this.Ty()) {
            return false;
        }
        if (!this.TA()) {
            return false;
        }
        if (!this.TC()) {
            return false;
        }
        if (!this.TE()) {
            return false;
        }
        if (!this.TH()) {
            return false;
        }
        if (!this.TK()) {
            return false;
        }
        if (!this.TM()) {
            return false;
        }
        if (!this.TW()) {
            return false;
        }
        if (!this.TF().isInitialized()) {
            return false;
        }
        return this.TI().isInitialized();
    }

    public jj_1 fD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        jh_1 jh_12 = null;
        try {
            jh_12 = (jh_1)jh_1.BO.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            jh_12 = (jh_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (jh_12 != null) {
                this.c(jh_12);
            }
        }
        return this;
    }

    @Override
    public boolean Tw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Tx() {
        return this.Bn;
    }

    public jj_1 av(long l) {
        this.an |= 1;
        this.Bn = l;
        this.onChanged();
        return this;
    }

    public jj_1 Ui() {
        this.an &= 0xFFFFFFFE;
        this.Bn = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Ty() {
        return (this.an & 2) != 0;
    }

    @Override
    public long Tz() {
        return this.Bp;
    }

    public jj_1 aw(long l) {
        this.an |= 2;
        this.Bp = l;
        this.onChanged();
        return this;
    }

    public jj_1 Uj() {
        this.an &= 0xFFFFFFFD;
        this.Bp = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TA() {
        return (this.an & 4) != 0;
    }

    @Override
    public int TB() {
        return this.Br;
    }

    public jj_1 fc(int n) {
        this.an |= 4;
        this.Br = n;
        this.onChanged();
        return this;
    }

    public jj_1 Uk() {
        this.an &= 0xFFFFFFFB;
        this.Br = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TC() {
        return (this.an & 8) != 0;
    }

    @Override
    public int TD() {
        return this.Bt;
    }

    public jj_1 fd(int n) {
        this.an |= 8;
        this.Bt = n;
        this.onChanged();
        return this;
    }

    public jj_1 Ul() {
        this.an &= 0xFFFFFFF7;
        this.Bt = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TE() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public jl_1 TF() {
        if (this.BP == null) {
            return this.Bv == null ? jl_1.UL() : this.Bv;
        }
        return (jl_1)this.BP.getMessage();
    }

    public jj_1 a(jl_1 jl_12) {
        if (this.BP == null) {
            if (jl_12 == null) {
                throw new NullPointerException();
            }
            this.Bv = jl_12;
            this.onChanged();
        } else {
            this.BP.setMessage((AbstractMessage)jl_12);
        }
        this.an |= 0x10;
        return this;
    }

    public jj_1 a(jn_1 jn_12) {
        if (this.BP == null) {
            this.Bv = jn_12.UP();
            this.onChanged();
        } else {
            this.BP.setMessage((AbstractMessage)jn_12.UP());
        }
        this.an |= 0x10;
        return this;
    }

    public jj_1 b(jl_1 jl_12) {
        if (this.BP == null) {
            this.Bv = (this.an & 0x10) != 0 && this.Bv != null && this.Bv != jl_1.UL() ? jl_1.e(this.Bv).g(jl_12).UQ() : jl_12;
            this.onChanged();
        } else {
            this.BP.mergeFrom((AbstractMessage)jl_12);
        }
        this.an |= 0x10;
        return this;
    }

    public jj_1 Um() {
        if (this.BP == null) {
            this.Bv = null;
            this.onChanged();
        } else {
            this.BP.clear();
        }
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public jn_1 Un() {
        this.an |= 0x10;
        this.onChanged();
        return (jn_1)this.Uo().getBuilder();
    }

    @Override
    public jo_1 TG() {
        if (this.BP != null) {
            return (jo_1)this.BP.getMessageOrBuilder();
        }
        return this.Bv == null ? jl_1.UL() : this.Bv;
    }

    private SingleFieldBuilderV3<jl_1, jn_1, jo_1> Uo() {
        if (this.BP == null) {
            this.BP = new SingleFieldBuilderV3((AbstractMessage)this.TF(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Bv = null;
        }
        return this.BP;
    }

    @Override
    public boolean TH() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public jl_1 TI() {
        if (this.BQ == null) {
            return this.Bx == null ? jl_1.UL() : this.Bx;
        }
        return (jl_1)this.BQ.getMessage();
    }

    public jj_1 c(jl_1 jl_12) {
        if (this.BQ == null) {
            if (jl_12 == null) {
                throw new NullPointerException();
            }
            this.Bx = jl_12;
            this.onChanged();
        } else {
            this.BQ.setMessage((AbstractMessage)jl_12);
        }
        this.an |= 0x20;
        return this;
    }

    public jj_1 b(jn_1 jn_12) {
        if (this.BQ == null) {
            this.Bx = jn_12.UP();
            this.onChanged();
        } else {
            this.BQ.setMessage((AbstractMessage)jn_12.UP());
        }
        this.an |= 0x20;
        return this;
    }

    public jj_1 d(jl_1 jl_12) {
        if (this.BQ == null) {
            this.Bx = (this.an & 0x20) != 0 && this.Bx != null && this.Bx != jl_1.UL() ? jl_1.e(this.Bx).g(jl_12).UQ() : jl_12;
            this.onChanged();
        } else {
            this.BQ.mergeFrom((AbstractMessage)jl_12);
        }
        this.an |= 0x20;
        return this;
    }

    public jj_1 Up() {
        if (this.BQ == null) {
            this.Bx = null;
            this.onChanged();
        } else {
            this.BQ.clear();
        }
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public jn_1 Uq() {
        this.an |= 0x20;
        this.onChanged();
        return (jn_1)this.Ur().getBuilder();
    }

    @Override
    public jo_1 TJ() {
        if (this.BQ != null) {
            return (jo_1)this.BQ.getMessageOrBuilder();
        }
        return this.Bx == null ? jl_1.UL() : this.Bx;
    }

    private SingleFieldBuilderV3<jl_1, jn_1, jo_1> Ur() {
        if (this.BQ == null) {
            this.BQ = new SingleFieldBuilderV3((AbstractMessage)this.TI(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Bx = null;
        }
        return this.BQ;
    }

    @Override
    public boolean TK() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long TL() {
        return this.Bz;
    }

    public jj_1 ax(long l) {
        this.an |= 0x40;
        this.Bz = l;
        this.onChanged();
        return this;
    }

    public jj_1 Us() {
        this.an &= 0xFFFFFFBF;
        this.Bz = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TM() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int TN() {
        return this.BB;
    }

    public jj_1 fe(int n) {
        this.an |= 0x80;
        this.BB = n;
        this.onChanged();
        return this;
    }

    public jj_1 Ut() {
        this.an &= 0xFFFFFF7F;
        this.BB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean IT() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int IU() {
        return this.va;
    }

    public jj_1 ff(int n) {
        this.an |= 0x100;
        this.va = n;
        this.onChanged();
        return this;
    }

    public jj_1 Uu() {
        this.an &= 0xFFFFFEFF;
        this.va = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TO() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int TP() {
        return this.BE;
    }

    public jj_1 fg(int n) {
        this.an |= 0x200;
        this.BE = n;
        this.onChanged();
        return this;
    }

    public jj_1 Uv() {
        this.an &= 0xFFFFFDFF;
        this.BE = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TQ() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int TR() {
        return this.BG;
    }

    public jj_1 fh(int n) {
        this.an |= 0x400;
        this.BG = n;
        this.onChanged();
        return this;
    }

    public jj_1 Uw() {
        this.an &= 0xFFFFFBFF;
        this.BG = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TS() {
        return (this.an & 0x800) != 0;
    }

    @Override
    public int TT() {
        return this.BI;
    }

    public jj_1 fi(int n) {
        this.an |= 0x800;
        this.BI = n;
        this.onChanged();
        return this;
    }

    public jj_1 Ux() {
        this.an &= 0xFFFFF7FF;
        this.BI = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TU() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public int TV() {
        return this.BK;
    }

    public jj_1 fj(int n) {
        this.an |= 0x1000;
        this.BK = n;
        this.onChanged();
        return this;
    }

    public jj_1 Uy() {
        this.an &= 0xFFFFEFFF;
        this.BK = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean TW() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public long TX() {
        return this.BM;
    }

    public jj_1 ay(long l) {
        this.an |= 0x2000;
        this.BM = l;
        this.onChanged();
        return this;
    }

    public jj_1 Uz() {
        this.an &= 0xFFFFDFFF;
        this.BM = 0L;
        this.onChanged();
        return this;
    }

    public final jj_1 ds(UnknownFieldSet unknownFieldSet) {
        return (jj_1)super.setUnknownFields(unknownFieldSet);
    }

    public final jj_1 dt(UnknownFieldSet unknownFieldSet) {
        return (jj_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dt(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ds(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dt(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bj(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bj(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bj(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ds(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Ue();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Uh();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dt(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bj(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Ue();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bj(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Uh();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.dt(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ds(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.dt(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bj(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bj(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bj(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ds(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Uh();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Ug();
    }

    public /* synthetic */ Message build() {
        return this.Uf();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bj(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Ue();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Uh();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Ug();
    }

    public /* synthetic */ MessageLite build() {
        return this.Uf();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Ue();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Uc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Uc();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fD(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Uh();
    }

    public /* synthetic */ Object clone() {
        return this.Uh();
    }
}

