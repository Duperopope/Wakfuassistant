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
 * Renamed from aT
 */
public final class at_2
extends GeneratedMessageV3.Builder<at_2>
implements au_2 {
    private long fG;
    private long ga;

    public static final Descriptors.Descriptor gH() {
        return ae_1.eG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eH.ensureFieldAccessorsInitialized(ar_1.class, at_2.class);
    }

    at_2() {
        this.D();
    }

    at_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ar_1.gG()) {
            // empty if block
        }
    }

    public at_2 gI() {
        super.clear();
        this.fG = 0L;
        this.ga = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eG;
    }

    public ar_1 gF() {
        return ar_1.gE();
    }

    public ar_1 gJ() {
        ar_1 ar_12 = this.gK();
        if (!ar_12.isInitialized()) {
            throw at_2.newUninitializedMessageException((Message)ar_12);
        }
        return ar_12;
    }

    public ar_1 gK() {
        ar_1 ar_12 = new ar_1(this);
        ar_12.fG = this.fG;
        ar_12.ga = this.ga;
        this.onBuilt();
        return ar_12;
    }

    public at_2 gL() {
        return (at_2)super.clone();
    }

    public at_2 M(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_2)super.setField(fieldDescriptor, object);
    }

    public at_2 t(Descriptors.FieldDescriptor fieldDescriptor) {
        return (at_2)super.clearField(fieldDescriptor);
    }

    public at_2 t(Descriptors.OneofDescriptor oneofDescriptor) {
        return (at_2)super.clearOneof(oneofDescriptor);
    }

    public at_2 t(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (at_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public at_2 N(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public at_2 t(Message message) {
        if (message instanceof ar_1) {
            return this.c((ar_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public at_2 c(ar_1 ar_12) {
        if (ar_12 == ar_1.gE()) {
            return this;
        }
        if (ar_12.fD() != 0L) {
            this.m(ar_12.fD());
        }
        if (ar_12.gA() != 0L) {
            this.n(ar_12.gA());
        }
        this.N(ar_1.b(ar_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public at_2 ah(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ar_1 ar_12 = null;
        try {
            ar_12 = (ar_1)ar_1.gc.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ar_12 = (ar_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ar_12 != null) {
                this.c(ar_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public at_2 m(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public at_2 gM() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long gA() {
        return this.ga;
    }

    public at_2 n(long l) {
        this.ga = l;
        this.onChanged();
        return this;
    }

    public at_2 gN() {
        this.ga = 0L;
        this.onChanged();
        return this;
    }

    public final at_2 M(UnknownFieldSet unknownFieldSet) {
        return (at_2)super.setUnknownFields(unknownFieldSet);
    }

    public final at_2 N(UnknownFieldSet unknownFieldSet) {
        return (at_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.N(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.M(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.N(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.t(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.t(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.t(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.M(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.gI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.gL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.N(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ah(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.t(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.gI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.t(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.gL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.N(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.M(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.N(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.t(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.t(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.t(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.M(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ah(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.gL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.gK();
    }

    public /* synthetic */ Message build() {
        return this.gJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.t(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.gI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ah(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.gL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.gK();
    }

    public /* synthetic */ MessageLite build() {
        return this.gJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.gI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.gF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.gF();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ah(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.gL();
    }

    public /* synthetic */ Object clone() {
        return this.gL();
    }
}

