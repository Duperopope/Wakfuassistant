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
 * Renamed from aP
 */
public final class ap_1
extends GeneratedMessageV3.Builder<ap_1>
implements aq_2 {
    private long fG;
    private long fI;

    public static final Descriptors.Descriptor gs() {
        return ae_1.eS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eT.ensureFieldAccessorsInitialized(an_1.class, ap_1.class);
    }

    ap_1() {
        this.D();
    }

    ap_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (an_1.gr()) {
            // empty if block
        }
    }

    public ap_1 gt() {
        super.clear();
        this.fG = 0L;
        this.fI = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eS;
    }

    public an_1 gq() {
        return an_1.gp();
    }

    public an_1 gu() {
        an_1 an_12 = this.gv();
        if (!an_12.isInitialized()) {
            throw ap_1.newUninitializedMessageException((Message)an_12);
        }
        return an_12;
    }

    public an_1 gv() {
        an_1 an_12 = new an_1(this);
        an_12.fG = this.fG;
        an_12.fI = this.fI;
        this.onBuilt();
        return an_12;
    }

    public ap_1 gw() {
        return (ap_1)super.clone();
    }

    public ap_1 K(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ap_1)super.setField(fieldDescriptor, object);
    }

    public ap_1 s(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ap_1)super.clearField(fieldDescriptor);
    }

    public ap_1 s(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ap_1)super.clearOneof(oneofDescriptor);
    }

    public ap_1 s(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ap_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ap_1 L(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ap_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ap_1 s(Message message) {
        if (message instanceof an_1) {
            return this.c((an_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ap_1 c(an_1 an_12) {
        if (an_12 == an_1.gp()) {
            return this;
        }
        if (an_12.fD() != 0L) {
            this.k(an_12.fD());
        }
        if (an_12.fE() != 0L) {
            this.l(an_12.fE());
        }
        this.L(an_1.b(an_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ap_1 ae(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        an_1 an_12 = null;
        try {
            an_12 = (an_1)an_1.fW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            an_12 = (an_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (an_12 != null) {
                this.c(an_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public ap_1 k(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public ap_1 gx() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long fE() {
        return this.fI;
    }

    public ap_1 l(long l) {
        this.fI = l;
        this.onChanged();
        return this;
    }

    public ap_1 gy() {
        this.fI = 0L;
        this.onChanged();
        return this;
    }

    public final ap_1 K(UnknownFieldSet unknownFieldSet) {
        return (ap_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ap_1 L(UnknownFieldSet unknownFieldSet) {
        return (ap_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.L(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.K(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.L(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.s(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.s(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.s(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.K(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.gt();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.gw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.L(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ae(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.s(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.gt();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.s(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.gw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.L(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.K(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.L(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.s(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.s(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.s(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.K(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ae(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.gw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.gv();
    }

    public /* synthetic */ Message build() {
        return this.gu();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.s(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.gt();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ae(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.gw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.gv();
    }

    public /* synthetic */ MessageLite build() {
        return this.gu();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.gt();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gq();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ae(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.gw();
    }

    public /* synthetic */ Object clone() {
        return this.gw();
    }
}

