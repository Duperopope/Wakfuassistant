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

public final class AH
extends GeneratedMessageV3.Builder<AH>
implements AI {
    private int an;
    private int aqZ = 1;
    private int arb;

    public static final Descriptors.Descriptor aEm() {
        return zS.apD;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apE.ensureFieldAccessorsInitialized(af_0.class, AH.class);
    }

    AH() {
        this.D();
    }

    AH(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (af_0.aEl()) {
            // empty if block
        }
    }

    public AH aEn() {
        super.clear();
        this.aqZ = 1;
        this.an &= 0xFFFFFFFE;
        this.arb = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apD;
    }

    public af_0 aEk() {
        return af_0.aEj();
    }

    public af_0 aEo() {
        af_0 af_02 = this.aEp();
        if (!af_02.isInitialized()) {
            throw AH.newUninitializedMessageException((Message)af_02);
        }
        return af_02;
    }

    public af_0 aEp() {
        af_0 af_02 = new af_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        af_02.aqZ = this.aqZ;
        if ((n & 2) != 0) {
            af_02.arb = this.arb;
            n2 |= 2;
        }
        af_02.an = n2;
        this.onBuilt();
        return af_02;
    }

    public AH aEq() {
        return (AH)super.clone();
    }

    public AH gA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AH)super.setField(fieldDescriptor, object);
    }

    public AH cN(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AH)super.clearField(fieldDescriptor);
    }

    public AH cN(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AH)super.clearOneof(oneofDescriptor);
    }

    public AH cN(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AH)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AH gB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AH)super.addRepeatedField(fieldDescriptor, object);
    }

    public AH cN(Message message) {
        if (message instanceof af_0) {
            return this.c((af_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AH c(af_0 af_02) {
        if (af_02 == af_0.aEj()) {
            return this;
        }
        if (af_02.aEc()) {
            this.b(af_02.aEd());
        }
        if (af_02.aEe()) {
            this.ln(af_02.aEf());
        }
        this.gB(af_0.b(af_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.aEc();
    }

    public AH kp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        af_0 af_02 = null;
        try {
            af_02 = (af_0)af_0.ard.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            af_02 = (af_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (af_02 != null) {
                this.c(af_02);
            }
        }
        return this;
    }

    @Override
    public boolean aEc() {
        return (this.an & 1) != 0;
    }

    @Override
    public aq_0 aEd() {
        aq_0 aq_02 = aq_0.lu(this.aqZ);
        return aq_02 == null ? aq_0.arp : aq_02;
    }

    public AH b(aq_0 aq_02) {
        if (aq_02 == null) {
            throw new NullPointerException();
        }
        this.an |= 1;
        this.aqZ = aq_02.getNumber();
        this.onChanged();
        return this;
    }

    public AH aEr() {
        this.an &= 0xFFFFFFFE;
        this.aqZ = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aEe() {
        return (this.an & 2) != 0;
    }

    @Override
    public int aEf() {
        return this.arb;
    }

    public AH ln(int n) {
        this.an |= 2;
        this.arb = n;
        this.onChanged();
        return this;
    }

    public AH aEs() {
        this.an &= 0xFFFFFFFD;
        this.arb = 0;
        this.onChanged();
        return this;
    }

    public final AH gA(UnknownFieldSet unknownFieldSet) {
        return (AH)super.setUnknownFields(unknownFieldSet);
    }

    public final AH gB(UnknownFieldSet unknownFieldSet) {
        return (AH)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cN(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cN(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cN(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aEn();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aEq();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cN(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aEn();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cN(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aEq();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cN(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cN(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cN(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aEq();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aEp();
    }

    public /* synthetic */ Message build() {
        return this.aEo();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cN(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aEn();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aEq();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aEp();
    }

    public /* synthetic */ MessageLite build() {
        return this.aEo();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aEn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aEk();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aEk();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aEq();
    }

    public /* synthetic */ Object clone() {
        return this.aEq();
    }
}

