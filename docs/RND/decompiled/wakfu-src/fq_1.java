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
 * Renamed from fq
 */
public final class fq_1
extends GeneratedMessageV3.Builder<fq_1>
implements fr_2 {
    private int an;
    private List<fb_2> qg = Collections.emptyList();
    private RepeatedFieldBuilderV3<fb_2, fd_2, fe_2> qj;

    public static final Descriptors.Descriptor zG() {
        return fl_1.pk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pl.ensureFieldAccessorsInitialized(fo_2.class, fq_1.class);
    }

    fq_1() {
        this.D();
    }

    fq_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (fo_2.Y()) {
            this.zP();
        }
    }

    public fq_1 zH() {
        super.clear();
        if (this.qj == null) {
            this.qg = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.qj.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fl_1.pk;
    }

    public fo_2 zF() {
        return fo_2.zE();
    }

    public fo_2 zI() {
        fo_2 fo_22 = this.zJ();
        if (!fo_22.isInitialized()) {
            throw fq_1.newUninitializedMessageException((Message)fo_22);
        }
        return fo_22;
    }

    public fo_2 zJ() {
        fo_2 fo_22 = new fo_2(this);
        int n = this.an;
        if (this.qj == null) {
            if ((this.an & 1) != 0) {
                this.qg = Collections.unmodifiableList(this.qg);
                this.an &= 0xFFFFFFFE;
            }
            fo_22.qg = this.qg;
        } else {
            fo_22.qg = this.qj.build();
        }
        this.onBuilt();
        return fo_22;
    }

    public fq_1 zK() {
        return (fq_1)super.clone();
    }

    public fq_1 bK(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fq_1)super.setField(fieldDescriptor, object);
    }

    public fq_1 as(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fq_1)super.clearField(fieldDescriptor);
    }

    public fq_1 as(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fq_1)super.clearOneof(oneofDescriptor);
    }

    public fq_1 as(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fq_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fq_1 bL(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fq_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public fq_1 as(Message message) {
        if (message instanceof fo_2) {
            return this.c((fo_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fq_1 c(fo_2 fo_22) {
        if (fo_22 == fo_2.zE()) {
            return this;
        }
        if (this.qj == null) {
            if (!fo_22.qg.isEmpty()) {
                if (this.qg.isEmpty()) {
                    this.qg = fo_22.qg;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.zL();
                    this.qg.addAll(fo_22.qg);
                }
                this.onChanged();
            }
        } else if (!fo_22.qg.isEmpty()) {
            if (this.qj.isEmpty()) {
                this.qj.dispose();
                this.qj = null;
                this.qg = fo_22.qg;
                this.an &= 0xFFFFFFFE;
                this.qj = fo_2.gG() ? this.zP() : null;
            } else {
                this.qj.addAllMessages(fo_22.qg);
            }
        }
        this.bL(fo_2.b(fo_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zA(); ++i) {
            if (this.cg(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fq_1 de(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fo_2 fo_22 = null;
        try {
            fo_22 = (fo_2)fo_2.qi.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fo_22 = (fo_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fo_22 != null) {
                this.c(fo_22);
            }
        }
        return this;
    }

    private void zL() {
        if ((this.an & 1) == 0) {
            this.qg = new ArrayList<fb_2>(this.qg);
            this.an |= 1;
        }
    }

    @Override
    public List<fb_2> zy() {
        if (this.qj == null) {
            return Collections.unmodifiableList(this.qg);
        }
        return this.qj.getMessageList();
    }

    @Override
    public int zA() {
        if (this.qj == null) {
            return this.qg.size();
        }
        return this.qj.getCount();
    }

    @Override
    public fb_2 cg(int n) {
        if (this.qj == null) {
            return this.qg.get(n);
        }
        return (fb_2)this.qj.getMessage(n);
    }

    public fq_1 a(int n, fb_2 fb_22) {
        if (this.qj == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.zL();
            this.qg.set(n, fb_22);
            this.onChanged();
        } else {
            this.qj.setMessage(n, (AbstractMessage)fb_22);
        }
        return this;
    }

    public fq_1 a(int n, fd_2 fd_22) {
        if (this.qj == null) {
            this.zL();
            this.qg.set(n, fd_22.AW());
            this.onChanged();
        } else {
            this.qj.setMessage(n, (AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fq_1 a(fb_2 fb_22) {
        if (this.qj == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.zL();
            this.qg.add(fb_22);
            this.onChanged();
        } else {
            this.qj.addMessage((AbstractMessage)fb_22);
        }
        return this;
    }

    public fq_1 b(int n, fb_2 fb_22) {
        if (this.qj == null) {
            if (fb_22 == null) {
                throw new NullPointerException();
            }
            this.zL();
            this.qg.add(n, fb_22);
            this.onChanged();
        } else {
            this.qj.addMessage(n, (AbstractMessage)fb_22);
        }
        return this;
    }

    public fq_1 a(fd_2 fd_22) {
        if (this.qj == null) {
            this.zL();
            this.qg.add(fd_22.AW());
            this.onChanged();
        } else {
            this.qj.addMessage((AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fq_1 b(int n, fd_2 fd_22) {
        if (this.qj == null) {
            this.zL();
            this.qg.add(n, fd_22.AW());
            this.onChanged();
        } else {
            this.qj.addMessage(n, (AbstractMessage)fd_22.AW());
        }
        return this;
    }

    public fq_1 q(Iterable<? extends fb_2> iterable) {
        if (this.qj == null) {
            this.zL();
            AbstractMessageLite.Builder.addAll(iterable, this.qg);
            this.onChanged();
        } else {
            this.qj.addAllMessages(iterable);
        }
        return this;
    }

    public fq_1 zM() {
        if (this.qj == null) {
            this.qg = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.qj.clear();
        }
        return this;
    }

    public fq_1 ci(int n) {
        if (this.qj == null) {
            this.zL();
            this.qg.remove(n);
            this.onChanged();
        } else {
            this.qj.remove(n);
        }
        return this;
    }

    public fd_2 cj(int n) {
        return (fd_2)this.zP().getBuilder(n);
    }

    @Override
    public fe_2 ch(int n) {
        if (this.qj == null) {
            return this.qg.get(n);
        }
        return (fe_2)this.qj.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fe_2> zz() {
        if (this.qj != null) {
            return this.qj.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.qg);
    }

    public fd_2 zN() {
        return (fd_2)this.zP().addBuilder((AbstractMessage)fb_2.AS());
    }

    public fd_2 ck(int n) {
        return (fd_2)this.zP().addBuilder(n, (AbstractMessage)fb_2.AS());
    }

    public List<fd_2> zO() {
        return this.zP().getBuilderList();
    }

    private RepeatedFieldBuilderV3<fb_2, fd_2, fe_2> zP() {
        if (this.qj == null) {
            this.qj = new RepeatedFieldBuilderV3(this.qg, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.qg = null;
        }
        return this.qj;
    }

    public final fq_1 bK(UnknownFieldSet unknownFieldSet) {
        return (fq_1)super.setUnknownFields(unknownFieldSet);
    }

    public final fq_1 bL(UnknownFieldSet unknownFieldSet) {
        return (fq_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bL(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bK(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bL(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.as(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.as(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.as(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bK(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.zH();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.zK();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bL(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.de(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.as(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.zH();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.as(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.zK();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bL(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bK(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bL(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.as(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.as(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.as(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bK(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.de(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.zK();
    }

    public /* synthetic */ Message buildPartial() {
        return this.zJ();
    }

    public /* synthetic */ Message build() {
        return this.zI();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.as(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.zH();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.de(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.zK();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.zJ();
    }

    public /* synthetic */ MessageLite build() {
        return this.zI();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.zH();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.zF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.zF();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.de(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.zK();
    }

    public /* synthetic */ Object clone() {
        return this.zK();
    }
}

