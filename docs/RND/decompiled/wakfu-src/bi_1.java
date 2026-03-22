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
 * Renamed from bI
 */
public final class bi_1
extends GeneratedMessageV3.Builder<bi_1>
implements bj_1 {
    private long fG;

    public static final Descriptors.Descriptor jH() {
        return ae_1.eA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eB.ensureFieldAccessorsInitialized(bg_1.class, bi_1.class);
    }

    bi_1() {
        this.D();
    }

    bi_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bg_1.bg()) {
            // empty if block
        }
    }

    public bi_1 jI() {
        super.clear();
        this.fG = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eA;
    }

    public bg_1 jG() {
        return bg_1.jF();
    }

    public bg_1 jJ() {
        bg_1 bg_12 = this.jK();
        if (!bg_12.isInitialized()) {
            throw bi_1.newUninitializedMessageException((Message)bg_12);
        }
        return bg_12;
    }

    public bg_1 jK() {
        bg_1 bg_12 = new bg_1(this);
        bg_12.fG = this.fG;
        this.onBuilt();
        return bg_12;
    }

    public bi_1 jL() {
        return (bi_1)super.clone();
    }

    public bi_1 ag(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_1)super.setField(fieldDescriptor, object);
    }

    public bi_1 D(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bi_1)super.clearField(fieldDescriptor);
    }

    public bi_1 D(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bi_1)super.clearOneof(oneofDescriptor);
    }

    public bi_1 D(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bi_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bi_1 ah(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bi_1 D(Message message) {
        if (message instanceof bg_1) {
            return this.c((bg_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bi_1 c(bg_1 bg_12) {
        if (bg_12 == bg_1.jF()) {
            return this;
        }
        if (bg_12.fD() != 0L) {
            this.s(bg_12.fD());
        }
        this.ah(bg_1.b(bg_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bi_1 aL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bg_1 bg_12 = null;
        try {
            bg_12 = (bg_1)bg_1.hc.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bg_12 = (bg_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bg_12 != null) {
                this.c(bg_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public bi_1 s(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public bi_1 jM() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    public final bi_1 ag(UnknownFieldSet unknownFieldSet) {
        return (bi_1)super.setUnknownFields(unknownFieldSet);
    }

    public final bi_1 ah(UnknownFieldSet unknownFieldSet) {
        return (bi_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ah(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ag(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ah(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.D(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.D(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.D(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ag(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.jI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.jL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ah(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.D(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.jI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.D(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.jL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ah(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ag(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ah(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.D(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.D(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.D(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ag(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.jL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.jK();
    }

    public /* synthetic */ Message build() {
        return this.jJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.D(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.jI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.jL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.jK();
    }

    public /* synthetic */ MessageLite build() {
        return this.jJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.jI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jG();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.jL();
    }

    public /* synthetic */ Object clone() {
        return this.jL();
    }
}

