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
 * Renamed from eq
 */
public final class eq_2
extends GeneratedMessageV3.Builder<eq_2>
implements er_2 {
    private int an;
    private int mQ;

    public static final Descriptors.Descriptor vg() {
        return ej_2.mB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mC.ensureFieldAccessorsInitialized(eo_2.class, eq_2.class);
    }

    eq_2() {
        this.D();
    }

    eq_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eo_2.fa()) {
            // empty if block
        }
    }

    public eq_2 vh() {
        super.clear();
        this.mQ = 0;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ej_2.mB;
    }

    public eo_2 vf() {
        return eo_2.ve();
    }

    public eo_2 vi() {
        eo_2 eo_22 = this.vj();
        if (!eo_22.isInitialized()) {
            throw eq_2.newUninitializedMessageException((Message)eo_22);
        }
        return eo_22;
    }

    public eo_2 vj() {
        eo_2 eo_22 = new eo_2(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            eo_22.mQ = this.mQ;
            n2 |= 1;
        }
        eo_22.an = n2;
        this.onBuilt();
        return eo_22;
    }

    public eq_2 vk() {
        return (eq_2)super.clone();
    }

    public eq_2 bq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eq_2)super.setField(fieldDescriptor, object);
    }

    public eq_2 ai(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eq_2)super.clearField(fieldDescriptor);
    }

    public eq_2 ai(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eq_2)super.clearOneof(oneofDescriptor);
    }

    public eq_2 ai(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eq_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eq_2 br(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eq_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public eq_2 ai(Message message) {
        if (message instanceof eo_2) {
            return this.c((eo_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eq_2 c(eo_2 eo_22) {
        if (eo_22 == eo_2.ve()) {
            return this;
        }
        if (eo_22.uZ()) {
            this.bq(eo_22.va());
        }
        this.br(eo_2.b(eo_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.uZ();
    }

    public eq_2 cA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eo_2 eo_22 = null;
        try {
            eo_22 = (eo_2)eo_2.mS.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eo_22 = (eo_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eo_22 != null) {
                this.c(eo_22);
            }
        }
        return this;
    }

    @Override
    public boolean uZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int va() {
        return this.mQ;
    }

    public eq_2 bq(int n) {
        this.an |= 1;
        this.mQ = n;
        this.onChanged();
        return this;
    }

    public eq_2 vl() {
        this.an &= 0xFFFFFFFE;
        this.mQ = 0;
        this.onChanged();
        return this;
    }

    public final eq_2 bq(UnknownFieldSet unknownFieldSet) {
        return (eq_2)super.setUnknownFields(unknownFieldSet);
    }

    public final eq_2 br(UnknownFieldSet unknownFieldSet) {
        return (eq_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.br(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.br(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ai(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ai(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ai(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.vh();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.vk();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.br(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ai(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.vh();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ai(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.vk();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.br(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.br(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ai(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ai(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ai(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.vk();
    }

    public /* synthetic */ Message buildPartial() {
        return this.vj();
    }

    public /* synthetic */ Message build() {
        return this.vi();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ai(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.vh();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.vk();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.vj();
    }

    public /* synthetic */ MessageLite build() {
        return this.vi();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.vh();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.vf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.vf();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cA(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.vk();
    }

    public /* synthetic */ Object clone() {
        return this.vk();
    }
}

