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
 * Renamed from aH
 */
public final class ah_1
extends GeneratedMessageV3.Builder<ah_1>
implements ai_1 {
    private long fG;
    private long fI;

    public static final Descriptors.Descriptor fL() {
        return ae_1.eQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eR.ensureFieldAccessorsInitialized(af_2.class, ah_1.class);
    }

    ah_1() {
        this.D();
    }

    ah_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (af_2.fK()) {
            // empty if block
        }
    }

    public ah_1 fM() {
        super.clear();
        this.fG = 0L;
        this.fI = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eQ;
    }

    public af_2 fJ() {
        return af_2.fI();
    }

    public af_2 fN() {
        af_2 af_22 = this.fO();
        if (!af_22.isInitialized()) {
            throw ah_1.newUninitializedMessageException((Message)af_22);
        }
        return af_22;
    }

    public af_2 fO() {
        af_2 af_22 = new af_2(this);
        af_22.fG = this.fG;
        af_22.fI = this.fI;
        this.onBuilt();
        return af_22;
    }

    public ah_1 fP() {
        return (ah_1)super.clone();
    }

    public ah_1 G(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ah_1)super.setField(fieldDescriptor, object);
    }

    public ah_1 q(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ah_1)super.clearField(fieldDescriptor);
    }

    public ah_1 q(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ah_1)super.clearOneof(oneofDescriptor);
    }

    public ah_1 q(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ah_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ah_1 H(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ah_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ah_1 q(Message message) {
        if (message instanceof af_2) {
            return this.c((af_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ah_1 c(af_2 af_22) {
        if (af_22 == af_2.fI()) {
            return this;
        }
        if (af_22.fD() != 0L) {
            this.h(af_22.fD());
        }
        if (af_22.fE() != 0L) {
            this.i(af_22.fE());
        }
        this.H(af_2.b(af_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ah_1 Y(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        af_2 af_22 = null;
        try {
            af_22 = (af_2)af_2.fK.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            af_22 = (af_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (af_22 != null) {
                this.c(af_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public ah_1 h(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public ah_1 fQ() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long fE() {
        return this.fI;
    }

    public ah_1 i(long l) {
        this.fI = l;
        this.onChanged();
        return this;
    }

    public ah_1 fR() {
        this.fI = 0L;
        this.onChanged();
        return this;
    }

    public final ah_1 G(UnknownFieldSet unknownFieldSet) {
        return (ah_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ah_1 H(UnknownFieldSet unknownFieldSet) {
        return (ah_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.H(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.G(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.H(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.q(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.q(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.q(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.G(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.fM();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.fP();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.H(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.Y(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.q(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.fM();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.q(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.fP();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.H(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.G(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.H(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.q(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.q(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.q(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.G(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.Y(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.fP();
    }

    public /* synthetic */ Message buildPartial() {
        return this.fO();
    }

    public /* synthetic */ Message build() {
        return this.fN();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.q(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.fM();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.Y(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.fP();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.fO();
    }

    public /* synthetic */ MessageLite build() {
        return this.fN();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.fM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.fJ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.fJ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.Y(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.fP();
    }

    public /* synthetic */ Object clone() {
        return this.fP();
    }
}

