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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hO
extends GeneratedMessageV3.Builder<hO>
implements hP {
    private int an;
    private List<hU> vU = Collections.emptyList();
    private RepeatedFieldBuilderV3<hU, hW, hY> vX;

    public static final Descriptors.Descriptor Kv() {
        return hL.vO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vP.ensureFieldAccessorsInitialized(hM.class, hO.class);
    }

    hO() {
        this.D();
    }

    hO(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hM.cs()) {
            this.KE();
        }
    }

    public hO Kw() {
        super.clear();
        if (this.vX == null) {
            this.vU = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.vX.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hL.vO;
    }

    public hM Ku() {
        return hM.Kt();
    }

    public hM Kx() {
        hM hM2 = this.Ky();
        if (!hM2.isInitialized()) {
            throw hO.newUninitializedMessageException((Message)hM2);
        }
        return hM2;
    }

    public hM Ky() {
        hM hM2 = new hM(this);
        int n = this.an;
        if (this.vX == null) {
            if ((this.an & 1) != 0) {
                this.vU = Collections.unmodifiableList(this.vU);
                this.an &= 0xFFFFFFFE;
            }
            hM2.vU = this.vU;
        } else {
            hM2.vU = this.vX.build();
        }
        this.onBuilt();
        return hM2;
    }

    public hO Kz() {
        return (hO)super.clone();
    }

    public hO cK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hO)super.setField(fieldDescriptor, object);
    }

    public hO aS(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hO)super.clearField(fieldDescriptor);
    }

    public hO aS(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hO)super.clearOneof(oneofDescriptor);
    }

    public hO aS(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hO)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hO cL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hO)super.addRepeatedField(fieldDescriptor, object);
    }

    public hO aS(Message message) {
        if (message instanceof hM) {
            return this.c((hM)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hO c(hM hM2) {
        if (hM2 == hM.Kt()) {
            return this;
        }
        if (this.vX == null) {
            if (!hM2.vU.isEmpty()) {
                if (this.vU.isEmpty()) {
                    this.vU = hM2.vU;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.KA();
                    this.vU.addAll(hM2.vU);
                }
                this.onChanged();
            }
        } else if (!hM2.vU.isEmpty()) {
            if (this.vX.isEmpty()) {
                this.vX.dispose();
                this.vX = null;
                this.vU = hM2.vU;
                this.an &= 0xFFFFFFFE;
                this.vX = hM.ju() ? this.KE() : null;
            } else {
                this.vX.addAllMessages(hM2.vU);
            }
        }
        this.cL(hM.b(hM2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.Kp(); ++i) {
            if (this.dR(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hO eE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hM hM2 = null;
        try {
            hM2 = (hM)hM.vW.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hM2 = (hM)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hM2 != null) {
                this.c(hM2);
            }
        }
        return this;
    }

    private void KA() {
        if ((this.an & 1) == 0) {
            this.vU = new ArrayList<hU>(this.vU);
            this.an |= 1;
        }
    }

    @Override
    public List<hU> Kn() {
        if (this.vX == null) {
            return Collections.unmodifiableList(this.vU);
        }
        return this.vX.getMessageList();
    }

    @Override
    public int Kp() {
        if (this.vX == null) {
            return this.vU.size();
        }
        return this.vX.getCount();
    }

    @Override
    public hU dR(int n) {
        if (this.vX == null) {
            return this.vU.get(n);
        }
        return (hU)this.vX.getMessage(n);
    }

    public hO a(int n, hU hU2) {
        if (this.vX == null) {
            if (hU2 == null) {
                throw new NullPointerException();
            }
            this.KA();
            this.vU.set(n, hU2);
            this.onChanged();
        } else {
            this.vX.setMessage(n, (AbstractMessage)hU2);
        }
        return this;
    }

    public hO a(int n, hW hW2) {
        if (this.vX == null) {
            this.KA();
            this.vU.set(n, hW2.Lc());
            this.onChanged();
        } else {
            this.vX.setMessage(n, (AbstractMessage)hW2.Lc());
        }
        return this;
    }

    public hO a(hU hU2) {
        if (this.vX == null) {
            if (hU2 == null) {
                throw new NullPointerException();
            }
            this.KA();
            this.vU.add(hU2);
            this.onChanged();
        } else {
            this.vX.addMessage((AbstractMessage)hU2);
        }
        return this;
    }

    public hO b(int n, hU hU2) {
        if (this.vX == null) {
            if (hU2 == null) {
                throw new NullPointerException();
            }
            this.KA();
            this.vU.add(n, hU2);
            this.onChanged();
        } else {
            this.vX.addMessage(n, (AbstractMessage)hU2);
        }
        return this;
    }

    public hO a(hW hW2) {
        if (this.vX == null) {
            this.KA();
            this.vU.add(hW2.Lc());
            this.onChanged();
        } else {
            this.vX.addMessage((AbstractMessage)hW2.Lc());
        }
        return this;
    }

    public hO b(int n, hW hW2) {
        if (this.vX == null) {
            this.KA();
            this.vU.add(n, hW2.Lc());
            this.onChanged();
        } else {
            this.vX.addMessage(n, (AbstractMessage)hW2.Lc());
        }
        return this;
    }

    public hO C(Iterable<? extends hU> iterable) {
        if (this.vX == null) {
            this.KA();
            AbstractMessageLite.Builder.addAll(iterable, this.vU);
            this.onChanged();
        } else {
            this.vX.addAllMessages(iterable);
        }
        return this;
    }

    public hO KB() {
        if (this.vX == null) {
            this.vU = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.vX.clear();
        }
        return this;
    }

    public hO dT(int n) {
        if (this.vX == null) {
            this.KA();
            this.vU.remove(n);
            this.onChanged();
        } else {
            this.vX.remove(n);
        }
        return this;
    }

    public hW dU(int n) {
        return (hW)this.KE().getBuilder(n);
    }

    @Override
    public hY dS(int n) {
        if (this.vX == null) {
            return this.vU.get(n);
        }
        return (hY)this.vX.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends hY> Ko() {
        if (this.vX != null) {
            return this.vX.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.vU);
    }

    public hW KC() {
        return (hW)this.KE().addBuilder((AbstractMessage)hU.KY());
    }

    public hW dV(int n) {
        return (hW)this.KE().addBuilder(n, (AbstractMessage)hU.KY());
    }

    public List<hW> KD() {
        return this.KE().getBuilderList();
    }

    private RepeatedFieldBuilderV3<hU, hW, hY> KE() {
        if (this.vX == null) {
            this.vX = new RepeatedFieldBuilderV3(this.vU, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.vU = null;
        }
        return this.vX;
    }

    public final hO cK(UnknownFieldSet unknownFieldSet) {
        return (hO)super.setUnknownFields(unknownFieldSet);
    }

    public final hO cL(UnknownFieldSet unknownFieldSet) {
        return (hO)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aS(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aS(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aS(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Kw();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Kz();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aS(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Kw();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aS(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Kz();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aS(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aS(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aS(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Kz();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Ky();
    }

    public /* synthetic */ Message build() {
        return this.Kx();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aS(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Kw();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Kz();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Ky();
    }

    public /* synthetic */ MessageLite build() {
        return this.Kx();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Kw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ku();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ku();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eE(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Kz();
    }

    public /* synthetic */ Object clone() {
        return this.Kz();
    }
}

