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

public final class kL
extends GeneratedMessageV3.Builder<kL>
implements kM {
    private int an;
    private kW Fc;
    private SingleFieldBuilderV3<kW, kY, lh> Fh;
    private int ws;

    public static final Descriptors.Descriptor ada() {
        return kF.Gi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gj.ensureFieldAccessorsInitialized(kJ.class, kL.class);
    }

    kL() {
        this.D();
    }

    kL(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kJ.gr()) {
            this.aaS();
        }
    }

    public kL adb() {
        super.clear();
        if (this.Fh == null) {
            this.Fc = null;
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFE;
        this.ws = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gi;
    }

    public kJ acZ() {
        return kJ.acY();
    }

    public kJ adc() {
        kJ kJ2 = this.add();
        if (!kJ2.isInitialized()) {
            throw kL.newUninitializedMessageException((Message)kJ2);
        }
        return kJ2;
    }

    public kJ add() {
        kJ kJ2 = new kJ(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            kJ2.Fc = this.Fh == null ? this.Fc : (kW)this.Fh.build();
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            kJ2.ws = this.ws;
            n2 |= 2;
        }
        kJ2.an = n2;
        this.onBuilt();
        return kJ2;
    }

    public kL ade() {
        return (kL)super.clone();
    }

    public kL ee(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kL)super.setField(fieldDescriptor, object);
    }

    public kL bC(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kL)super.clearField(fieldDescriptor);
    }

    public kL bC(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kL)super.clearOneof(oneofDescriptor);
    }

    public kL bC(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kL)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kL ef(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kL)super.addRepeatedField(fieldDescriptor, object);
    }

    public kL bC(Message message) {
        if (message instanceof kJ) {
            return this.e((kJ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kL e(kJ kJ2) {
        if (kJ2 == kJ.acY()) {
            return this;
        }
        if (kJ2.aaz()) {
            this.e(kJ2.aaA());
        }
        if (kJ2.Ly()) {
            this.gR(kJ2.Lz());
        }
        this.ef(kJ.d(kJ2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.aaz()) {
            return false;
        }
        if (!this.Ly()) {
            return false;
        }
        return this.aaA().isInitialized();
    }

    public kL gI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kJ kJ2 = null;
        try {
            kJ2 = (kJ)kJ.GM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kJ2 = (kJ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kJ2 != null) {
                this.e(kJ2);
            }
        }
        return this;
    }

    @Override
    public boolean aaz() {
        return (this.an & 1) != 0;
    }

    @Override
    public kW aaA() {
        if (this.Fh == null) {
            return this.Fc == null ? kW.aen() : this.Fc;
        }
        return (kW)this.Fh.getMessage();
    }

    public kL d(kW kW2) {
        if (this.Fh == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.Fc = kW2;
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kW2);
        }
        this.an |= 1;
        return this;
    }

    public kL c(kY kY2) {
        if (this.Fh == null) {
            this.Fc = kY2.aer();
            this.onChanged();
        } else {
            this.Fh.setMessage((AbstractMessage)kY2.aer());
        }
        this.an |= 1;
        return this;
    }

    public kL e(kW kW2) {
        if (this.Fh == null) {
            this.Fc = (this.an & 1) != 0 && this.Fc != null && this.Fc != kW.aen() ? kW.f(this.Fc).h(kW2).aes() : kW2;
            this.onChanged();
        } else {
            this.Fh.mergeFrom((AbstractMessage)kW2);
        }
        this.an |= 1;
        return this;
    }

    public kL adf() {
        if (this.Fh == null) {
            this.Fc = null;
            this.onChanged();
        } else {
            this.Fh.clear();
        }
        this.an &= 0xFFFFFFFE;
        return this;
    }

    public kY aaR() {
        this.an |= 1;
        this.onChanged();
        return (kY)this.aaS().getBuilder();
    }

    @Override
    public lh aaB() {
        if (this.Fh != null) {
            return (lh)this.Fh.getMessageOrBuilder();
        }
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    private SingleFieldBuilderV3<kW, kY, lh> aaS() {
        if (this.Fh == null) {
            this.Fh = new SingleFieldBuilderV3((AbstractMessage)this.aaA(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Fc = null;
        }
        return this.Fh;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public kL gR(int n) {
        this.an |= 2;
        this.ws = n;
        this.onChanged();
        return this;
    }

    public kL adg() {
        this.an &= 0xFFFFFFFD;
        this.ws = 0;
        this.onChanged();
        return this;
    }

    public final kL ee(UnknownFieldSet unknownFieldSet) {
        return (kL)super.setUnknownFields(unknownFieldSet);
    }

    public final kL ef(UnknownFieldSet unknownFieldSet) {
        return (kL)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ef(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ee(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ef(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bC(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bC(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bC(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ee(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.adb();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ade();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ef(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bC(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.adb();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bC(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ade();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ef(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ee(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ef(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bC(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bC(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bC(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ee(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ade();
    }

    public /* synthetic */ Message buildPartial() {
        return this.add();
    }

    public /* synthetic */ Message build() {
        return this.adc();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bC(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.adb();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ade();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.add();
    }

    public /* synthetic */ MessageLite build() {
        return this.adc();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.adb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acZ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gI(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ade();
    }

    public /* synthetic */ Object clone() {
        return this.ade();
    }
}

