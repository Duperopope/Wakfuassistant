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

public final class oq
extends GeneratedMessageV3.Builder<oq>
implements or {
    private int an;
    private boolean nk = true;
    private int QK;
    private int jq;

    public static final Descriptors.Descriptor avx() {
        return ok.Qz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.QA.ensureFieldAccessorsInitialized(oo.class, oq.class);
    }

    oq() {
        this.D();
    }

    oq(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (oo.fa()) {
            // empty if block
        }
    }

    public oq avy() {
        super.clear();
        this.nk = true;
        this.an &= 0xFFFFFFFE;
        this.QK = 0;
        this.an &= 0xFFFFFFFD;
        this.jq = 0;
        this.an &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ok.Qz;
    }

    public oo avw() {
        return oo.avv();
    }

    public oo avz() {
        oo oo2 = this.avA();
        if (!oo2.isInitialized()) {
            throw oq.newUninitializedMessageException((Message)oo2);
        }
        return oo2;
    }

    public oo avA() {
        oo oo2 = new oo(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 1;
        }
        oo2.nk = this.nk;
        if ((n & 2) != 0) {
            oo2.QK = this.QK;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            oo2.jq = this.jq;
            n2 |= 4;
        }
        oo2.an = n2;
        this.onBuilt();
        return oo2;
    }

    public oq avB() {
        return (oq)super.clone();
    }

    public oq fG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oq)super.setField(fieldDescriptor, object);
    }

    public oq cq(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oq)super.clearField(fieldDescriptor);
    }

    public oq cq(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oq)super.clearOneof(oneofDescriptor);
    }

    public oq cq(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oq)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oq fH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oq)super.addRepeatedField(fieldDescriptor, object);
    }

    public oq cq(Message message) {
        if (message instanceof oo) {
            return this.d((oo)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oq d(oo oo2) {
        if (oo2 == oo.avv()) {
            return this;
        }
        if (oo2.vZ()) {
            this.aa(oo2.wa());
        }
        if (oo2.avq()) {
            this.jU(oo2.avr());
        }
        if (oo2.oO()) {
            this.jV(oo2.oP());
        }
        this.fH(oo.c(oo2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.avq()) {
            return false;
        }
        return this.oO();
    }

    public oq iY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oo oo2 = null;
        try {
            oo2 = (oo)oo.QN.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oo2 = (oo)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oo2 != null) {
                this.d(oo2);
            }
        }
        return this;
    }

    @Override
    public boolean vZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean wa() {
        return this.nk;
    }

    public oq aa(boolean bl) {
        this.an |= 1;
        this.nk = bl;
        this.onChanged();
        return this;
    }

    public oq avC() {
        this.an &= 0xFFFFFFFE;
        this.nk = true;
        this.onChanged();
        return this;
    }

    @Override
    public boolean avq() {
        return (this.an & 2) != 0;
    }

    @Override
    public int avr() {
        return this.QK;
    }

    public oq jU(int n) {
        this.an |= 2;
        this.QK = n;
        this.onChanged();
        return this;
    }

    public oq avD() {
        this.an &= 0xFFFFFFFD;
        this.QK = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 4) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public oq jV(int n) {
        this.an |= 4;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public oq avE() {
        this.an &= 0xFFFFFFFB;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    public final oq fG(UnknownFieldSet unknownFieldSet) {
        return (oq)super.setUnknownFields(unknownFieldSet);
    }

    public final oq fH(UnknownFieldSet unknownFieldSet) {
        return (oq)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cq(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cq(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cq(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.avy();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.avB();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cq(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.avy();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cq(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.avB();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cq(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cq(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cq(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.avB();
    }

    public /* synthetic */ Message buildPartial() {
        return this.avA();
    }

    public /* synthetic */ Message build() {
        return this.avz();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cq(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.avy();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.avB();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.avA();
    }

    public /* synthetic */ MessageLite build() {
        return this.avz();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.avy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.avw();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.avw();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.avB();
    }

    public /* synthetic */ Object clone() {
        return this.avB();
    }
}

