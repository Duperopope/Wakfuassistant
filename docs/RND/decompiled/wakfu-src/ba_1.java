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
 * Renamed from bA
 */
public final class ba_1
extends GeneratedMessageV3.Builder<ba_1>
implements bb_2 {
    private long fG;

    public static final Descriptors.Descriptor ji() {
        return ae_1.eI;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eJ.ensureFieldAccessorsInitialized(by_2.class, ba_1.class);
    }

    ba_1() {
        this.D();
    }

    ba_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (by_2.jh()) {
            // empty if block
        }
    }

    public ba_1 jj() {
        super.clear();
        this.fG = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eI;
    }

    public by_2 jg() {
        return by_2.jf();
    }

    public by_2 jk() {
        by_2 by_22 = this.jl();
        if (!by_22.isInitialized()) {
            throw ba_1.newUninitializedMessageException((Message)by_22);
        }
        return by_22;
    }

    public by_2 jl() {
        by_2 by_22 = new by_2(this);
        by_22.fG = this.fG;
        this.onBuilt();
        return by_22;
    }

    public ba_1 jm() {
        return (ba_1)super.clone();
    }

    public ba_1 ac(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_1)super.setField(fieldDescriptor, object);
    }

    public ba_1 B(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ba_1)super.clearField(fieldDescriptor);
    }

    public ba_1 B(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ba_1)super.clearOneof(oneofDescriptor);
    }

    public ba_1 B(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ba_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ba_1 ad(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ba_1 B(Message message) {
        if (message instanceof by_2) {
            return this.c((by_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ba_1 c(by_2 by_22) {
        if (by_22 == by_2.jf()) {
            return this;
        }
        if (by_22.fD() != 0L) {
            this.q(by_22.fD());
        }
        this.ad(by_2.b(by_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ba_1 aF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        by_2 by_22 = null;
        try {
            by_22 = (by_2)by_2.gU.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            by_22 = (by_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (by_22 != null) {
                this.c(by_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public ba_1 q(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public ba_1 jn() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    public final ba_1 ac(UnknownFieldSet unknownFieldSet) {
        return (ba_1)super.setUnknownFields(unknownFieldSet);
    }

    public final ba_1 ad(UnknownFieldSet unknownFieldSet) {
        return (ba_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ad(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ac(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ad(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.B(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.B(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.B(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ac(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.jj();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.jm();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ad(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.B(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.jj();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.B(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.jm();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ad(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ac(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ad(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.B(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.B(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.B(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ac(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.jm();
    }

    public /* synthetic */ Message buildPartial() {
        return this.jl();
    }

    public /* synthetic */ Message build() {
        return this.jk();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.B(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.jj();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.jm();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.jl();
    }

    public /* synthetic */ MessageLite build() {
        return this.jk();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.jj();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jg();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jg();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aF(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.jm();
    }

    public /* synthetic */ Object clone() {
        return this.jm();
    }
}

