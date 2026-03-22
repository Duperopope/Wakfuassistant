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
 * Renamed from mv
 */
public final class mv_1
extends GeneratedMessageV3.Builder<mv_1>
implements mw_0 {
    private int an;
    private long wq;
    private int HC = 0;
    private long nW;
    private long KV;
    private int KX;
    private long sN;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;

    public static final Descriptors.Descriptor alQ() {
        return ms.KO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ms.KP.ensureFieldAccessorsInitialized(mt_1.class, mv_1.class);
    }

    mv_1() {
        this.D();
    }

    mv_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mt_1.oV()) {
            this.aaS();
        }
    }

    public mv_1 alR() {
        super.clear();
        this.wq = 0L;
        this.an &= 0xFFFFFFFE;
        this.HC = 0;
        this.an &= 0xFFFFFFFD;
        this.nW = 0L;
        this.an &= 0xFFFFFFFB;
        this.KV = 0L;
        this.an &= 0xFFFFFFF7;
        this.KX = 0;
        this.an &= 0xFFFFFFEF;
        this.sN = 0L;
        this.an &= 0xFFFFFFDF;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ms.KO;
    }

    public mt_1 alP() {
        return mt_1.alO();
    }

    public mt_1 alS() {
        mt_1 mt_12 = this.alT();
        if (!mt_12.isInitialized()) {
            throw mv_1.newUninitializedMessageException((Message)mt_12);
        }
        return mt_12;
    }

    public mt_1 alT() {
        mt_1 mt_12 = new mt_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mt_12.wq = this.wq;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        mt_12.HC = this.HC;
        if ((n & 4) != 0) {
            mt_12.nW = this.nW;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            mt_12.KV = this.KV;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            mt_12.KX = this.KX;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            mt_12.sN = this.sN;
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0) {
            mt_12.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 0x40;
        }
        mt_12.an = n2;
        this.onBuilt();
        return mt_12;
    }

    public mv_1 alU() {
        return (mv_1)super.clone();
    }

    public mv_1 eU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mv_1)super.setField(fieldDescriptor, object);
    }

    public mv_1 bX(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mv_1)super.clearField(fieldDescriptor);
    }

    public mv_1 bX(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mv_1)super.clearOneof(oneofDescriptor);
    }

    public mv_1 bX(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mv_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mv_1 eV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mv_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public mv_1 bX(Message message) {
        if (message instanceof mt_1) {
            return this.c((mt_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mv_1 c(mt_1 mt_12) {
        if (mt_12 == mt_1.alO()) {
            return this;
        }
        if (mt_12.Lw()) {
            this.bi(mt_12.Lx());
        }
        if (mt_12.aeU()) {
            this.a(mt_12.alG());
        }
        if (mt_12.xk()) {
            this.bj(mt_12.xl());
        }
        if (mt_12.alH()) {
            this.bk(mt_12.alI());
        }
        if (mt_12.alJ()) {
            this.ig(mt_12.alK());
        }
        if (mt_12.EZ()) {
            this.bl(mt_12.Fa());
        }
        if (mt_12.aaz()) {
            this.p(mt_12.aaA());
        }
        this.eV(mt_1.b(mt_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Lw()) {
            return false;
        }
        if (!this.aeU()) {
            return false;
        }
        if (!this.xk()) {
            return false;
        }
        if (!this.alH()) {
            return false;
        }
        if (!this.alJ()) {
            return false;
        }
        if (!this.EZ()) {
            return false;
        }
        if (!this.aaz()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public mv_1 hT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mt_1 mt_12 = null;
        try {
            mt_12 = (mt_1)mt_1.Lb.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mt_12 = (mt_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mt_12 != null) {
                this.c(mt_12);
            }
        }
        return this;
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    public mv_1 bi(long l) {
        this.an |= 1;
        this.wq = l;
        this.onChanged();
        return this;
    }

    public mv_1 alV() {
        this.an &= 0xFFFFFFFE;
        this.wq = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aeU() {
        return (this.an & 2) != 0;
    }

    @Override
    public mx_0 alG() {
        mx_0 mx_02 = mx_0.ih(this.HC);
        return mx_02 == null ? mx_0.Lc : mx_02;
    }

    public mv_1 a(mx_0 mx_02) {
        if (mx_02 == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.HC = mx_02.getNumber();
        this.onChanged();
        return this;
    }

    public mv_1 alW() {
        this.an &= 0xFFFFFFFD;
        this.HC = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 4) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public mv_1 bj(long l) {
        this.an |= 4;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public mv_1 alX() {
        this.an &= 0xFFFFFFFB;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean alH() {
        return (this.an & 8) != 0;
    }

    @Override
    public long alI() {
        return this.KV;
    }

    public mv_1 bk(long l) {
        this.an |= 8;
        this.KV = l;
        this.onChanged();
        return this;
    }

    public mv_1 alY() {
        this.an &= 0xFFFFFFF7;
        this.KV = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean alJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int alK() {
        return this.KX;
    }

    public mv_1 ig(int n) {
        this.an |= 0x10;
        this.KX = n;
        this.onChanged();
        return this;
    }

    public mv_1 alZ() {
        this.an &= 0xFFFFFFEF;
        this.KX = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean EZ() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Fa() {
        return this.sN;
    }

    public mv_1 bl(long l) {
        this.an |= 0x20;
        this.sN = l;
        this.onChanged();
        return this;
    }

    public mv_1 ama() {
        this.an &= 0xFFFFFFDF;
        this.sN = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public mv_1 o(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 0x40;
        return this;
    }

    public mv_1 h(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 0x40;
        return this;
    }

    public mv_1 p(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 0x40) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 0x40;
        return this;
    }

    public mv_1 amb() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFBF;
        return this;
    }

    public kY aaR() {
        this.an |= 0x40;
        this.onChanged();
        return (kY)this.aaS().getBuilder();
    }

    @Override
    public lh aaB() {
        if (this.Fh != null) {
            return (lh)this.Fh.getMessageOrBuilder();
        }
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    private SingleFieldBuilderV3<kW, kY, lh> aaS() {
        if (this.Fh == null) {
            this.Fh = new SingleFieldBuilderV3((AbstractMessage)this.aaA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fc = null;
        }
        return this.Fh;
    }

    public final mv_1 eU(UnknownFieldSet unknownFieldSet) {
        return (mv_1)super.setUnknownFields(unknownFieldSet);
    }

    public final mv_1 eV(UnknownFieldSet unknownFieldSet) {
        return (mv_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bX(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bX(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bX(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.alR();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.alU();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bX(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.alR();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bX(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.alU();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bX(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bX(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bX(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.alU();
    }

    public /* synthetic */ Message buildPartial() {
        return this.alT();
    }

    public /* synthetic */ Message build() {
        return this.alS();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bX(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.alR();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.alU();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.alT();
    }

    public /* synthetic */ MessageLite build() {
        return this.alS();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.alR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hT(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.alU();
    }

    public /* synthetic */ Object clone() {
        return this.alU();
    }
}

