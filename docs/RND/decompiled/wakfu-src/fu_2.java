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
 *  com.google.protobuf.Internal$IntList
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from fu
 */
public final class fu_2
extends GeneratedMessageV3.Builder<fu_2>
implements fv_2 {
    private int an;
    private List<fb_2> qm = Collections.emptyList();
    private RepeatedFieldBuilderV3<fb_2, fd_2, fe_2> qs;
    private Internal.IntList qo = fs_1.Ac();

    public static final Descriptors.Descriptor Ae() {
        return fl_1.pi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pj.ensureFieldAccessorsInitialized(fs_1.class, fu_2.class);
    }

    fu_2() {
        this.D();
    }

    fu_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fs_1.fa()) {
            this.An();
        }
    }

    public fu_2 Af() {
        super.clear();
        if (this.qs == null) {
            this.qm = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.qs.clear();
        }
        this.qo = fs_1.Ab();
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.pi;
    }

    public fs_1 Aa() {
        return fs_1.zZ();
    }

    public fs_1 Ag() {
        fs_1 fs_12 = this.Ah();
        if (!fs_12.isInitialized()) {
            throw fu_2.newUninitializedMessageException((Message)fs_12);
        }
        return fs_12;
    }

    public fs_1 Ah() {
        fs_1 fs_12 = new fs_1(this);
        int n = this.an;
        if (this.qs == null) {
            if ((this.an & 1) != 0) {
                this.qm = Collections.unmodifiableList(this.qm);
                this.an &= 0xFFFFFFFE;
            }
            fs_12.qm = this.qm;
        } else {
            fs_12.qm = this.qs.build();
        }
        if ((this.an & 2) != 0) {
            this.qo.makeImmutable();
            this.an &= 0xFFFFFFFD;
        }
        fs_12.qo = this.qo;
        this.onBuilt();
        return fs_12;
    }

    public fu_2 Ai() {
        return (fu_2)super.clone();
    }

    public fu_2 bM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fu_2)super.setField(fieldDescriptor, object);
    }

    public fu_2 at(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fu_2)super.clearField(fieldDescriptor);
    }

    public fu_2 at(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fu_2)super.clearOneof(oneofDescriptor);
    }

    public fu_2 at(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fu_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fu_2 bN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fu_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fu_2 at(Message message) {
        if (message instanceof fs_1) {
            return this.c((fs_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fu_2 c(fs_1 fs_12) {
        if (fs_12 == fs_1.zZ()) {
            return this;
        }
        if (this.qs == null) {
            if (!fs_12.qm.isEmpty()) {
                if (this.qm.isEmpty()) {
                    this.qm = fs_12.qm;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Aj();
                    this.qm.addAll(fs_12.qm);
                }
                this.onChanged();
            }
        } else if (!fs_12.qm.isEmpty()) {
            if (this.qs.isEmpty()) {
                this.qs.dispose();
                this.qs = null;
                this.qm = fs_12.qm;
                this.an &= 0xFFFFFFFE;
                this.qs = fs_1.bg() ? this.An() : null;
            } else {
                this.qs.addAllMessages(fs_12.qm);
            }
        }
        if (!fs_12.qo.isEmpty()) {
            if (this.qo.isEmpty()) {
                this.qo = fs_12.qo;
                this.an &= 0xFFFFFFFD;
            } else {
                this.Ao();
                this.qo.addAll((Collection)fs_12.qo);
            }
            this.onChanged();
        }
        this.bN(fs_1.b(fs_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zT(); ++i) {
            if (this.cl(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fu_2 dh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fs_1 fs_12 = null;
        try {
            fs_12 = (fs_1)fs_1.qr.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fs_12 = (fs_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fs_12 != null) {
                this.c(fs_12);
            }
        }
        return this;
    }

    private void Aj() {
        if ((this.an & 1) == 0) {
            this.qm = new ArrayList<fb_2>(this.qm);
            this.an |= 1;
        }
    }

    @Override
    public List<fb_2> zR() {
        if (this.qs == null) {
            return Collections.unmodifiableList(this.qm);
        }
        return this.qs.getMessageList();
    }

    @Override
    public int zT() {
        if (this.qs == null) {
            return this.qm.size();
        }
        return this.qs.getCount();
    }

    @Override
    public fb_2 cl(int n) {
        if (this.qs == null) {
            return this.qm.get(n);
        }
        return (fb_2)this.qs.getMessage(n);
    }

    public fu_2 c(int n, fb_2 fb_22) {
        if (this.qs == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.Aj();
            this.qm.set(n, fb_22);
            this.onChanged();
        } else {
            this.qs.setMessage(n, (AbstractMessage)fb_22);
        }
        return this;
    }

    public fu_2 c(int n, fd_2 fd_22) {
        if (this.qs == null) {
            this.Aj();
            this.qm.set(n, fd_22.AW());
            this.onChanged();
        } else {
            this.qs.setMessage(n, (AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fu_2 b(fb_2 fb_22) {
        if (this.qs == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.Aj();
            this.qm.add(fb_22);
            this.onChanged();
        } else {
            this.qs.addMessage((AbstractMessage)fb_22);
        }
        return this;
    }

    public fu_2 d(int n, fb_2 fb_22) {
        if (this.qs == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.Aj();
            this.qm.add(n, fb_22);
            this.onChanged();
        } else {
            this.qs.addMessage(n, (AbstractMessage)fb_22);
        }
        return this;
    }

    public fu_2 b(fd_2 fd_22) {
        if (this.qs == null) {
            this.Aj();
            this.qm.add(fd_22.AW());
            this.onChanged();
        } else {
            this.qs.addMessage((AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fu_2 d(int n, fd_2 fd_22) {
        if (this.qs == null) {
            this.Aj();
            this.qm.add(n, fd_22.AW());
            this.onChanged();
        } else {
            this.qs.addMessage(n, (AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fu_2 r(Iterable<? extends fb_2> iterable) {
        if (this.qs == null) {
            this.Aj();
            AbstractMessageLite.Builder.addAll(iterable, this.qm);
            this.onChanged();
        } else {
            this.qs.addAllMessages(iterable);
        }
        return this;
    }

    public fu_2 Ak() {
        if (this.qs == null) {
            this.qm = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.qs.clear();
        }
        return this;
    }

    public fu_2 co(int n) {
        if (this.qs == null) {
            this.Aj();
            this.qm.remove(n);
            this.onChanged();
        } else {
            this.qs.remove(n);
        }
        return this;
    }

    public fd_2 cp(int n) {
        return (fd_2)this.An().getBuilder(n);
    }

    @Override
    public fe_2 cm(int n) {
        if (this.qs == null) {
            return this.qm.get(n);
        }
        return (fe_2)this.qs.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fe_2> zS() {
        if (this.qs != null) {
            return this.qs.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.qm);
    }

    public fd_2 Al() {
        return (fd_2)this.An().addBuilder((AbstractMessage)fb_2.AS());
    }

    public fd_2 cq(int n) {
        return (fd_2)this.An().addBuilder(n, (AbstractMessage)fb_2.AS());
    }

    public List<fd_2> Am() {
        return this.An().getBuilderList();
    }

    private RepeatedFieldBuilderV3<fb_2, fd_2, fe_2> An() {
        if (this.qs == null) {
            this.qs = new RepeatedFieldBuilderV3(this.qm, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.qm = null;
        }
        return this.qs;
    }

    private void Ao() {
        if ((this.an & 2) == 0) {
            this.qo = fs_1.b(this.qo);
            this.an |= 2;
        }
    }

    @Override
    public List<Integer> zU() {
        return (this.an & 2) != 0 ? Collections.unmodifiableList(this.qo) : this.qo;
    }

    @Override
    public int zV() {
        return this.qo.size();
    }

    @Override
    public int cn(int n) {
        return this.qo.getInt(n);
    }

    public fu_2 d(int n, int n2) {
        this.Ao();
        this.qo.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public fu_2 cr(int n) {
        this.Ao();
        this.qo.addInt(n);
        this.onChanged();
        return this;
    }

    public fu_2 s(Iterable<? extends Integer> iterable) {
        this.Ao();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.qo);
        this.onChanged();
        return this;
    }

    public fu_2 Ap() {
        this.qo = fs_1.Ad();
        this.an &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final fu_2 bM(UnknownFieldSet unknownFieldSet) {
        return (fu_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fu_2 bN(UnknownFieldSet unknownFieldSet) {
        return (fu_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.at(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.at(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.at(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Af();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Ai();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.at(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Af();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.at(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Ai();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.at(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.at(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.at(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Ai();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Ah();
    }

    public /* synthetic */ Message build() {
        return this.Ag();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.at(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Af();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Ai();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Ah();
    }

    public /* synthetic */ MessageLite build() {
        return this.Ag();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Af();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Aa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Aa();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dh(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Ai();
    }

    public /* synthetic */ Object clone() {
        return this.Ai();
    }
}

