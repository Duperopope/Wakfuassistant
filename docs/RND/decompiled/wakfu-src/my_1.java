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
 * Renamed from mY
 */
public final class my_1
extends GeneratedMessageV3.Builder<my_1>
implements mZ {
    private int an;
    private long MM;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private int jq;
    private long Kf;
    private long MR;

    public static final Descriptors.Descriptor aoQ() {
        return mv_0.MI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mv_0.MJ.ensureFieldAccessorsInitialized(mw_1.class, my_1.class);
    }

    my_1() {
        this.D();
    }

    my_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mw_1.oV()) {
            this.aaS();
        }
    }

    public my_1 aoR() {
        super.clear();
        this.MM = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.an &= 0xFFFFFFFB;
        this.Kf = 0L;
        this.an &= 0xFFFFFFF7;
        this.MR = 0L;
        this.an &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mv_0.MI;
    }

    public mw_1 aoP() {
        return mw_1.aoO();
    }

    public mw_1 aoS() {
        mw_1 mw_12 = this.aoT();
        if (!mw_12.isInitialized()) {
            throw my_1.newUninitializedMessageException((Message)mw_12);
        }
        return mw_12;
    }

    public mw_1 aoT() {
        mw_1 mw_12 = new mw_1(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mw_12.MM = this.MM;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            mw_12.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            mw_12.jq = this.jq;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            mw_12.Kf = this.Kf;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            mw_12.MR = this.MR;
            n2 |= 0x10;
        }
        mw_12.an = n2;
        this.onBuilt();
        return mw_12;
    }

    public my_1 aoU() {
        return (my_1)super.clone();
    }

    public my_1 fg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (my_1)super.setField(fieldDescriptor, object);
    }

    public my_1 cd(Descriptors.FieldDescriptor fieldDescriptor) {
        return (my_1)super.clearField(fieldDescriptor);
    }

    public my_1 cd(Descriptors.OneofDescriptor oneofDescriptor) {
        return (my_1)super.clearOneof(oneofDescriptor);
    }

    public my_1 cd(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (my_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public my_1 fh(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (my_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public my_1 cd(Message message) {
        if (message instanceof mw_1) {
            return this.c((mw_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public my_1 c(mw_1 mw_12) {
        if (mw_12 == mw_1.aoO()) {
            return this;
        }
        if (mw_12.aoH()) {
            this.bw(mw_12.aoI());
        }
        if (mw_12.aaz()) {
            this.t(mw_12.aaA());
        }
        if (mw_12.oO()) {
            this.iK(mw_12.oP());
        }
        if (mw_12.akc()) {
            this.bx(mw_12.akd());
        }
        if (mw_12.aoJ()) {
            this.by(mw_12.aoK());
        }
        this.fh(mw_1.b(mw_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aoH()) {
            return false;
        }
        if (!this.aaz()) {
            return false;
        }
        if (!this.oO()) {
            return false;
        }
        if (!this.akc()) {
            return false;
        }
        if (!this.aoJ()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public my_1 il(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mw_1 mw_12 = null;
        try {
            mw_12 = (mw_1)mw_1.MT.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mw_12 = (mw_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mw_12 != null) {
                this.c(mw_12);
            }
        }
        return this;
    }

    @Override
    public boolean aoH() {
        return (this.an & 1) != 0;
    }

    @Override
    public long aoI() {
        return this.MM;
    }

    public my_1 bw(long l) {
        this.an |= 1;
        this.MM = l;
        this.onChanged();
        return this;
    }

    public my_1 aoV() {
        this.an &= 0xFFFFFFFE;
        this.MM = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 2) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public my_1 s(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 2;
        return this;
    }

    public my_1 j(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 2;
        return this;
    }

    public my_1 t(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 2) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 2;
        return this;
    }

    public my_1 aoW() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public kY aaR() {
        this.an |= 2;
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

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public my_1 iK(int n) {
        this.an |= 4;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public my_1 aoX() {
        this.an &= 0xFFFFFFFB;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akc() {
        return (this.an & 8) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    public my_1 bx(long l) {
        this.an |= 8;
        this.Kf = l;
        this.onChanged();
        return this;
    }

    public my_1 aoY() {
        this.an &= 0xFFFFFFF7;
        this.Kf = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aoJ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long aoK() {
        return this.MR;
    }

    public my_1 by(long l) {
        this.an |= 0x10;
        this.MR = l;
        this.onChanged();
        return this;
    }

    public my_1 aoZ() {
        this.an &= 0xFFFFFFEF;
        this.MR = 0L;
        this.onChanged();
        return this;
    }

    public final my_1 fg(UnknownFieldSet unknownFieldSet) {
        return (my_1)super.setUnknownFields(unknownFieldSet);
    }

    public final my_1 fh(UnknownFieldSet unknownFieldSet) {
        return (my_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fh(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fh(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cd(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cd(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cd(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aoR();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aoU();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fh(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.il(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cd(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aoR();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cd(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aoU();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fh(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fh(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cd(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cd(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cd(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.il(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aoU();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aoT();
    }

    public /* synthetic */ Message build() {
        return this.aoS();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cd(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aoR();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.il(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aoU();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aoT();
    }

    public /* synthetic */ MessageLite build() {
        return this.aoS();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aoR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aoP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aoP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.il(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aoU();
    }

    public /* synthetic */ Object clone() {
        return this.aoU();
    }
}

