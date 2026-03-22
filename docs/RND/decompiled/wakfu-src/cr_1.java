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
 * Renamed from cr
 */
public final class cr_1
extends GeneratedMessageV3.Builder<cr_1>
implements cs_2 {
    private long fG;
    private long ga;

    public static final Descriptors.Descriptor my() {
        return ae_1.fe;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ff.ensureFieldAccessorsInitialized(cp_2.class, cr_1.class);
    }

    cr_1() {
        this.D();
    }

    cr_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cp_2.mx()) {
            // empty if block
        }
    }

    public cr_1 mz() {
        super.clear();
        this.fG = 0L;
        this.ga = 0L;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fe;
    }

    public cp_2 mw() {
        return cp_2.mv();
    }

    public cp_2 mA() {
        cp_2 cp_22 = this.mB();
        if (!cp_22.isInitialized()) {
            throw cr_1.newUninitializedMessageException((Message)cp_22);
        }
        return cp_22;
    }

    public cp_2 mB() {
        cp_2 cp_22 = new cp_2(this);
        cp_22.fG = this.fG;
        cp_22.ga = this.ga;
        this.onBuilt();
        return cp_22;
    }

    public cr_1 mC() {
        return (cr_1)super.clone();
    }

    public cr_1 ay(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cr_1)super.setField(fieldDescriptor, object);
    }

    public cr_1 M(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cr_1)super.clearField(fieldDescriptor);
    }

    public cr_1 M(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cr_1)super.clearOneof(oneofDescriptor);
    }

    public cr_1 M(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cr_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cr_1 az(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cr_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cr_1 M(Message message) {
        if (message instanceof cp_2) {
            return this.c((cp_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cr_1 c(cp_2 cp_22) {
        if (cp_22 == cp_2.mv()) {
            return this;
        }
        if (cp_22.fD() != 0L) {
            this.C(cp_22.fD());
        }
        if (cp_22.gA() != 0L) {
            this.D(cp_22.gA());
        }
        this.az(cp_2.b(cp_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cr_1 bm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cp_2 cp_22 = null;
        try {
            cp_22 = (cp_2)cp_2.ie.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cp_22 = (cp_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cp_22 != null) {
                this.c(cp_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cr_1 C(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cr_1 mD() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long gA() {
        return this.ga;
    }

    public cr_1 D(long l) {
        this.ga = l;
        this.onChanged();
        return this;
    }

    public cr_1 mE() {
        this.ga = 0L;
        this.onChanged();
        return this;
    }

    public final cr_1 ay(UnknownFieldSet unknownFieldSet) {
        return (cr_1)super.setUnknownFields(unknownFieldSet);
    }

    public final cr_1 az(UnknownFieldSet unknownFieldSet) {
        return (cr_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.az(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ay(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.az(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.M(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.M(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.M(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ay(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.mz();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.mC();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.az(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.M(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.mz();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.M(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.mC();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.az(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ay(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.az(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.M(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.M(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.M(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ay(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.mC();
    }

    public /* synthetic */ Message buildPartial() {
        return this.mB();
    }

    public /* synthetic */ Message build() {
        return this.mA();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.M(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.mz();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.mC();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.mB();
    }

    public /* synthetic */ MessageLite build() {
        return this.mA();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.mz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mw();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bm(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.mC();
    }

    public /* synthetic */ Object clone() {
        return this.mC();
    }
}

