/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from cU
 */
public final class cu_2
extends GeneratedMessageV3.Builder<cu_2>
implements cv_1 {
    private long fG;
    private int eb = 0;

    public static final Descriptors.Descriptor ol() {
        return ae_1.eW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eX.ensureFieldAccessorsInitialized(cs_1.class, cu_2.class);
    }

    cu_2() {
        this.D();
    }

    cu_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cs_1.ok()) {
            // empty if block
        }
    }

    public cu_2 om() {
        super.clear();
        this.fG = 0L;
        this.eb = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eW;
    }

    public cs_1 oj() {
        return cs_1.oi();
    }

    public cs_1 on() {
        cs_1 cs_12 = this.oo();
        if (!cs_12.isInitialized()) {
            throw cu_2.newUninitializedMessageException((Message)cs_12);
        }
        return cs_12;
    }

    public cs_1 oo() {
        cs_1 cs_12 = new cs_1(this);
        cs_12.fG = this.fG;
        cs_12.eb = this.eb;
        this.onBuilt();
        return cs_12;
    }

    public cu_2 op() {
        return (cu_2)super.clone();
    }

    public cu_2 aK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cu_2)super.setField(fieldDescriptor, object);
    }

    public cu_2 S(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cu_2)super.clearField(fieldDescriptor);
    }

    public cu_2 S(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cu_2)super.clearOneof(oneofDescriptor);
    }

    public cu_2 S(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cu_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cu_2 aL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cu_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cu_2 S(Message message) {
        if (message instanceof cs_1) {
            return this.c((cs_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cu_2 c(cs_1 cs_12) {
        if (cs_12 == cs_1.oi()) {
            return this;
        }
        if (cs_12.fD() != 0L) {
            this.I(cs_12.fD());
        }
        if (cs_12.eb != 0) {
            this.ai(cs_12.fl());
        }
        this.aL(cs_1.b(cs_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cu_2 bE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cs_1 cs_12 = null;
        try {
            cs_12 = (cs_1)cs_1.jc.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cs_12 = (cs_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cs_12 != null) {
                this.c(cs_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cu_2 I(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cu_2 oq() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int fl() {
        return this.eb;
    }

    public cu_2 ai(int n) {
        this.eb = n;
        this.onChanged();
        return this;
    }

    @Override
    public cq_2 ky() {
        cq_2 cq_22 = cq_2.af(this.eb);
        return cq_22 == null ? cq_2.iQ : cq_22;
    }

    public cu_2 b(cq_2 cq_22) {
        if (cq_22 == null) {
            throw new NullPointerException();
        }
        this.eb = cq_22.getNumber();
        this.onChanged();
        return this;
    }

    public cu_2 or() {
        this.eb = 0;
        this.onChanged();
        return this;
    }

    public final cu_2 aK(UnknownFieldSet unknownFieldSet) {
        return (cu_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cu_2 aL(UnknownFieldSet unknownFieldSet) {
        return (cu_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.S(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.S(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.S(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.om();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.op();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.S(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.om();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.S(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.op();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.S(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.S(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.S(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.op();
    }

    public /* synthetic */ Message buildPartial() {
        return this.oo();
    }

    public /* synthetic */ Message build() {
        return this.on();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.S(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.om();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.op();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.oo();
    }

    public /* synthetic */ MessageLite build() {
        return this.on();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.om();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oj();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oj();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.op();
    }

    public /* synthetic */ Object clone() {
        return this.op();
    }
}

