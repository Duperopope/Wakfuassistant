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

public final class kU
extends GeneratedMessageV3.Builder<kU>
implements kV {
    private int an;
    private long jT;

    public static final Descriptors.Descriptor adH() {
        return kF.Ga;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gb.ensureFieldAccessorsInitialized(kS.class, kU.class);
    }

    kU() {
        this.D();
    }

    kU(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kS.gb()) {
            // empty if block
        }
    }

    public kU adI() {
        super.clear();
        this.jT = 0L;
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Ga;
    }

    public kS adG() {
        return kS.adF();
    }

    public kS adJ() {
        kS kS2 = this.adK();
        if (!kS2.isInitialized()) {
            throw kU.newUninitializedMessageException((Message)kS2);
        }
        return kS2;
    }

    public kS adK() {
        kS kS2 = new kS(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kS2.jT = this.jT;
            n2 |= 1;
        }
        kS2.an = n2;
        this.onBuilt();
        return kS2;
    }

    public kU adL() {
        return (kU)super.clone();
    }

    public kU ei(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kU)super.setField(fieldDescriptor, object);
    }

    public kU bE(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kU)super.clearField(fieldDescriptor);
    }

    public kU bE(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kU)super.clearOneof(oneofDescriptor);
    }

    public kU bE(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kU)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kU ej(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kU)super.addRepeatedField(fieldDescriptor, object);
    }

    public kU bE(Message message) {
        if (message instanceof kS) {
            return this.c((kS)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kU c(kS kS2) {
        if (kS2 == kS.adF()) {
            return this;
        }
        if (kS2.pe()) {
            this.aW(kS2.pf());
        }
        this.ej(kS.b(kS2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.pe();
    }

    public kU gO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kS kS2 = null;
        try {
            kS2 = (kS)kS.GW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kS2 = (kS)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kS2 != null) {
                this.c(kS2);
            }
        }
        return this;
    }

    @Override
    public boolean pe() {
        return (this.an & 1) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    public kU aW(long l) {
        this.an |= 1;
        this.jT = l;
        this.onChanged();
        return this;
    }

    public kU adM() {
        this.an &= 0xFFFFFFFE;
        this.jT = 0L;
        this.onChanged();
        return this;
    }

    public final kU ei(UnknownFieldSet unknownFieldSet) {
        return (kU)super.setUnknownFields(unknownFieldSet);
    }

    public final kU ej(UnknownFieldSet unknownFieldSet) {
        return (kU)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ej(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ei(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ej(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bE(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bE(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bE(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ei(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.adI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.adL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ej(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bE(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.adI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bE(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.adL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ej(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ei(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ej(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bE(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bE(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bE(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ei(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.adL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.adK();
    }

    public /* synthetic */ Message build() {
        return this.adJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bE(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.adI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.adL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.adK();
    }

    public /* synthetic */ MessageLite build() {
        return this.adJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.adI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.adG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.adG();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.adL();
    }

    public /* synthetic */ Object clone() {
        return this.adL();
    }
}

