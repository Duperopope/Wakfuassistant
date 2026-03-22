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
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class mP
extends GeneratedMessageV3.Builder<mP>
implements mQ {
    private int an;
    private long Mp;
    private long Mr;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private int jq;
    private long Kf;
    private long Mw;

    public static final Descriptors.Descriptor aob() {
        return mM.Ml;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mM.Mm.ensureFieldAccessorsInitialized(mn_0.class, mP.class);
    }

    mP() {
        this.D();
    }

    mP(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mn_0.oV()) {
            this.aaS();
        }
    }

    public mP aoc() {
        super.clear();
        this.Mp = 0L;
        this.an &= 0xFFFFFFFE;
        this.Mr = 0L;
        this.an &= 0xFFFFFFFD;
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFB;
        this.jq = 0;
        this.an &= 0xFFFFFFF7;
        this.Kf = 0L;
        this.an &= 0xFFFFFFEF;
        this.Mw = 0L;
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mM.Ml;
    }

    public mn_0 aoa() {
        return mn_0.anZ();
    }

    public mn_0 aod() {
        mn_0 mn_02 = this.aoe();
        if (!mn_02.isInitialized()) {
            throw mP.newUninitializedMessageException((Message)mn_02);
        }
        return mn_02;
    }

    public mn_0 aoe() {
        mn_0 mn_02 = new mn_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mn_02.Mp = this.Mp;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            mn_02.Mr = this.Mr;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            mn_02.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            mn_02.jq = this.jq;
            n2 |= 8;
        }
        if ((n & 0x10) != 0) {
            mn_02.Kf = this.Kf;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            mn_02.Mw = this.Mw;
            n2 |= 0x20;
        }
        mn_02.an = n2;
        this.onBuilt();
        return mn_02;
    }

    public mP aof() {
        return (mP)super.clone();
    }

    public mP fc(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mP)super.setField(fieldDescriptor, object);
    }

    public mP cb(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mP)super.clearField(fieldDescriptor);
    }

    public mP cb(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mP)super.clearOneof(oneofDescriptor);
    }

    public mP cb(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mP)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mP fd(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mP)super.addRepeatedField(fieldDescriptor, object);
    }

    public mP cb(Message message) {
        if (message instanceof mn_0) {
            return this.c((mn_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mP c(mn_0 mn_02) {
        if (mn_02 == mn_0.anZ()) {
            return this;
        }
        if (mn_02.anQ()) {
            this.bs(mn_02.anR());
        }
        if (mn_02.anS()) {
            this.bt(mn_02.anT());
        }
        if (mn_02.aaz()) {
            this.r(mn_02.aaA());
        }
        if (mn_02.oO()) {
            this.iE(mn_02.oP());
        }
        if (mn_02.akc()) {
            this.bu(mn_02.akd());
        }
        if (mn_02.anU()) {
            this.bv(mn_02.anV());
        }
        this.fd(mn_0.b(mn_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.anQ()) {
            return false;
        }
        if (!this.anS()) {
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
        if (!this.anU()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public mP if(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mn_0 mn_02 = null;
        try {
            mn_02 = (mn_0)mn_0.My.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mn_02 = (mn_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mn_02 != null) {
                this.c(mn_02);
            }
        }
        return this;
    }

    @Override
    public boolean anQ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long anR() {
        return this.Mp;
    }

    public mP bs(long l) {
        this.an |= 1;
        this.Mp = l;
        this.onChanged();
        return this;
    }

    public mP aog() {
        this.an &= 0xFFFFFFFE;
        this.Mp = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean anS() {
        return (this.an & 2) != 0;
    }

    @Override
    public long anT() {
        return this.Mr;
    }

    public mP bt(long l) {
        this.an |= 2;
        this.Mr = l;
        this.onChanged();
        return this;
    }

    public mP aoh() {
        this.an &= 0xFFFFFFFD;
        this.Mr = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 4) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public mP q(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 4;
        return this;
    }

    public mP i(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 4;
        return this;
    }

    public mP r(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 4) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 4;
        return this;
    }

    public mP aoi() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public kY aaR() {
        this.an |= 4;
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
        return (this.an & 8) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public mP iE(int n) {
        this.an |= 8;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public mP aoj() {
        this.an &= 0xFFFFFFF7;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    public mP bu(long l) {
        this.an |= 0x10;
        this.Kf = l;
        this.onChanged();
        return this;
    }

    public mP aok() {
        this.an &= 0xFFFFFFEF;
        this.Kf = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean anU() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long anV() {
        return this.Mw;
    }

    public mP bv(long l) {
        this.an |= 0x20;
        this.Mw = l;
        this.onChanged();
        return this;
    }

    public mP aol() {
        this.an &= 0xFFFFFFDF;
        this.Mw = 0L;
        this.onChanged();
        return this;
    }

    public final mP fc(UnknownFieldSet unknownFieldSet) {
        return (mP)super.setUnknownFields(unknownFieldSet);
    }

    public final mP fd(UnknownFieldSet unknownFieldSet) {
        return (mP)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fd(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fc(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fd(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cb(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cb(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cb(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fc(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aoc();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aof();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fd(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.if(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cb(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aoc();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cb(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aof();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fd(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fc(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fd(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cb(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cb(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cb(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fc(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.if(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aof();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aoe();
    }

    public /* synthetic */ Message build() {
        return this.aod();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cb(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aoc();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.if(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aof();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aoe();
    }

    public /* synthetic */ MessageLite build() {
        return this.aod();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aoc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aoa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aoa();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.if(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aof();
    }

    public /* synthetic */ Object clone() {
        return this.aof();
    }
}

