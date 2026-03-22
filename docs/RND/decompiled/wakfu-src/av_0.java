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
 *  com.google.protobuf.Internal$ListAdapter
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Av
 */
public final class av_0
extends GeneratedMessageV3.Builder<av_0>
implements aw_0 {
    private int an;
    private long Dj;
    private long wf;
    private List<Integer> aqw = Collections.emptyList();
    private List<Integer> aqz = Collections.emptyList();
    private int aB;
    private boolean aqD;

    public static final Descriptors.Descriptor aDb() {
        return zS.app;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apq.ensureFieldAccessorsInitialized(ar_0.class, av_0.class);
    }

    av_0() {
        this.D();
    }

    av_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ar_0.B()) {
            // empty if block
        }
    }

    public av_0 aDc() {
        super.clear();
        this.Dj = 0L;
        this.an &= 0xFFFFFFFE;
        this.wf = 0L;
        this.an &= 0xFFFFFFFD;
        this.aqw = Collections.emptyList();
        this.an &= 0xFFFFFFFB;
        this.aqz = Collections.emptyList();
        this.an &= 0xFFFFFFF7;
        this.aB = 0;
        this.an &= 0xFFFFFFEF;
        this.aqD = false;
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.app;
    }

    public ar_0 aDa() {
        return ar_0.aCZ();
    }

    public ar_0 aDd() {
        ar_0 ar_02 = this.aDe();
        if (!ar_02.isInitialized()) {
            throw av_0.newUninitializedMessageException((Message)ar_02);
        }
        return ar_02;
    }

    public ar_0 aDe() {
        ar_0 ar_02 = new ar_0(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ar_02.Dj = this.Dj;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            ar_02.wf = this.wf;
            n2 |= 2;
        }
        if ((this.an & 4) != 0) {
            this.aqw = Collections.unmodifiableList(this.aqw);
            this.an &= 0xFFFFFFFB;
        }
        ar_02.aqw = this.aqw;
        if ((this.an & 8) != 0) {
            this.aqz = Collections.unmodifiableList(this.aqz);
            this.an &= 0xFFFFFFF7;
        }
        ar_02.aqz = this.aqz;
        if ((n & 0x10) != 0) {
            ar_02.aB = this.aB;
            n2 |= 4;
        }
        if ((n & 0x20) != 0) {
            ar_02.aqD = this.aqD;
            n2 |= 8;
        }
        ar_02.an = n2;
        this.onBuilt();
        return ar_02;
    }

    public av_0 aDf() {
        return (av_0)super.clone();
    }

    public av_0 gu(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (av_0)super.setField(fieldDescriptor, object);
    }

    public av_0 cK(Descriptors.FieldDescriptor fieldDescriptor) {
        return (av_0)super.clearField(fieldDescriptor);
    }

    public av_0 cK(Descriptors.OneofDescriptor oneofDescriptor) {
        return (av_0)super.clearOneof(oneofDescriptor);
    }

    public av_0 cK(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (av_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public av_0 gv(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (av_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public av_0 cK(Message message) {
        if (message instanceof ar_0) {
            return this.c((ar_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public av_0 c(ar_0 ar_02) {
        if (ar_02 == ar_0.aCZ()) {
            return this;
        }
        if (ar_02.Xh()) {
            this.cc(ar_02.Xi());
        }
        if (ar_02.KT()) {
            this.cd(ar_02.KU());
        }
        if (!ar_02.aqw.isEmpty()) {
            if (this.aqw.isEmpty()) {
                this.aqw = ar_02.aqw;
                this.an &= 0xFFFFFFFB;
            } else {
                this.aDi();
                this.aqw.addAll(ar_02.aqw);
            }
            this.onChanged();
        }
        if (!ar_02.aqz.isEmpty()) {
            if (this.aqz.isEmpty()) {
                this.aqz = ar_02.aqz;
                this.an &= 0xFFFFFFF7;
            } else {
                this.aDk();
                this.aqz.addAll(ar_02.aqz);
            }
            this.onChanged();
        }
        if (ar_02.aCT()) {
            this.lm(ar_02.aU());
        }
        if (ar_02.aCU()) {
            this.ae(ar_02.aCV());
        }
        this.gv(ar_0.b(ar_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.Xh()) {
            return false;
        }
        if (!this.KT()) {
            return false;
        }
        return this.aCU();
    }

    public av_0 kg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ar_0 ar_02 = null;
        try {
            ar_02 = (ar_0)ar_0.aqF.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ar_02 = (ar_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ar_02 != null) {
                this.c(ar_02);
            }
        }
        return this;
    }

    @Override
    public boolean Xh() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Xi() {
        return this.Dj;
    }

    public av_0 cc(long l) {
        this.an |= 1;
        this.Dj = l;
        this.onChanged();
        return this;
    }

    public av_0 aDg() {
        this.an &= 0xFFFFFFFE;
        this.Dj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean KT() {
        return (this.an & 2) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public av_0 cd(long l) {
        this.an |= 2;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public av_0 aDh() {
        this.an &= 0xFFFFFFFD;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    private void aDi() {
        if ((this.an & 4) == 0) {
            this.aqw = new ArrayList<Integer>(this.aqw);
            this.an |= 4;
        }
    }

    @Override
    public List<aq_0> aCP() {
        return new Internal.ListAdapter(this.aqw, ar_0.aqx);
    }

    @Override
    public int aCQ() {
        return this.aqw.size();
    }

    @Override
    public aq_0 lk(int n) {
        return (aq_0)((Object)ar_0.aqx.convert((Object)this.aqw.get(n)));
    }

    public av_0 a(int n, aq_0 aq_02) {
        if (aq_02 == null) {
            throw new NullPointerException();
        }
        this.aDi();
        this.aqw.set(n, aq_02.getNumber());
        this.onChanged();
        return this;
    }

    public av_0 a(aq_0 aq_02) {
        if (aq_02 == null) {
            throw new NullPointerException();
        }
        this.aDi();
        this.aqw.add(aq_02.getNumber());
        this.onChanged();
        return this;
    }

    public av_0 aB(Iterable<? extends aq_0> iterable) {
        this.aDi();
        for (aq_0 aq_02 : iterable) {
            this.aqw.add(aq_02.getNumber());
        }
        this.onChanged();
        return this;
    }

    public av_0 aDj() {
        this.aqw = Collections.emptyList();
        this.an &= 0xFFFFFFFB;
        this.onChanged();
        return this;
    }

    private void aDk() {
        if ((this.an & 8) == 0) {
            this.aqz = new ArrayList<Integer>(this.aqz);
            this.an |= 8;
        }
    }

    @Override
    public List<ax_0> aCR() {
        return new Internal.ListAdapter(this.aqz, ar_0.aqA);
    }

    @Override
    public int aCS() {
        return this.aqz.size();
    }

    @Override
    public ax_0 ll(int n) {
        return (ax_0)((Object)ar_0.aqA.convert((Object)this.aqz.get(n)));
    }

    public av_0 a(int n, ax_0 ax_02) {
        if (ax_02 == null) {
            throw new NullPointerException();
        }
        this.aDk();
        this.aqz.set(n, ax_02.getNumber());
        this.onChanged();
        return this;
    }

    public av_0 b(ax_0 ax_02) {
        if (ax_02 == null) {
            throw new NullPointerException();
        }
        this.aDk();
        this.aqz.add(ax_02.getNumber());
        this.onChanged();
        return this;
    }

    public av_0 aC(Iterable<? extends ax_0> iterable) {
        this.aDk();
        for (ax_0 ax_02 : iterable) {
            this.aqz.add(ax_02.getNumber());
        }
        this.onChanged();
        return this;
    }

    public av_0 aDl() {
        this.aqz = Collections.emptyList();
        this.an &= 0xFFFFFFF7;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aCT() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int aU() {
        return this.aB;
    }

    public av_0 lm(int n) {
        this.an |= 0x10;
        this.aB = n;
        this.onChanged();
        return this;
    }

    public av_0 aDm() {
        this.an &= 0xFFFFFFEF;
        this.aB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean aCU() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean aCV() {
        return this.aqD;
    }

    public av_0 ae(boolean bl) {
        this.an |= 0x20;
        this.aqD = bl;
        this.onChanged();
        return this;
    }

    public av_0 aDn() {
        this.an &= 0xFFFFFFDF;
        this.aqD = false;
        this.onChanged();
        return this;
    }

    public final av_0 gu(UnknownFieldSet unknownFieldSet) {
        return (av_0)super.setUnknownFields(unknownFieldSet);
    }

    public final av_0 gv(UnknownFieldSet unknownFieldSet) {
        return (av_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gv(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gu(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gv(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cK(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cK(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cK(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gu(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aDc();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aDf();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gv(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cK(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aDc();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cK(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aDf();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gv(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gu(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gv(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cK(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cK(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cK(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gu(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aDf();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aDe();
    }

    public /* synthetic */ Message build() {
        return this.aDd();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cK(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aDc();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aDf();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aDe();
    }

    public /* synthetic */ MessageLite build() {
        return this.aDd();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aDc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aDa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aDa();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aDf();
    }

    public /* synthetic */ Object clone() {
        return this.aDf();
    }
}

