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
 * Renamed from AD
 */
public final class ad_0
extends GeneratedMessageV3.Builder<ad_0>
implements ae_0 {
    private int an;
    private long Dj;
    private AS aqS;
    private SingleFieldBuilderV3<AS, AU, AV> aqW;
    private long wf;

    public static final Descriptors.Descriptor aDR() {
        return zS.apr;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.aps.ensureFieldAccessorsInitialized(ab_0.class, ad_0.class);
    }

    ad_0() {
        this.D();
    }

    ad_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ab_0.cQ()) {
            this.aDZ();
        }
    }

    public ad_0 aDS() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.aqW == null) {
            this.aqS = null;
        } else {
            this.aqW.clear();
        }
        this.an &= 0xFFFFFFFD;
        this.wf = 0L;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apr;
    }

    public ab_0 aDQ() {
        return ab_0.aDP();
    }

    public ab_0 aDT() {
        ab_0 ab_02 = this.aDU();
        if (!ab_02.isInitialized()) {
            throw ad_0.newUninitializedMessageException((Message)ab_02);
        }
        return ab_02;
    }

    public ab_0 aDU() {
        ab_0 ab_02 = new ab_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ab_02.Dj = this.Dj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ab_02.aqS = this.aqW == null ? this.aqS : (AS)this.aqW.build();
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            ab_02.wf = this.wf;
            n2 |= 4;
        }
        ab_02.an = n2;
        this.onBuilt();
        return ab_02;
    }

    public ad_0 aDV() {
        return (ad_0)super.clone();
    }

    public ad_0 gy(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ad_0)super.setField(fieldDescriptor, object);
    }

    public ad_0 cM(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ad_0)super.clearField(fieldDescriptor);
    }

    public ad_0 cM(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ad_0)super.clearOneof(oneofDescriptor);
    }

    public ad_0 cM(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ad_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ad_0 gz(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ad_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ad_0 cM(Message message) {
        if (message instanceof ab_0) {
            return this.c((ab_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ad_0 c(ab_0 ab_02) {
        if (ab_02 == ab_0.aDP()) {
            return this;
        }
        if (ab_02.Xh()) {
            this.cg(ab_02.Xi());
        }
        if (ab_02.aDJ()) {
            this.d(ab_02.aDK());
        }
        if (ab_02.KT()) {
            this.ch(ab_02.KU());
        }
        this.gz(ab_0.b(ab_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Xh()) {
            return false;
        }
        if (!this.aDJ()) {
            return false;
        }
        return this.aDK().isInitialized();
    }

    public ad_0 km(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ab_0 ab_02 = null;
        try {
            ab_02 = (ab_0)ab_0.aqV.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ab_02 = (ab_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ab_02 != null) {
                this.c(ab_02);
            }
        }
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public ad_0 cg(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public ad_0 aDW() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aDJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public AS aDK() {
        if (this.aqW == null) {
            return this.aqS == null ? AS.aFn() : this.aqS;
        }
        return (AS)this.aqW.getMessage();
    }

    public ad_0 c(AS aS) {
        if (this.aqW == null) {
            if (aS == null) {
                throw new NullPointerException();
            }
            this.aqS = aS;
            this.onChanged();
        } else {
            this.aqW.setMessage((AbstractMessage)aS);
        }
        this.an |= 2;
        return this;
    }

    public ad_0 b(AU aU) {
        if (this.aqW == null) {
            this.aqS = aU.aFs();
            this.onChanged();
        } else {
            this.aqW.setMessage((AbstractMessage)aU.aFs());
        }
        this.an |= 2;
        return this;
    }

    public ad_0 d(AS aS) {
        if (this.aqW == null) {
            this.aqS = (this.an & 2) != 0 && this.aqS != null && this.aqS != AS.aFn() ? AS.f(this.aqS).h(aS).aFt() : aS;
            this.onChanged();
        } else {
            this.aqW.mergeFrom((AbstractMessage)aS);
        }
        this.an |= 2;
        return this;
    }

    public ad_0 aDX() {
        if (this.aqW == null) {
            this.aqS = null;
            this.onChanged();
        } else {
            this.aqW.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public AU aDY() {
        this.an |= 2;
        this.onChanged();
        return (AU)this.aDZ().getBuilder();
    }

    @Override
    public AV aDL() {
        if (this.aqW != null) {
            return (AV)this.aqW.getMessageOrBuilder();
        }
        return this.aqS == null ? AS.aFn() : this.aqS;
    }

    private SingleFieldBuilderV3<AS, AU, AV> aDZ() {
        if (this.aqW == null) {
            this.aqW = new SingleFieldBuilderV3((AbstractMessage)this.aDK(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.aqS = null;
        }
        return this.aqW;
    }

    @Override
    public boolean KT() {
        return (this.an & 4) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public ad_0 ch(long l) {
        this.an |= 4;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public ad_0 aEa() {
        this.an &= 0xFFFFFFFB;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    public final ad_0 gy(UnknownFieldSet unknownFieldSet) {
        return (ad_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ad_0 gz(UnknownFieldSet unknownFieldSet) {
        return (ad_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gz(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gy(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gz(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cM(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cM(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cM(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gy(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aDS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aDV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gz(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.km(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cM(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aDS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cM(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aDV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gz(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gy(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gz(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cM(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cM(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cM(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gy(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.km(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aDV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aDU();
    }

    public /* synthetic */ Message build() {
        return this.aDT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cM(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aDS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.km(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aDV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aDU();
    }

    public /* synthetic */ MessageLite build() {
        return this.aDT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aDS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aDQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aDQ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.km(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aDV();
    }

    public /* synthetic */ Object clone() {
        return this.aDV();
    }
}

