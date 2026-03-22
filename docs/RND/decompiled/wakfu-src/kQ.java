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

public final class kQ
extends GeneratedMessageV3.Builder<kQ>
implements kR {
    private int an;
    private List<kG> GP = Collections.emptyList();
    private RepeatedFieldBuilderV3<kG, kI, kN> GS;

    public static final Descriptors.Descriptor adr() {
        return kF.Gm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gn.ensureFieldAccessorsInitialized(kO.class, kQ.class);
    }

    kQ() {
        this.D();
    }

    kQ(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (kO.mj()) {
            this.adA();
        }
    }

    public kQ ads() {
        super.clear();
        if (this.GS == null) {
            this.GP = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.GS.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Gm;
    }

    public kO adp() {
        return kO.ado();
    }

    public kO adt() {
        kO kO2 = this.adu();
        if (!kO2.isInitialized()) {
            throw kQ.newUninitializedMessageException((Message)kO2);
        }
        return kO2;
    }

    public kO adu() {
        kO kO2 = new kO(this);
        int n = this.an;
        if (this.GS == null) {
            if ((this.an & 1) != 0) {
                this.GP = Collections.unmodifiableList(this.GP);
                this.an &= 0xFFFFFFFE;
            }
            kO2.GP = this.GP;
        } else {
            kO2.GP = this.GS.build();
        }
        this.onBuilt();
        return kO2;
    }

    public kQ adv() {
        return (kQ)super.clone();
    }

    public kQ eg(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kQ)super.setField(fieldDescriptor, object);
    }

    public kQ bD(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kQ)super.clearField(fieldDescriptor);
    }

    public kQ bD(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kQ)super.clearOneof(oneofDescriptor);
    }

    public kQ bD(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kQ)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kQ eh(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kQ)super.addRepeatedField(fieldDescriptor, object);
    }

    public kQ bD(Message message) {
        if (message instanceof kO) {
            return this.c((kO)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kQ c(kO kO2) {
        if (kO2 == kO.ado()) {
            return this;
        }
        if (this.GS == null) {
            if (!kO2.GP.isEmpty()) {
                if (this.GP.isEmpty()) {
                    this.GP = kO2.GP;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.adw();
                    this.GP.addAll(kO2.GP);
                }
                this.onChanged();
            }
        } else if (!kO2.GP.isEmpty()) {
            if (this.GS.isEmpty()) {
                this.GS.dispose();
                this.GS = null;
                this.GP = kO2.GP;
                this.an &= 0xFFFFFFFE;
                this.GS = kO.adq() ? this.adA() : null;
            } else {
                this.GS.addAllMessages(kO2.GP);
            }
        }
        this.eh(kO.b(kO2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.adk(); ++i) {
            if (this.gS(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public kQ gL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kO kO2 = null;
        try {
            kO2 = (kO)kO.GR.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kO2 = (kO)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kO2 != null) {
                this.c(kO2);
            }
        }
        return this;
    }

    private void adw() {
        if ((this.an & 1) == 0) {
            this.GP = new ArrayList<kG>(this.GP);
            this.an |= 1;
        }
    }

    @Override
    public List<kG> adi() {
        if (this.GS == null) {
            return Collections.unmodifiableList(this.GP);
        }
        return this.GS.getMessageList();
    }

    @Override
    public int adk() {
        if (this.GS == null) {
            return this.GP.size();
        }
        return this.GS.getCount();
    }

    @Override
    public kG gS(int n) {
        if (this.GS == null) {
            return this.GP.get(n);
        }
        return (kG)this.GS.getMessage(n);
    }

    public kQ a(int n, kG kG2) {
        if (this.GS == null) {
            if (kG2 == null) {
                throw new NullPointerException();
            }
            this.adw();
            this.GP.set(n, kG2);
            this.onChanged();
        } else {
            this.GS.setMessage(n, (AbstractMessage)kG2);
        }
        return this;
    }

    public kQ a(int n, kI kI2) {
        if (this.GS == null) {
            this.adw();
            this.GP.set(n, kI2.acJ());
            this.onChanged();
        } else {
            this.GS.setMessage(n, (AbstractMessage)kI2.acJ());
        }
        return this;
    }

    public kQ d(kG kG2) {
        if (this.GS == null) {
            if (kG2 == null) {
                throw new NullPointerException();
            }
            this.adw();
            this.GP.add(kG2);
            this.onChanged();
        } else {
            this.GS.addMessage((AbstractMessage)kG2);
        }
        return this;
    }

    public kQ b(int n, kG kG2) {
        if (this.GS == null) {
            if (kG2 == null) {
                throw new NullPointerException();
            }
            this.adw();
            this.GP.add(n, kG2);
            this.onChanged();
        } else {
            this.GS.addMessage(n, (AbstractMessage)kG2);
        }
        return this;
    }

    public kQ a(kI kI2) {
        if (this.GS == null) {
            this.adw();
            this.GP.add(kI2.acJ());
            this.onChanged();
        } else {
            this.GS.addMessage((AbstractMessage)kI2.acJ());
        }
        return this;
    }

    public kQ b(int n, kI kI2) {
        if (this.GS == null) {
            this.adw();
            this.GP.add(n, kI2.acJ());
            this.onChanged();
        } else {
            this.GS.addMessage(n, (AbstractMessage)kI2.acJ());
        }
        return this;
    }

    public kQ X(Iterable<? extends kG> iterable) {
        if (this.GS == null) {
            this.adw();
            AbstractMessageLite.Builder.addAll(iterable, this.GP);
            this.onChanged();
        } else {
            this.GS.addAllMessages(iterable);
        }
        return this;
    }

    public kQ adx() {
        if (this.GS == null) {
            this.GP = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.GS.clear();
        }
        return this;
    }

    public kQ gU(int n) {
        if (this.GS == null) {
            this.adw();
            this.GP.remove(n);
            this.onChanged();
        } else {
            this.GS.remove(n);
        }
        return this;
    }

    public kI gV(int n) {
        return (kI)this.adA().getBuilder(n);
    }

    @Override
    public kN gT(int n) {
        if (this.GS == null) {
            return this.GP.get(n);
        }
        return (kN)this.GS.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kN> adj() {
        if (this.GS != null) {
            return this.GS.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.GP);
    }

    public kI ady() {
        return (kI)this.adA().addBuilder((AbstractMessage)kG.acC());
    }

    public kI gW(int n) {
        return (kI)this.adA().addBuilder(n, (AbstractMessage)kG.acC());
    }

    public List<kI> adz() {
        return this.adA().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kG, kI, kN> adA() {
        if (this.GS == null) {
            this.GS = new RepeatedFieldBuilderV3(this.GP, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.GP = null;
        }
        return this.GS;
    }

    public final kQ eg(UnknownFieldSet unknownFieldSet) {
        return (kQ)super.setUnknownFields(unknownFieldSet);
    }

    public final kQ eh(UnknownFieldSet unknownFieldSet) {
        return (kQ)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eh(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eg(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eh(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bD(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bD(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bD(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eg(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ads();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.adv();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eh(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bD(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ads();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bD(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.adv();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eh(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eg(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eh(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bD(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bD(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bD(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eg(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.adv();
    }

    public /* synthetic */ Message buildPartial() {
        return this.adu();
    }

    public /* synthetic */ Message build() {
        return this.adt();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bD(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ads();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.adv();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.adu();
    }

    public /* synthetic */ MessageLite build() {
        return this.adt();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ads();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.adp();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.adp();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gL(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.adv();
    }

    public /* synthetic */ Object clone() {
        return this.adv();
    }
}

