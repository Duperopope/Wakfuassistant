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

/*
 * Renamed from zm
 */
public final class zm_2
extends GeneratedMessageV3.Builder<zm_2>
implements zn_1 {
    private int an;
    private List<zh_2> anG = Collections.emptyList();
    private RepeatedFieldBuilderV3<zh_2, zj_2, zo_1> anJ;

    public static final Descriptors.Descriptor axX() {
        return zg_2.ant;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zg_2.anu.ensureFieldAccessorsInitialized(zk_2.class, zm_2.class);
    }

    zm_2() {
        this.D();
    }

    zm_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (zk_2.aJ()) {
            this.ayg();
        }
    }

    public zm_2 axY() {
        super.clear();
        if (this.anJ == null) {
            this.anG = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.anJ.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zg_2.ant;
    }

    public zk_2 axW() {
        return zk_2.axV();
    }

    public zk_2 axZ() {
        zk_2 zk_22 = this.aya();
        if (!zk_22.isInitialized()) {
            throw zm_2.newUninitializedMessageException((Message)zk_22);
        }
        return zk_22;
    }

    public zk_2 aya() {
        zk_2 zk_22 = new zk_2(this);
        int n = this.an;
        if (this.anJ == null) {
            if ((this.an & 1) != 0) {
                this.anG = Collections.unmodifiableList(this.anG);
                this.an &= 0xFFFFFFFE;
            }
            zk_22.anG = this.anG;
        } else {
            zk_22.anG = this.anJ.build();
        }
        this.onBuilt();
        return zk_22;
    }

    public zm_2 ayb() {
        return (zm_2)super.clone();
    }

    public zm_2 fU(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zm_2)super.setField(fieldDescriptor, object);
    }

    public zm_2 cx(Descriptors.FieldDescriptor fieldDescriptor) {
        return (zm_2)super.clearField(fieldDescriptor);
    }

    public zm_2 cx(Descriptors.OneofDescriptor oneofDescriptor) {
        return (zm_2)super.clearOneof(oneofDescriptor);
    }

    public zm_2 cx(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (zm_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public zm_2 fV(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (zm_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public zm_2 cx(Message message) {
        if (message instanceof zk_2) {
            return this.e((zk_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public zm_2 e(zk_2 zk_22) {
        if (zk_22 == zk_2.axV()) {
            return this;
        }
        if (this.anJ == null) {
            if (!zk_22.anG.isEmpty()) {
                if (this.anG.isEmpty()) {
                    this.anG = zk_22.anG;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ayc();
                    this.anG.addAll(zk_22.anG);
                }
                this.onChanged();
            }
        } else if (!zk_22.anG.isEmpty()) {
            if (this.anJ.isEmpty()) {
                this.anJ.dispose();
                this.anJ = null;
                this.anG = zk_22.anG;
                this.an &= 0xFFFFFFFE;
                this.anJ = zk_2.oB() ? this.ayg() : null;
            } else {
                this.anJ.addAllMessages(zk_22.anG);
            }
        }
        this.fV(zk_2.d(zk_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.axR(); ++i) {
            if (this.kp(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public zm_2 jt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        zk_2 zk_22 = null;
        try {
            zk_22 = (zk_2)zk_2.anI.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            zk_22 = (zk_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (zk_22 != null) {
                this.e(zk_22);
            }
        }
        return this;
    }

    private void ayc() {
        if ((this.an & 1) == 0) {
            this.anG = new ArrayList<zh_2>(this.anG);
            this.an |= 1;
        }
    }

    @Override
    public List<zh_2> axP() {
        if (this.anJ == null) {
            return Collections.unmodifiableList(this.anG);
        }
        return this.anJ.getMessageList();
    }

    @Override
    public int axR() {
        if (this.anJ == null) {
            return this.anG.size();
        }
        return this.anJ.getCount();
    }

    @Override
    public zh_2 kp(int n) {
        if (this.anJ == null) {
            return this.anG.get(n);
        }
        return (zh_2)this.anJ.getMessage(n);
    }

    public zm_2 a(int n, zh_2 zh_22) {
        if (this.anJ == null) {
            if (zh_22 == null) {
                throw new NullPointerException();
            }
            this.ayc();
            this.anG.set(n, zh_22);
            this.onChanged();
        } else {
            this.anJ.setMessage(n, (AbstractMessage)zh_22);
        }
        return this;
    }

    public zm_2 a(int n, zj_2 zj_22) {
        if (this.anJ == null) {
            this.ayc();
            this.anG.set(n, zj_22.axI());
            this.onChanged();
        } else {
            this.anJ.setMessage(n, (AbstractMessage)zj_22.axI());
        }
        return this;
    }

    public zm_2 d(zh_2 zh_22) {
        if (this.anJ == null) {
            if (zh_22 == null) {
                throw new NullPointerException();
            }
            this.ayc();
            this.anG.add(zh_22);
            this.onChanged();
        } else {
            this.anJ.addMessage((AbstractMessage)zh_22);
        }
        return this;
    }

    public zm_2 b(int n, zh_2 zh_22) {
        if (this.anJ == null) {
            if (zh_22 == null) {
                throw new NullPointerException();
            }
            this.ayc();
            this.anG.add(n, zh_22);
            this.onChanged();
        } else {
            this.anJ.addMessage(n, (AbstractMessage)zh_22);
        }
        return this;
    }

    public zm_2 a(zj_2 zj_22) {
        if (this.anJ == null) {
            this.ayc();
            this.anG.add(zj_22.axI());
            this.onChanged();
        } else {
            this.anJ.addMessage((AbstractMessage)zj_22.axI());
        }
        return this;
    }

    public zm_2 b(int n, zj_2 zj_22) {
        if (this.anJ == null) {
            this.ayc();
            this.anG.add(n, zj_22.axI());
            this.onChanged();
        } else {
            this.anJ.addMessage(n, (AbstractMessage)zj_22.axI());
        }
        return this;
    }

    public zm_2 ar(Iterable<? extends zh_2> iterable) {
        if (this.anJ == null) {
            this.ayc();
            AbstractMessageLite.Builder.addAll(iterable, this.anG);
            this.onChanged();
        } else {
            this.anJ.addAllMessages(iterable);
        }
        return this;
    }

    public zm_2 ayd() {
        if (this.anJ == null) {
            this.anG = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.anJ.clear();
        }
        return this;
    }

    public zm_2 kr(int n) {
        if (this.anJ == null) {
            this.ayc();
            this.anG.remove(n);
            this.onChanged();
        } else {
            this.anJ.remove(n);
        }
        return this;
    }

    public zj_2 ks(int n) {
        return (zj_2)this.ayg().getBuilder(n);
    }

    @Override
    public zo_1 kq(int n) {
        if (this.anJ == null) {
            return this.anG.get(n);
        }
        return (zo_1)this.anJ.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends zo_1> axQ() {
        if (this.anJ != null) {
            return this.anJ.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.anG);
    }

    public zj_2 aye() {
        return (zj_2)this.ayg().addBuilder((AbstractMessage)zh_2.axE());
    }

    public zj_2 kt(int n) {
        return (zj_2)this.ayg().addBuilder(n, (AbstractMessage)zh_2.axE());
    }

    public List<zj_2> ayf() {
        return this.ayg().getBuilderList();
    }

    private RepeatedFieldBuilderV3<zh_2, zj_2, zo_1> ayg() {
        if (this.anJ == null) {
            this.anJ = new RepeatedFieldBuilderV3(this.anG, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.anG = null;
        }
        return this.anJ;
    }

    public final zm_2 fU(UnknownFieldSet unknownFieldSet) {
        return (zm_2)super.setUnknownFields(unknownFieldSet);
    }

    public final zm_2 fV(UnknownFieldSet unknownFieldSet) {
        return (zm_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fV(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fU(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fV(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cx(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cx(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cx(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fU(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.axY();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ayb();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fV(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cx(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.axY();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cx(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ayb();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fV(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fU(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fV(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cx(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cx(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cx(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fU(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ayb();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aya();
    }

    public /* synthetic */ Message build() {
        return this.axZ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cx(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.axY();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ayb();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aya();
    }

    public /* synthetic */ MessageLite build() {
        return this.axZ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.axY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axW();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axW();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jt(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ayb();
    }

    public /* synthetic */ Object clone() {
        return this.ayb();
    }
}

