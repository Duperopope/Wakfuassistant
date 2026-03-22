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

public final class zY
extends GeneratedMessageV3.Builder<zY>
implements zZ {
    private int an;
    private long nW;
    private AS apO;
    private SingleFieldBuilderV3<AS, AU, AV> apR;

    public static final Descriptors.Descriptor aBs() {
        return zS.aph;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.api.ensureFieldAccessorsInitialized(zW.class, zY.class);
    }

    zY() {
        this.D();
    }

    zY(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zW.aJ()) {
            this.aBA();
        }
    }

    public zY aBt() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.apR == null) {
            this.apO = null;
        } else {
            this.apR.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.aph;
    }

    public zW aBr() {
        return zW.aBq();
    }

    public zW aBu() {
        zW zW2 = this.aBv();
        if (!zW2.isInitialized()) {
            throw zY.newUninitializedMessageException((Message)zW2);
        }
        return zW2;
    }

    public zW aBv() {
        zW zW2 = new zW(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            zW2.nW = this.nW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            zW2.apO = this.apR == null ? this.apO : (AS)this.apR.build();
            n2 |= 2;
        }
        zW2.an = n2;
        this.onBuilt();
        return zW2;
    }

    public zY aBw() {
        return (zY)super.clone();
    }

    public zY gk(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zY)super.setField(fieldDescriptor, object);
    }

    public zY cF(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zY)super.clearField(fieldDescriptor);
    }

    public zY cF(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zY)super.clearOneof(oneofDescriptor);
    }

    public zY cF(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zY)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zY gl(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zY)super.addRepeatedField(fieldDescriptor, object);
    }

    public zY cF(Message message) {
        if (message instanceof zW) {
            return this.d((zW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zY d(zW zW2) {
        if (zW2 == zW.aBq()) {
            return this;
        }
        if (zW2.xk()) {
            this.bV(zW2.xl());
        }
        if (zW2.aBk()) {
            this.b(zW2.aBl());
        }
        this.gl(zW.c(zW2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        if (!this.aBk()) {
            return false;
        }
        return this.aBl().isInitialized();
    }

    public zY jR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zW zW2 = null;
        try {
            zW2 = (zW)zW.apQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zW2 = (zW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zW2 != null) {
                this.d(zW2);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public zY bV(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public zY aBx() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aBk() {
        return (this.an & 2) != 0;
    }

    @Override
    public AS aBl() {
        if (this.apR == null) {
            return this.apO == null ? AS.aFn() : this.apO;
        }
        return (AS)this.apR.getMessage();
    }

    public zY a(AS aS) {
        if (this.apR == null) {
            if (aS == null) {
                throw new NullPointerException();
            }
            this.apO = aS;
            this.onChanged();
        } else {
            this.apR.setMessage((AbstractMessage)aS);
        }
        this.an |= 2;
        return this;
    }

    public zY a(AU aU) {
        if (this.apR == null) {
            this.apO = aU.aFs();
            this.onChanged();
        } else {
            this.apR.setMessage((AbstractMessage)aU.aFs());
        }
        this.an |= 2;
        return this;
    }

    public zY b(AS aS) {
        if (this.apR == null) {
            this.apO = (this.an & 2) != 0 && this.apO != null && this.apO != AS.aFn() ? AS.f(this.apO).h(aS).aFt() : aS;
            this.onChanged();
        } else {
            this.apR.mergeFrom((AbstractMessage)aS);
        }
        this.an |= 2;
        return this;
    }

    public zY aBy() {
        if (this.apR == null) {
            this.apO = null;
            this.onChanged();
        } else {
            this.apR.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public AU aBz() {
        this.an |= 2;
        this.onChanged();
        return (AU)this.aBA().getBuilder();
    }

    @Override
    public AV aBm() {
        if (this.apR != null) {
            return (AV)this.apR.getMessageOrBuilder();
        }
        return this.apO == null ? AS.aFn() : this.apO;
    }

    private SingleFieldBuilderV3<AS, AU, AV> aBA() {
        if (this.apR == null) {
            this.apR = new SingleFieldBuilderV3((AbstractMessage)this.aBl(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.apO = null;
        }
        return this.apR;
    }

    public final zY gk(UnknownFieldSet unknownFieldSet) {
        return (zY)super.setUnknownFields(unknownFieldSet);
    }

    public final zY gl(UnknownFieldSet unknownFieldSet) {
        return (zY)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gl(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gk(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gl(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cF(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cF(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cF(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gk(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aBt();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aBw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gl(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cF(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aBt();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cF(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aBw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gl(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gk(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gl(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cF(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cF(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cF(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gk(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aBw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aBv();
    }

    public /* synthetic */ Message build() {
        return this.aBu();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cF(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aBt();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aBw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aBv();
    }

    public /* synthetic */ MessageLite build() {
        return this.aBu();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aBt();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aBr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aBr();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aBw();
    }

    public /* synthetic */ Object clone() {
        return this.aBw();
    }
}

