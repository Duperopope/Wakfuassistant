/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class ov
extends GeneratedMessageV3.Builder<ov>
implements ow {
    private int an;
    private long nW;
    private ol QR;
    private SingleFieldBuilderV3<ol, on, os> JM;

    public static final Descriptors.Descriptor avN() {
        return ok.Qv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.Qw.ensureFieldAccessorsInitialized(ot.class, ov.class);
    }

    ov() {
        this.D();
    }

    ov(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ot.aJ()) {
            this.ajT();
        }
    }

    public ov avO() {
        super.clear();
        this.nW = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.JM == null) {
            this.QR = null;
        } else {
            this.JM.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ok.Qv;
    }

    public ot avM() {
        return ot.avL();
    }

    public ot avP() {
        ot ot2 = this.avQ();
        if (!ot2.isInitialized()) {
            throw ov.newUninitializedMessageException((Message)ot2);
        }
        return ot2;
    }

    public ot avQ() {
        ot ot2 = new ot(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ot2.nW = this.nW;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ot2.QR = this.JM == null ? this.QR : (ol)this.JM.build();
            n2 |= 2;
        }
        ot2.an = n2;
        this.onBuilt();
        return ot2;
    }

    public ov avR() {
        return (ov)super.clone();
    }

    public ov fI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ov)super.setField(fieldDescriptor, object);
    }

    public ov cr(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ov)super.clearField(fieldDescriptor);
    }

    public ov cr(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ov)super.clearOneof(oneofDescriptor);
    }

    public ov cr(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ov)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ov fJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ov)super.addRepeatedField(fieldDescriptor, object);
    }

    public ov cr(Message message) {
        if (message instanceof ot) {
            return this.c((ot)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ov c(ot ot2) {
        if (ot2 == ot.avL()) {
            return this;
        }
        if (ot2.xk()) {
            this.bR(ot2.xl());
        }
        if (ot2.ajw()) {
            this.e(ot2.avG());
        }
        this.fJ(ot.b(ot2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.xk()) {
            return false;
        }
        return !this.ajw() || this.avG().isInitialized();
    }

    public ov jb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ot ot2 = null;
        try {
            ot2 = (ot)ot.QT.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ot2 = (ot)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ot2 != null) {
                this.c(ot2);
            }
        }
        return this;
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    public ov bR(long l) {
        this.an |= 1;
        this.nW = l;
        this.onChanged();
        return this;
    }

    public ov avS() {
        this.an &= 0xFFFFFFFE;
        this.nW = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ajw() {
        return (this.an & 2) != 0;
    }

    @Override
    public ol avG() {
        if (this.JM == null) {
            return this.QR == null ? ol.avd() : this.QR;
        }
        return (ol)this.JM.getMessage();
    }

    public ov d(ol ol2) {
        if (this.JM == null) {
            if (ol2 == null) {
                throw new NullPointerException();
            }
            this.QR = ol2;
            this.onChanged();
        } else {
            this.JM.setMessage((AbstractMessage)ol2);
        }
        this.an |= 2;
        return this;
    }

    public ov a(on on2) {
        if (this.JM == null) {
            this.QR = on2.avh();
            this.onChanged();
        } else {
            this.JM.setMessage((AbstractMessage)on2.avh());
        }
        this.an |= 2;
        return this;
    }

    public ov e(ol ol2) {
        if (this.JM == null) {
            this.QR = (this.an & 2) != 0 && this.QR != null && this.QR != ol.avd() ? ol.a(this.QR).c(ol2).avi() : ol2;
            this.onChanged();
        } else {
            this.JM.mergeFrom((AbstractMessage)ol2);
        }
        this.an |= 2;
        return this;
    }

    public ov avT() {
        if (this.JM == null) {
            this.QR = null;
            this.onChanged();
        } else {
            this.JM.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public on avU() {
        this.an |= 2;
        this.onChanged();
        return (on)this.ajT().getBuilder();
    }

    @Override
    public os avH() {
        if (this.JM != null) {
            return (os)this.JM.getMessageOrBuilder();
        }
        return this.QR == null ? ol.avd() : this.QR;
    }

    private SingleFieldBuilderV3<ol, on, os> ajT() {
        if (this.JM == null) {
            this.JM = new SingleFieldBuilderV3((AbstractMessage)this.avG(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.QR = null;
        }
        return this.JM;
    }

    public final ov fI(UnknownFieldSet unknownFieldSet) {
        return (ov)super.setUnknownFields(unknownFieldSet);
    }

    public final ov fJ(UnknownFieldSet unknownFieldSet) {
        return (ov)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cr(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cr(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cr(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.avO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.avR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cr(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.avO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cr(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.avR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cr(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cr(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cr(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.avR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.avQ();
    }

    public /* synthetic */ Message build() {
        return this.avP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cr(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.avO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.avR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.avQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.avP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.avO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.avM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.avM();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jb(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.avR();
    }

    public /* synthetic */ Object clone() {
        return this.avR();
    }
}

